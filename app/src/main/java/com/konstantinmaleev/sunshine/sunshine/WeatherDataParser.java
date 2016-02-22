package com.konstantinmaleev.sunshine.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

/**
 * Created by NewSimple on 22.02.2016.
 */
public class WeatherDataParser {




    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here

        JSONObject weather=new JSONObject(weatherJsonStr);
        JSONArray results= (JSONArray) weather.get("list");

        if(results.length()<dayIndex)
            throw new ArrayIndexOutOfBoundsException();

        JSONObject day=results.getJSONObject(dayIndex);
        JSONObject temp= (JSONObject) day.get("temp");
        return (Double) temp.get("max");
    }
}
