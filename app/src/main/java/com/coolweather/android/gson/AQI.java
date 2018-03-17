package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by FuGing on 2018/3/17.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
