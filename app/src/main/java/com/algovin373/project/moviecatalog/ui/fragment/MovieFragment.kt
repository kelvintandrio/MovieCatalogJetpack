package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.MovieAdapter
import com.algovin373.project.moviecatalog.injection.MovieCatalogInjector
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {
    private val movieViewModel by lazy {
        MovieCatalogInjector.movieViewModel(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_movie.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            adapter = MovieAdapter(movieViewModel.getDataMovie(), activity)
            adapter?.notifyDataSetChanged()
        }
    }
}
