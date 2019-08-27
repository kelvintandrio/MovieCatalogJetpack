package com.algovin373.project.moviecatalog.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.db.movie.MovieDao
import com.algovin373.project.moviecatalog.db.movie.MovieDatabase
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.util.configPaged
import io.reactivex.disposables.CompositeDisposable

class MovieFavoriteViewModel : ViewModel() {
    fun setMovieFavorite(context: Context) : LiveData<PagedList<MovieEntity>> {
        val movieDatabase = MovieDatabase.getInstance(context)
        return LivePagedListBuilder(movieDatabase.movieDao().getDataMovieFavorite(), 5).build()
    }
}