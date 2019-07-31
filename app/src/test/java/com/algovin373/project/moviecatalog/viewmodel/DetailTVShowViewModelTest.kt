package com.algovin373.project.moviecatalog.viewmodel

import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.model.TVShow
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTVShowViewModelTest {
    private lateinit var detailTVShowViewModel : DetailTVShowViewModel
    private lateinit var dummyDataTVShow : TVShow

    @Before
    fun setUp() {
        detailTVShowViewModel = DetailTVShowViewModel()
        dummyDataTVShow = TVShow(
            R.drawable.tvshow_poster_arrow,
            "Arrow", "October 10, 2012", 2012,
            "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. " +
                    "He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed " +
                    "with a bow.",
            "-", "-"
        )
    }

    @Test
    fun getImage() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow) /* Must setData in every method "get" to get check data TVShow */
        assertNotNull(detailTVShowViewModel.getImage())
        assertEquals(dummyDataTVShow.image, detailTVShowViewModel.getImage())
    }

    @Test
    fun getTitle() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getTitle())
        assertEquals(dummyDataTVShow.title, detailTVShowViewModel.getTitle())
    }

    @Test
    fun getDateRelease() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getDateRelease())
        assertEquals(dummyDataTVShow.date_release, detailTVShowViewModel.getDateRelease())
    }

    @Test
    fun getYear() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getYear())
        assertEquals(dummyDataTVShow.year_release, detailTVShowViewModel.getYear())
    }

    @Test
    fun getOverview() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getOverview())
        assertEquals(dummyDataTVShow.overview, detailTVShowViewModel.getOverview())
    }

    @Test
    fun getDirector() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getDirector())
        assertEquals(dummyDataTVShow.director, detailTVShowViewModel.getDirector())
    }

    @Test
    fun getScreenplay() {
        detailTVShowViewModel.setDataTVShow(dummyDataTVShow)
        assertNotNull(detailTVShowViewModel.getScreenplay())
        assertEquals(dummyDataTVShow.screenplay, detailTVShowViewModel.getScreenplay())
    }
}