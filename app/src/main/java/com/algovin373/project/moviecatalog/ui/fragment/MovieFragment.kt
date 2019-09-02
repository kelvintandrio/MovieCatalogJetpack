package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.movie.MovieAdapter
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.ui.activity.DetailMovieActivity
import com.algovin373.project.moviecatalog.util.statusGone
import com.algovin373.project.moviecatalog.util.statusVisible
import com.algovin373.project.moviecatalog.viewmodel.MovieViewModel
import com.algovin373.project.moviecatalog.viewmodelfactory.MovieViewModelFactory
import com.google.android.material.tabs.TabLayout
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_movie.*
import org.jetbrains.anko.startActivity
import java.util.*

class MovieFragment : Fragment() {
    private val movieViewModel by lazy {
        ViewModelProviders.of(this,
            MovieViewModelFactory(movieRepository = MovieRepository(), compositeDisposable = CompositeDisposable()))
            .get(MovieViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            requireContext().startActivity<DetailMovieActivity>("ID" to id)
        }
    }

    private val adapterMovieNowPlaying = MovieAdapter( 1, catalogClickListener)
    private val adapterMoviePopular = MovieAdapter( 1, catalogClickListener)
    private val adapterMovieTopRelated = MovieAdapter( 1, catalogClickListener)
    private val adapterMovieUpComing = MovieAdapter( 1, catalogClickListener)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterBannerMovie = MovieAdapter( 2, catalogClickListener)
        movieViewModel.getDataMovieNowPlaying().observe(this, Observer {
            adapterBannerMovie.submitList(it)
        })
        progress_content_movie_now_playing.visibility = statusGone
        setRecyclerViewMovie(rv_movie_now_playing, 2, adapterBannerMovie)

        setMovie(getString(R.string.now_playing).toLowerCase(Locale.getDefault()), adapterMovieNowPlaying)
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_now_playing))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_popular))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_top_related))
        tab_layout_movie.addTab(tab_layout_movie.newTab().setText(R.string.movie_upcoming))
        tabMovieCatalogOnClick(tab_layout_movie)
    }

    private fun tabMovieCatalogOnClick(tabLayout: TabLayout) {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(val type = tab?.text.toString().toLowerCase(Locale.getDefault())) {
                    "now playing" -> setMovie(type, adapterMovieNowPlaying)
                    "popular" -> setMovie(type, adapterMoviePopular)
                    "top related" -> setMovie(type, adapterMovieTopRelated)
                    "upcoming" -> setMovie(type, adapterMovieUpComing)
                }
            }
        })
    }

    private fun setMovie(type: String, adapter: MovieAdapter) {
        movieViewModel.getDataMovie(type).observe(this, Observer {
            adapter.submitList(it)
            Log.i("TESRESPONSE", it.toString())
        })
        setRecyclerViewMovie(rv_movie, 1, adapter)
        progress_content_movie.visibility = statusGone
    }

    private fun setRecyclerViewMovie(recyclerMovie: RecyclerView, type: Int, adapter: MovieAdapter) {
        when(type) {
            1 -> recyclerMovie.layoutManager = LinearLayoutManager(requireContext())
            2 -> recyclerMovie.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        recyclerMovie.setHasFixedSize(false)
        recyclerMovie.adapter = adapter
    }
}
