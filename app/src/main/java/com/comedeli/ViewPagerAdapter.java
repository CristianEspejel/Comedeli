package com.comedeli;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{

    int behavior;
    public ViewPagerAdapter (@NonNull FragmentManager fm, int behavior){
        super(fm, behavior);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public  Fragment getItem(int position){
        switch (position){
            case 0:
                return new tabFood();
            case 1:
                return new tabDrink();
            case 2:
                return new tabComplemento();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return behavior;
    }
}
