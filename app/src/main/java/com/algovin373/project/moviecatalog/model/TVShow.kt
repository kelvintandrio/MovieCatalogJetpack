package com.algovin373.project.moviecatalog.model

data class TVShow(
    val image: Int,
    val title: String,
    val date_release: String,
    val year_release: Int,
    val overview: String,
    val director: String,
    val screenplay: String
)