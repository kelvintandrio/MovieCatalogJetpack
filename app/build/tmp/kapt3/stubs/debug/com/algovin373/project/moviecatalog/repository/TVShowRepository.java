package com.algovin373.project.moviecatalog.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J3\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fJ,\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ3\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010\u001eJ$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/TVShowRepository;", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/TVShowInter;", "()V", "apiService", "Lcom/algovin373/project/moviecatalog/retrofit/tvshow/RestApiTVShow;", "getCastTVShow", "Landroidx/lifecycle/LiveData;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "idMovie", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;)Landroidx/lifecycle/LiveData;", "getDataTVShow", "Landroidx/paging/PagedList;", "Lcom/algovin373/project/moviecatalog/model/DataTVShow;", "type", "", "statusResponseTVShow", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;", "getDetailTVShow", "Lcom/algovin373/project/moviecatalog/model/DetailTVShow;", "idTVShow", "statusResponseDetailTVShow", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseDetailTVShow;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseDetailTVShow;)Landroidx/lifecycle/LiveData;", "getRecommendationTVShow", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;)Landroidx/lifecycle/LiveData;", "getSimilarTVShow", "getTVShowAiringToday", "app_debug"})
public final class TVShowRepository implements com.algovin373.project.moviecatalog.repository.inter.tvshow.TVShowInter {
    private final com.algovin373.project.moviecatalog.retrofit.tvshow.RestApiTVShow apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getTVShowAiringToday(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataTVShow>> getDataTVShow(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailTVShow> getDetailTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idTVShow, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseDetailTVShow statusResponseDetailTVShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataCast>> getCastTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getSimilarTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getRecommendationTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow) {
        return null;
    }
    
    public TVShowRepository() {
        super();
    }
}