package com.algovin373.project.moviecatalog.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.injection.MovieCatalogInjector

class DetailTVShowActivity : AppCompatActivity() {

    private val detailMovieViewModel by lazy {
        MovieCatalogInjector.detailTVShowViewModel(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

       /* detailMovieViewModel.setDataTVShow(intent.getParcelableExtra(DATA_MOVIE_CATALOG))

        Glide.with(this).load(detailMovieViewModel.getImage()).into(image_poster_catalog_movie)
        Glide.with(this).load(detailMovieViewModel.getImage()).into(image_movie_catalog)
        title_catalog_movie.text = detailMovieViewModel.getTitle()
        date_release_catalog_movie.text = detailMovieViewModel.getDateRelease()
        year_release_catalog_movie.text = detailMovieViewModel.getYear().toString()
        overview_catalog_movie.text = detailMovieViewModel.getOverview()
        director_catalog_movie.text = detailMovieViewModel.getDirector()
        screenplay_catalog_movie.text = detailMovieViewModel.getScreenplay()

        btn_back_to_menu.setOnClickListener {
            super.onBackPressed()
        }*/
    }
}
