package com.companionfree.demo.recyclerview.demos.demo1;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.companionfree.demo.recyclerview.demos.adapter.MultiLayoutAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo1Fragment4 extends DemoBaseFragment {

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new MultiLayoutAdapter(items);
    }

    @Override
    public void modifyElements() {

    }
}
