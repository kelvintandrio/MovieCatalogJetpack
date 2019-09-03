package com.algovin373.project.moviecatalog.datasource.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/algovin373/project/moviecatalog/datasource/factory/DataSourceFactoryCast;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "statusResponseDataCast", "Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "observable", "Lio/reactivex/Observable;", "Lcom/algovin373/project/moviecatalog/model/Cast;", "(Lio/reactivex/disposables/CompositeDisposable;Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;Lio/reactivex/Observable;)V", "dataSourceCast", "Landroidx/lifecycle/MutableLiveData;", "Lcom/algovin373/project/moviecatalog/datasource/ds/DataSourceCast;", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class DataSourceFactoryCast extends androidx.paging.DataSource.Factory<java.lang.String, com.algovin373.project.moviecatalog.model.DataCast> {
    private final androidx.lifecycle.MutableLiveData<com.algovin373.project.moviecatalog.datasource.ds.DataSourceCast> dataSourceCast = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast = null;
    private final io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> observable = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.String, com.algovin373.project.moviecatalog.model.DataCast> create() {
        return null;
    }
    
    public DataSourceFactoryCast(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.inter.StatusResponseDataCast statusResponseDataCast, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> observable) {
        super();
    }
}