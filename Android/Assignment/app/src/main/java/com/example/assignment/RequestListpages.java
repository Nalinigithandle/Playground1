package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;

import com.example.assignment.Global.RequestStatus;
import com.example.assignment.Model.RequestModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RequestListpages extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button newreqbtn;
    ListView listView;
    ArrayList title=new ArrayList<String>();
    ArrayList date=new ArrayList<String>();
    ArrayList status=new ArrayList<String>();
    TextView popup;
    ImageView filterpic;
    ListPopupWindow popupwindow;
    String[] Statuses={"CLEAR", "APPROVED", "AWAITING", "DRAFT", "REJECTED"};

    ArrayList<RequestModel> requestList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_listpages);

        newreqbtn=findViewById(R.id.newreqbutton);
        newreqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),RequisitionPages.class);
                startActivity(intent);
            }
        });

        popup=findViewById(R.id.popdatum);
        filterpic=findViewById(R.id.filterimage);

        popupwindow = new ListPopupWindow(getApplicationContext());
        popupwindow.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.popview, Statuses));
        popupwindow.setAnchorView(filterpic);
        popupwindow.setModal(true);
        filterpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupwindow.show();
            }
        });

        RequestModel req_Model= new RequestModel();
        req_Model.setRequestNumber("PUR-2019-056");
        req_Model.setRequestStatus(RequestStatus.AWAITING_APPROVAL);
        req_Model.setDescription("25-03-2019");
        requestList.add(req_Model);

        req_Model=new RequestModel();
        req_Model.setRequestNumber("PUR-2019-057");
        req_Model.setRequestStatus(RequestStatus.APPROVED);
        req_Model.setDescription("26-03-2019");
        requestList.add(req_Model);

        req_Model=new RequestModel();
        req_Model.setRequestNumber("PUR-2019-058");
        req_Model.setRequestStatus(RequestStatus.DRAFT);
        req_Model.setDescription("27-03-2019");
        requestList.add(req_Model);

        req_Model=new RequestModel();
        req_Model.setRequestNumber("PUR-2019-059");
        req_Model.setRequestStatus(RequestStatus.REJECTED);
        req_Model.setDescription("28-03-2019");
        requestList.add(req_Model);



 //       title.add("PUR-2019-056");
 //       title.add("PUR-2019-056");
//        title.add("PUR-2019-056");
//        title.add("PUR-2019-056");

//        date.add("20-09-2019");
//        date.add("22-09-2019");
//        date.add("25-09-2019");
//        date.add("28-09-2019");

//        status.add("APPROVED");
//        status.add("APPROVED");
//        status.add("APPROVED");
//        status.add("APPROVED");

        listView=findViewById(R.id.listbox);
        ArrayAdapterExample adapter=new ArrayAdapterExample(getApplicationContext(),requestList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View convertview, int position, long l) {
                RequestModel request=requestList.get(position);

                Intent intent=new Intent(getApplicationContext(),RequestView.class);
                Bundle req_Bundle=new Bundle();
                req_Bundle.putString("RequestNumber",request.getRequestNumber());
                req_Bundle.putString("RequestStatus",request.getRequestStatus().toString());
                req_Bundle.putString("RequestDescription",request.getDescription());

                intent.putExtra("request",req_Bundle);
                startActivity(intent);


            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.request_listpages, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
