package com.algovin373.project.moviecatalog.repository.inter.tvshow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010\fJ,\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H&J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H&\u00a2\u0006\u0002\u0010\u0019J3\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a2\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a2\u0006\u0002\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u001e"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/TVShowInter;", "", "getCastTVShow", "Landroidx/lifecycle/LiveData;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "idMovie", "", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;)Landroidx/lifecycle/LiveData;", "getDataTVShow", "Landroidx/paging/PagedList;", "Lcom/algovin373/project/moviecatalog/model/DataTVShow;", "type", "", "statusResponseTVShow", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;", "getDetailTVShow", "Lcom/algovin373/project/moviecatalog/model/DetailTVShow;", "idTVShow", "statusResponseDetailTVShow", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseDetailTVShow;", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseDetailTVShow;)Landroidx/lifecycle/LiveData;", "getRecommendationTVShow", "(Ljava/lang/Integer;Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;)Landroidx/lifecycle/LiveData;", "getSimilarTVShow", "getTVShowAiringToday", "app_debug"})
public abstract interface TVShowInter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getTVShowAiringToday(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataTVShow>> getDataTVShow(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailTVShow> getDetailTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idTVShow, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseDetailTVShow statusResponseDetailTVShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getRecommendationTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getSimilarTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataCast>> getCastTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idMovie, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast);
}