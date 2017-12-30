package com.catlover.catlover.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.catlover.catlover.fragment.WelcomeFirstFragment;
import com.catlover.catlover.fragment.WelcomeSecondFragment;

/**
 * Created by DAVID on 27/12/2017.
 */

public class WelcomeAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public WelcomeAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return new WelcomeFirstFragment();
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return new WelcomeSecondFragment();
            case 2: // Fragment # 1 - This will show SecondFragment
                return new WelcomeFirstFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}