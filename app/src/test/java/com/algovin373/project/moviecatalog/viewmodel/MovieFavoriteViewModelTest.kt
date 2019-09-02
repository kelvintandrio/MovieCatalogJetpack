package com.algovin373.project.moviecatalog.viewmodel

import android.app.Application
import android.app.Instrumentation
import android.content.Context
import android.content.Intent
import android.content.pm.InstrumentationInfo
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import com.algovin373.project.moviecatalog.db.movie.MovieDao
import com.algovin373.project.moviecatalog.db.movie.MovieDatabase
import com.algovin373.project.moviecatalog.db.movie.MovieEntity
import com.algovin373.project.moviecatalog.ui.fragment.MovieFavoriteFragment
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class MovieFavoriteViewModelTest {

    @Rule @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var movieFavoriteViewModel: MovieFavoriteViewModel

    @Before
    fun setUp() {
        movieFavoriteViewModel = MovieFavoriteViewModel()
    }

    @Test
    fun setMovieFavorite() {
        val sampleData = MutableLiveData<PagedList<MovieEntity>>()
        val pagedList = mock(PagedList::class.java) as PagedList<MovieEntity>
//        sampleData.value = pagedList
//
//        `when`(movieFavoriteViewModel.setMovieFavorite(ApplicationProvider.getApplicationContext())).thenReturn(sampleData)

//        val observer = mock(Observer::class.java) as Observer<MovieEntity>
//        val observer = mock(Observer::class.java) as Observer<List<DataMovie>>


        /*val dummyCourse = MutableLiveData<Resource<PagedList<CourseEntity>>>()
        val pagedList = mock<PagedList<*>>(PagedList<*>::class.java)
        dummyCourse.setValue(Resource.success(pagedList))

        `when`(academyRepository.getBookmarkedCoursesPaged()).thenReturn(dummyCourse)

        val observer = mock<Observer<*>>(Observer<*>::class.java)

        viewModel.getBookmarksPaged().observeForever(observer)

        verify<Any>(academyRepository).getBookmarkedCoursesPaged()*/
    }
}