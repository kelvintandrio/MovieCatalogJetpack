package com.algovin373.project.moviecatalog.adapter.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_movie_catalog.view.*

class MovieFavoriteAdapter(private val fragmentActivity: FragmentActivity,
                           private val catalogClickListener: CatalogClickListener)
        : PagedListAdapter<MovieEntity, MovieCatalogViewHolder>(MovieFavoriteDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(fragmentActivity).inflate(R.layout.item_movie_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        Glide.with(fragmentActivity).load(getItem(position)?.moviePoster).into(holder.itemView.image_movie_catalog)
        holder.itemView.title_movie_catalog.text = getItem(position)?.movieTitle
        holder.itemView.date_movie_catalog.text = getItem(position)?.movieReleaseDate
        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(getItem(position)?.movieId)
        }
    }
}

class MovieFavoriteDiffUtil : DiffUtil.ItemCallback<MovieEntity>() {
    override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean = oldItem.movieId == newItem.movieId
    override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean = oldItem == newItem
}