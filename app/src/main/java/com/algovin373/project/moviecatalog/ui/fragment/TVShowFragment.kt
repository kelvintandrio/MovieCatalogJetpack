package com.algovin373.project.moviecatalog.ui.fragment

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.adapter.tvshow.TVShowAdapter
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener
import com.algovin373.project.moviecatalog.repository.TVShowRepository
import com.algovin373.project.moviecatalog.ui.activity.DetailTVShowActivity
import com.algovin373.project.moviecatalog.util.statusGone
import com.algovin373.project.moviecatalog.viewmodel.TVShowViewModel
import com.algovin373.project.moviecatalog.viewmodelfactory.TVShowViewModelFactory
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_tvshow.*
import kotlinx.android.synthetic.main.item_tvshow_banner.view.*
import org.jetbrains.anko.startActivity

class TVShowFragment : Fragment() {
    private val tvShowViewModel by lazy {
        ViewModelProviders.of(this,
            TVShowViewModelFactory(tvShowRepository = TVShowRepository(), compositeDisposable = CompositeDisposable()))
            .get(TVShowViewModel::class.java)
    }

    private val catalogClickListener = object : CatalogClickListener {
        override fun itemCatalogClick(id: Int?) {
            requireContext().startActivity<DetailTVShowActivity>("ID" to id)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tvshow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvShowViewModel.getDataTVShowAiringToday().observe(this, Observer { data ->
//            worm_dots_indicator_tvshow.setViewPager(viewpager_tvshow_banner)
//            autoSlide(viewpager_video_banner, videoBanner)

            viewpager_tvshow_banner.setupPageBanner<DataTVShow>(R.layout.item_tvshow_banner, requireContext()) {
                setBanner(data)
                banner {
                    val imageBanner = "${BuildConfig.URL_POSTER}${item?.backgroundTVShow}"
                    viewBanner.title_tvshow_banner.text = item?.titleTVShow
                    Glide.with(this@TVShowFragment).load(imageBanner).into(viewBanner.image_tvshow_banner)
                }
                setWormDotsIndicator(worm_dots_indicator_tvshow)
                autoSlideBanner(true)
            }
        })

        setTVShow(getString(R.string.tvShow_airing_today).toLowerCase())
        tab_layout_tvShow.addTab(tab_layout_tvShow.newTab().setText(R.string.tvShow_airing_today))
        tab_layout_tvShow.addTab(tab_layout_tvShow.newTab().setText(R.string.tvShow_on_the_air))
        tab_layout_tvShow.addTab(tab_layout_tvShow.newTab().setText(R.string.tvShow_popular))
        tab_layout_tvShow.addTab(tab_layout_tvShow.newTab().setText(R.string.tvShow_top_related))
        tabTVShowCatalogOnClick(tab_layout_tvShow)
    }

    private fun tabTVShowCatalogOnClick(tabLayout: TabLayout) {
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                setTVShow(tab?.text.toString().toLowerCase())
            }
        })
    }

    private fun setTVShow(type: String) {
        tvShowViewModel.getDataTVShow(type).observe(this, Observer {
            progress_content_tvShow.visibility = statusGone
            rv_tvShow.apply {
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
                adapter = TVShowAdapter(
                    it,
                    requireActivity(),
                    catalogClickListener
                )
                adapter?.notifyDataSetChanged()
            }
        })
    }

    fun <T> ViewPager.setupPageBanner(layout: Int, context: Context, setBanner: SetBanner<T>.() -> Unit) {
        setBanner(SetBanner(layout, context, this))
    }
}

@Suppress("UNCHECKED_CAST")
class SetBanner<T>(val layout: Int, val context: Context, private val viewPager: ViewPager) {
    var adapterBanner = PageBannerAdapter<T>(layout, context)

    fun banner(banner: Binding<T>.() -> Unit) {
        adapterBanner.setBanner(banner as Binding<*>.() -> Unit)
    }

    fun setBanner(list: List<T>?) {
        adapterBanner.addListBanner(list)
    }

    fun setWormDotsIndicator(wormDotsIndicator: WormDotsIndicator) {
        wormDotsIndicator.setViewPager(viewPager)
    }

    fun autoSlideBanner(boolean: Boolean) {
        if(boolean) {
            var state = 1
            val handler = Handler()
            handler.postDelayed(object : Runnable {
                override fun run() {
                    viewPager.setCurrentItem(state, true)
                    state += 1
                    if (state == adapterBanner.count)
                        state = 0
                    handler.postDelayed(this, 5000)
                }
            }, 5000)
        }
    }

    init {
        viewPager.adapter = adapterBanner
    }
}

class PageBannerAdapter<T>(private val layoutBanner: Int, private val context: Context) : PagerAdapter() {

    private lateinit var setupBanner: Binding<*>.() -> Unit
    private var listBanner: MutableList<T> = mutableListOf()

    override fun isViewFromObject(view: View, o: Any): Boolean = view == o

    override fun getCount(): Int = listBanner.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater
            .from(context)
            .inflate(layoutBanner, container, false)
        bind(setupBanner, listBanner[position], position, view)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    fun bind(setup: Binding<*>.() -> Unit, item: Any?, position: Int, view: View)  {
        Log.i("Tes List Data", "You have process setup")
        setup(Binding(view, item, position))
    }

    fun addListBanner(list: List<T>?) {
        Log.i("Tes List Data", "You have been set list")
        if (list != null) {
            this.listBanner.addAll(list)
            Log.i("Tes List Data", "Total = ${list.size}")
        }
        notifyDataSetChanged()
    }

    fun setBanner(binding: Binding<*>.() -> Unit) {
        Log.i("Tes List Data", "Banner Called")
        this.setupBanner = binding
    }

}

class Binding<T>(val viewBanner: View, val item: T?, val position: Int)

