package com.example.javaoop;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Student dennis = new Student("Dennis") {
            @Override
            public void writeExam() {
            }
        };
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

        Human oldStudent = new Student() {
            @Override
            public void writeExam() {
            }
        };
        oldStudent.talk();

        ArrayList<Children> children = new ArrayList<>();

        Son ivan = new Son(1);
        Son peter = new Son(2);
        Daughter masha = new Daughter(3);
        Daughter dasha = new Daughter(0);

        children.add(ivan);
        children.add(peter);
        children.add(masha);
        children.add(dasha);

        for (Children child : children) {
            if (child instanceof Son)
                Log.i("instance", "Son" + ", " + child.childText);
            if (child instanceof Daughter)
                Log.i("instance", "Daughter" + ", " + child.childText);
        }

        Log.i("instance", "Count of children: " + Children.count);

        Student youngStudent = new Student() {
            @Override
            public void talk() {
                Log.i("text", "I´m a young student");
            }

            @Override
            public void writeExam() {
                Log.i("exam", "I write an exam");
            }
        };

        youngStudent.talk();
        youngStudent.writeExam();
        youngStudent.learn();
        youngStudent.haveIntellect();
    }
}