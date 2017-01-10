package com.companionfree.demo.recyclerview.demos.demo5;


import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;
import com.companionfree.demo.recyclerview.util.ItemManager;

public class Demo5Fragment2 extends DemoBaseFragment {

    private OriginalAdapter adapter;
    private LinearLayoutManager llm;

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        llm = new LinearLayoutManager(getContext());
        return llm;
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        adapter = new OriginalAdapter(items);
        return adapter;
    }

    @Override
    public void modifyElements() {
        EndlessRecyclerScrollListener scrollListener = new EndlessRecyclerScrollListener(llm) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                swipeRefreshLayout.setRefreshing(true);
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        if (swipeRefreshLayout == null) {
                            return;
                        }
                        adapter.addMoreItems(ItemManager.getItems(getContext()));
                        swipeRefreshLayout.setRefreshing(false);
                    }
                };
                new Handler().postDelayed(r, 1500);
            }
        };
        recycler.addOnScrollListener(scrollListener);
    }
}
