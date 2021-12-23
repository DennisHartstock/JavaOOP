package com.example.javaoop;

public class Student extends Human {

    boolean canPlayGuitar;

    public Student(String name) {
        super(name);
    }

    public String study() {
        return "I want to become an Android Developer";
    }

    public String playGuitar() {
        if (canPlayGuitar)
        return "I can play Guitar";
        else return "";
    }
}
