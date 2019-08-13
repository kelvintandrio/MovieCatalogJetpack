package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse
import io.reactivex.disposables.CompositeDisposable

class MovieViewModel : ViewModel() {
    private val movieRepository = MovieRepository()
    private val compositeDisposable = CompositeDisposable()
    val statusResponseLiveData = MutableLiveData<String>()

    fun getDataMovieNowPlaying() : LiveData<List<DataMovie>> {
        return movieRepository.getMovieNowPlaying(object : StatusResponse {
            override fun onSuccess() {
                statusResponseLiveData.postValue("Success")
                Log.i("STATUS_RESPONSE", "Success Response")
            }

            override fun onFailed() {
                statusResponseLiveData.postValue("Failed")
                Log.e("STATUS_RESPONSE", "Failed Response")
            }
        })
    }

    fun getDataMovie(type: String) : LiveData<List<DataMovie>> = movieRepository.getDataMovie(type, compositeDisposable)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}