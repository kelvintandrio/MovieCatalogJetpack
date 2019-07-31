package com.algovin373.project.moviecatalog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_movie_catalog.view.*

class TVShowAdapter(private val dataTVShow: ArrayList<TVShow>, private val fragmentActivity: FragmentActivity?) :
    RecyclerView.Adapter<MovieCatalogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder =
        MovieCatalogViewHolder(LayoutInflater.from(fragmentActivity!!).inflate(R.layout.item_movie_catalog, parent, false))

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        Glide.with(fragmentActivity!!).load(dataTVShow[position].image).into(holder.itemView.image_movie_catalog)
        holder.itemView.title_movie_catalog.text = dataTVShow[position].title
        holder.itemView.date_movie_catalog.text = dataTVShow[position].date_release
    }

    override fun getItemCount(): Int = dataTVShow.size
}