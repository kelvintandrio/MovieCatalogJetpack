package com.algovin373.project.moviecatalog.db.tvshow

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TVShowEntity::class], version = 1)
abstract class TVShowDatabase : RoomDatabase() {
    abstract fun tvShowDao() : TVShowDao

    companion object {
        private val sLock = Any()
        private var INSTANCE: TVShowDatabase? = null

        fun getInstance(context: Context): TVShowDatabase {
            synchronized(sLock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        TVShowDatabase::class.java, "TVShowFavorite.db"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE as TVShowDatabase
            }
        }
    }
}
