package com.algovin373.project.moviecatalog.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ!\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J!\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0013J!\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00110\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/algovin373/project/moviecatalog/viewmodel/DetailTVShowViewModel;", "Landroidx/lifecycle/ViewModel;", "tvShowRepository", "Lcom/algovin373/project/moviecatalog/repository/TVShowRepository;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/algovin373/project/moviecatalog/repository/TVShowRepository;Lio/reactivex/disposables/CompositeDisposable;)V", "myDetailTVShow", "Landroidx/lifecycle/MutableLiveData;", "Lcom/algovin373/project/moviecatalog/model/DetailTVShow;", "checkDataTVShowFavorite", "", "context", "Landroid/content/Context;", "id", "setCastTVShow", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "(Ljava/lang/Integer;)Landroidx/lifecycle/LiveData;", "setDeleteTVShowFavorite", "", "setDetailTVShow", "setInsertTVShowFavorite", "tvShowEntity", "Lcom/algovin373/project/moviecatalog/db/tvshow/TVShowEntity;", "setRecommendationTVShow", "Lcom/algovin373/project/moviecatalog/model/DataTVShow;", "setSimilarTVShow", "app_debug"})
public final class DetailTVShowViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.algovin373.project.moviecatalog.model.DetailTVShow> myDetailTVShow = null;
    private final com.algovin373.project.moviecatalog.repository.TVShowRepository tvShowRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.algovin373.project.moviecatalog.model.DetailTVShow> setDetailTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataCast>> setCastTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataTVShow>> setSimilarTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.algovin373.project.moviecatalog.model.DataTVShow>> setRecommendationTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    public final void setInsertTVShowFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.db.tvshow.TVShowEntity tvShowEntity) {
    }
    
    public final int checkDataTVShowFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
        return 0;
    }
    
    public final void setDeleteTVShowFavorite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int id) {
    }
    
    public DetailTVShowViewModel(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.repository.TVShowRepository tvShowRepository, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}