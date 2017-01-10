package com.companionfree.demo.recyclerview.demos.demo2;


import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo2Fragment2 extends DemoBaseFragment {


    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new OriginalAdapter(items);
    }

    @Override
    public void modifyElements() {
        recycler.addItemDecoration(new
                DividerItemDecoration(getContext(), DividerItemDecoration.HORIZONTAL));
    }
}
