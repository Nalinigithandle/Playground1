package com.carmel.bootcamp.productcomparison;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1Fragment extends Fragment {
    private TextView create_from_blank_link;
    private View view;


    public Page1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_page1, container, false);
        create_from_blank_link=view.findViewById(R.id.comparisonsheet);
        create_from_blank_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_activity_layout,new Page2Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

//        return inflater.inflate(R.layout.fragment_page1, container, false);
        return view;
    }

}
