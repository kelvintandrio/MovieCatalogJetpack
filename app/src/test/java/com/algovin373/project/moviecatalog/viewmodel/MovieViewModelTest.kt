package com.algovin373.project.moviecatalog.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.model.Movie
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

class MovieViewModelTest {
    @Rule @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var observer: Observer<List<DataMovie>>

    @Mock
    lateinit var movieRepositoryTest: MovieRepository

    lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieViewModel = MovieViewModel(movieRepositoryTest)
    }

    @Test
    fun getDataMovieNowPlaying() {
        movieViewModel.getDataMovieNowPlaying()

        argumentCaptor<StatusResponse>().apply {
            Mockito.verify(movieRepositoryTest).getMovieNowPlaying(capture())
            firstValue.onSuccess()
        }

        /*movieViewModel.getDataMovieNowPlaying().observeForever(observer)
        verify(movieRepositoryTest).getMovieNowPlaying()*/

        /*movieViewModel.getDataMovieNowPlaying().observeForever(observer)
        verify(observer).onChanged()*/
    }
}