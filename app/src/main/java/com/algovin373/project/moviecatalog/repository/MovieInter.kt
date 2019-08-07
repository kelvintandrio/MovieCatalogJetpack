package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import com.algovin373.project.moviecatalog.model.DataMovie
import io.reactivex.disposables.CompositeDisposable

interface MovieInter {
    fun getMovieNowPlaying(disposable: CompositeDisposable) : LiveData<List<DataMovie>>
    fun getDataMovie(type: String, disposable: CompositeDisposable) : LiveData<List<DataMovie>>
}