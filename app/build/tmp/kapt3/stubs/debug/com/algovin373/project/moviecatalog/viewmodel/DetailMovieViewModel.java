package com.algovin373.project.moviecatalog.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J!\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 J+\u0010!\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\"0\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001aJ!\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001aJ!\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/algovin373/project/moviecatalog/viewmodel/DetailMovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/algovin373/project/moviecatalog/repository/MovieRepository;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/algovin373/project/moviecatalog/repository/MovieRepository;Lio/reactivex/disposables/CompositeDisposable;)V", "myCastMovie", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "myDetailMovie", "Lcom/algovin373/project/moviecatalog/model/DetailMovie;", "myKeywordMovie", "Ljava/util/ArrayList;", "Lcom/algovin373/project/moviecatalog/model/Keyword;", "myRecommendationMovie", "Lcom/algovin373/project/moviecatalog/model/DataMovie;", "mySimilarMovie", "checkDataMovieFavorite", "", "context", "Landroid/content/Context;", "id", "setCastMovie", "Landroidx/lifecycle/LiveData;", "(Ljava/lang/Integer;)Landroidx/lifecycle/LiveData;", "setDeleteMovieFavorite", "", "setDetailMovie", "setInsertMovieFavorite", "movieFavorite", "Lcom/algovin373/project/moviecatalog/db/movie/MovieEntity;", "setKeywordMovie", "Lkotlin/collections/ArrayList;", "setRecommendationMovie", "setSimilarMovie", "app_debug"})
public final class DetailMovieViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.algovin373.project.moviecatalog.model.DetailMovie> myDetailMovie = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.algovin373.project.moviecatalog.model.Keyword>> myKeywordMovie = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataCast>> myCastMovie = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> mySimilarMovie = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> myRecommendationMovie = null;
    private final com.algovin373.project.moviecatalog.repository.MovieRepository movieRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailMovie> setDetailMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.algovin373.project.moviecatalog.model.Keyword>> setKeywordMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataCast>> setCastMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> setSimilarMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> setRecommendationMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    public final void setInsertMovieFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.db.movie.MovieEntity movieFavorite) {
    }
    
    public final int checkDataMovieFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
        return 0;
    }
    
    public final void setDeleteMovieFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
    }
    
    public DetailMovieViewModel(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.MovieRepository movieRepository, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}