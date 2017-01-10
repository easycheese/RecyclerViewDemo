package com.companionfree.demo.recyclerview.demos.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.main.DataItem;
import com.companionfree.demo.recyclerview.util.ItemManager;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class DemoBaseFragment extends Fragment {

    @BindView(R.id.fragment_recycler)
    public RecyclerView recycler;

    @BindView(R.id.fragment_recycler_swiperefresh)
    public SwipeRefreshLayout swipeRefreshLayout;

    @BindView(R.id.fragment_fab)
    public FloatingActionButton fab;

    private Unbinder unbinder;
    public abstract RecyclerView.LayoutManager getLayoutManager();
    public abstract RecyclerView.Adapter getAdapter();
    public abstract void modifyElements();

    public ArrayList<DataItem> items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_demo, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        recycler.setHasFixedSize(true);
        swipeRefreshLayout.setEnabled(false);
        fab.hide();
        items = ItemManager.getItems(getContext());

        recycler.setLayoutManager(getLayoutManager());
        recycler.setAdapter(getAdapter());
        modifyElements();

        return rootView;
    }

    @Override
    public void onDestroyView() {
        unbinder.unbind();
        super.onDestroyView();
    }
}
