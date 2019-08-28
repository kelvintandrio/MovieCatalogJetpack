package com.algovin373.project.moviecatalog.db.movie

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MovieDao {
    @Query("SELECT * FROM movieentity")
    fun getDataMovieFavorite() : DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieentity WHERE idMovie = :id")
    fun checkDataMovieFavorite(id: Int) : List<MovieEntity>

    @Insert
    fun insertMovieFavorite(movieFavorite: MovieEntity)

    @Query("DELETE FROM movieentity WHERE idMovie = :id")
    fun deleteMovieFavorite(id: Int)

}