package com.example.classactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle of activity","oncreate invoked");
    }
    @Override
    protected void onStart() {

        super.onStart();
        Log.d("lifecycle of activity","onstart invoked");
    }
    @Override
    protected void onResume(){

        super.onResume();
        Log.d("lifecycle of activity","onresume invoked");
    }
    @Override
    protected void onPause(){

        super.onPause();
        Log.d("lifecycle of activity","onpause invoked");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d("lifecycle of activity","onstop invoked");
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("lifecycle of activity","onrestart invoked");

    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("lifecycle of activity","ondestroy invoked");
    }
}
