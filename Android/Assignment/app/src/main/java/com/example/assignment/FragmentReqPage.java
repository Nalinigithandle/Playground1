package com.example.assignment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class FragmentReqPage extends Fragment {
    ListView list_view;
    private View v_view;



    //    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        listView=view.findViewById(R.id.listviewbox);
        // Inflate the layout for this fragment
//        view= inflater.inflate(R.layout.fragment_fragment_req_page, container, false);
//        return view;
//    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {





        return inflater.inflate(R.layout.fragment_fragment_req_page,container,false);


    }
}


