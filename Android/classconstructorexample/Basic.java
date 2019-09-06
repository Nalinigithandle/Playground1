package com.example.classconstructorexample;

import android.widget.Toast;

public class Basic {
    String name;
    String place;

    public Basic(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}

