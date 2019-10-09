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

class ArrayAdapterPreviewApprovals extends BaseAdapter {
    Context context;
    ArrayList<PreviewModel> previewapproval;

    public ArrayAdapterPreviewApprovals(Context context, ArrayList<PreviewModel> approvalsList) {
        this.context=context;
        this.previewapproval=approvalsList;
    }

    @Override
    public int getCount() {
        return previewapproval.size();
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
        View view= LayoutInflater.from(context).inflate(R.layout.preview_approvals_list,parent,false);

        TextView profile_name, profile_description;
        ImageView profile_picture;

        profile_name=view.findViewById(R.id.approvalprofilename);
        profile_description=view.findViewById(R.id.approvalprofiledescription);
        profile_picture=view.findViewById(R.id.approvalprofilepicture);

        PreviewModel previewModel3=this.previewapproval.get(i);

        profile_name.setText(String.valueOf(previewModel3.getApprovalprofilenames()));
        profile_picture.setImageResource(R.drawable.picture1);

        return view;
    }
}
