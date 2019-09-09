package com.example.classconstructorexample;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Basic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    Basic(){
        System.out.println("This is a constructor");
        System.out.println("This is an example");

    }

    void cons(Context applicationContext){
        Toast.makeText(applicationContext, "This is a fuction", Toast.LENGTH_LONG).show();
    }
}

