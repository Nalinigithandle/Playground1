package com.carmel.bootcamp.carmelbootcampnalini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.carmel.bootcamp.carmelbootcampnalini.Model.PreviewModel;

import java.util.ArrayList;

class ArrayAdapterPreview extends BaseAdapter {

    Context context;
    ArrayList<PreviewModel> preview;

    public ArrayAdapterPreview(Context context, ArrayList<PreviewModel> previewList) {
        this.context=context;
        this.preview=previewList;
    }

    @Override
    public int getCount() {
        return preview.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.previewdescriptionlist,parent,false);

        TextView product_descriptions,quantity,dates,cost;

        product_descriptions=view.findViewById(R.id.product_description);
        quantity=view.findViewById(R.id.number);
        dates=view.findViewById(R.id.date);
        cost=view.findViewById(R.id.price);

        PreviewModel previewModel=this.preview.get(i);

        product_descriptions.setText(String.valueOf(previewModel.getDescription()));

        return view;
    }
}
