package com.example.navigationdrawer;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    androidx.appcompat.widget.Toolbar foodpanda;
    NavigationView navbar;
    ActionBarDrawerToggle hamburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        foodpanda = (androidx.appcompat.widget.Toolbar) findViewById(R.id.foodpanda);
        navbar = (NavigationView) findViewById(R.id.navbar);

        hamburger = new ActionBarDrawerToggle(this,drawer, foodpanda,R.string.open,R.string.close);
        drawer.addDrawerListener(hamburger);
        hamburger.syncState();
    }

}