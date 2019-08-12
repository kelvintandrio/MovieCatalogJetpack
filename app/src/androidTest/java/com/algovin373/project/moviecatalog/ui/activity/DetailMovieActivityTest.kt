package com.algovin373.project.moviecatalog.ui.activity

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.util.DATA_MOVIE_CATALOG
import org.junit.Rule
import org.junit.Test

/*
Scenario Instrumentation Testing :
- Testing to check match detail data movie ( title, image, date release, year, overview, director, screenplay )
  Note : Using sample data movie index 0 -> "A Star is Born"
 */

class DetailMovieActivityTest {

    /*private val dummyDataMovie = dataMovie()[0]

    @Rule @JvmField
    var activityDetailMovieRule: ActivityTestRule<DetailMovieActivity> =
        object : ActivityTestRule<DetailMovieActivity>(DetailMovieActivity::class.java) {
            override fun getActivityIntent(): Intent {
                val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
                val result = Intent(targetContext, DetailMovieActivity::class.java)
                result.putExtra(DATA_MOVIE_CATALOG, dummyDataMovie)
                return result
            }
    }

    @Test
    fun loadDetailMovie() {
        // Title
        onView(withId(R.id.title_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.title_catalog_movie)).check(matches(withText(dummyDataMovie.title)))

        // Image
        onView(withId(R.id.image_movie_catalog)).check(matches(isDisplayed()))
//        onView(withId(R.id.image_movie_catalog)).check(matches(withText(dummyDataMovie.image.toString())))

        // Date Release
        onView(withId(R.id.date_release_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.date_release_catalog_movie)).check(matches(withText(dummyDataMovie.date_release)))

        // Year
        onView(withId(R.id.year_release_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.year_release_catalog_movie)).check(matches(withText(dummyDataMovie.year_release.toString())))

        // Overview
        onView(withId(R.id.overview_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.overview_catalog_movie)).check(matches(withText(dummyDataMovie.overview)))

        // Director
        onView(withId(R.id.director_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.director_catalog_movie)).check(matches(withText(dummyDataMovie.director)))

        // Screenplay
        onView(withId(R.id.screenplay_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.screenplay_catalog_movie)).check(matches(withText(dummyDataMovie.screenplay)))
    }*/
}