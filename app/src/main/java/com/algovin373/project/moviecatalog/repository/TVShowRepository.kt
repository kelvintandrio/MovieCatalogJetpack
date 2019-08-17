package com.algovin373.project.moviecatalog.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.repository.inter.TVShowInter
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class TVShowRepository : TVShowInter {
    private val apiService = MyRetrofit.iniRetrofitTVShow()

    override fun getTVShowAiringToday(disposable: CompositeDisposable): LiveData<List<DataTVShow>> {
        val myTVShowAiringToday = MutableLiveData<List<DataTVShow>>()

        disposable.add(
            apiService.getDataTVShowAiringToday()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.dataTVShow?.take(5) }
                .subscribe(
                    {
                        myTVShowAiringToday.postValue(it)
                    },
                    {
                        Log.e("ERRORGETDATA", it.message)
                    }
                ))

        return myTVShowAiringToday
    }

    override fun getDataTVShow(type: String, disposable: CompositeDisposable): LiveData<List<DataTVShow>> {
        val myDataTVShow : MutableLiveData<List<DataTVShow>> = MutableLiveData()
        var observable : Observable<TVShow> = apiService.getDataTVShowAiringToday()
        when(type) {
            "airing today" -> observable = apiService.getDataTVShowAiringToday()
            "popular" -> observable = apiService.getDataTVShowPopularToday()
            "top related" -> observable = apiService.getDataTVShowTopRatedToday()
            "on the air" -> observable = apiService.getDataTVShowOnTheAirToday()
        }

        disposable.add(observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataTVShow }
            .subscribe(
                {
                    myDataTVShow.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))

        return myDataTVShow
    }

}