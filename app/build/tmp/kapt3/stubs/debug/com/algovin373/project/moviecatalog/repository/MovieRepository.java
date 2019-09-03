package com.algovin373.project.moviecatalog.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J3\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001bJ=\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001f0\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010\"J$\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J3\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010%J3\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/MovieRepository;", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/MovieInter;", "()V", "apiService", "Lcom/algovin373/project/moviecatalog/retrofit/movie/RestApiMovie;", "getCastMovie", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "idMovie", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;)Landroidx/lifecycle/LiveData;", "getDataMovie", "Lcom/algovin373/project/moviecatalog/model/DataMovie;", "type", "", "compositeDisposable", "statusResponseMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseMovie;", "getDetailMovie", "Lcom/algovin373/project/moviecatalog/model/DetailMovie;", "statusResponseDetailMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseDetailMovie;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseDetailMovie;)Landroidx/lifecycle/LiveData;", "getKeywordMovie", "Ljava/util/ArrayList;", "Lcom/algovin373/project/moviecatalog/model/Keyword;", "Lkotlin/collections/ArrayList;", "statusResponseKeywordMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseKeywordMovie;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseKeywordMovie;)Landroidx/lifecycle/LiveData;", "getMovieNowPlaying", "getRecommendationMovie", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseMovie;)Landroidx/lifecycle/LiveData;", "getSimilarMovie", "app_debug"})
public final class MovieRepository implements com.algovin373.project.moviecatalog.repository.inter.movie.MovieInter {
    private final com.algovin373.project.moviecatalog.retrofit.movie.RestApiMovie apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getMovieNowPlaying(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getDataMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailMovie> getDetailMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseDetailMovie statusResponseDetailMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.ArrayList<com.algovin373.project.moviecatalog.model.Keyword>> getKeywordMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseKeywordMovie statusResponseKeywordMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataCast>> getCastMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getSimilarMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getRecommendationMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie) {
        return null;
    }
    
    public MovieRepository() {
        super();
    }
}