package com.algovin373.project.moviecatalog.repository.inter.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\fJ,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H&J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H&\u00a2\u0006\u0002\u0010\u0019J=\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH&\u00a2\u0006\u0002\u0010 J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H&J3\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a2\u0006\u0002\u0010#J3\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H&\u00a2\u0006\u0002\u0010#\u00a8\u0006%"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/inter/movie/MovieInter;", "", "getCastMovie", "Landroidx/lifecycle/LiveData;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "idMovie", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;)Landroidx/lifecycle/LiveData;", "getDataMovie", "Landroidx/paging/PagedList;", "Lcom/algovin373/project/moviecatalog/model/DataMovie;", "type", "", "compositeDisposable", "statusResponseMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseMovie;", "getDetailMovie", "Lcom/algovin373/project/moviecatalog/model/DetailMovie;", "statusResponseDetailMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseDetailMovie;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseDetailMovie;)Landroidx/lifecycle/LiveData;", "getKeywordMovie", "Ljava/util/ArrayList;", "Lcom/algovin373/project/moviecatalog/model/Keyword;", "Lkotlin/collections/ArrayList;", "statusResponseKeywordMovie", "Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseKeywordMovie;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseKeywordMovie;)Landroidx/lifecycle/LiveData;", "getMovieNowPlaying", "getRecommendationMovie", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseMovie;)Landroidx/lifecycle/LiveData;", "getSimilarMovie", "app_debug"})
public abstract interface MovieInter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getMovieNowPlaying(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataMovie>> getDataMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailMovie> getDetailMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseDetailMovie statusResponseDetailMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.ArrayList<com.algovin373.project.moviecatalog.model.Keyword>> getKeywordMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseKeywordMovie statusResponseKeywordMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataCast>> getCastMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> getSimilarMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataMovie>> getRecommendationMovie(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.movie.StatusResponseMovie statusResponseMovie);
}