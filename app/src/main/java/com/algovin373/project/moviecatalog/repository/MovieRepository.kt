package com.algovin373.project.moviecatalog.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.model.*
import com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast
import com.algovin373.project.moviecatalog.repository.inter.movie.MovieInter
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseDetailMovie
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseKeywordMovie
import com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MovieRepository : MovieInter {
    private val apiService = MyRetrofit.iniRetrofitMovie()
    private val idlingResource = EspressoIdlingResource()

    override fun getMovieNowPlaying(compositeDisposable: CompositeDisposable, statusResponseMovie: StatusResponseMovie) : LiveData<List<DataMovie>> {
        val myDataMovieNowPlaying = MutableLiveData<List<DataMovie>>()

        compositeDisposable.add(
            apiService.getDataMovieNowPlaying()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(7) }
            .subscribe(
                {
                    statusResponseMovie.onSuccess(it!!)
                    myDataMovieNowPlaying.postValue(it)
                },
                {
                    statusResponseMovie.onFailed()
                }
            ))
        return myDataMovieNowPlaying
    }

    override fun getDataMovie(type: String, compositeDisposable: CompositeDisposable, statusResponseMovie: StatusResponseMovie) : LiveData<List<DataMovie>> {
        val myDataMovie : MutableLiveData<List<DataMovie>> = MutableLiveData()
        var observable : Observable<Movie> = apiService.getDataMovieNowPlaying()
        when(type) {
            "now playing" -> observable = apiService.getDataMovieNowPlaying()
            "popular" -> observable = apiService.getDataMoviePopular()
            "top related" -> observable = apiService.getDataMovieTopRated()
            "upcoming" -> observable = apiService.getDataMovieUpComing()
        }

        compositeDisposable.add(observable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie }
            .subscribe(
                {
                    statusResponseMovie.onSuccess(it!!)
                    myDataMovie.postValue(it)
                },
                {
                    statusResponseMovie.onFailed()
                }
            ))

        return myDataMovie
    }

    override fun getDetailMovie(idMovie: Int?, disposable: CompositeDisposable, statusResponseDetailMovie: StatusResponseDetailMovie): LiveData<DetailMovie> {
        val myDetailMovie: MutableLiveData<DetailMovie> = MutableLiveData()
        disposable.add(apiService.getDetailMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    statusResponseDetailMovie.onSuccess(it!!)
                    myDetailMovie.postValue(it)
                },
                {
                    statusResponseDetailMovie.onFailed()
                }
            ))
        return myDetailMovie
    }

    override fun getKeywordMovie(idMovie: Int?, disposable: CompositeDisposable, statusResponseKeywordMovie: StatusResponseKeywordMovie): LiveData<ArrayList<Keyword>> {
        val myKeywordMovie: MutableLiveData<ArrayList<Keyword>> = MutableLiveData()
        disposable.add(apiService.getKeywordMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.keywordMovie }
            .subscribe(
                {
                    statusResponseKeywordMovie.onSuccess(it!!)
                    myKeywordMovie.postValue(it)
                },
                {
                    statusResponseKeywordMovie.onFailed()
                }
            )
        )
        return myKeywordMovie
    }

    override fun getCastMovie(idMovie: Int?, disposable: CompositeDisposable, statusResponseDataCast: StatusResponseDataCast): LiveData<List<DataCast>> {
        val myCastMovie: MutableLiveData<List<DataCast>> = MutableLiveData()
        disposable.add(apiService.getCastMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataCast }
            .subscribe(
                {
                    statusResponseDataCast.onSuccess(it!!)
                    myCastMovie.postValue(it)
                },
                {
                    statusResponseDataCast.onFailed()
                }
            )
        )
        return myCastMovie
    }

    override fun getSimilarMovie(idMovie: Int?, disposable: CompositeDisposable, statusResponseMovie: StatusResponseMovie): LiveData<List<DataMovie>> {
        val mySimilarMovie: MutableLiveData<List<DataMovie>> = MutableLiveData()
        disposable.add(apiService.getSimilarMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(8) }
            .subscribe(
                {
                    statusResponseMovie.onSuccess(it!!)
                    mySimilarMovie.postValue(it)
                },
                {
                    statusResponseMovie.onFailed()
                }
            )
        )
        return mySimilarMovie
    }

    override fun getRecommendationMovie(idMovie: Int?, disposable: CompositeDisposable, statusResponseMovie: StatusResponseMovie): LiveData<List<DataMovie>> {
        val mySimilarMovie: MutableLiveData<List<DataMovie>> = MutableLiveData()
        disposable.add(apiService.getRecommendtionMovie(idMovie.toString())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it.dataMovie?.take(8) }
            .subscribe(
                {
                    statusResponseMovie.onSuccess(it!!)
                    mySimilarMovie.postValue(it)
                },
                {
                    statusResponseMovie.onFailed()
                }
            )
        )
        return mySimilarMovie
    }
}