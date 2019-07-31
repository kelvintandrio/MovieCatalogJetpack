package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.TVShow

class DetailTVShowViewModel : ViewModel() {
    private lateinit var dataTVShow : TVShow

    fun setDataTVShow(data: TVShow) {
        this.dataTVShow = data
    }

    fun getImage() : Int = dataTVShow.image
    fun getTitle() : String = dataTVShow.title
    fun getDateRelease() : String = dataTVShow.date_release
    fun getYear() : Int = dataTVShow.year_release
    fun getOverview() : String = dataTVShow.overview
    fun getDirector() : String = dataTVShow.director
    fun getScreenplay() : String = dataTVShow.screenplay
}