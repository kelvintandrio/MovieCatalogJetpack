package com.algovin373.project.moviecatalog.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.db.tvshow.TVShowDatabase
import com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.DetailTVShow
import com.algovin373.project.moviecatalog.repository.TVShowRepository
import com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseDetailTVShow
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow
import io.reactivex.disposables.CompositeDisposable
import org.jetbrains.anko.toast

class DetailTVShowViewModel(private val tvShowRepository: TVShowRepository,
                            private val compositeDisposable: CompositeDisposable) : ViewModel() {
    private val myDetailTVShow = MutableLiveData<DetailTVShow>()

    fun setDetailTVShow(id: Int?) : LiveData<DetailTVShow> {
        tvShowRepository.getDetailTVShow(id, compositeDisposable, object : StatusResponseDetailTVShow {
            override fun onSuccess(data: DetailTVShow) = myDetailTVShow.postValue(data)
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
        return myDetailTVShow
    }

    fun setCastTVShow(id: Int?) : LiveData<PagedList<DataCast>> {
        return tvShowRepository.getCastTVShow(id, compositeDisposable, object :
            StatusResponseDataCast {
            override fun onSuccess(data: List<DataCast>) { }
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
    }

    fun setSimilarTVShow(id: Int?) : LiveData<PagedList<DataTVShow>> {
        return tvShowRepository.getSimilarTVShow(id, compositeDisposable, object : StatusResponseTVShow {
            override fun onSuccess(list: List<DataTVShow>) { }
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
    }

    fun setRecommendationTVShow(id: Int?) : LiveData<PagedList<DataTVShow>> {
        return tvShowRepository.getRecommendationTVShow(id, compositeDisposable, object :StatusResponseTVShow {
            override fun onSuccess(list: List<DataTVShow>) { }
            override fun onFailed() {
                Log.i("TES", "Failed")
            }
        })
    }

    fun setInsertTVShowFavorite(context: Context, tvShowEntity: TVShowEntity) {
        val tvShowDatabase = TVShowDatabase.getInstance(context)
        tvShowDatabase.tvShowDao().insertTVShowFavorite(tvShowEntity)
        context.toast("Success input to TV Show Favorite")
    }

    fun checkDataTVShowFavorite(context: Context, id: Int) : Int {
        val tvShowDatabase = TVShowDatabase.getInstance(context)
        val data = tvShowDatabase.tvShowDao().checkDataTVShowFavorite(id)
        if (data.size == 1)
            return data[0].tvShowId
        return 0
    }

    fun setDeleteTVShowFavorite(context: Context, id: Int) {
        val tvShowDatabase = TVShowDatabase.getInstance(context)
        tvShowDatabase.tvShowDao().deleteTVShowFavorite(id)
        context.toast("Success delete from TV Show Favorite")
    }
}