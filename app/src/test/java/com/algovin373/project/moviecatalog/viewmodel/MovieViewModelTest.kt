package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieInter
import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie
import io.reactivex.disposables.CompositeDisposable
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*
import java.net.HttpURLConnection

class MovieViewModelTest {
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var apiServiceMovie: RestApiMovie
    private lateinit var compositeDisposable: CompositeDisposable
    private var mockWebServer = MockWebServer()

    private var movieRepository = mock(MovieInter::class.java)

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
        compositeDisposable = CompositeDisposable()

        mockWebServer.start()
        apiServiceMovie = MyRetrofit.iniRetrofitMovie()
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }

    @Test
    fun getDataMovie() {

        // Assign
        val response = MockResponse().setResponseCode(HttpURLConnection.HTTP_OK)
        mockWebServer.enqueue(response)

        // Act
        val data = apiServiceMovie.getDataMovieNowPlaying()
        val dummyDataMovieNowPlaying = MutableLiveData<List<DataMovie>>()

        // Assert
        data.map { it.dataMovie }
            .subscribe(
                {
                    dummyDataMovieNowPlaying.value = it
                    `when` (movieRepository.getMovieNowPlaying(compositeDisposable)).thenReturn(dummyDataMovieNowPlaying)
                    val observer = mock(Observer::class.java) as Observer<List<DataMovie>>
                    movieViewModel.getDataMovieNowPlaying().observeForever(observer)
                    verify<Any>(movieRepository.getMovieNowPlaying(compositeDisposable))
                },
                { }
            )
    }
}