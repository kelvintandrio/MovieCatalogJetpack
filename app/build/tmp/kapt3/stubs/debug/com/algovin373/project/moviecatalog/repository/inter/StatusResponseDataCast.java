package com.algovin373.project.moviecatalog.repository.inter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/algovin373/project/moviecatalog/repository/inter/StatusResponseDataCast;", "", "onFailed", "", "onSuccess", "data", "", "Lcom/algovin373/project/moviecatalog/model/DataCast;", "app_debug"})
public abstract interface StatusResponseDataCast {
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<com.algovin373.project.moviecatalog.model.DataCast> data);
    
    public abstract void onFailed();
}