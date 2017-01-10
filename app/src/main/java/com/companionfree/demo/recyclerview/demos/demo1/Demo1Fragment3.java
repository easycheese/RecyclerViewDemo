package com.companionfree.demo.recyclerview.demos.demo1;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.MultiLayoutAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo1Fragment3 extends DemoBaseFragment {


    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new GridLayoutManager(getContext(), 2);
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new MultiLayoutAdapter(items);
    }

    @Override
    public void modifyElements() {

    }
}
