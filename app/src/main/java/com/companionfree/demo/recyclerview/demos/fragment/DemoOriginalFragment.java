package com.companionfree.demo.recyclerview.demos.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.util.ItemManager;

public class DemoOriginalFragment extends DemoBaseFragment {

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new OriginalAdapter(ItemManager.getItems(getContext()));
    }

    @Override
    public void modifyElements() {

    }
}
