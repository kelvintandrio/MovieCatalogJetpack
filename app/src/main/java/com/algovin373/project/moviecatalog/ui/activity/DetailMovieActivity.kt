package com.algovin373.project.moviecatalog.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.CastAdapter
import com.algovin373.project.moviecatalog.adapter.movie.OtherAdapterMovie
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.viewmodel.DetailMovieViewModel
import com.algovin373.project.moviecatalog.viewmodelfactory.DetailMovieViewModelFactory
import com.bumptech.glide.Glide
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_detail_movie.*
import org.jetbrains.anko.startActivity

class DetailMovieActivity : AppCompatActivity() {
    private var imgPosterMovie = ""
    private var statusFavorite = 0

    private val detailMovieViewModel by lazy {
        ViewModelProviders.of(this,
            DetailMovieViewModelFactory(movieRepository = MovieRepository(),
                compositeDisposable = CompositeDisposable()))
            .get(DetailMovieViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            startActivity<DetailMovieActivity>("ID" to id)
        }
    }

    private val castAdapter = CastAdapter()
    private val otherAdapterMovie = OtherAdapterMovie(catalogClickListener)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val id = intent.getIntExtra("ID", 0)

        if (id == detailMovieViewModel.checkDataMovieFavorite(this, id)) {
            statusFavorite = 1
            btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_added_to_favorite))
        }

        detailMovieViewModel.setDetailMovie(id).observe(this, Observer {
            imgPosterMovie = "${BuildConfig.URL_POSTER}${it.posterMovie}"
            Glide.with(this).load("${BuildConfig.URL_POSTER}${it.backgroundMovie}").into(image_poster_catalog_movie)
            Glide.with(this).load("${BuildConfig.URL_IMAGE}${it.posterMovie}").into(image_movie_catalog)
            title_catalog_movie.text = it.titleMovie
            date_release_catalog_movie.text = it.releaseDateMovie
            status_release_catalog_movie.text = it.statusMovie
            runtime_release_catalog_movie.text = it.runtimeMovie.toString()
            vote_average_release_catalog_movie.text = it.voteAverageMovie.toString()
            vote_count_release_catalog_movie.text = it.voteCountMovie.toString()
            overview_catalog_movie.text = it.overviewMovie
        })

        detailMovieViewModel.setKeywordMovie(id).observe(this, Observer {
            var keyword = ""
            for (i in 0 until it.size) {
                keyword += if (i == it.size-1) "${it[i].keyword}" else "${it[i].keyword}, "
            }
            keyword_catalog_movie.text = keyword
        })

        detailMovieViewModel.setCastMovie(id).observe(this, Observer {
            castAdapter.submitList(it)
        })
        setMovieRecyclerView(rv_cast_movie, 1)

        detailMovieViewModel.setSimilarMovie(id).observe(this, Observer {
            otherAdapterMovie.submitList(it)
        })
        setMovieRecyclerView(rv_similar_movie, 2)

        detailMovieViewModel.setRecommendationMovie(id).observe(this, Observer {
            otherAdapterMovie.submitList(it)
        })
        setMovieRecyclerView(rv_recommendation_movie, 2)

        btn_back_to_menu.setOnClickListener {
            super.onBackPressed()
        }

        btn_favorite_movie.setOnClickListener {
            when(statusFavorite) {
                1 -> {
                    statusFavorite = 0
                    detailMovieViewModel.setDeleteMovieFavorite(this, id)
                    btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_add_to_favorite))
                }
                0 -> {
                    statusFavorite = 1
                    val favorite = MovieEntity(
                        id,
                        imgPosterMovie,
                        title_catalog_movie.text.toString(),
                        date_release_catalog_movie.text.toString()
                    )
                    detailMovieViewModel.setInsertMovieFavorite(this, favorite)
                    btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_added_to_favorite))
                }
            }
        }
    }

    private fun setMovieRecyclerView(rv: RecyclerView, type: Int) {
        rv.apply {
            when(type) {
                1 -> {
                    layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    setHasFixedSize(true)
                    adapter = castAdapter
                }
                2 -> {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(false)
                    adapter = otherAdapterMovie
                }
            }
            adapter?.notifyDataSetChanged()
        }
    }
}
