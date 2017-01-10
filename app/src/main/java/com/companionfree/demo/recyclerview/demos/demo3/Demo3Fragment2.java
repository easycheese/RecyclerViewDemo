package com.companionfree.demo.recyclerview.demos.demo3;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import com.companionfree.demo.recyclerview.demos.adapter.MultiLayoutAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo3Fragment2 extends DemoBaseFragment {


    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new MultiLayoutAdapter(items);
    }

    @Override
    public void modifyElements() {
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recycler);
    }
}
