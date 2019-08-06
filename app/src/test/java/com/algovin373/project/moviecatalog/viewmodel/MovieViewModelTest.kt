package com.algovin373.project.moviecatalog.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.algovin373.project.moviecatalog.model.DataMovie
import com.algovin373.project.moviecatalog.repository.MovieInter
import com.algovin373.project.moviecatalog.util.dataMovieNowPlaying
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class MovieViewModelTest {
    private var movieViewModel: MovieViewModel? = null
    private var movieRepository = mock(MovieInter::class.java)

    @Before
    fun setUp() {
        this.movieViewModel = MovieViewModel()
    }

    @Test
    fun getDataMovieNowPlaying() {
        val sampleData = MutableLiveData<List<DataMovie>>()
        sampleData.value = dataMovieNowPlaying() // Using method "dataMovieNowPlaying" in ConstantVal to get data from API

        `when` (movieRepository.getMovieNowPlaying()).thenReturn(sampleData)

        val observer = mock(Observer::class.java) as Observer<List<DataMovie>>
        movieViewModel?.getDataMovieNowPlaying()?.observeForever(observer)
        verify<Any>(movieRepository.getMovieNowPlaying())
    }
}