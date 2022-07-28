package com.experlabs.footballnews.weather.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0010\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003JY\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eJ\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u001eJ\t\u0010$\u001a\u00020\u001eH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/experlabs/footballnews/weather/models/AirQuality;", "", "co", "", "gb_defra_index", "", "no2", "o3", "pm10", "pm2_5", "so2", "us_epa_index", "(DIDDDDDI)V", "getGb_defra_index", "()I", "getUs_epa_index", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "sliced_co", "", "sliced_no2", "sliced_o3", "sliced_pm10", "sliced_pm2_5", "sliced_so2", "toString", "app_debug"})
public final class AirQuality {
    private final double co = 0.0;
    @com.google.gson.annotations.SerializedName(value = "gb-defra-index")
    private final int gb_defra_index = 0;
    private final double no2 = 0.0;
    private final double o3 = 0.0;
    private final double pm10 = 0.0;
    private final double pm2_5 = 0.0;
    private final double so2 = 0.0;
    @com.google.gson.annotations.SerializedName(value = "us-epa-index")
    private final int us_epa_index = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.experlabs.footballnews.weather.models.AirQuality copy(double co, int gb_defra_index, double no2, double o3, double pm10, double pm2_5, double so2, int us_epa_index) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AirQuality(double co, int gb_defra_index, double no2, double o3, double pm10, double pm2_5, double so2, int us_epa_index) {
        super();
    }
    
    private final double component1() {
        return 0.0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getGb_defra_index() {
        return 0;
    }
    
    private final double component3() {
        return 0.0;
    }
    
    private final double component4() {
        return 0.0;
    }
    
    private final double component5() {
        return 0.0;
    }
    
    private final double component6() {
        return 0.0;
    }
    
    private final double component7() {
        return 0.0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getUs_epa_index() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_co() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_no2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_o3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_so2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_pm10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sliced_pm2_5() {
        return null;
    }
}