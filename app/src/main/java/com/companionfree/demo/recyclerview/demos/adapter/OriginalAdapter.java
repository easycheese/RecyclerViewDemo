package com.companionfree.demo.recyclerview.demos.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.demos.DemoViewHolder;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;

public class OriginalAdapter extends RecyclerView.Adapter<DemoViewHolder> {

    private ArrayList<DataItem> items = new ArrayList<>();

    public ArrayList<DataItem> getItems() {
        return items;
    }


    public OriginalAdapter(ArrayList<DataItem> items) {
        this.items.addAll(items);
    }

    public void replaceItems(ArrayList<DataItem> items) {
        this.items.clear();
        this.items.addAll(items);
    }

    public void addMoreItems(ArrayList<DataItem> items) {
        int originalSize = this.items.size();
        this.items.addAll(items);
        int newSize = this.items.size();
        notifyItemRangeInserted(originalSize + 1, newSize);
    }

    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DemoViewHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.holder_demo_original, parent, false));
    }

    @Override
    public void onBindViewHolder(DemoViewHolder holder, int position) {
        holder.setItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}