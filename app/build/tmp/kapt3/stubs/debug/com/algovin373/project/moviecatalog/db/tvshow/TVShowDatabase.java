package com.algovin373.project.moviecatalog.db.tvshow;

import java.lang.System;

@androidx.room.Database(entities = {com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/algovin373/project/moviecatalog/db/tvshow/TVShowDatabase;", "Landroidx/room/RoomDatabase;", "()V", "tvShowDao", "Lcom/algovin373/project/moviecatalog/db/tvshow/TVShowDao;", "Companion", "app_debug"})
public abstract class TVShowDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.Object sLock = null;
    private static com.algovin373.project.moviecatalog.db.tvshow.TVShowDatabase INSTANCE;
    public static final com.algovin373.project.moviecatalog.db.tvshow.TVShowDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.algovin373.project.moviecatalog.db.tvshow.TVShowDao tvShowDao();
    
    public TVShowDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/algovin373/project/moviecatalog/db/tvshow/TVShowDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/algovin373/project/moviecatalog/db/tvshow/TVShowDatabase;", "sLock", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.algovin373.project.moviecatalog.db.tvshow.TVShowDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}