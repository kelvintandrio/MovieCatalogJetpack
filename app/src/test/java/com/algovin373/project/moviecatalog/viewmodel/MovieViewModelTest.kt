package com.algovin373.project.moviecatalog.viewmodel

import com.algovin373.project.moviecatalog.retrofit.MyRetrofit
import com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.net.HttpURLConnection

class MovieViewModelTest {
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var apiServiceMovie: RestApiMovie
//    private var movieRepository: MovieRepository = mock(MovieRepository::class.java)
    private var mockWebServer = MockWebServer()

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
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

        // Assert
        data.map { it.dataMovie?.get(1)?.titleMovie }
            .subscribe(
                {
                    assertEquals("The Lion King", it)
                },
                {

                }
            )
    }
}