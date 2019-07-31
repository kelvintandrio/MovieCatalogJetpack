package com.algovin373.project.moviecatalog.viewmodel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TVShowViewModelTest {
    private lateinit var tvShowViewModel: TVShowViewModel

    @Before
    fun setUp() {
        tvShowViewModel = TVShowViewModel()
    }


    @Test
    fun getDataTVShow() {
        val dataTVShow = tvShowViewModel.getDataTVShow()
        assertNotNull(dataTVShow) /* To check condition null data TV Show */
        assertEquals(10, dataTVShow.size) /* To check that data TV Show is 10 data */
        assertEquals("Arrow", dataTVShow[0].title) /* To check that the title "Arrow" in index 0 */
    }
}