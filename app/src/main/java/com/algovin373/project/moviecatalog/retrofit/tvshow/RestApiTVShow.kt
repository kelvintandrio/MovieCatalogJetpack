package com.algovin373.project.moviecatalog.retrofit.tvshow

import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.model.TVShow
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiTVShow {

    @GET("/3/tv/airing_today?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataTVShowAiringToday() : Observable<TVShow>

    @GET("/3/tv/popular?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataTVShowPopularToday() : Observable<TVShow>

    @GET("/3/tv/top_rated?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataTVShowTopRatedToday() : Observable<TVShow>

    @GET("/3/tv/on_the_air?api_key=${BuildConfig.API_KEY}&language=en-US")
    fun getDataTVShowOnTheAirToday() : Observable<TVShow>
}