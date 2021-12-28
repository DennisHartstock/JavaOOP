package com.example.javaoop;

public class Children {
    static int count = 0;
    private static int age;
    String childText;
    AgeOfChild ageOfChild;


    private static class AgeOfChild {
        String canText;

        private String canText() {

            if(age < 1)
                canText = "can´t walk";
            else if (age == 1)
                canText = "can´t run";
            else
                canText = "can run";
            return canText;
        }
    }

    public Children(int childAge) {
        count++;
        age = childAge;
        ageOfChild = new AgeOfChild();
        childText = ageOfChild.canText();
    }
}
