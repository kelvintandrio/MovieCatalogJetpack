package com.algovin373.project.moviecatalog.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieRepository : MovieInter {
    private val apiService = MyRetrofit.iniRetrofitMovie()

    override fun getMovieNowPlaying(disposable: CompositeDisposable) : LiveData<List<DataMovie>> {
        val myDataMovieNowPlaying = MutableLiveData<List<DataMovie>>()

        disposable.add(
            apiService.getDataMovieNowPlaying()
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

    override fun getDataMovie(type: String, disposable: CompositeDisposable) : LiveData<List<DataMovie>> {
        val myDataMovie : MutableLiveData<List<DataMovie>> = MutableLiveData()
        var observable : Observable<Movie> = apiService.getDataMovieNowPlaying()

        when(type) {
            "now playing" -> observable = apiService.getDataMovieNowPlaying()
            "popular" -> observable = apiService.getDataMoviePopular()
            "top related" -> observable = apiService.getDataMovieTopRated()
            "upcoming" -> observable = apiService.getDataMovieUpComing()
        }
        disposable.add(observable.subscribeOn(Schedulers.io())
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
}