package com.example.classconstructorexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Basic FirstBasic;
    Basic SecondBasic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstBasic=new Basic("Dave","Bangalore");
        SecondBasic=new Basic("David","Mumbai");

        System.out.println("Name:"+FirstBasic.getName());
        System.out.println("Place:"+SecondBasic.getPlace());
    }
}
