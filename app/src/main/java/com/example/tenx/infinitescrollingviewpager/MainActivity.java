package com.example.tenx.infinitescrollingviewpager;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomAdapter adapter;
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        adapter = new CustomAdapter(MainActivity.this);
        pager = findViewById(R.id.pager);
        pager.addOnPageChangeListener(new CircularViewPagerHandler(pager, adapter));
        pager.setAdapter(adapter);

    }
}
