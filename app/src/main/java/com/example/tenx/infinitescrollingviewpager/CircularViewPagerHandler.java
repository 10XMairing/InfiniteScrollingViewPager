package com.example.tenx.infinitescrollingviewpager;

import android.support.v4.view.ViewPager;

public class CircularViewPagerHandler implements ViewPager.OnPageChangeListener{
    private ViewPager mViewPager;
    private int mCurrentPosition;
    private int mScrollState;
    private CustomAdapter adapter;
    int size;

    public CircularViewPagerHandler(ViewPager mViewPager, CustomAdapter adapter) {
        this.mViewPager = mViewPager;
        this.adapter = adapter;
        size =adapter.getCount();
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        mCurrentPosition = i;
    }

    @Override
    public void onPageScrollStateChanged(int i) {
        handleScrollState(i);
        mScrollState = i;
    }

    private void handleScrollState(final int state) {
         if(state == ViewPager.SCROLL_STATE_DRAGGING && mCurrentPosition==0 || mCurrentPosition == size-1){
            swapFirstAndlast();
        }
    }



    private void swapFirstAndlast() {
        final int lastPosition = size - 1;
        if(mCurrentPosition == 0) {
            mViewPager.setCurrentItem(lastPosition-1, false);
        } else if(mCurrentPosition == lastPosition) {
            mViewPager.setCurrentItem(1, false);
        }
    }

}
