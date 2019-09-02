package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.algovin373.project.moviecatalog.datasource.factory.DataSourceFactoryTVShow
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.DataCast
import com.algovin373.project.moviecatalog.model.DataTVShow
import com.algovin373.project.moviecatalog.model.DetailTVShow
import com.algovin373.project.moviecatalog.model.TVShow
import com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseDetailTVShow
import com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow
import com.algovin373.project.moviecatalog.repository.inter.tvshow.TVShowInter
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class TVShowRepository : TVShowInter {
    private val apiService = MyRetrofit.iniRetrofitTVShow()

    override fun getTVShowAiringToday(disposable: CompositeDisposable, statusResponseTVShow: StatusResponseTVShow): LiveData<List<DataTVShow>> {
        EspressoIdlingResource.increment()
        val dataBanner = MutableLiveData<List<DataTVShow>>()
        disposable.add(
            apiService.getDataTVShowAiringToday()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map { it.dataTVShow?.take(5) }
                .subscribe(
                    {
                        statusResponseTVShow.onSuccess(it!!)
                        dataBanner.postValue(it)
                        EspressoIdlingResource.decrement()
                    },
                    {
                        statusResponseTVShow.onFailed()
                    }
                )
        )
        return dataBanner
    }

    override fun getDataTVShow(type: String, disposable: CompositeDisposable, statusResponseTVShow: StatusResponseTVShow)
            : LiveData<PagedList<DataTVShow>> {
        return when(type) {
            "airing today" -> LivePagedListBuilder(DataSourceFactoryTVShow(
                disposable, statusResponseTVShow, apiService.getDataTVShowAiringToday(), 1), 5).build()
            "popular" -> LivePagedListBuilder(DataSourceFactoryTVShow(
                disposable, statusResponseTVShow, apiService.getDataTVShowPopularToday(), 1), 5).build()
            "top related" -> LivePagedListBuilder(DataSourceFactoryTVShow(
                disposable, statusResponseTVShow, apiService.getDataTVShowTopRatedToday(), 1), 5).build()
            "on the air" -> LivePagedListBuilder(DataSourceFactoryTVShow(
                disposable, statusResponseTVShow, apiService.getDataTVShowOnTheAirToday(), 1), 5).build()
            else -> LivePagedListBuilder(DataSourceFactoryTVShow(
                disposable, statusResponseTVShow, apiService.getDataTVShowAiringToday(), 1), 5).build()
        }
    }

    override fun getDetailTVShow(idTVShow: Int?, disposable: CompositeDisposable, statusResponseDetailTVShow: StatusResponseDetailTVShow): LiveData<DetailTVShow> {
        EspressoIdlingResource.increment()
        val myDetailTVShow : MutableLiveData<DetailTVShow> = MutableLiveData()
        disposable.add(
            apiService.getDetailTVShow(idTVShow.toString())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        statusResponseDetailTVShow.onSuccess(it!!)
                        myDetailTVShow.postValue(it)
                        EspressoIdlingResource.decrement()
                    },
                    {
                        statusResponseDetailTVShow.onFailed()
                    }
                )
        )
        return myDetailTVShow
    }

    override fun getCastTVShow(idMovie: Int?, disposable: CompositeDisposable, statusResponseDataCast: StatusResponseDataCast): LiveData<List<DataCast>> {
        EspressoIdlingResource.increment()
        val myCastTVShow: MutableLiveData<List<DataCast>> = MutableLiveData()
        disposable.add(apiService.getCastTVShow(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataCast }
            .subscribe(
                {
                    statusResponseDataCast.onSuccess(it!!)
                    myCastTVShow.postValue(it)
                    EspressoIdlingResource.decrement()
                },
                {
                    statusResponseDataCast.onFailed()
                }
            )
        )
        return myCastTVShow
    }

    override fun getSimilarTVShow(idMovie: Int?, disposable: CompositeDisposable, statusResponseTVShow: StatusResponseTVShow): LiveData<List<DataTVShow>> {
        EspressoIdlingResource.increment()
        val mySimilarTVShow: MutableLiveData<List<DataTVShow>> = MutableLiveData()
        disposable.add(apiService.getSimilarTVShow(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataTVShow?.take(8) }
            .subscribe(
                {
                    statusResponseTVShow.onSuccess(it!!)
                    mySimilarTVShow.postValue(it)
                    EspressoIdlingResource.decrement()
                },
                {
                    statusResponseTVShow.onFailed()
                }
            )
        )
        return mySimilarTVShow
    }

    override fun getRecommendationTVShow(idMovie: Int?, disposable: CompositeDisposable, statusResponseTVShow: StatusResponseTVShow): LiveData<List<DataTVShow>> {
        EspressoIdlingResource.increment()
        val myRecommendationTVShow: MutableLiveData<List<DataTVShow>> = MutableLiveData()
        disposable.add(apiService.getRecommendtionTVShow(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataTVShow?.take(8) }
            .subscribe(
                {
                    statusResponseTVShow.onSuccess(it!!)
                    myRecommendationTVShow.postValue(it)
                    EspressoIdlingResource.decrement()
                },
                {
                    statusResponseTVShow.onFailed()
                }
            )
        )
        return myRecommendationTVShow
    }

}