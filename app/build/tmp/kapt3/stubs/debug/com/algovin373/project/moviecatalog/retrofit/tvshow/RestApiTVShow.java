package com.algovin373.project.moviecatalog.retrofit.tvshow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/algovin373/project/moviecatalog/retrofit/tvshow/RestApiTVShow;", "", "getCastTVShow", "Lio/reactivex/Observable;", "Lcom/algovin373/project/moviecatalog/model/Cast;", "id", "", "getDataTVShowAiringToday", "Lcom/algovin373/project/moviecatalog/model/TVShow;", "getDataTVShowOnTheAirToday", "getDataTVShowPopularToday", "getDataTVShowTopRatedToday", "getDetailTVShow", "Lcom/algovin373/project/moviecatalog/model/DetailTVShow;", "getRecommendtionTVShow", "getSimilarTVShow", "app_debug"})
public abstract interface RestApiTVShow {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/airing_today?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getDataTVShowAiringToday();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/popular?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getDataTVShowPopularToday();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/top_rated?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getDataTVShowTopRatedToday();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/on_the_air?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getDataTVShowOnTheAirToday();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/{tv_id}?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.DetailTVShow> getDetailTVShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tv_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/{tv_id}/credits?api_key=19978af3bb16e019522fd5077f3018f2")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> getCastTVShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tv_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/{tv_id}/similar?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getSimilarTVShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tv_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/tv/{tv_id}/recommendations?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.TVShow> getRecommendtionTVShow(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "tv_id")
    java.lang.String id);
}