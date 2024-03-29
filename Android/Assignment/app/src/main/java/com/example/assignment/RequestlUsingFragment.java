package com.example.assignment;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.assignment.Delegates.RequestDelegate;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;

public class RequestlUsingFragment extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, RequestDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestl_using_fragment);

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

        FragmentReqPage My_Fragment=new FragmentReqPage();
        My_Fragment.setRequestDelegate(this);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.port_frame_layout,My_Fragment);
        fragmentTransaction.commit();
    }

//    public void RequestlUsingFragment(View view){
//        FragmentReqPage My_Fragment=new FragmentReqPage();
//        My_Fragment.setRequestDelegate(this);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fragment,My_Fragment);
//        fragmentTransaction.commit();
//
//
//    }


    @Override
    public  void onConfigurationChanged(Configuration newConfigur) {
        super.onConfigurationChanged(newConfigur);

        if (newConfigur.orientation==Configuration.ORIENTATION_LANDSCAPE) {

            Fragment My_Fragment = new FragmentReqPage2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.land_reqview, My_Fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else  if(newConfigur.orientation==Configuration.ORIENTATION_PORTRAIT) {

            Fragment My_Fragment=new FragmentReqPage2();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.port_frame_layout,My_Fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
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
        getMenuInflater().inflate(R.menu.requestl_using, menu);
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

    @Override
    public void onClickRequestItem(RequestModel requestModel) {
        int i=0;
        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){

            Fragment My_Fragment=new FragmentReqPage2();
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.port_frame_layout,My_Fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            ((FragmentReqPage2)My_Fragment).set_data(requestModel);

        }else if(orientation==Configuration.ORIENTATION_LANDSCAPE) {

            Fragment My_Fragment = new FragmentReqPage2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.land_reqview, My_Fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            ((FragmentReqPage2)My_Fragment).set_data(requestModel);
        }
    }
}
