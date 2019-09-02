package com.algovin373.project.moviecatalog.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.repository.TVShowRepository
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow
import io.reactivex.disposables.CompositeDisposable

class TVShowViewModel(private val tvShowRepository: TVShowRepository,
                      private val compositeDisposable: CompositeDisposable) : ViewModel() {
    private val myDataTVShowAiringToday = MutableLiveData<List<DataTVShow>>()

    fun getDataTVShowAiringToday() : LiveData<List<DataTVShow>> {
        tvShowRepository.getTVShowAiringToday(compositeDisposable, object : StatusResponseTVShow {
            override fun onSuccess(list: List<DataTVShow>) { myDataTVShowAiringToday.postValue(list) }
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
        return myDataTVShowAiringToday
    }

    fun getDataTVShow(type: String) : LiveData<PagedList<DataTVShow>> {
        return tvShowRepository.getDataTVShow(type, compositeDisposable, object : StatusResponseTVShow {
            override fun onSuccess(list: List<DataTVShow>) { }
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}