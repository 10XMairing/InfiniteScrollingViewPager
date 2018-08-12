package com.example.tenx.infinitescrollingviewpager;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

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

        //add timer for auto scroll


       /* TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                pager.post(new Runnable() {
                    @Override
                    public void run() {
                        int currentItem = pager.getCurrentItem();
                        pager.setCurrentItem(currentItem+1, true);
                    }
                });
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 500, 2300);*/


    }
}
