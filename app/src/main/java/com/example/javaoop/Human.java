package com.example.javaoop;

import android.util.Log;

public class Human extends Creature {
    String name;

    public Human(String name) {
        super();
        this.name = name;
    }

    public Human() {

    }

    public void talk() {
        Log.i("text", "My name is " + name + ". I´m " + age + " years old.");
    }
}
