package com.experlabs.footballnews.databinding;
import com.experlabs.footballnews.R;
import com.experlabs.footballnews.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWeatherBindingImpl extends FragmentWeatherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_layout, 20);
        sViewsWithIds.put(R.id.location_cardview, 21);
        sViewsWithIds.put(R.id.current_card, 22);
        sViewsWithIds.put(R.id.air_card, 23);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.TextView mboundView17;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.TextView mboundView19;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWeatherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentWeatherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.TextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.TextView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.refreshWeatherBt.setTag(null);
        this.textView10.setTag(null);
        this.textView11.setTag(null);
        this.textView7.setTag(null);
        this.textView8.setTag(null);
        this.textView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.air_item == variableId) {
            setAirItem((com.experlabs.footballnews.weather.models.AirQuality) variable);
        }
        else if (BR.location_item == variableId) {
            setLocationItem((com.experlabs.footballnews.weather.models.Location) variable);
        }
        else if (BR.currentWeather_item == variableId) {
            setCurrentWeatherItem((com.experlabs.footballnews.weather.models.Current) variable);
        }
        else if (BR.condtion_item == variableId) {
            setCondtionItem((com.experlabs.footballnews.weather.models.Condition) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAirItem(@Nullable com.experlabs.footballnews.weather.models.AirQuality AirItem) {
        this.mAirItem = AirItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.air_item);
        super.requestRebind();
    }
    public void setLocationItem(@Nullable com.experlabs.footballnews.weather.models.Location LocationItem) {
        this.mLocationItem = LocationItem;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.location_item);
        super.requestRebind();
    }
    public void setCurrentWeatherItem(@Nullable com.experlabs.footballnews.weather.models.Current CurrentWeatherItem) {
        this.mCurrentWeatherItem = CurrentWeatherItem;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.currentWeather_item);
        super.requestRebind();
    }
    public void setCondtionItem(@Nullable com.experlabs.footballnews.weather.models.Condition CondtionItem) {
        this.mCondtionItem = CondtionItem;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String locationItemName = null;
        java.lang.String currentWeatherItemTempC = null;
        java.lang.String currentWeatherItemAirQualitySlicedCo = null;
        java.lang.String locationItemRegion = null;
        java.lang.String javaLangStringLatLongLocationItemLatJavaLangStringLocationItemLon = null;
        java.lang.String javaLangStringUVCurrentWeatherItemUv = null;
        java.lang.String javaLangStringCOCurrentWeatherItemAirQualitySlicedCo = null;
        java.lang.String currentWeatherItemHumidity = null;
        java.lang.String currentWeatherItemWindMph = null;
        java.lang.String javaLangStringWindDirectionCurrentWeatherItemWindDir = null;
        java.lang.String javaLangStringTimeLocationItemLocaltime = null;
        java.lang.String javaLangStringHumidityCurrentWeatherItemHumidity = null;
        java.lang.String javaLangStringVisibleKmCurrentWeatherItemVisKm = null;
        java.lang.String currentWeatherItemAirQualitySlicedNo2 = null;
        java.lang.String airItemSlicedO3 = null;
        com.experlabs.footballnews.weather.models.AirQuality currentWeatherItemAirQuality = null;
        com.experlabs.footballnews.weather.models.AirQuality airItem = mAirItem;
        java.lang.String locationItemLon = null;
        com.experlabs.footballnews.weather.models.Location locationItem = mLocationItem;
        java.lang.String javaLangStringTemperatureCurrentWeatherItemTempC = null;
        java.lang.String javaLangStringNO2CurrentWeatherItemAirQualitySlicedNo2 = null;
        java.lang.String javaLangStringIsDayCurrentWeatherItemIsDay = null;
        java.lang.String currentWeatherItemVisKm = null;
        java.lang.String javaLangStringWindSpeedCurrentWeatherItemWindMph = null;
        java.lang.String airItemSlicedPm25 = null;
        java.lang.String locationItemLat = null;
        java.lang.String currentWeatherItemWindDir = null;
        java.lang.String locationItemLocaltime = null;
        java.lang.String javaLangStringCountryLocationItemCountry = null;
        java.lang.String javaLangStringSO2AirItemSlicedSo2 = null;
        java.lang.String javaLangStringLatLongLocationItemLat = null;
        java.lang.String currentWeatherItemIsDay = null;
        java.lang.String airItemSlicedSo2 = null;
        com.experlabs.footballnews.weather.models.Current currentWeatherItem = mCurrentWeatherItem;
        java.lang.String javaLangStringLatLongLocationItemLatJavaLangString = null;
        java.lang.String airItemSlicedPm10 = null;
        java.lang.String locationItemCountry = null;
        java.lang.String javaLangStringPm25AirItemSlicedPm25 = null;
        java.lang.String currentWeatherItemUv = null;
        java.lang.String javaLangStringFeelLikeCurrentWeatherItemFeelslikeC = null;
        java.lang.String javaLangStringRegionLocationItemRegion = null;
        java.lang.String javaLangStringPm10AirItemSlicedPm10 = null;
        java.lang.String javaLangStringO3AirItemSlicedO3 = null;
        java.lang.String currentWeatherItemFeelslikeC = null;

        if ((dirtyFlags & 0x11L) != 0) {



                if (airItem != null) {
                    // read air_item.sliced_o3
                    airItemSlicedO3 = airItem.sliced_o3();
                    // read air_item.sliced_pm2_5()
                    airItemSlicedPm25 = airItem.sliced_pm2_5();
                    // read air_item.sliced_so2
                    airItemSlicedSo2 = airItem.sliced_so2();
                    // read air_item.sliced_pm10
                    airItemSlicedPm10 = airItem.sliced_pm10();
                }


                // read ("O3: ") + (air_item.sliced_o3)
                javaLangStringO3AirItemSlicedO3 = ("O3: ") + (airItemSlicedO3);
                // read ("Pm2.5: ") + (air_item.sliced_pm2_5())
                javaLangStringPm25AirItemSlicedPm25 = ("Pm2.5: ") + (airItemSlicedPm25);
                // read ("SO2: ") + (air_item.sliced_so2)
                javaLangStringSO2AirItemSlicedSo2 = ("SO2: ") + (airItemSlicedSo2);
                // read ("Pm10: ") + (air_item.sliced_pm10)
                javaLangStringPm10AirItemSlicedPm10 = ("Pm10: ") + (airItemSlicedPm10);
        }
        if ((dirtyFlags & 0x12L) != 0) {



                if (locationItem != null) {
                    // read location_item.name
                    locationItemName = locationItem.getName();
                    // read location_item.region
                    locationItemRegion = locationItem.getRegion();
                    // read location_item.lon
                    locationItemLon = locationItem.getLon();
                    // read location_item.lat
                    locationItemLat = locationItem.getLat();
                    // read location_item.localtime
                    locationItemLocaltime = locationItem.getLocaltime();
                    // read location_item.country
                    locationItemCountry = locationItem.getCountry();
                }


                // read ("Region: ") + (location_item.region)
                javaLangStringRegionLocationItemRegion = ("Region: ") + (locationItemRegion);
                // read ("Lat/Long: ") + (location_item.lat)
                javaLangStringLatLongLocationItemLat = ("Lat/Long: ") + (locationItemLat);
                // read ("Time: ") + (location_item.localtime)
                javaLangStringTimeLocationItemLocaltime = ("Time: ") + (locationItemLocaltime);
                // read ("Country: ") + (location_item.country)
                javaLangStringCountryLocationItemCountry = ("Country: ") + (locationItemCountry);


                // read (("Lat/Long: ") + (location_item.lat)) + ("/")
                javaLangStringLatLongLocationItemLatJavaLangString = (javaLangStringLatLongLocationItemLat) + ("/");


                // read ((("Lat/Long: ") + (location_item.lat)) + ("/")) + (location_item.lon)
                javaLangStringLatLongLocationItemLatJavaLangStringLocationItemLon = (javaLangStringLatLongLocationItemLatJavaLangString) + (locationItemLon);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (currentWeatherItem != null) {
                    // read currentWeather_item.temp_c
                    currentWeatherItemTempC = currentWeatherItem.getTemp_c();
                    // read currentWeather_item.humidity
                    currentWeatherItemHumidity = currentWeatherItem.getHumidity();
                    // read currentWeather_item.wind_mph
                    currentWeatherItemWindMph = currentWeatherItem.getWind_mph();
                    // read currentWeather_item.air_quality
                    currentWeatherItemAirQuality = currentWeatherItem.getAir_quality();
                    // read currentWeather_item.vis_km
                    currentWeatherItemVisKm = currentWeatherItem.getVis_km();
                    // read currentWeather_item.wind_dir
                    currentWeatherItemWindDir = currentWeatherItem.getWind_dir();
                    // read currentWeather_item.is_day
                    currentWeatherItemIsDay = currentWeatherItem.is_day();
                    // read currentWeather_item.uv
                    currentWeatherItemUv = currentWeatherItem.getUv();
                    // read currentWeather_item.feelslike_c
                    currentWeatherItemFeelslikeC = currentWeatherItem.getFeelslike_c();
                }


                // read ("Temperature: ") + (currentWeather_item.temp_c)
                javaLangStringTemperatureCurrentWeatherItemTempC = ("Temperature: ") + (currentWeatherItemTempC);
                // read ("Humidity: ") + (currentWeather_item.humidity)
                javaLangStringHumidityCurrentWeatherItemHumidity = ("Humidity: ") + (currentWeatherItemHumidity);
                // read ("Wind Speed: ") + (currentWeather_item.wind_mph)
                javaLangStringWindSpeedCurrentWeatherItemWindMph = ("Wind Speed: ") + (currentWeatherItemWindMph);
                // read ("Visible(km): ") + (currentWeather_item.vis_km)
                javaLangStringVisibleKmCurrentWeatherItemVisKm = ("Visible(km): ") + (currentWeatherItemVisKm);
                // read ("Wind Direction: ") + (currentWeather_item.wind_dir)
                javaLangStringWindDirectionCurrentWeatherItemWindDir = ("Wind Direction: ") + (currentWeatherItemWindDir);
                // read ("Is Day: ") + (currentWeather_item.is_day)
                javaLangStringIsDayCurrentWeatherItemIsDay = ("Is Day: ") + (currentWeatherItemIsDay);
                // read ("UV: ") + (currentWeather_item.uv)
                javaLangStringUVCurrentWeatherItemUv = ("UV: ") + (currentWeatherItemUv);
                // read ("Feel like: ") + (currentWeather_item.feelslike_c)
                javaLangStringFeelLikeCurrentWeatherItemFeelslikeC = ("Feel like: ") + (currentWeatherItemFeelslikeC);
                if (currentWeatherItemAirQuality != null) {
                    // read currentWeather_item.air_quality.sliced_co
                    currentWeatherItemAirQualitySlicedCo = currentWeatherItemAirQuality.sliced_co();
                    // read currentWeather_item.air_quality.sliced_no2
                    currentWeatherItemAirQualitySlicedNo2 = currentWeatherItemAirQuality.sliced_no2();
                }


                // read ("CO: ") + (currentWeather_item.air_quality.sliced_co)
                javaLangStringCOCurrentWeatherItemAirQualitySlicedCo = ("CO: ") + (currentWeatherItemAirQualitySlicedCo);
                // read ("NO2: ") + (currentWeather_item.air_quality.sliced_no2)
                javaLangStringNO2CurrentWeatherItemAirQualitySlicedNo2 = ("NO2: ") + (currentWeatherItemAirQualitySlicedNo2);
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, javaLangStringWindSpeedCurrentWeatherItemWindMph);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, javaLangStringVisibleKmCurrentWeatherItemVisKm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, javaLangStringUVCurrentWeatherItemUv);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, javaLangStringWindDirectionCurrentWeatherItemWindDir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, javaLangStringCOCurrentWeatherItemAirQualitySlicedCo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, javaLangStringNO2CurrentWeatherItemAirQualitySlicedNo2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, javaLangStringTemperatureCurrentWeatherItemTempC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, javaLangStringFeelLikeCurrentWeatherItemFeelslikeC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, javaLangStringHumidityCurrentWeatherItemHumidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, javaLangStringIsDayCurrentWeatherItemIsDay);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, javaLangStringO3AirItemSlicedO3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, javaLangStringSO2AirItemSlicedSo2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, javaLangStringPm10AirItemSlicedPm10);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, javaLangStringPm25AirItemSlicedPm25);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView10, javaLangStringRegionLocationItemRegion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView11, javaLangStringCountryLocationItemCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, javaLangStringTimeLocationItemLocaltime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, javaLangStringLatLongLocationItemLatJavaLangStringLocationItemLon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView9, locationItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): air_item
        flag 1 (0x2L): location_item
        flag 2 (0x3L): currentWeather_item
        flag 3 (0x4L): condtion_item
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}