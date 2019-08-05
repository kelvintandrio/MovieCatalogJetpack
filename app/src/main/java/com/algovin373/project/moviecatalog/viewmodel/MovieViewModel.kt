package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieViewModel : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    private val apiService = MyRetrofit.iniRetrofitMovie()

    fun getDataMovieNowPlaying() : LiveData<List<DataMovie>> {
        val myDataMovieNowPlaying : MutableLiveData<List<DataMovie>> = MutableLiveData()

        compositeDisposable.add(apiService.getDataMovieNowPlaying()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(7) }
            .subscribe(
                {
                    myDataMovieNowPlaying.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))
        return myDataMovieNowPlaying
    }

    fun getDataMovie(type: String) : LiveData<List<DataMovie>> {
        val myDataMovie : MutableLiveData<List<DataMovie>> = MutableLiveData()
        var observable : Observable<Movie> = apiService.getDataMovieNowPlaying()

        when(type) {
            "now playing" -> observable = apiService.getDataMovieNowPlaying()
            "popular" -> observable = apiService.getDataMoviePopular()
            "top related" -> observable = apiService.getDataMovieTopRated()
            "upcoming" -> observable = apiService.getDataMovieUpComing()
        }
        compositeDisposable.add(observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie }
            .subscribe(
                {
                    myDataMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))
        return myDataMovie
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}