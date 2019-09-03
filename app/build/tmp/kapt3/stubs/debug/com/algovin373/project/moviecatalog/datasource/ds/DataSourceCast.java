package com.algovin373.project.moviecatalog.datasource.ds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J&\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016J&\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00162\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/algovin373/project/moviecatalog/datasource/ds/DataSourceCast;", "Landroidx/paging/ItemKeyedDataSource;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "observable", "Lio/reactivex/Observable;", "Lcom/algovin373/project/moviecatalog/model/Cast;", "(Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;Lio/reactivex/Observable;)V", "getKey", "item", "loadAfter", "", "params", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "app_debug"})
public final class DataSourceCast extends androidx.paging.ItemKeyedDataSource<java.lang.String, com.algovin373.project.moviecatalog.model.DataCast> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast = null;
    private final io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> observable = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadInitialCallback<com.algovin373.project.moviecatalog.model.DataCast> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<com.algovin373.project.moviecatalog.model.DataCast> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadParams<java.lang.String> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.ItemKeyedDataSource.LoadCallback<com.algovin373.project.moviecatalog.model.DataCast> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getKey(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.model.DataCast item) {
        return null;
    }
    
    public DataSourceCast(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> observable) {
        super();
    }
}