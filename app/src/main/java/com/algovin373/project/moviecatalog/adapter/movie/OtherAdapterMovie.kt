package com.algovin373.project.moviecatalog.adapter.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_catalog_other.view.*

class OtherAdapterMovie(private val catalogClickListener: CatalogClickListener)
        : PagedListAdapter<DataMovie, MovieCatalogViewHolder>(MovieDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_catalog_other, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val urlImage = "${BuildConfig.URL_POSTER}${getItem(position)?.backgroundDateMovie}"
        Glide.with(holder.itemView.context).load(urlImage).into(holder.itemView.image_other_movie)
        holder.itemView.title.text = getItem(position)?.titleMovie
        holder.itemView.date_release.text = getItem(position)?.releaseDateMovie
        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(getItem(position)?.idMovie)
        }
    }
}