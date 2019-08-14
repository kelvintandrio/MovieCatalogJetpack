package com.algovin373.project.moviecatalog.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie
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
    lateinit var movieRepositoryTest: MovieRepository

    lateinit var movieViewModel: MovieViewModel

    private lateinit var apiServiceMovie: RestApiMovie

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieViewModel = MovieViewModel(movieRepositoryTest)
        apiServiceMovie = MyRetrofit.iniRetrofitMovie()
    }

    @Test
    fun getDataMovieNowPlaying() {
        val data = apiServiceMovie.getDataMovieNowPlaying()
        movieViewModel.getDataMovieNowPlaying()

        argumentCaptor<StatusResponse>().apply {
            Mockito.verify(movieRepositoryTest).getMovieNowPlaying(capture())
            firstValue.onSuccess()
        }

        // This case is just to get data sample from data API
        data.map { it.dataMovie }
            .subscribe(
                {
                    // And this to verify observer in ViewModel
                    movieViewModel.getDataMovieNowPlaying().observeForever(observer)
                    verify(observer).onChanged(it)
                },
                {

                }
            )
    }
}