package com.algovin373.project.moviecatalog.model

import com.google.gson.annotations.SerializedName

data class Movie (
    @field:SerializedName("results")
    val dataMovie: ArrayList<DataMovie>? = null
)

data class DataMovie(
    @field:SerializedName("id")
    val idMovie: Int? = null,

    @field:SerializedName("title")
    val titleMovie: String? = null,

    @field:SerializedName("poster_path")
    val posterMovie: String? = null,

    @field:SerializedName("release_date")
    val releaseDateMovie: String? = null
)

data class DetailMovie(
    @field:SerializedName("id")
    val idMovie: Int? = null,

    @field:SerializedName("title")
    val titleMovie: String? = null,

    @field:SerializedName("poster_path")
    val posterMovie: String? = null,

    @field:SerializedName("release_date")
    val releaseDateMovie: String? = null
)
