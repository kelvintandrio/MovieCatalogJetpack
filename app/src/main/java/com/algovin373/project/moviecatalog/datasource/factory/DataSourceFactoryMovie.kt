package com.algovin373.project.moviecatalog.datasource.factory

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.algovin373.project.moviecatalog.datasource.ds.DataSourceMovie
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable

class DataSourceFactoryMovie(private val compositeDisposable: CompositeDisposable,
                             private val statusResponseMovie: StatusResponseMovie,
                             private val observable: Observable<Movie>,
                             private val type: Int) : DataSource.Factory<String?, DataMovie>() {

    private val dataSourceBannerMovie = MutableLiveData<DataSourceMovie>()

    override fun create(): DataSource<String?, DataMovie> {
        val relatedBannerMovieDataSource = DataSourceMovie(compositeDisposable, statusResponseMovie, observable, type)
        dataSourceBannerMovie.postValue(relatedBannerMovieDataSource)
        return relatedBannerMovieDataSource
    }
}