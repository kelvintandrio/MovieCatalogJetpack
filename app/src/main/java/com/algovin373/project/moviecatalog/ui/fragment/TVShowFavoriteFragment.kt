package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.tvshow.TVShowFavoriteAdapter
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.ui.activity.DetailTVShowActivity
import com.algovin373.project.moviecatalog.viewmodel.TVShowFavoriteViewModel
import kotlinx.android.synthetic.main.fragment_tvshow_favorite.*
import org.jetbrains.anko.startActivity

class TVShowFavoriteFragment : Fragment() {

    private val tvShowMovieFavoriteViewModel by lazy {
        ViewModelProviders.of(this).get(TVShowFavoriteViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            requireContext().startActivity<DetailTVShowActivity>("ID" to id)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tvshow_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapterTVShowFavorite = TVShowFavoriteAdapter(requireContext(), catalogClickListener)

        tvShowMovieFavoriteViewModel.setTVShowFavorite(requireContext()).observe(this, Observer {
            adapterTVShowFavorite.submitList(it)
        })

        rv_tv_show_favorite.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = adapterTVShowFavorite
            adapter?.notifyDataSetChanged()
        }
    }
}
