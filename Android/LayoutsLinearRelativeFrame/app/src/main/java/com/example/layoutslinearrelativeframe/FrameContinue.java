package com.example.layoutslinearrelativeframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FrameContinue extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_continue);

        listView=(ListView)findViewById(R.id.lists);

        final String[] Names={"keerthi", "sushma", "anjali"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String mynames= Names[position];

                Toast.makeText(FrameContinue.this, "YOU HAVE CLICKED ON"+mynames, Toast.LENGTH_LONG).show();
            }
        });
    }
}
