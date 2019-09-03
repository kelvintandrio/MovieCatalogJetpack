package com.algovin373.project.moviecatalog.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.algovin373.project.moviecatalog.datasource.ds.DataSourceCast
import com.algovin373.project.moviecatalog.model.Cast
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

class DataSourceFactoryCast(private val compositeDisposable: CompositeDisposable,
                             private val statusResponseDataCast: StatusResponseDataCast,
                             private val observable: Observable<Cast>) : DataSource.Factory<String?, DataCast>() {

    private val dataSourceCast = MutableLiveData<DataSourceCast>()

    override fun create(): DataSource<String?, DataCast> {
        val relatedCastDataSource = DataSourceCast(compositeDisposable, statusResponseDataCast, observable)
        dataSourceCast.postValue(relatedCastDataSource)
        return relatedCastDataSource
    }
}