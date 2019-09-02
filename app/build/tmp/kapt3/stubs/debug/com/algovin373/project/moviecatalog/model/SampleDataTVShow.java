package com.algovin373.project.moviecatalog.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Ji\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006+"}, d2 = {"Lcom/algovin373/project/moviecatalog/model/SampleDataTVShow;", "Landroid/os/Parcelable;", "idTVShow", "", "titleTVShow", "firstDateTVShow", "seasonsTVShow", "episodesTVShow", "voteAverageTVShow", "voteCountTVShow", "overviewTVShow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEpisodesTVShow", "()Ljava/lang/String;", "getFirstDateTVShow", "getIdTVShow", "getOverviewTVShow", "getSeasonsTVShow", "getTitleTVShow", "getVoteAverageTVShow", "getVoteCountTVShow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class SampleDataTVShow implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String titleTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String firstDateTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String seasonsTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String episodesTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String voteAverageTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String voteCountTVShow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String overviewTVShow = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitleTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstDateTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSeasonsTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEpisodesTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVoteAverageTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVoteCountTVShow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverviewTVShow() {
        return null;
    }
    
    public SampleDataTVShow(@org.jetbrains.annotations.Nullable()
    java.lang.String idTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String titleTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String firstDateTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String seasonsTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String episodesTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String voteAverageTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String voteCountTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String overviewTVShow) {
        super();
    }
    
    public SampleDataTVShow() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.algovin373.project.moviecatalog.model.SampleDataTVShow copy(@org.jetbrains.annotations.Nullable()
    java.lang.String idTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String titleTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String firstDateTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String seasonsTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String episodesTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String voteAverageTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String voteCountTVShow, @org.jetbrains.annotations.Nullable()
    java.lang.String overviewTVShow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}