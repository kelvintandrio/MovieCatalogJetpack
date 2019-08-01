package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.util.dataMovie

class MovieViewModel : ViewModel() {
    fun getDataMovie(): ArrayList<Movie> = dataMovie()
}