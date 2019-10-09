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

class ArrayAdapterPreviewAttachment extends BaseAdapter {
    Context context;
    ArrayList<PreviewModel> previewattachment;

    public ArrayAdapterPreviewAttachment(Context context, ArrayList<PreviewModel> attachmentList) {
        this.context=context;
        this.previewattachment=attachmentList;
    }

    @Override
    public int getCount() {
        return previewattachment.size();
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
        View view=LayoutInflater.from(context).inflate(R.layout.preview_attachment_list,parent,false);
        TextView documentsizes, document_names, document_descriptions;
        documentsizes=view.findViewById(R.id.document_size);
        document_names=view.findViewById(R.id.document_name);
        document_descriptions=view.findViewById(R.id.document_description);
        PreviewModel previewModel1=this.previewattachment.get(i);
        documentsizes.setText(String.valueOf(previewModel1.getDocumentsize()));
        return view;
    }
}
