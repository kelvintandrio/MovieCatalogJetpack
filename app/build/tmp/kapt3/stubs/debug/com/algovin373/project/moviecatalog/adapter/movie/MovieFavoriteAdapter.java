package com.algovin373.project.moviecatalog.adapter.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/algovin373/project/moviecatalog/adapter/movie/MovieFavoriteAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/algovin373/project/moviecatalog/db/movie/MovieEntity;", "Lcom/algovin373/project/moviecatalog/viewholder/MovieCatalogViewHolder;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "catalogClickListener", "Lcom/algovin373/project/moviecatalog/onclicklisterner/CatalogClickListener;", "(Landroidx/fragment/app/FragmentActivity;Lcom/algovin373/project/moviecatalog/onclicklisterner/CatalogClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class MovieFavoriteAdapter extends androidx.paging.PagedListAdapter<com.algovin373.project.moviecatalog.db.movie.MovieEntity, com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder> {
    private final androidx.fragment.app.FragmentActivity fragmentActivity = null;
    private final com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener catalogClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder holder, int position) {
    }
    
    public MovieFavoriteAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity fragmentActivity, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener catalogClickListener) {
        super(null);
    }
}