package com.algovin373.project.moviecatalog.idleresource

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

class EspressoIdlingResource {
    private val resource = "GLOBAL"
    private val espressoTestIdlingResource = CountingIdlingResource(resource)

    fun increment() {
        espressoTestIdlingResource.increment()
    }

    fun decrement() {
        espressoTestIdlingResource.decrement()
    }

    fun getEspressoIdlingResource(): IdlingResource {
        return espressoTestIdlingResource
    }
}