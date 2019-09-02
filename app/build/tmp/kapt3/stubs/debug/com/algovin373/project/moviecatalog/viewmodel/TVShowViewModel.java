package com.algovin373.project.moviecatalog.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/algovin373/project/moviecatalog/viewmodel/TVShowViewModel;", "Landroidx/lifecycle/ViewModel;", "tvShowRepository", "Lcom/algovin373/project/moviecatalog/repository/TVShowRepository;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/algovin373/project/moviecatalog/repository/TVShowRepository;Lio/reactivex/disposables/CompositeDisposable;)V", "myDataTVShow", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/algovin373/project/moviecatalog/model/DataTVShow;", "myDataTVShowAiringToday", "getDataTVShow", "Landroidx/lifecycle/LiveData;", "type", "", "getDataTVShowAiringToday", "onCleared", "", "app_debug"})
public final class TVShowViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> myDataTVShow = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> myDataTVShowAiringToday = null;
    private final com.algovin373.project.moviecatalog.repository.TVShowRepository tvShowRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getDataTVShowAiringToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.algovin373.project.moviecatalog.model.DataTVShow>> getDataTVShow(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public TVShowViewModel(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.TVShowRepository tvShowRepository, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}