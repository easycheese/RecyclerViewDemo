package com.companionfree.demo.recyclerview.demos.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.demos.DemoViewHolder;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;

public class SwipeAdapter extends RecyclerView.Adapter<DemoViewHolder> {

    private ArrayList<DataItem> items = new ArrayList<>();

    public SwipeAdapter(ArrayList<DataItem> items) {
        this.items.addAll(items);
    }

    public void removeItem(int position) {
        items.remove(position);
        notifyItemRemoved(position);
    }

    public void moveItem(int oldPosition, int newPosition) {
        DataItem item = items.remove(oldPosition);
        items.add(newPosition, item);
        notifyItemMoved(oldPosition, newPosition);
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