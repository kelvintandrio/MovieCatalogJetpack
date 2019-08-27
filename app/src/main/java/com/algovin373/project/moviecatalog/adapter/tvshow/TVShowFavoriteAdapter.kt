package com.algovin373.project.moviecatalog.adapter.tvshow

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.movie.MovieFavoriteDiffUtil
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_tvshow_catalog.view.*

class TVShowFavoriteAdapter (private val context: Context,
                             private val catalogClickListener: CatalogClickListener)
        : PagedListAdapter<TVShowEntity, MovieCatalogViewHolder>(TVShowFavoriteDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_tvshow_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val imageURL = "${BuildConfig.URL_POSTER}${getItem(position)?.tvShowPoster}"
        Glide.with(context).load(imageURL).into(holder.itemView.image_tvshow_catalog)
        holder.itemView.title_tvshow_catalog.text = getItem(position)?.tvShowTitle
        holder.itemView.date_tvshow_catalog.text = getItem(position)?.tvShowReleaseDate

        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(getItem(position)?.tvShowId)
        }
    }
}

class TVShowFavoriteDiffUtil : DiffUtil.ItemCallback<TVShowEntity>() {
    override fun areItemsTheSame(oldItem: TVShowEntity, newItem: TVShowEntity): Boolean = oldItem.tvShowId == newItem.tvShowId
    override fun areContentsTheSame(oldItem: TVShowEntity, newItem: TVShowEntity): Boolean = oldItem == newItem
}