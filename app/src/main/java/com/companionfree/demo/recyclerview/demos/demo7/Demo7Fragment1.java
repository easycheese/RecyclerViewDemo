package com.companionfree.demo.recyclerview.demos.demo7;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.SwipeAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo7Fragment1 extends DemoBaseFragment {

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new SwipeAdapter(items);
    }

    @Override
    public void modifyElements() {
    }
}
