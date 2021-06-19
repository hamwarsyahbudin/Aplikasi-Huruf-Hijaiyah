package com.syahbudin.hijaiyahhuruf.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.syahbudin.hijaiyahhuruf.fragment.FragmentDhammah;
import com.syahbudin.hijaiyahhuruf.fragment.FragmentFathah;
import com.syahbudin.hijaiyahhuruf.fragment.FragmentHijaiyah;
import com.syahbudin.hijaiyahhuruf.fragment.FragmentKasrah;

public class HijaiyyahAdapter extends FragmentStatePagerAdapter {
    public HijaiyyahAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new FragmentHijaiyah();
                break;
            case 1:
                frag = new FragmentDhammah();
                break;
            case 2:
                frag = new FragmentKasrah();
                break;
            case 3:
                frag = new FragmentFathah();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = " ";
        switch (position) {
            case 0:
                title = "Huruf Hijaiyah";
                break;
            case 1:
                title = "Huruf Hijaiyah Dhammah";
                break;
            case 2:
                title = "Huruf Hijaiyah Kasrah";
                break;
            case 3:
                title = "Huruf Hijaiyah Fathah";
                break;
        }

        return title;
    }
}
