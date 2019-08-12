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

class DetailTVShowActivityTest {
    /*private val dummyDataTVShow = dataTVShow()[1]

    @Rule
    @JvmField
    var activityDetailTVShowRule: ActivityTestRule<DetailTVShowActivity> =
        object : ActivityTestRule<DetailTVShowActivity>(DetailTVShowActivity::class.java) {
            override fun getActivityIntent(): Intent {
                val targetContext = InstrumentationRegistry.getInstrumentation().targetContext
                val result = Intent(targetContext, DetailTVShowActivity::class.java)
                result.putExtra(DATA_MOVIE_CATALOG, dummyDataTVShow)
                return result
            }
        }

    @Test
    fun loadDetailMovie() {
        // Title
        onView(withId(R.id.title_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.title_catalog_movie)).check(matches(withText(dummyDataTVShow.title)))

        // Image
        onView(withId(R.id.image_movie_catalog)).check(matches(isDisplayed()))

        // Date Release
        onView(withId(R.id.date_release_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.date_release_catalog_movie)).check(matches(withText(dummyDataTVShow.date_release)))

        // Year
        onView(withId(R.id.year_release_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.year_release_catalog_movie)).check(matches(withText(dummyDataTVShow.year_release.toString())))

        // Overview
        onView(withId(R.id.overview_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.overview_catalog_movie)).check(matches(withText(dummyDataTVShow.overview)))

        // Director
        onView(withId(R.id.director_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.director_catalog_movie)).check(matches(withText(dummyDataTVShow.director)))

        // Screenplay
        onView(withId(R.id.screenplay_catalog_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.screenplay_catalog_movie)).check(matches(withText(dummyDataTVShow.screenplay)))
    }*/
}