package com.algovin373.project.moviecatalog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_cast.view.*

class CastAdapter : PagedListAdapter<DataCast, MovieCatalogViewHolder>(CastDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_cast, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val urlImage = "${BuildConfig.URL_IMAGE}${getItem(position)?.posterCast}"
        Glide.with(holder.itemView.context).load(urlImage).into(holder.itemView.image_cast)
        holder.itemView.name_cast.text = getItem(position)?.nameCast
        holder.itemView.character_cast.text = getItem(position)?.characterCast
    }
}

class CastDiffUtil : DiffUtil.ItemCallback<DataCast>() {
    override fun areItemsTheSame(oldItem: DataCast, newItem: DataCast): Boolean = oldItem.idCast == newItem.idCast
    override fun areContentsTheSame(oldItem: DataCast, newItem: DataCast): Boolean = oldItem == newItem
}