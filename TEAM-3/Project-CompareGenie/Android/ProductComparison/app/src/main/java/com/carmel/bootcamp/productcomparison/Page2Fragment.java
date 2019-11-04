package com.carmel.bootcamp.productcomparison;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class Page2Fragment extends Fragment {

   private Button backbutton;
   private Button nextbutton;
   private View view;

   public Page2Fragment() {}

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.fragment_page2, container, false);

        nextbutton=view.findViewById(R.id.next_button);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_activity_layout,new Page3Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}
