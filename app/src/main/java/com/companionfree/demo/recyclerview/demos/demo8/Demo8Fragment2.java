package com.companionfree.demo.recyclerview.demos.demo8;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo8Fragment2 extends DemoBaseFragment {

    @Override
    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(getContext());
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        return new OriginalAdapter(items);
    }

    @Override
    public void modifyElements() {
        fab.show();
        recycler.setOnFlingListener(new RecyclerView.OnFlingListener() {
            @Override
            public boolean onFling(int velocityX, int velocityY) {
                if (velocityY > 0) {
                    fab.hide();
                }
                if (velocityY < 0) {
                    fab.show();
                }
                return false;
            }
        });
    }
}
