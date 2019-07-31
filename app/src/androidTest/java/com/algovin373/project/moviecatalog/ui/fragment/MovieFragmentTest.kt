package com.algovin373.project.moviecatalog.ui.fragment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.algokelvin373.project.moviecatalog.testing.AlternativeFragmentActivity
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.utils.RVItemCountAssertion
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MovieFragmentTest {
    @Rule @JvmField
    var fragmentMovieRule: ActivityTestRule<AlternativeFragmentActivity> = ActivityTestRule(AlternativeFragmentActivity::class.java)

    private val movieFragment = MovieFragment()

    @Before
    fun setUp() {
        fragmentMovieRule.activity.setFragment(movieFragment)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun loadCourses() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).check(RVItemCountAssertion(10))
    }
}