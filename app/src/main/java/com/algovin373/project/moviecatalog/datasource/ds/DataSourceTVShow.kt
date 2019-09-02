package com.algovin373.project.moviecatalog.datasource.ds

import android.util.Log
import androidx.paging.ItemKeyedDataSource
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DataSourceTVShow(private val compositeDisposable: CompositeDisposable,
                      private val statusResponseTVShow: StatusResponseTVShow,
                      private val observable: Observable<TVShow>,
                      private val type: Int) : ItemKeyedDataSource<String?, DataTVShow>() {

    override fun loadInitial(params: LoadInitialParams<String?>, callback: LoadInitialCallback<DataTVShow>) {
        EspressoIdlingResource.increment()
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    when(type) {
                        0 -> it.dataTVShow?.take(5)
                        1 -> it.dataTVShow
                        else -> it.dataTVShow
                    }
                }
                .subscribe(
                    {
                        statusResponseTVShow.onSuccess(it!!)
                        callback.onResult(it)
                        EspressoIdlingResource.decrement()
                    },
                    {
                        statusResponseTVShow.onFailed()
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<String?>, callback: LoadCallback<DataTVShow>) { }

    override fun loadBefore(params: LoadParams<String?>, callback: LoadCallback<DataTVShow>) { }

    override fun getKey(item: DataTVShow): String = item.idTVShow.toString()
}