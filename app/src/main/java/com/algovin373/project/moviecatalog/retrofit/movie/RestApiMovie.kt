package com.algovin373.project.moviecatalog.retrofit.movie

import com.algovin373.project.moviecatalog.BuildConfig
import com.algovin373.project.moviecatalog.model.Movie
import io.reactivex.Observable
import retrofit2.http.GET

interface RestApiMovie {

    @GET("/3/movie/now_playing?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieNowPlaying() : Observable<Movie>

    @GET("/3/movie/popular?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMoviePopular() : Observable<Movie>

    @GET("/3/movie/top_rated?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieTopRated() : Observable<Movie>

    @GET("/3/movie/upcoming?api_key=${BuildConfig.API_KEY}&language=en-US ")
    fun getDataMovieUpComing() : Observable<Movie>
}