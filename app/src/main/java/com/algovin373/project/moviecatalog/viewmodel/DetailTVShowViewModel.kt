package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.TVShow

class DetailTVShowViewModel : ViewModel() {
    private lateinit var dataMovie : TVShow

    fun setDataMovie(data: TVShow) {
        this.dataMovie = data
    }

    fun getImage() : Int = dataMovie.image
    fun getTitle() : String = dataMovie.title
    fun getDateRelease() : String = dataMovie.date_release
    fun getYear() : Int = dataMovie.year_release
    fun getOverview() : String = dataMovie.overview
    fun getDirector() : String = dataMovie.director
    fun getScreenplay() : String = dataMovie.screenplay
}