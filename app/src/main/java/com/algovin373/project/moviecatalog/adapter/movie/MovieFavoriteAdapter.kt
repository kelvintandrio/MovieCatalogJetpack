package com.algovin373.project.moviecatalog.adapter.movie

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_movie_catalog.view.*

class MovieFavoriteAdapter(private val dataMovieFavorite: List<MovieEntity>, private val context: Context,
                           private val catalogClickListener: CatalogClickListener)
        : RecyclerView.Adapter<MovieCatalogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_movie_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val urlImage = "${BuildConfig.URL_POSTER}${dataMovieFavorite[position].moviePoster}"
        Glide.with(context).load(urlImage).into(holder.itemView.image_movie_catalog)
        holder.itemView.title_movie_catalog.text = dataMovieFavorite[position].movieTitle
        holder.itemView.date_movie_catalog.text = dataMovieFavorite[position].movieReleaseDate
        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(dataMovieFavorite[position].movieId)
        }
    }

    override fun getItemCount(): Int = dataMovieFavorite.size
}