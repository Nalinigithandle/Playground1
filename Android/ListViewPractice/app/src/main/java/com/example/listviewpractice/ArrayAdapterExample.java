package com.example.listviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ArrayAdapterExample extends BaseAdapter {
    ArrayList<String> title_data=new ArrayList<String>();
    ArrayList<String> date_data=new ArrayList<String>();
    ArrayList<String> status_data=new ArrayList<String>();
    ImageView bellimage;
    Context context;
    public ArrayAdapterExample(Context applicationContext, ArrayList title, ArrayList date, ArrayList status) {
        this.title_data=title;
        this.date_data=status;
        this.status_data=date;
        this.context=applicationContext;
    }


    @Override
    public int getCount() {
        return status_data.size();
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
        View view= LayoutInflater.from(context).inflate(R.layout.resdata,parent,false);
        TextView title,date,status;
        ImageView imageView;
        title=view.findViewById(R.id.textView);
        date=view.findViewById(R.id.textView3);
        status=view.findViewById(R.id.textView4);
        bellimage=view.findViewById(R.id.imageView);

        title.setText(title_data.get(position));
        date.setText(date_data.get(position));
        status.setText(status_data.get(position));
        bellimage.setImageResource(R.drawable.bellicon);
        return view;
    }
}
