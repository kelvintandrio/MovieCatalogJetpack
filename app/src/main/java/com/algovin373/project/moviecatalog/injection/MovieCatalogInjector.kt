package com.algovin373.project.moviecatalog.injection

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.algovin373.project.moviecatalog.viewmodel.MovieViewModel
import com.algovin373.project.moviecatalog.viewmodel.TVShowViewModel

object MovieCatalogInjector {
    fun movieViewModel(fragment: Fragment) = ViewModelProviders.of(fragment)[MovieViewModel::class.java]

    fun tvshowViewModel(fragment: Fragment) = ViewModelProviders.of(fragment)[TVShowViewModel::class.java]
}