package com.algovin373.project.moviecatalog.viewmodel

import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.Movie
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {
    private lateinit var detailMovieViewModel : DetailMovieViewModel
    private lateinit var dummyDataMovie : Movie

    @Before
    fun setUp() {
        detailMovieViewModel = DetailMovieViewModel()
        dummyDataMovie = Movie(
            R.drawable.movie_poster_a_start_is_born,
            "A Star is Born", "October 3, 2018", 2018,
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about " +
                    "given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's " +
                    "career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle " +
                    "with his own internal demons.",
            "Bradley Cooper",
            "Will Fetters, Eric Roth"
        )
    }

    /*@Test
    fun setDataMovie() { } // This method just to set Data Movie. */

    @Test
    fun getImage() {
        detailMovieViewModel.setDataMovie(dummyDataMovie) /* Must setData in every method "get" to get check data Movie */
        assertNotNull(detailMovieViewModel.getImage())
        assertEquals(dummyDataMovie.image, detailMovieViewModel.getImage())
    }

    @Test
    fun getTitle() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getTitle())
        assertEquals(dummyDataMovie.title, detailMovieViewModel.getTitle())
    }

    @Test
    fun getDateRelease() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getDateRelease())
        assertEquals(dummyDataMovie.date_release, detailMovieViewModel.getDateRelease())
    }

    @Test
    fun getYear() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getYear())
        assertEquals(dummyDataMovie.year_release, detailMovieViewModel.getYear())
    }

    @Test
    fun getOverview() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getOverview())
        assertEquals(dummyDataMovie.overview, detailMovieViewModel.getOverview())
    }

    @Test
    fun getDirector() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getDirector())
        assertEquals(dummyDataMovie.director, detailMovieViewModel.getDirector())
    }

    @Test
    fun getScreenplay() {
        detailMovieViewModel.setDataMovie(dummyDataMovie)
        assertNotNull(detailMovieViewModel.getScreenplay())
        assertEquals(dummyDataMovie.screenplay, detailMovieViewModel.getScreenplay())
    }
}