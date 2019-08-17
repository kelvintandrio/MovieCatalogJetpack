package com.algovin373.project.moviecatalog.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class MovieViewModelTest {
    @Rule @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var observer: Observer<List<DataMovie>>

    @Mock
    lateinit var movieRepository: MovieRepository

    lateinit var movieViewModel: MovieViewModel
    private var apiService = MyRetrofit.iniRetrofitMovie()
    private val movieNowPlaying = "now playing"
    private val moviePopular = "popular"
    private val movieTopRelated = "top related"
    private val movieUpcoming = "upcoming"

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieViewModel = MovieViewModel(movieRepository)
    }

    @Test
    fun getDataMovieNowPlaying() {
        movieViewModel.getDataMovieNowPlaying()

        // For Dummy Data using ApiService
        apiService.getDataMovieNowPlaying()
            .map { it.dataMovie?.take(7) }
            .subscribe(
                {
                    argumentCaptor<StatusResponse>().apply {
                        Mockito.verify(movieRepository).getMovieNowPlaying(capture())
                        firstValue.onSuccess(it!!) // --> "it" is Dummy Data
                    }

                    movieViewModel.getDataMovieNowPlaying().observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }

    @Test // For Movie : Now Playing
    fun getDataMovie01() {
        movieViewModel.getDataMovie(movieNowPlaying)

        apiService.getDataMovieNowPlaying()
            .map { it.dataMovie }
            .subscribe(
                {
                    argumentCaptor<StatusResponse>().apply {
                        Mockito.verify(movieRepository).getDataMovie(movieNowPlaying, capture())
                        firstValue.onSuccess(it!!) // --> "it" is Dummy Data
                    }

                    movieViewModel.getDataMovie(movieNowPlaying).observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }

    @Test // For Movie : Popular
    fun getDataMovie02() {
        movieViewModel.getDataMovie(moviePopular)

        apiService.getDataMoviePopular()
            .map { it.dataMovie }
            .subscribe(
                {
                    argumentCaptor<StatusResponse>().apply {
                        Mockito.verify(movieRepository).getDataMovie(moviePopular, capture())
                        firstValue.onSuccess(it!!) // --> "it" is Dummy Data
                    }

                    movieViewModel.getDataMovie(moviePopular).observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }

    @Test // For Movie : Top Related
    fun getDataMovie03() {
        movieViewModel.getDataMovie(movieTopRelated)

        apiService.getDataMovieTopRated()
            .map { it.dataMovie }
            .subscribe(
                {
                    argumentCaptor<StatusResponse>().apply {
                        Mockito.verify(movieRepository).getDataMovie(movieTopRelated, capture())
                        firstValue.onSuccess(it!!) // --> "it" is Dummy Data
                    }

                    movieViewModel.getDataMovie(movieTopRelated).observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }

    @Test // For Movie : Upcoming
    fun getDataMovie04() {
        movieViewModel.getDataMovie(movieUpcoming)

        apiService.getDataMovieUpComing()
            .map { it.dataMovie }
            .subscribe(
                {
                    argumentCaptor<StatusResponse>().apply {
                        Mockito.verify(movieRepository).getDataMovie(movieUpcoming, capture())
                        firstValue.onSuccess(it!!) // --> "it" is Dummy Data
                    }

                    movieViewModel.getDataMovie(movieUpcoming).observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }
}