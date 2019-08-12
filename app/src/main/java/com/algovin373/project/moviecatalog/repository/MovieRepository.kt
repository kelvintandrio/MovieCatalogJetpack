package com.algovin373.project.moviecatalog.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.*
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieRepository : MovieInter {
    private val apiService = MyRetrofit.iniRetrofitMovie()
    private val idlingResource = EspressoIdlingResource()

    override fun getMovieNowPlaying(disposable: CompositeDisposable) : LiveData<List<DataMovie>> {
        val myDataMovieNowPlaying = MutableLiveData<List<DataMovie>>()

        idlingResource.increment()
        disposable.add(
            apiService.getDataMovieNowPlaying()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(7) }
            .subscribe(
                {
                    myDataMovieNowPlaying.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))
        if (!idlingResource.getEspressoIdlingResource().isIdleNow) {
            idlingResource.decrement()
        }

        return myDataMovieNowPlaying
    }

    override fun getDataMovie(type: String, disposable: CompositeDisposable) : LiveData<List<DataMovie>> {
        val myDataMovie : MutableLiveData<List<DataMovie>> = MutableLiveData()
        var observable : Observable<Movie> = apiService.getDataMovieNowPlaying()
        when(type) {
            "now playing" -> observable = apiService.getDataMovieNowPlaying()
            "popular" -> observable = apiService.getDataMoviePopular()
            "top related" -> observable = apiService.getDataMovieTopRated()
            "upcoming" -> observable = apiService.getDataMovieUpComing()
        }

        idlingResource.increment()
        disposable.add(observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie }
            .subscribe(
                {
                    myDataMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))
        if (!idlingResource.getEspressoIdlingResource().isIdleNow) {
            idlingResource.decrement()
        }

        return myDataMovie
    }

    override fun getDetailMovie(idMovie: Int?, disposable: CompositeDisposable): LiveData<DetailMovie> {
        val myDetailMovie: MutableLiveData<DetailMovie> = MutableLiveData()
        disposable.add(apiService.getDetailMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    myDetailMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            ))

        return myDetailMovie
    }

    override fun getKeywordMovie(idMovie: Int?, disposable: CompositeDisposable): LiveData<ArrayList<Keyword>> {
        val myKeywordMovie: MutableLiveData<ArrayList<Keyword>> = MutableLiveData()
        disposable.add(apiService.getKeywordMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.keywordMovie }
            .subscribe(
                {
                    myKeywordMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            )
        )
        return myKeywordMovie
    }

    override fun getCastMovie(idMovie: Int?, disposable: CompositeDisposable): LiveData<List<DataCast>> {
        val myCastMovie: MutableLiveData<List<DataCast>> = MutableLiveData()
        disposable.add(apiService.getCastMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataCast }
            .subscribe(
                {
                    myCastMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            )
        )
        return myCastMovie
    }

    override fun getSimilarMovie(idMovie: Int?, disposable: CompositeDisposable): LiveData<List<DataMovie>> {
        val mySimilarMovie: MutableLiveData<List<DataMovie>> = MutableLiveData()
        disposable.add(apiService.getSimilarMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(8) }
            .subscribe(
                {
                    mySimilarMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            )
        )
        return mySimilarMovie
    }

    override fun getRecommendationMovie(idMovie: Int?, disposable: CompositeDisposable): LiveData<List<DataMovie>> {
        val mySimilarMovie: MutableLiveData<List<DataMovie>> = MutableLiveData()
        disposable.add(apiService.getRecommendtionMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(8) }
            .subscribe(
                {
                    mySimilarMovie.postValue(it)
                },
                {
                    Log.e("ERRORGETDATA", it.message)
                }
            )
        )
        return mySimilarMovie
    }
}