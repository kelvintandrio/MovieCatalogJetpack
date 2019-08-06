package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.MovieAdapter
import com.algovin373.project.moviecatalog.injection.MovieCatalogInjector
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.util.dataMovieNowPlaying
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {
    private val statusGone = View.GONE
    private val statusVisible = View.VISIBLE

    private val movieViewModel by lazy {
        MovieCatalogInjector.movieViewModel(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i("SAMPELMOVIE", dataMovieNowPlaying().toString())

        movieViewModel.getDataMovieNowPlaying().observe(this, Observer {
            progress_content_movie_now_playing.visibility = statusGone
            setRecyclerViewMovie(rv_movie_now_playing, 2, it)
        })

        setMovie(getString(R.string.now_playing).toLowerCase())
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_now_playing))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_popular))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_top_related))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_upcoming))
        tabMovieOnClick(tab_layout_movie)
    }

    private fun tabMovieOnClick(tabLayout: TabLayout) {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.i("TABLAYOUTMOVIE", "You choose ${tab?.text}")
                setMovie(tab?.text.toString().toLowerCase())
            }
        })
    }

    private fun setMovie(type: String) {
        /*movieViewModel.getDataMovie(type).observe(this, Observer {
            progress_content_movie.visibility = statusGone
            setRecyclerViewMovie(rv_movie, 1, it)
        })*/
    }

    private fun setRecyclerViewMovie(recyclerMovie: RecyclerView, type: Int, list: List<DataMovie>) {
        when(type) {
            1 -> recyclerMovie.layoutManager = LinearLayoutManager(requireContext())
            2 -> recyclerMovie.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        recyclerMovie.setHasFixedSize(true)
        recyclerMovie.adapter = MovieAdapter(list, requireActivity(), type)
        recyclerMovie.adapter?.notifyDataSetChanged()
    }
}