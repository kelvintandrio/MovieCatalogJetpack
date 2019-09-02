package com.algovin373.project.moviecatalog.repository.inter.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&\u00a8\u0006\t"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/inter/movie/StatusResponseKeywordMovie;", "", "onFailed", "", "onSuccess", "dataKeyword", "Ljava/util/ArrayList;", "Lcom/algovin373/project/moviecatalog/model/Keyword;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface StatusResponseKeywordMovie {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.algovin373.project.moviecatalog.model.Keyword> dataKeyword);
    
    public abstract void onFailed();
}