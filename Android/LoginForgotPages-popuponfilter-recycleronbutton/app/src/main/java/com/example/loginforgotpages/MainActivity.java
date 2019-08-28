package com.example.loginforgotpages;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView war1;
    TextView war2;
    ImageView i1;
    ImageView i2;
    TextView forg;
    EditText eml1;
    EditText psw1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btnbox);
        war1=findViewById(R.id.msg1);
        war2=findViewById(R.id.msg2);
        i1=findViewById(R.id.image1);
        i2=findViewById(R.id.image2);
        eml1=findViewById(R.id.emailbox);
        psw1=findViewById(R.id.passwordbox);
        forg=findViewById(R.id.forgotlink);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (eml1.getText().toString().equals("")) {

                        war1.setVisibility(View.VISIBLE);
                        i1.setVisibility(View.VISIBLE);
                        i2.setVisibility(View.VISIBLE);
                        war2.setVisibility(View.VISIBLE);


                }
                else {
                    Intent intent = new Intent(getApplicationContext(), RequestLists.class);
                    startActivity(intent);

                }

            }
        });

        forg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ForgotPasswordpages.class);
                startActivity(intent);
            }
        });

    }
}
