package com.example.javaoop;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Student dennis = new Student("Dennis");
        dennis.age = 45;
        dennis.canPlayGuitar = true;

        textView.setText(MessageFormat.format("My name is {0}. I`m {1}. {2}. {3}",
                dennis.name, dennis.age, dennis.study(), dennis.playGuitar()));

        Constructors firstConstructor = new Constructors(1);
        firstConstructor.sum();

        Constructors secondConstructor = new Constructors(1, 2);
        secondConstructor.sum();

        Constructors thirdConstructor = new Constructors(1, 2, 3);
        thirdConstructor.sum();
    }

}