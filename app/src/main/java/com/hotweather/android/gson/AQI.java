package com.hotweather.android.gson;

/**
 * Created by Administrator on 2018/9/5 0005.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
