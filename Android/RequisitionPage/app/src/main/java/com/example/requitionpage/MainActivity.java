package com.example.requitionpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.requitionpage.Global.RequestStatus;
import com.example.requitionpage.Model.RequestModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<RequestModel> requestList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RequestModel requestModel=new RequestModel();
        requestModel.setRequestNumber("PUR-2019-056");
        requestModel.setRequestStatus(RequestStatus.APPROVED);
        requestModel.setDescription("06 Jul 2019");
        requestList.add(requestModel);

    }
}
