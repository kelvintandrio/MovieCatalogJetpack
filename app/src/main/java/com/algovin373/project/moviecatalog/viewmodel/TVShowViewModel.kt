package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.repository.TVShowRepository
import io.reactivex.disposables.CompositeDisposable

class TVShowViewModel : ViewModel() {
    private val tvShowRepository = TVShowRepository()
    private val compositeDisposable = CompositeDisposable()

    fun getDataTVShowAiringToday() : LiveData<List<DataTVShow>> = tvShowRepository.getTVShowAiringToday(compositeDisposable)
    fun getDataTVShow(type: String) : LiveData<List<DataTVShow>> = tvShowRepository.getDataTVShow(type, compositeDisposable)

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}