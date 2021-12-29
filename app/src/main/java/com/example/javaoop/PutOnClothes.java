package com.example.javaoop;

import android.util.Log;

public class PutOnClothes extends Daughter {

    public PutOnClothes(int childAge) {
        super(childAge);
    }

    public void checkWeather(boolean isWarm) {

        class Weather {
            boolean isCold;

            Weather(boolean isCold) {
                this.isCold = isWarm;
            }
        }

        Weather weather = new Weather(true);

        if (weather.isCold)
            Log.i("putOn", "I take pants");
        else
            Log.i("putOn", "I take a skirt");
    }

}
