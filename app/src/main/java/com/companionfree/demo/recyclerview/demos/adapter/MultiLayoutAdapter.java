package com.companionfree.demo.recyclerview.demos.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.demos.DemoViewHolder;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;

public class MultiLayoutAdapter extends RecyclerView.Adapter<DemoViewHolder> {

    private ArrayList<DataItem> items = new ArrayList<>();

    public MultiLayoutAdapter(ArrayList<DataItem> items) {
        this.items.addAll(items);
    }

    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DemoViewHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(viewType, parent, false));
    }

    @Override
    public void onBindViewHolder(final DemoViewHolder holder, int position) {
        holder.setItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).isAndroid ? R.layout.holder_demo : R.layout.holder_demo_original;
    }
}