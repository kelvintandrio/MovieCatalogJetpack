package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.movie.MovieFavoriteAdapter
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.ui.activity.DetailMovieActivity
import com.algovin373.project.moviecatalog.viewmodel.MovieFavoriteViewModel
import kotlinx.android.synthetic.main.fragment_movie_favorite.*
import org.jetbrains.anko.startActivity

class MovieFavoriteFragment : Fragment() {

    private val movieFavoriteViewModel by lazy {
        ViewModelProviders.of(this).get(MovieFavoriteViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            requireContext().startActivity<DetailMovieActivity>("ID" to id)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterMovieFavorite = MovieFavoriteAdapter(requireActivity(), catalogClickListener)

        movieFavoriteViewModel.setMovieFavorite(requireContext()).observe(this, Observer {
            adapterMovieFavorite.submitList(it)
        })

        rv_movie_favorite.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = adapterMovieFavorite
            adapter?.notifyDataSetChanged()
        }
    }
}
