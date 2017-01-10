package com.companionfree.demo.recyclerview.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.Demo;
import com.companionfree.demo.recyclerview.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private ArrayList<Demo> items = new ArrayList<>();

    public MainAdapter(ArrayList<Demo> items) {
        this.items.addAll(items);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.holder_main, parent, false));
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.setItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
