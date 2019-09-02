package com.algovin373.project.moviecatalog.adapter.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.movie.MovieDiffUtil
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_tvshow_catalog.view.*

class TVShowAdapter(private val catalogClickListener: CatalogClickListener) : PagedListAdapter<DataTVShow, MovieCatalogViewHolder>(TVShowDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCatalogViewHolder {
        return MovieCatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_tvshow_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: MovieCatalogViewHolder, position: Int) {
        val imageURL = "${BuildConfig.URL_POSTER}${getItem(position)?.backgroundTVShow}"
        Glide.with(holder.itemView.context).load(imageURL).into(holder.itemView.image_tvshow_catalog)
        holder.itemView.title_tvshow_catalog.text = getItem(position)?.titleTVShow
        holder.itemView.date_tvshow_catalog.text = getItem(position)?.firstDateTVShow

        holder.itemView.setOnClickListener {
            catalogClickListener.itemCatalogClick(getItem(position)?.idTVShow)
        }
    }
}

class TVShowDiffUtil : DiffUtil.ItemCallback<DataTVShow>() {
    override fun areItemsTheSame(oldItem: DataTVShow, newItem: DataTVShow): Boolean = oldItem.idTVShow == newItem.idTVShow
    override fun areContentsTheSame(oldItem: DataTVShow, newItem: DataTVShow): Boolean = oldItem == newItem
}