package com.companionfree.demo.recyclerview.demos.demo9;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.AnimatedAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo9Fragment2 extends DemoBaseFragment {

    AnimatedAdapter adapter;

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        adapter = new AnimatedAdapter(items);
        return adapter;
    }

    @Override
    public void modifyElements() {
        adapter.setRecyclerView(recycler);
    }
}
