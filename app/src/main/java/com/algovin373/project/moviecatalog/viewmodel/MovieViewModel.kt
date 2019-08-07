package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import io.reactivex.disposables.CompositeDisposable

class MovieViewModel : ViewModel() {
    private val movieRepository = MovieRepository()
    private val compositeDisposable = CompositeDisposable()

    fun getDataMovieNowPlaying() : LiveData<List<DataMovie>> = movieRepository.getMovieNowPlaying(compositeDisposable)

    fun getDataMovie(type: String) : LiveData<List<DataMovie>> = movieRepository.getDataMovie(type, compositeDisposable)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}