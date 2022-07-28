package com.experlabs.footballnews.weather.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u0097\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/experlabs/footballnews/weather/models/Current;", "", "air_quality", "Lcom/experlabs/footballnews/weather/models/AirQuality;", "cloud", "", "condition", "Lcom/experlabs/footballnews/weather/models/Condition;", "feelslike_c", "humidity", "is_day", "last_updated", "precip_mm", "temp_c", "uv", "vis_km", "wind_degree", "wind_dir", "wind_mph", "(Lcom/experlabs/footballnews/weather/models/AirQuality;Ljava/lang/String;Lcom/experlabs/footballnews/weather/models/Condition;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAir_quality", "()Lcom/experlabs/footballnews/weather/models/AirQuality;", "getCloud", "()Ljava/lang/String;", "getCondition", "()Lcom/experlabs/footballnews/weather/models/Condition;", "getFeelslike_c", "getHumidity", "getLast_updated", "getPrecip_mm", "getTemp_c", "getUv", "getVis_km", "getWind_degree", "getWind_dir", "getWind_mph", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Current {
    @org.jetbrains.annotations.Nullable()
    private final com.experlabs.footballnews.weather.models.AirQuality air_quality = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cloud = null;
    @org.jetbrains.annotations.NotNull()
    private final com.experlabs.footballnews.weather.models.Condition condition = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String feelslike_c = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String humidity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String is_day = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String last_updated = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String precip_mm = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temp_c = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uv = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String vis_km = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wind_degree = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wind_dir = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String wind_mph = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.experlabs.footballnews.weather.models.Current copy(@org.jetbrains.annotations.Nullable()
    com.experlabs.footballnews.weather.models.AirQuality air_quality, @org.jetbrains.annotations.NotNull()
    java.lang.String cloud, @org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.weather.models.Condition condition, @org.jetbrains.annotations.NotNull()
    java.lang.String feelslike_c, @org.jetbrains.annotations.NotNull()
    java.lang.String humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String is_day, @org.jetbrains.annotations.NotNull()
    java.lang.String last_updated, @org.jetbrains.annotations.NotNull()
    java.lang.String precip_mm, @org.jetbrains.annotations.NotNull()
    java.lang.String temp_c, @org.jetbrains.annotations.NotNull()
    java.lang.String uv, @org.jetbrains.annotations.NotNull()
    java.lang.String vis_km, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_degree, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_dir, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_mph) {
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
    
    public Current(@org.jetbrains.annotations.Nullable()
    com.experlabs.footballnews.weather.models.AirQuality air_quality, @org.jetbrains.annotations.NotNull()
    java.lang.String cloud, @org.jetbrains.annotations.NotNull()
    com.experlabs.footballnews.weather.models.Condition condition, @org.jetbrains.annotations.NotNull()
    java.lang.String feelslike_c, @org.jetbrains.annotations.NotNull()
    java.lang.String humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String is_day, @org.jetbrains.annotations.NotNull()
    java.lang.String last_updated, @org.jetbrains.annotations.NotNull()
    java.lang.String precip_mm, @org.jetbrains.annotations.NotNull()
    java.lang.String temp_c, @org.jetbrains.annotations.NotNull()
    java.lang.String uv, @org.jetbrains.annotations.NotNull()
    java.lang.String vis_km, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_degree, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_dir, @org.jetbrains.annotations.NotNull()
    java.lang.String wind_mph) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.experlabs.footballnews.weather.models.AirQuality component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.experlabs.footballnews.weather.models.AirQuality getAir_quality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloud() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.experlabs.footballnews.weather.models.Condition component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.experlabs.footballnews.weather.models.Condition getCondition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeelslike_c() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String is_day() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_updated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrecip_mm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemp_c() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVis_km() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWind_degree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWind_dir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWind_mph() {
        return null;
    }
}