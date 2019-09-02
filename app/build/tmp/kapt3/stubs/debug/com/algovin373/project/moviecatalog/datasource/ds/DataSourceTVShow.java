package com.algovin373.project.moviecatalog.datasource.ds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J&\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J&\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J&\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/algovin373/project/moviecatalog/datasource/ds/DataSourceTVShow;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lcom/algovin373/project/moviecatalog/model/DataTVShow;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseTVShow", "Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;", "observable", "Lio/reactivex/Observable;", "Lcom/algovin373/project/moviecatalog/model/TVShow;", "type", "", "(Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/tvshow/StatusResponseTVShow;Lio/reactivex/Observable;I)V", "getKey", "item", "loadAfter", "", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "app_debug"})
public final class DataSourceTVShow extends androidx.paging.ItemKeyedDataSource<java.lang.String, com.algovin373.project.moviecatalog.model.DataTVShow> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow = null;
    private final io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> observable = null;
    private final int type = 0;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialCallback<com.algovin373.project.moviecatalog.model.DataTVShow> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<com.algovin373.project.moviecatalog.model.DataTVShow> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<com.algovin373.project.moviecatalog.model.DataTVShow> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getKey(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.model.DataTVShow item) {
        return null;
    }
    
    public DataSourceTVShow(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.tvshow.StatusResponseTVShow statusResponseTVShow, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> observable, int type) {
        super();
    }
}