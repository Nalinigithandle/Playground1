package com.carmel.bootcamp.carmelbootcampnalini;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private TextView save_draft;
    private Button submit_button;
    TextView requisition_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save_draft=findViewById(R.id.save_draft_link);
        submit_button=findViewById(R.id.submit_btn);
        requisition_text=findViewById(R.id.requisitiontitle);

        requisition_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), PreviewPageUsingModel.class);
                startActivity(intent);
            }
        });

        save_draft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSaveDraft fragmentSaveDraft=new FragmentSaveDraft();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.preview_main_container,fragmentSaveDraft);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentRegistered fragmentRegistered=new FragmentRegistered();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.preview_main_container,fragmentRegistered);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

//                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.preview_main_container,fragmentRegistered);
//                fragmentTransaction.commit();
//                fragmentManager.beginTransaction().add(R.id.preview_main_container,fragmentRegistered);


            }
        });
    }
}

