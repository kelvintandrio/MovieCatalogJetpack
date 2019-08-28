package com.algovin373.project.moviecatalog.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.db.tvshow.TVShowDatabase
import com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity

class TVShowFavoriteViewModel : ViewModel() {

    fun setTVShowFavorite(context: Context) : LiveData<PagedList<TVShowEntity>> {
        val tvShowFavorite = TVShowDatabase.getInstance(context)
        return LivePagedListBuilder(tvShowFavorite.tvShowDao().getDataTvShowFavorite(), 5).build()
    }

}