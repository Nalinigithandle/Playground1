package com.example.loginforgotpages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewExample extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_example);
        recyclerView=findViewById(R.id.listss);
        String title[]={"PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056","PUR-2019-056"};
        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","2-Sep"};
        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        MyRecyclerListAdapter myRecyclerListAdapter=new MyRecyclerListAdapter(getApplicationContext(),title,date,status);
        recyclerView.setAdapter(myRecyclerListAdapter);

    }
}
