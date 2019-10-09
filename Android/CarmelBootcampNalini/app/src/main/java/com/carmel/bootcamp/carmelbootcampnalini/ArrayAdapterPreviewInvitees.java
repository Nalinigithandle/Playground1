package com.carmel.bootcamp.carmelbootcampnalini;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.carmel.bootcamp.carmelbootcampnalini.Model.PreviewModel;

import java.util.ArrayList;

class ArrayAdapterPreviewInvitees extends BaseAdapter {
    Context context;
    ArrayList<PreviewModel> previewinvitees;

    public ArrayAdapterPreviewInvitees(Context context, ArrayList<PreviewModel> inviteesList) {
        this.context=context;
        this.previewinvitees=inviteesList;
    }

    @Override
    public int getCount() {
        return previewinvitees.size();
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
        View view= LayoutInflater.from(context).inflate(R.layout.preview_invitees_list,parent,false);
        TextView profile_name, profile_description;
        ImageView profile_picture;
        profile_name=view.findViewById(R.id.approvalprofilename);
        profile_description=view.findViewById(R.id.approvalprofiledescription);
        profile_picture=view.findViewById(R.id.approvalprofilepicture);

        PreviewModel previewModel2=this.previewinvitees.get(i);

        profile_name.setText(String.valueOf(previewModel2.getProfilename()));
        profile_picture.setImageResource(R.drawable.picture1);
        return view;
    }
}
