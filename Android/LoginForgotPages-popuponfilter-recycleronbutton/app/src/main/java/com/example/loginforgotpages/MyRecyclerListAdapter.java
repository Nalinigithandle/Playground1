package com.example.loginforgotpages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyRecyclerListAdapter extends RecyclerView.Adapter{
    String titles[]={},dates[]={},status[]={};
    private Context context;

    public MyRecyclerListAdapter(Context context, String[] title, String[] date, String[] status) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.status=status;
    }

    @NonNull
    @Override

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.listfirst,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        MyRecyclerListAdapter.MyViewHolder myViewHolder = (MyRecyclerListAdapter.MyViewHolder) viewHolder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(status[position]));


    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,date,statusText;
        public ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.textView2);
            date=itemView.findViewById(R.id.textView7);
            statusText=itemView.findViewById(R.id.textView9);
            imageView=itemView.findViewById(R.id.imageView2);


        }

        public void setUpData(String titles, String dates, String status) {
            title.setText(titles);
            date.setText(dates);
            statusText.setText(status);
            imageView.setImageResource(R.drawable.bellicon);
        }
    }
}
