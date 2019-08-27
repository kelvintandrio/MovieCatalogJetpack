package com.algovin373.project.moviecatalog.db.tvshow

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.algovin373.project.moviecatalog.db.movie.MovieEntity

@Dao
interface TVShowDao {
    @Query("SELECT * FROM tvshowentity")
    fun getDataTvShowFavorite() : DataSource.Factory<Int, TVShowEntity>

    @Query("SELECT * FROM tvshowentity WHERE idTVShow = :id")
    fun checkDataTVShowFavorite(id: Int) : List<TVShowEntity>

    @Insert
    fun insertTVShowFavorite(tvShowEntity: TVShowEntity)

    @Query("DELETE FROM tvshowentity WHERE idTVShow = :id")
    fun deleteTVShowFavorite(id: Int)
}