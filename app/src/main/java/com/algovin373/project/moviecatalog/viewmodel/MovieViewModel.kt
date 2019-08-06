package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieViewModel : ViewModel() {

    private val movieRepository = MovieRepository()

    fun getDataMovieNowPlaying() : LiveData<List<DataMovie>> {
        return movieRepository.getMovieNowPlaying()
    }

    fun getDataMovie(type: String) : LiveData<List<DataMovie>> {
        return movieRepository.getDataMovie(type)
    }
}