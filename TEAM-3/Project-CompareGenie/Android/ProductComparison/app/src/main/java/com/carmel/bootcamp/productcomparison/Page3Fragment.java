package com.carmel.bootcamp.productcomparison;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page3Fragment extends Fragment {

    private View view;
    EditText editTextdata;
    Button addbutton;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;


    public Page3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_page3, container, false);

        editTextdata = view.findViewById(R.id.addparameter_input);
        addbutton = view.findViewById(R.id.addparameter_button);
        listView = view.findViewById(R.id.listcontainer);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        onbuttonclick();
        return view;
    }



    public  void onbuttonclick(){
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result=editTextdata.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();

            }
        });

    }
}






