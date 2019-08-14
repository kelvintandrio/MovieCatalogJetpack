package com.algovin373.project.moviecatalog.injection

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.viewmodel.DetailMovieViewModel
import com.algovin373.project.moviecatalog.viewmodel.DetailTVShowViewModel
import com.algovin373.project.moviecatalog.viewmodel.MovieViewModel
import com.algovin373.project.moviecatalog.viewmodel.TVShowViewModel
import com.algovin373.project.moviecatalog.viewmodelfactory.MovieViewModelFactory

object MovieCatalogInjector {

//    fun movieViewModel02(fragment: Fragment, )
//        = ViewModelProviders.of(this, MovieViewModelFactory(movieRepository = MovieRepository()))[MovieViewModel::class.java]



    fun movieViewModel(fragment: Fragment) = ViewModelProviders.of(fragment)[MovieViewModel::class.java]
    fun tvshowViewModel(fragment: Fragment) = ViewModelProviders.of(fragment)[TVShowViewModel::class.java]
    fun detailMovieViewModel(activity: FragmentActivity) = ViewModelProviders.of(activity)[DetailMovieViewModel::class.java]
    fun detailTVShowViewModel(activity: FragmentActivity) = ViewModelProviders.of(activity)[DetailTVShowViewModel::class.java]
}