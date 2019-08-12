package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DetailMovie
import com.algovin373.project.moviecatalog.model.Keyword
import com.algovin373.project.moviecatalog.repository.MovieRepository
import io.reactivex.disposables.CompositeDisposable

class DetailMovieViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private val movieRepository = MovieRepository()

    fun setDetailMovie(id: Int?) : LiveData<DetailMovie> = movieRepository.getDetailMovie(id, compositeDisposable)
    fun setKeywordMovie(id: Int?) : LiveData<ArrayList<Keyword>> = movieRepository.getKeywordMovie(id, compositeDisposable)
    fun setCastMovie(id: Int?) : LiveData<List<DataCast>> = movieRepository.getCastMovie(id, compositeDisposable)
    fun setSimilarMovie(id: Int?) : LiveData<List<DataMovie>> = movieRepository.getSimilarMovie(id, compositeDisposable)
    fun setRecommendationMovie(id: Int?) : LiveData<List<DataMovie>> = movieRepository.getRecommendationMovie(id, compositeDisposable)
}