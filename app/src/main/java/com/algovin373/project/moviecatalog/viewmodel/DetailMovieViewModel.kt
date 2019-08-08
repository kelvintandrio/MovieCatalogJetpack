package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DetailMovie
import com.algovin373.project.moviecatalog.model.Keyword
import com.algovin373.project.moviecatalog.repository.MovieRepository
import io.reactivex.disposables.CompositeDisposable

class DetailMovieViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private val movieRepository = MovieRepository()

    fun setDetailMovie(id: Int?) : LiveData<DetailMovie> = movieRepository.getDetailMovie(id, compositeDisposable)
    fun setKeywordMovie(id: Int?) : LiveData<ArrayList<Keyword>> = movieRepository.getKeywordMovie(id, compositeDisposable)
}