package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse

class MovieViewModel(var movieRepository: MovieRepository) : ViewModel() {
    private val myData = MutableLiveData<List<DataMovie>>()

    fun getDataMovieNowPlaying() : LiveData<List<DataMovie>> {
        movieRepository.getMovieNowPlaying(object : StatusResponse {
            override fun onSuccess(list: List<DataMovie>) = myData.postValue(list)
            override fun onFailed() {
                Log.i("TES","Failed")
            }
        })
        return myData
    }

    fun getDataMovie(type: String) : LiveData<List<DataMovie>> {
        movieRepository.getDataMovie(type, object : StatusResponse {
            override fun onSuccess(list: List<DataMovie>) = myData.postValue(list)
            override fun onFailed() {
                Log.i("TES","Failed")
            }
        })
        return myData
    }
}