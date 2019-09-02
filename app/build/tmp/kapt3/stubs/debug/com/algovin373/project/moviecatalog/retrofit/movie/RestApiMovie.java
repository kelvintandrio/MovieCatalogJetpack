package com.algovin373.project.moviecatalog.retrofit.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/algovin373/project/moviecatalog/retrofit/movie/RestApiMovie;", "", "getCastMovie", "Lio/reactivex/Observable;", "Lcom/algovin373/project/moviecatalog/model/Cast;", "id", "", "getDataMovieNowPlaying", "Lcom/algovin373/project/moviecatalog/model/Movie;", "getDataMoviePopular", "getDataMovieTopRated", "getDataMovieUpComing", "getDetailMovie", "Lcom/algovin373/project/moviecatalog/model/DetailMovie;", "getKeywordMovie", "Lcom/algovin373/project/moviecatalog/model/KeywordMovie;", "getRecommendtionMovie", "getSimilarMovie", "app_debug"})
public abstract interface RestApiMovie {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/now_playing?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US ")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getDataMovieNowPlaying();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/popular?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US ")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getDataMoviePopular();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/top_rated?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US ")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getDataMovieTopRated();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/upcoming?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US ")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getDataMovieUpComing();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.DetailMovie> getDetailMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/keywords?api_key=19978af3bb16e019522fd5077f3018f2")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.KeywordMovie> getKeywordMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/credits?api_key=19978af3bb16e019522fd5077f3018f2")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Cast> getCastMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/similar?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getSimilarMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/3/movie/{movie_id}/recommendations?api_key=19978af3bb16e019522fd5077f3018f2&language=en-US")
    public abstract io.reactivex.Observable<com.algovin373.project.moviecatalog.model.Movie> getRecommendtionMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movie_id")
    java.lang.String id);
}