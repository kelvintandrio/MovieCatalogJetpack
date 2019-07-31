package com.algovin373.project.moviecatalog.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var movieViewMode: MovieViewModel

    @Before
    fun setUp() {
        movieViewMode = MovieViewModel()
    }

    @Test
    fun getDataMovie() {
        val dataMovie = movieViewMode.getDataMovie()
        assertNotNull(dataMovie) /* To check condition null data Movie */
        assertEquals(10, dataMovie.size) /* To check that data Movie is 10 data */
        assertEquals("A Star is Born", dataMovie[0].title) /* To check that the title "A Star is Born" in index 0 */
    }
}