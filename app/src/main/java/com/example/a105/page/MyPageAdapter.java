package com.example.a105.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    private String[] title =new String[]{"熊猫","大象","长颈鹿"};

    public  MyPageAdapter(FragmentManager manager){
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFragment();
        } else if (position == 1) {
            return new SecondFragment();
        } else{
            return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
//        if (position==0){
//            return "First";
//        }
//        return "Title" + position;
        return title[position];
    }
}
