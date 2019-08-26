package com.algovin373.project.moviecatalog.db.tvshow

/*
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
                    ).build()
                }
                return INSTANCE as TVShowDatabase
            }
        }
    }
}*/
