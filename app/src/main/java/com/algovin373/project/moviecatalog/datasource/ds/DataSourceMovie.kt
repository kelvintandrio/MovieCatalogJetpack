package com.algovin373.project.moviecatalog.datasource.ds

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.ItemKeyedDataSource
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DataSourceMovie(private val compositeDisposable: CompositeDisposable,
                      private val statusResponseMovie: StatusResponseMovie,
                      private val observable: Observable<Movie>,
                      private val type: Int)
        : ItemKeyedDataSource<String?, DataMovie>() {

    override fun loadInitial(params: LoadInitialParams<String?>, callback: LoadInitialCallback<DataMovie>) {
        EspressoIdlingResource.increment()
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    when(type) {
                        0 -> it.dataMovie?.take(7)
                        1 -> it.dataMovie
                        else -> it.dataMovie
                    }
                }
                .subscribe(
                    {
                        statusResponseMovie.onSuccess(it!!)
                        callback.onResult(it)
                        EspressoIdlingResource.decrement()
                    },
                    {
                        statusResponseMovie.onFailed()
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<String?>, callback: LoadCallback<DataMovie>) { }

    override fun loadBefore(params: LoadParams<String?>, callback: LoadCallback<DataMovie>) { }

    override fun getKey(item: DataMovie): String = item.idMovie.toString()
}