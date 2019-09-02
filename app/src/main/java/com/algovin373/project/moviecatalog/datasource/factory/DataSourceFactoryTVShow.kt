package com.algovin373.project.moviecatalog.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.algovin373.project.moviecatalog.datasource.ds.DataSourceMovie
import com.algovin373.project.moviecatalog.datasource.ds.DataSourceTVShow
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

class DataSourceFactoryTVShow(private val compositeDisposable: CompositeDisposable,
                             private val statusResponseTVShow: StatusResponseTVShow,
                             private val observable: Observable<TVShow>,
                             private val type: Int) : DataSource.Factory<String?, DataTVShow>() {

    private val dataSourceBannerTVShow = MutableLiveData<DataSourceTVShow>()

    override fun create(): DataSource<String?, DataTVShow> {
        val relatedBannerTVShowDataSource = DataSourceTVShow(compositeDisposable, statusResponseTVShow, observable, type)
        dataSourceBannerTVShow.postValue(relatedBannerTVShowDataSource)
        return relatedBannerTVShowDataSource
    }
}