package com.algovin373.project.moviecatalog.util

import android.util.Log
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

const val DATA_MOVIE_CATALOG = "MOVIE_CATALOG"

fun dataMovieNowPlaying() : List<DataMovie>? {
    val compositeDisposable = CompositeDisposable()
    val apiService = MyRetrofit.iniRetrofitMovie()
    var list: List<DataMovie>? = null

    compositeDisposable.add(apiService.getDataMovieNowPlaying()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .map { it.dataMovie?.take(7) }
        .subscribe(
            {
                list = it
            },
            {
                Log.e("ERRORGETDATA", it.message)
            }
        ))
    return list
}
