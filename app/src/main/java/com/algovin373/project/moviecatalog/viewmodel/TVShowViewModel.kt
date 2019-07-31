package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.util.dataTVShow

class TVShowViewModel : ViewModel() {
    fun getDataTVShow(): ArrayList<TVShow> = dataTVShow()
}