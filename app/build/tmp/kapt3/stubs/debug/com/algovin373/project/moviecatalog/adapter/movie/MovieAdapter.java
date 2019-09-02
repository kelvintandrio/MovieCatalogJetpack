package com.algovin373.project.moviecatalog.adapter.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/algovin373/project/moviecatalog/adapter/movie/MovieAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/algovin373/project/moviecatalog/model/DataMovie;", "Lcom/algovin373/project/moviecatalog/viewholder/MovieCatalogViewHolder;", "type", "", "catalogClickListener", "Lcom/algovin373/project/moviecatalog/onclicklisterner/CatalogClickListener;", "(ILcom/algovin373/project/moviecatalog/onclicklisterner/CatalogClickListener;)V", "typeLayout", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class MovieAdapter extends androidx.paging.PagedListAdapter<com.algovin373.project.moviecatalog.model.DataMovie, com.algovin373.project.moviecatalog.viewholder.MovieCatalogViewHolder> {
    private int typeLayout;
    private final int type = 0;
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
    
    public MovieAdapter(int type, @org.jetbrains.annotations.NotNull()
    com.algovin373.project.moviecatalog.onclicklisterner.CatalogClickListener catalogClickListener) {
        super(null);
    }
}