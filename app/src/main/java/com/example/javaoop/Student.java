package com.example.javaoop;

import android.util.Log;

public class Student extends Human {

    boolean canPlayGuitar;
    private String studentHelloText;

    public Student() {
        name = "Down";
        age = 45;
        studentHelloText = "I´m an old student";
    }

    private String createStudentHelloText() {
        return "My name is " + name + ". I´m " + age + " years old. " +
                studentHelloText;
    }

    @Override
    public void talk() {
        Log.i("text", createStudentHelloText());
    }

    public Student(String name) {
        super(name);
    }

    public String study() {
        return "I want to become an Android Developer";
    }

    public String playGuitar() {
        if (canPlayGuitar)
            return "I can play guitar";
        else return "";
    }
}
