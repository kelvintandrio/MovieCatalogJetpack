package com.algovin373.project.moviecatalog.ui.activity

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.algovin373.project.moviecatalog.R
import com.algovin373.project.moviecatalog.idleresource.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/*
Scenario Instrumentation Testing :
A. In Section "MovieActivityTest" : ( complete )
    1. Testing to check Data Movie and Movie Now Playing can display in RecyclerView
    2. Testing to get choose Data Movie in index n                          ------
    3. Testing to check that the data movie title is match or not                 | -> Testing until n data Movie
    4. Testing to get return to Main Menu ( MainActivity ) with Button Back ------
B. In Section "TVShowActivityTest" : ( complete )
    1. Testing to check Data TVShow can display in RecyclerView.
       Note : Before do that, must make action to page TVShowFragment in ViewPager.
    2. Testing to get choose Data TVShow in index n                         -------
    3. Testing to check that the data tv show title is match or not                | -> Testing until n data TVShow
    4. Testing to get return to Main Menu ( MainActivity ) with Button Back -------

Note : For detail data can testing in DetailMovieActivity and DetailTVShowActivity
*/

class MainActivityTest {
    private val idlingResource = EspressoIdlingResource()

    @Rule @JvmField
    var mainActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(idlingResource.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(idlingResource.getEspressoIdlingResource())
    }

    /* This is section to testing Data Movie */
    @Test
    fun toMovieActivityTest() {
        // Point A1
//        Thread.sleep(5000)
        onView(withId(R.id.progress_content_movie_now_playing)).check(matches(isDisplayed()))
        Thread.sleep(5000)
        onView(withId(R.id.rv_movie_now_playing)).check(matches(isDisplayed()))
        // Testing until 10 data Movie
        /*for(i in 0 until dataMovie().size) {
            // Point A2
            onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(i, click()))

            //Point A3
            onView(withId(R.id.title_catalog_movie)).check(matches(isDisplayed()))
            onView(withId(R.id.title_catalog_movie)).check(matches(withText(dummyDataMovie[i].title)))

            // Point A4
            onView(withId(R.id.btn_back_to_menu)).check(matches(isDisplayed()))
            onView(withId(R.id.btn_back_to_menu)).perform(click())
        }*/
    }

    /* This is section to testing Data TVShow */
    /*@Test
    fun toTVShowActivityTest() {
        // Point B1
        // This line to go to page 1 -> TVShowFragment in ViewPager
        *//*onView(withId(R.id.main_viewpager)).perform(ViewPagerActions.scrollToPage(1))
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))*//*

        // Testing until 10 data TV Show
        *//*for(i in 0 until dataTVShow().size) {
            // Point B2
            onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(i, click()))

            //Point B3
            onView(withId(R.id.title_catalog_movie)).check(matches(isDisplayed()))
            onView(withId(R.id.title_catalog_movie)).check(matches(withText(dummyDataTVShow[i].title)))

            // Point B4
            onView(withId(R.id.btn_back_to_menu)).check(matches(isDisplayed()))
            onView(withId(R.id.btn_back_to_menu)).perform(click())
        }*//*
    }*/
}