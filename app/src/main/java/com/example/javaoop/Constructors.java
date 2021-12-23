package com.example.javaoop;


import android.util.Log;

public class Constructors {
    int a;
    int b;
    int c;

    public void sum() {
        Log.i("constructors", String.valueOf(a + b + c));
    }

    public Constructors(int a) {
        // a = 1
        this.a = a;
    }

    public Constructors(int a, int b) {
        // a = 1, b = 2
        this.a = a;
        this.b = b;
    }

    public Constructors(int a, int b, int c) {
        // a = 1, b = 2, c = 3
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
