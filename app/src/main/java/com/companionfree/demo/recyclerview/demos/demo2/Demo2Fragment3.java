package com.companionfree.demo.recyclerview.demos.demo2;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.demos.adapter.OriginalAdapter;
import com.companionfree.demo.recyclerview.demos.fragment.DemoBaseFragment;

public class Demo2Fragment3 extends DemoBaseFragment {


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
        recycler.addItemDecoration(new
                CustomItemDecoration(getResources().getDrawable(R.drawable.ic_android_black_24dp, null)));
//                CustomItemDecoration(getResources().getDrawable(R.drawable.divider, null)));
    }
}
