package com.example.loginforgotpages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPasswordpages extends AppCompatActivity {
    Button bt;
    ImageView a1;
    ImageView a2;
    TextView a3;
    TextView a4;
    EditText eml;
    AlertDialog.Builder alertbuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passwordpages);
        bt=findViewById(R.id.btnbtn);
        a1=findViewById(R.id.w1);
        a2=findViewById(R.id.w2);
        a3=findViewById(R.id.t1);
        a4=findViewById(R.id.t2);
        eml=findViewById(R.id.emailbox1);
        alertbuilder=new AlertDialog.Builder(this);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eml.getText().toString().equals("")){
                    a1.setVisibility(View.VISIBLE);
                    a2.setVisibility(View.VISIBLE);
                    a3.setVisibility(View.VISIBLE);
                    a4.setVisibility(View.VISIBLE);

                }
                else {

                    final View alertView= getLayoutInflater().inflate(R.layout.activity_forgot_alert, null);
                    alertbuilder.setView(alertView);
                    final AlertDialog alertDialog= alertbuilder.create();
                    alertDialog.show();

                }
            }
        });
    }
}
