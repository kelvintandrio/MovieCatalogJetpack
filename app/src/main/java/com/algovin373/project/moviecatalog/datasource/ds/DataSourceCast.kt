package com.algovin373.project.moviecatalog.datasource.ds

import androidx.paging.ItemKeyedDataSource
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.Cast
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DataSourceCast(private val compositeDisposable: CompositeDisposable,
                      private val statusResponseDataCast: StatusResponseDataCast,
                      private val observable: Observable<Cast>) : ItemKeyedDataSource<String?, DataCast>() {

    override fun loadInitial(params: LoadInitialParams<String?>, callback: LoadInitialCallback<DataCast>) {
        EspressoIdlingResource.increment()
        compositeDisposable.add(
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.dataCast }
                .subscribe(
                    {
                        statusResponseDataCast.onSuccess(it!!)
                        callback.onResult(it)
                        EspressoIdlingResource.decrement()
                    },
                    {
                        statusResponseDataCast.onFailed()
                    }
                )
        )
    }

    override fun loadAfter(params: LoadParams<String?>, callback: LoadCallback<DataCast>) { }

    override fun loadBefore(params: LoadParams<String?>, callback: LoadCallback<DataCast>) { }

    override fun getKey(item: DataCast): String = item.idCast.toString()
}