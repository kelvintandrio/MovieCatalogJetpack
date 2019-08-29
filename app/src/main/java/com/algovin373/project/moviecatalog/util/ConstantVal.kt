package com.algovin373.project.moviecatalog.util

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

const val DATA_MOVIE_CATALOG = "MOVIE_CATALOG"
const val statusGone = View.GONE
const val statusVisible = View.VISIBLE

fun loadMovie() : LiveData<List<DataMovie>> {
    val myDataMovieNowPlaying = MutableLiveData<List<DataMovie>>()
    val compositeDisposable = CompositeDisposable()
    val apiService = MyRetrofit.iniRetrofitMovie()

    compositeDisposable.add(
        apiService.getDataMovieNowPlaying()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(7) }
            .subscribe(
                {
                    myDataMovieNowPlaying.postValue(it)
                },
                {
                }
            ))

    return myDataMovieNowPlaying
}

fun configPaged(size: Int): PagedList.Config = PagedList.Config.Builder()
    .setPageSize(size)
    .setInitialLoadSizeHint(size)
    .setEnablePlaceholders(true)
    .build()