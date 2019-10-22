package com.carmel.bootcamp.comparegenie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText editTextdata;
Button addbutton;
ListView listView;
ArrayList<String> arrayList;
ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextdata=findViewById(R.id.editText);
        addbutton=findViewById(R.id.button);
        listView=findViewById(R.id.listviewfordata);

        arrayList=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        onbuttonclick();
    }
    public  void onbuttonclick(){
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result=editTextdata.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
