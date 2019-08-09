package com.algovin373.project.moviecatalog.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.injection.MovieCatalogInjector
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {

    private val detailMovieViewModel by lazy {
        MovieCatalogInjector.detailMovieViewModel(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val id = intent.getIntExtra("ID", 0)

        detailMovieViewModel.setDetailMovie(id).observe(this, Observer {
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

    }
}
