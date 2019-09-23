package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ConstraintLayout cont1;
    ConstraintLayout cont2;
    TextView forgpass;
    EditText emailcont;
    EditText passcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.loginbutton);
        cont1=findViewById(R.id.warningbox1);
        cont2=findViewById(R.id.warningbox2);
        forgpass=findViewById(R.id.forgotpassword);
        emailcont=findViewById(R.id.emailbox);
        passcont=findViewById(R.id.passwordbox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emailcont.getText().toString().equals("")&&
                   (passcont.getText().toString().equals(""))) {

                    cont1.setVisibility(View.VISIBLE);
                    cont2.setVisibility(View.VISIBLE);
                }
                else {
                    Intent intent= new Intent(getApplicationContext(),RequestListpages.class);
                    startActivity(intent);
                }

            }
        });

        forgpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ForgotPasswordpages.class);
                startActivity(intent);
            }
        });

    }
}
