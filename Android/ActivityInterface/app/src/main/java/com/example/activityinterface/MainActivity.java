package com.example.activityinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DemoAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demoimplementation();
        demointerface();



    }

    @Override
    public void demoimplementation() {
        Toast.makeText(this, "Example for java implement method", Toast.LENGTH_LONG).show();

    }

    @Override
    public void demointerface() {
        Toast.makeText(this, "Example for java inheritance method", Toast.LENGTH_LONG).show();


    }
}
