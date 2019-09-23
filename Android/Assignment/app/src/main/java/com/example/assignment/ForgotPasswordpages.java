package com.example.assignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordpages extends AppCompatActivity {
    Button btn;
    ConstraintLayout contnr1;
    ConstraintLayout contnr2;
    EditText eml;
    AlertDialog.Builder alertBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passwordpages);

        alertBuilder=new AlertDialog.Builder(this);


        btn=findViewById(R.id.continuebutton);
        contnr1=findViewById(R.id.container1);
        contnr2=findViewById(R.id.container2);
        eml=findViewById(R.id.inputemail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eml.getText().toString().equals("")) {
                    contnr1.setVisibility(View.VISIBLE);
                    contnr2.setVisibility(View.VISIBLE);
                }
                else {
                    final View alertView=getLayoutInflater().inflate(R.layout.forgotdialogbox,null);
                    alertBuilder.setView(alertView);
                    final AlertDialog alertDialog=alertBuilder.create();
                    alertDialog.show();

                }


            }
        });
    }
}
