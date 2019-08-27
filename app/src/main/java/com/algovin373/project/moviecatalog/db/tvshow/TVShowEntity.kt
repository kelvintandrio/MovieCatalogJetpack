package com.algovin373.project.moviecatalog.db.tvshow

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TVShowEntity(
    @field:PrimaryKey(autoGenerate = true) @field:ColumnInfo(name = "idTVShow") val tvShowId: Int,
    @field:ColumnInfo(name = "posterTVShow") val tvShowPoster: String,
    @field:ColumnInfo(name = "titleTVShow") val tvShowTitle: String,
    @field:ColumnInfo(name = "releaseDateTVShow") val tvShowReleaseDate: String
)
