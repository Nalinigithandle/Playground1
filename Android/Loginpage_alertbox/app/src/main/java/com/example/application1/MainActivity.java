package com.example.application1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alertbuilder;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.LoginBtn);
        alertbuilder=new AlertDialog.Builder(this);
        final View alertView = getLayoutInflater().inflate(R.layout.activity_login1_alert, null);
        alertbuilder.setView(alertView);
        final AlertDialog alertDialog = alertbuilder.create();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//               Intent intent = new Intent(getApplicationContext(), Login1Alert.class);
//
//              startActivity(intent);

                alertDialog.show();
            }
        });

    }
}
