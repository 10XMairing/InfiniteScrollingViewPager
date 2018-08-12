package com.example.tenx.infinitescrollingviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends PagerAdapter{

    private Context mCtx;
    private List<Integer> mList;

     CustomAdapter(Context mCtx) {
        this.mCtx = mCtx;
        this.mList = new ArrayList<>();
        mList.add(R.color.bg_4);
        mList.add(R.color.bg_1);
        mList.add(R.color.bg_2);
        mList.add(R.color.bg_3);
        mList.add(R.color.bg_4);
        mList.add(R.color.bg_1);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.slide, container, false);
        ImageView img = view.findViewById(R.id.bg);
        img.setBackgroundColor(ContextCompat.getColor(mCtx, mList.get(position)));
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }





}
