package com.algovin373.project.moviecatalog.adapter.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_catalog_other.view.*

class OtherAdapterTVShow(private val catalogClickListener: CatalogClickListener)
            : PagedListAdapter<DataTVShow, MovieCatalogViewHolder>(TVShowDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_catalog_other, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val urlImage = "${BuildConfig.URL_POSTER}${getItem(position)?.backgroundTVShow}"
        Glide.with(holder.itemView.context).load(urlImage).into(holder.itemView.image_other_movie)
        holder.itemView.title.text = getItem(position)?.titleTVShow
        holder.itemView.date_release.text = getItem(position)?.firstDateTVShow
        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(getItem(position)?.idTVShow)
        }
    }
}