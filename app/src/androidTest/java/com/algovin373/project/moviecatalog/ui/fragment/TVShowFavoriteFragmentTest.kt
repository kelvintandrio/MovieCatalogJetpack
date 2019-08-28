package com.algovin373.project.moviecatalog.ui.fragment

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import com.algokelvin373.project.moviecatalog.testing.AlternativeFragmentActivity
import com.algovin373.project.moviecatalog.R
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TVShowFavoriteFragmentTest {
    @Rule
    @JvmField
    var fragmentMovieRule: ActivityTestRule<AlternativeFragmentActivity> = ActivityTestRule(AlternativeFragmentActivity::class.java)
    private val tvShowFavoriteFragment = TVShowFavoriteFragment()

    @Before
    fun setUp() {
        fragmentMovieRule.activity.setFragment(tvShowFavoriteFragment)
    }

    @Test
    fun getMovieFavorite() {
        Espresso.onView(ViewMatchers.withId(R.id.rv_tv_show_favorite)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}