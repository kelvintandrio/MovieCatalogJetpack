package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import com.algovin373.project.moviecatalog.model.DataMovie

interface MovieInter {
    fun getMovieNowPlaying() : LiveData<List<DataMovie>>
    fun getDataMovie(type: String) : LiveData<List<DataMovie>>
}