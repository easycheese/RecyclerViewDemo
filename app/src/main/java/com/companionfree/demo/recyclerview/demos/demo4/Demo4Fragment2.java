package com.companionfree.demo.recyclerview.demos.demo4;


import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;
import com.companionfree.demo.recyclerview.main.DataItem;
import com.companionfree.demo.recyclerview.util.ItemManager;

import java.util.ArrayList;

public class Demo4Fragment2 extends DemoBaseFragment {

    private OriginalAdapter adapter;

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        adapter = new OriginalAdapter(items);
        return adapter;
    }

    @Override
    public void modifyElements() {
        swipeRefreshLayout.setEnabled(true);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        if (swipeRefreshLayout == null) {
                            return;
                        }
                        swipeRefreshLayout.setRefreshing(false);
                        ArrayList<DataItem> newItems = ItemManager.shuffleList();
                        adapter.replaceItems(newItems);
                        adapter.notifyDataSetChanged();
                    }
                };
                new Handler().postDelayed(r, 1500);
            }
        });
    }
}
