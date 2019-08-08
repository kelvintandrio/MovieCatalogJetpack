package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DetailMovie
import com.algovin373.project.moviecatalog.model.Keyword
import io.reactivex.disposables.CompositeDisposable

interface MovieInter {
    fun getMovieNowPlaying(disposable: CompositeDisposable) : LiveData<List<DataMovie>>
    fun getDataMovie(type: String, disposable: CompositeDisposable) : LiveData<List<DataMovie>>
    fun getDetailMovie(idMovie: Int?, disposable: CompositeDisposable) : LiveData<DetailMovie>
    fun getKeywordMovie(idMovie: Int?, disposable: CompositeDisposable) :  LiveData<ArrayList<Keyword>>
}