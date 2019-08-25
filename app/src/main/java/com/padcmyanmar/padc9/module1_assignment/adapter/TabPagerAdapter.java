package com.padcmyanmar.padc9.module1_assignment.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.padcmyanmar.padc9.module1_assignment.fragments.FragmentOne;
import com.padcmyanmar.padc9.module1_assignment.fragments.FragmentTwo;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0){
            return new FragmentOne();
        }else{
            return new FragmentTwo();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "NearBy";
        }else {
            return "Popular";
        }
    }
}
