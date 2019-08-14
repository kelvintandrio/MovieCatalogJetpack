package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import com.algovin373.project.moviecatalog.model.DataTVShow
import io.reactivex.disposables.CompositeDisposable

interface TVShowInter {
    fun getTVShowAiringToday(disposable: CompositeDisposable) : LiveData<List<DataTVShow>>
    fun getDataTVShow(type: String, disposable: CompositeDisposable) : LiveData<List<DataTVShow>>
}