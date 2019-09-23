package com.example.assignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment.Model.RequestModel;

import java.util.ArrayList;

class ArrayAdapterExample extends BaseAdapter {
//    ArrayList<String> title_data=new ArrayList<String>();
//    ArrayList<String> date_data=new ArrayList<String>();
//    ArrayList<String> status_data=new ArrayList<String>();
    ImageView bellimg;
    Context context;
    ArrayList<RequestModel> request;
    public ArrayAdapterExample(Context context, ArrayList<RequestModel> request) {
//        this.title_data=title;
//        this.date_data=date;
//        this.status_data=status;
        this.context=context;
        this.request=request;

    }

    @Override
    public int getCount() {
        return request.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.dataforrequestlist,parent,false);
        TextView title,date,status;

        title=view.findViewById(R.id.titledata);
        date=view.findViewById(R.id.datedata);
        status=view.findViewById(R.id.statusdata);
        bellimg=view.findViewById(R.id.bellimage);

        RequestModel req_Model=this.request.get(position);

        title.setText(String.valueOf(req_Model.getRequestNumber()));
        status.setText(String.valueOf(req_Model.getRequestStatus()));
        date.setText(String.valueOf(req_Model.getDescription()));
        bellimg.setImageResource(R.drawable.bellicon);
        return view;



//        date.setText(date_data.get(position));
//        status.setText(status_data.get(position));
//        bellimg.setImageResource(R.drawable.bellicon);
//        return view;




    }
}
