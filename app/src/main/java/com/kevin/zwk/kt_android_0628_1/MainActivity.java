package com.kevin.zwk.kt_android_0628_1;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout_1;
    private LinearLayout linearLayout_left;
    private Toolbar toolbar;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout_1 = (DrawerLayout) findViewById(R.id.drawerLayout_1);
        linearLayout_left = (LinearLayout) findViewById(R.id.linearLayout_left);
        toolbar = (Toolbar) findViewById(R.id.toolbar);


        setTitle("");
        toolbar.setTitle("Title");
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setSubtitle("Subtitle");
        setSupportActionBar(toolbar);


        mToggle = new ActionBarDrawerToggle(this, drawerLayout_1, toolbar, R.string.open, R.string.close);
        drawerLayout_1.addDrawerListener(mToggle);
        
    }
}
