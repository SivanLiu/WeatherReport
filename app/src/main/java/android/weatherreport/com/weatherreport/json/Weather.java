package android.weatherreport.com.weatherreport.json;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sivanliu on 2016/12/28.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecase")
    public List<Forecast> forecastList;
}
