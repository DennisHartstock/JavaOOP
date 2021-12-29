package com.example.javaoop;

import android.util.Log;

public interface Intellable {

    default void haveIntellect() {
        Log.i("intellect", "I have intellect");
    }
}
