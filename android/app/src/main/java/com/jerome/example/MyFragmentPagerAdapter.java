package com.jerome.example;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by jerome on 2016/5/23.
 */
class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    //integer to count number of tabs
    private int mTabCount;
    private ArrayList<Fragment> mListFragment;
    //Constructor to the class
    public MyFragmentPagerAdapter(FragmentManager fm, int tabCount, ArrayList<Fragment> listFragment) {
        super(fm);
        //Initializing tab count
        mTabCount = tabCount;
        mListFragment = listFragment;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
       if ((position < 0) || (position >= mListFragment.size()))
           return null;
        return mListFragment.get(position);
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return mTabCount;
    }
}