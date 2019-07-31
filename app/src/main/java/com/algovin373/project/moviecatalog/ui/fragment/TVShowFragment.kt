package com.algovin373.project.moviecatalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.TVShowAdapter
import com.algovin373.project.moviecatalog.injection.MovieCatalogInjector
import kotlinx.android.synthetic.main.fragment_tvshow.*

class TVShowFragment : Fragment() {
    private val tvShowViewModel by lazy {
        MovieCatalogInjector.tvshowViewModel(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_tvshow.apply {
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
            adapter = TVShowAdapter(tvShowViewModel.getDataTVShow(), activity)
            adapter?.notifyDataSetChanged()
        }
    }

}
