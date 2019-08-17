package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DetailMovie
import com.algovin373.project.moviecatalog.model.Keyword
import io.reactivex.disposables.CompositeDisposable

interface MovieInter {
    fun getMovieNowPlaying(statusResponse: StatusResponse) : LiveData<List<DataMovie>>
    fun getDataMovie(type: String, statusResponse: StatusResponse) : LiveData<List<DataMovie>>
    fun getDetailMovie(idMovie: Int?, disposable: CompositeDisposable) : LiveData<DetailMovie>
    fun getKeywordMovie(idMovie: Int?, disposable: CompositeDisposable) :  LiveData<ArrayList<Keyword>>
    fun getCastMovie(idMovie: Int?, disposable: CompositeDisposable) : LiveData<List<DataCast>>
    fun getSimilarMovie(idMovie: Int?, disposable: CompositeDisposable) : LiveData<List<DataMovie>>
    fun getRecommendationMovie(idMovie: Int?, disposable: CompositeDisposable) : LiveData<List<DataMovie>>
}