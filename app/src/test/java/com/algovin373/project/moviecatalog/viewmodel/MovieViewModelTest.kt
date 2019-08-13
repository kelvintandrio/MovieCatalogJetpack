package com.algovin373.project.moviecatalog.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.repository.MovieRepository
import com.algovin373.project.moviecatalog.repository.StatusResponse
import com.nhaarman.mockitokotlin2.argumentCaptor
import com.nhaarman.mockitokotlin2.verify
import io.reactivex.disposables.CompositeDisposable
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class MovieViewModelTest {

    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var observer: Observer<String>

    lateinit var movieRepository: MovieRepository

    @Mock
    lateinit var movieViewModel: MovieViewModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        movieRepository = Mockito.spy(MovieRepository())
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getDataMovieNowPlaying() {
        movieViewModel.getDataMovieNowPlaying()
        val compositeDisposable = CompositeDisposable()

        argumentCaptor<StatusResponse>().apply {
            Mockito.verify(movieRepository).getMovieNowPlaying(capture())
            firstValue.onSuccess()
        }
    }
}