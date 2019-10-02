package com.example.assignment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.assignment.Global.RequestStatus;
import com.example.assignment.Model.RequestModel;


public class FragmentReqPage2 extends Fragment {
    private View view;

    TextView num_data;
    TextView date_data;
    TextView stat_data;
    RequestModel request_Model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_req_page2, container, false);

        num_data = view.findViewById(R.id.r_number);
        date_data = view.findViewById(R.id.r_date);
        stat_data = view.findViewById(R.id.r_status);
        if (request_Model != null) {
            num_data.setText(request_Model.getRequestNumber());
            date_data.setText(request_Model.getDescription());
            stat_data.setText(request_Model.getRequestStatus().toString());
        }
            return view;

    }
    public void set_data(RequestModel requestModel ){
        this.request_Model=requestModel;


    }
}
