package com.kevin.zwk.textinputlayout_1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) {
        Snackbar.make(view,"我是一个提示",Snackbar.LENGTH_LONG).setAction("点我", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了点我", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }



}
