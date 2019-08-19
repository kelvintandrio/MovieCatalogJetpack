package com.algovin373.project.moviecatalog.ui.fragment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.algokelvin373.project.moviecatalog.testing.AlternativeFragmentActivity
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import com.algovin373.project.moviecatalog.utils.RVItemCountAssertion
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/*
Scenario Instrumentation Testing :
1. Testing to can display data Movie in RecyclerView ( complete )
2. Testing to check that the Data Movie is 10 in RecyclerView ( complete )
 */

class MovieFragmentTest {
    private val idlingResource = EspressoIdlingResource()

    @Rule @JvmField
    var fragmentMovieRule: ActivityTestRule<AlternativeFragmentActivity> = ActivityTestRule(AlternativeFragmentActivity::class.java)
    private val movieFragment = MovieFragment()

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(idlingResource.getEspressoIdlingResource())
        fragmentMovieRule.activity.setFragment(movieFragment)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(idlingResource.getEspressoIdlingResource())
    }

    @Test
    fun loadCourses() {
        onView(withId(R.id.rv_movie_now_playing)).check(matches(isDisplayed())) // Point No. 1
        Thread.sleep(5000)
        onView(withId(R.id.rv_movie_now_playing)).check(RVItemCountAssertion(7)) // Point No. 2
    }
}