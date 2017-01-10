package com.companionfree.demo.recyclerview.demos.demo9;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.AnimatedAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;

public class Demo9Fragment1 extends DemoBaseFragment {

    AnimatedAdapter adapter;

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        ArrayList<DataItem> itemsShort = new ArrayList<>();
        for (int x = 0 ; x < 5 ; x++) {
            itemsShort.add(items.get(x));
        }
        adapter = new AnimatedAdapter(itemsShort);
        return adapter;
    }

    @Override
    public void modifyElements() {
        adapter.setRecyclerView(recycler);
    }
}
