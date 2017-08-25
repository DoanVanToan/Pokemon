package com.framgia.pokemon.utils;

import android.databinding.BindingAdapter;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by ducpm on 24/08/17.
 */
public final class BindingUtils {
    @BindingAdapter({"bind:listener"})
    public static void setBottomViewItemListener(BottomNavigationView view,
                                                 BottomNavigationView
                                                 .OnNavigationItemSelectedListener listener) {
        view.setOnNavigationItemSelectedListener(listener);
    }

    @BindingAdapter("bind:currentTabSelect")
    public static void setSelectedTab(ViewPager viewPager, int position) {
        viewPager.setCurrentItem(position);
    }

    @BindingAdapter("bind:viewPagerAdapter")
    public static void setViewPagerAdapter(ViewPager viewPager, PagerAdapter pagerAdapter) {
        viewPager.setAdapter(pagerAdapter);
    }
}

