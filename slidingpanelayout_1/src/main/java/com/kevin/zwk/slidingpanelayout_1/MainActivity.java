package com.kevin.zwk.slidingpanelayout_1;

import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SlidingPaneLayout slidingPaneLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slidingPaneLayout = (SlidingPaneLayout) findViewById(R.id.slidingPaneLayout);
    }

    public void click1(View view) {
        slidingPaneLayout.closePane();
        Toast.makeText(MainActivity.this, "点击了测试一", Toast.LENGTH_SHORT).show();
    }

    public void click2(View view) {
        Toast.makeText(MainActivity.this, "点击了测试二", Toast.LENGTH_SHORT).show();
    }

    public void click3(View view) {
        if (slidingPaneLayout.isOpen()) {
            slidingPaneLayout.closePane();
        } else {
            slidingPaneLayout.openPane();
        }
    }
}
