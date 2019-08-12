package com.algovin373.project.moviecatalog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.ui.activity.DetailTVShowActivity
import com.algovin373.project.moviecatalog.util.DATA_MOVIE_CATALOG
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_movie_catalog.view.*
import kotlinx.android.synthetic.main.item_tvshow_catalog.view.*
import org.jetbrains.anko.startActivity

class TVShowAdapter(private val dataTVShow: List<DataTVShow>, private val fragmentActivity: FragmentActivity)
                    : RecyclerView.Adapter<MovieCatalogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(fragmentActivity).inflate(R.layout.item_tvshow_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val imageURL = "${BuildConfig.URL_POSTER}${dataTVShow[position].backgroundTVShow}"
        Glide.with(fragmentActivity).load(imageURL).into(holder.itemView.image_tvshow_banner)
        holder.itemView.title_tvshow_banner.text = dataTVShow[position].titleTVShow
        holder.itemView.date_tvshow_banner.text = dataTVShow[position].firstDateTVShow

        holder.itemView.setOnClickListener {
//            fragmentActivity.startActivity<DetailTVShowActivity>(DATA_MOVIE_CATALOG to dataTVShow[position])
        }
    }

    override fun getItemCount(): Int = dataTVShow.size
}