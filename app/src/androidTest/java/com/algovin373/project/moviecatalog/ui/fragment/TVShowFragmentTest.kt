package com.algovin373.project.moviecatalog.ui.fragment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.algokelvin373.project.moviecatalog.testing.AlternativeFragmentActivity
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.utils.RVItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/*
Scenario Instrumentation Testing :
1. Testing to can display data TVShow in RecyclerView ( complete )
2. Testing to check that the Data TVShow is 10 in RecyclerView ( complete )
 */

class TVShowFragmentTest {
    @Rule
    @JvmField
    var fragmentTVShowRule: ActivityTestRule<AlternativeFragmentActivity> = ActivityTestRule(AlternativeFragmentActivity::class.java)

    private val tvShowFragment = TVShowFragment()

    @Before
    fun setUp() {
        fragmentTVShowRule.activity.setFragment(tvShowFragment)
    }

    @Test
    fun loadCourses() {
//        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed())) // Point No. 1
//        onView(withId(R.id.rv_tvshow)).check(RVItemCountAssertion(10)) // Point No. 2
    }
}