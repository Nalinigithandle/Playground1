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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.assignment.Delegates.RequestDelegate;
import com.example.assignment.Global.RequestStatus;
import com.example.assignment.Model.RequestModel;

import java.util.ArrayList;


public class FragmentReqPage extends Fragment {
    ListView list_view;
    private View v_view;

    ArrayList<RequestModel> requestList=new ArrayList<>();

    private RequestDelegate requestDelegate;

        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//         Inflate the layout for this fragment
            v_view = inflater.inflate(R.layout.fragment_fragment_req_page, container, false);
            list_view = v_view.findViewById(R.id.listviewbox);


            RequestModel req_Model = new RequestModel();
            req_Model.setRequestNumber("PUR-2019-056");
            req_Model.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
            req_Model.setDescription("25-03-2019");
            requestList.add(req_Model);

            req_Model = new RequestModel();
            req_Model.setRequestNumber("PUR-2019-057");
            req_Model.setRequestStatus(RequestStatus.APPROVED);
            req_Model.setDescription("26-03-2019");
            requestList.add(req_Model);

            req_Model = new RequestModel();
            req_Model.setRequestNumber("PUR-2019-058");
            req_Model.setRequestStatus(RequestStatus.DRAFT);
            req_Model.setDescription("27-03-2019");
            requestList.add(req_Model);

            req_Model = new RequestModel();
            req_Model.setRequestNumber("PUR-2019-059");
            req_Model.setRequestStatus(RequestStatus.REJECTED);
            req_Model.setDescription("28-03-2019");
            requestList.add(req_Model);


           ListAdapter adapter=new ArrayAdapterExample(v_view.getContext(),requestList);
           list_view.setAdapter(adapter);

//            list_view.setOnItemClickListener(adapter, view, position, arg) {
//                RequestModel requestModel = requestList.get(position);
//                if (requestDelegate != null) {
//                    requestDelegate.onClickRequestItem(req_Model);
//                }
//            }

            list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    RequestModel requestModel=requestList.get(position);
                    if (requestDelegate != null) {
                        requestDelegate.onClickRequestItem(requestModel);
                    }

                }
            });
            return v_view;
        }

            public void setRequestDelegate(RequestDelegate requestDelegate) {
            this.requestDelegate=requestDelegate;

        }
}


