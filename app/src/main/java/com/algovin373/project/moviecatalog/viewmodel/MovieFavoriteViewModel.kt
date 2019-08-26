package com.algovin373.project.moviecatalog.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.algovin373.project.moviecatalog.db.movie.MovieDatabase
import com.algovin373.project.moviecatalog.db.movie.MovieEntity

class MovieFavoriteViewModel : ViewModel() {

    fun setMovieFavorite(context: Context) : LiveData<List<MovieEntity>> {
        val listMovieFavorite = MutableLiveData<List<MovieEntity>>()

        val movieDatabase = MovieDatabase.getInstance(context)
        val list = movieDatabase.movieDao().getDataMovieFavorite()
        listMovieFavorite.postValue(list)

        return listMovieFavorite
    }

}