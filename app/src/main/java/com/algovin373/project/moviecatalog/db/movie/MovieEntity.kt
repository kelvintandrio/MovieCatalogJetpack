package com.algovin373.project.moviecatalog.db.movie

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "idMovie") val movieId: Int,
    @ColumnInfo(name = "posterMovie") val moviePoster: String,
    @ColumnInfo(name = "titleMovie") val movieTitle: String,
    @ColumnInfo(name = "releaseDateMovie") val movieReleaseDate: String
)