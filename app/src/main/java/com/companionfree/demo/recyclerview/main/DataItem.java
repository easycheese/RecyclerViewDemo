package com.companionfree.demo.recyclerview.main;


import android.support.annotation.DrawableRes;

import com.companionfree.demo.recyclerview.R;

public class DataItem {

    public String name;
    public @DrawableRes int imageRes;
    public boolean isAndroid;

    public DataItem(String name) {
        this.name = name;
        this.imageRes = R.drawable.ic_android_black_48dp;
        isAndroid = true;
    }

    public DataItem(String name, @DrawableRes int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }
}
