package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import io.reactivex.disposables.CompositeDisposable

class MovieViewModel(private val movieRepository: MovieRepository,
                     private val compositeDisposable: CompositeDisposable) : ViewModel() {

    fun getDataMovieNowPlaying() : LiveData<PagedList<DataMovie>> {
        return movieRepository.getMovieNowPlaying(compositeDisposable, object : StatusResponseMovie {
            override fun onSuccess(list: List<DataMovie>) { }
            override fun onFailed() {
                Log.i("TES","Failed")
            }
        })
    }

    fun getDataMovie(type: String) : LiveData<PagedList<DataMovie>> {
        return movieRepository.getDataMovie(type, compositeDisposable, object : StatusResponseMovie {
            override fun onSuccess(list: List<DataMovie>) { }
            override fun onFailed() {
                Log.i("TES","Failed")
            }
        })
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}