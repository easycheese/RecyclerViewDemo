package com.companionfree.demo.recyclerview.demos.demo4;


import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;
import com.companionfree.demo.recyclerview.main.DataItem;
import com.companionfree.demo.recyclerview.util.ItemManager;

import java.util.ArrayList;

public class Demo4Fragment3 extends DemoBaseFragment {

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
                        ArrayList<DataItem> newItems = ItemManager.shuffleList();
                        DiffUtil.DiffResult result = ItemManager.calculateDiff(adapter.getItems(), newItems);
                        adapter.replaceItems(newItems);
                        result.dispatchUpdatesTo(adapter);
                        swipeRefreshLayout.setRefreshing(false);
                        recycler.scrollToPosition(0);
                    }
                };
                new Handler().postDelayed(r, 1500);
            }
        });
    }
}
