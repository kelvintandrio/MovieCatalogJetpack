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
import com.algovin373.project.moviecatalog.adapter.tvshow.OtherAdapterTVShow
import com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.repository.TVShowRepository
import com.algovin373.project.moviecatalog.viewmodel.DetailTVShowViewModel
import com.algovin373.project.moviecatalog.viewmodelfactory.DetailTVShowViewModelFactory
import com.bumptech.glide.Glide
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_detail_tvshow.*
import org.jetbrains.anko.startActivity

class DetailTVShowActivity : AppCompatActivity() {
    private var imgPosterTVShow = ""
    private var statusFavorite = 0

    private val detailTVShowViewModel by lazy {
        ViewModelProviders.of(this,
            DetailTVShowViewModelFactory(tvShowRepository = TVShowRepository(), compositeDisposable = CompositeDisposable()))
            .get(DetailTVShowViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            startActivity<DetailTVShowActivity>("ID" to id)
        }
    }

    private val castAdapter = CastAdapter()
    private val otherAdapterTVShow = OtherAdapterTVShow(catalogClickListener)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tvshow)

        val id = intent.getIntExtra("ID", 0)

        if (id == detailTVShowViewModel.checkDataTVShowFavorite(this, id)) {
            statusFavorite = 1
            btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_added_to_favorite))
        }

        detailTVShowViewModel.setDetailTVShow(id).observe(this, Observer {
            imgPosterTVShow = "${it.backgroundTVShow}"
            Glide.with(this).load("${BuildConfig.URL_POSTER}${it.backgroundTVShow}").into(image_poster_catalog_tv_show)
            Glide.with(this).load("${BuildConfig.URL_IMAGE}${it.posterTVShow}").into(image_tv_show_catalog)
            title_catalog_tv_show.text = it.titleTVShow
            date_release_catalog_tv_show.text = it.firstDateTVShow
            seasons_catalog_tv_show.text = it.seasonsTVShow
            episodes_release_catalog_tv_show.text = it.episodesTVShow
            vote_average_release_catalog_tv_show.text = it.voteAverageTVShow.toString()
            vote_count_release_catalog_tv_show.text = it.voteCountTVShow.toString()
            overview_catalog_tv_show.text = it.descriptionTVShow
        })

        detailTVShowViewModel.setCastTVShow(id).observe(this, Observer {
            castAdapter.submitList(it)
        })
        setTVShowRecyclerView(rv_cast_tv_show, 1)

        detailTVShowViewModel.setSimilarTVShow(id).observe(this, Observer {
            otherAdapterTVShow.submitList(it)
        })
        setTVShowRecyclerView(rv_similar_tv_show, 2)

        detailTVShowViewModel.setRecommendationTVShow(id).observe(this, Observer {
            otherAdapterTVShow.submitList(it)
        })
        setTVShowRecyclerView(rv_recommendation_tv_show, 2)

        btn_back_to_menu.setOnClickListener {
            super.onBackPressed()
        }

        btn_favorite_movie.setOnClickListener {
            when(statusFavorite) {
                1 -> {
                    statusFavorite = 0
                    detailTVShowViewModel.setDeleteTVShowFavorite(this, id)
                    btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_add_to_favorite))
                }
                0 -> {
                    statusFavorite = 1
                    val favorite = TVShowEntity(
                        id,
                        imgPosterTVShow,
                        title_catalog_tv_show.text.toString(),
                        date_release_catalog_tv_show.text.toString()
                    )
                    detailTVShowViewModel.setInsertTVShowFavorite(this, favorite)
                    btn_favorite_movie.setImageDrawable(getDrawable(R.drawable.ic_added_to_favorite))
                }
            }
        }
    }

    private fun setTVShowRecyclerView(rv: RecyclerView, type: Int) {
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
                    adapter = otherAdapterTVShow
                }
            }
        }
    }
}
