package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList title=new ArrayList<String>();
    ArrayList status=new ArrayList<String>();
    ArrayList date=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listitemdata);
        ArrayAdapterExample adapter= new ArrayAdapterExample(getApplicationContext(),title,status,date);
        listView.setAdapter(adapter);

        title.add("PUR-2019-056");
        title.add("PUR-2019-056");
        title.add("PUR-2019-056");
        title.add("PUR-2019-056");

        status.add("APPROVED");
        status.add("APPROVED");
        status.add("APPROVED");
        status.add("APPROVED");

        date.add("20-09-2019");
        date.add("22-09-2019");
        date.add("25-09-2019");
        date.add("28-09-2019");



    }
}
