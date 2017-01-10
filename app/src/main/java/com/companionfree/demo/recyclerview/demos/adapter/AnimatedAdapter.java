package com.companionfree.demo.recyclerview.demos.adapter;

import android.support.transition.TransitionManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.demos.DemoAnimatedViewHolder;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;
import java.util.List;

public class AnimatedAdapter extends RecyclerView.Adapter<DemoAnimatedViewHolder> {

    private List<DataItem> items = new ArrayList<>();

    private int mExpandedPosition = -1;
    private RecyclerView recyclerView;
    private LinearLayoutManager llm;

    public AnimatedAdapter(List<DataItem> items) {
        this.items.addAll(items);
        this.recyclerView = null;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    @Override
    public DemoAnimatedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.holder_animated_demo, parent, false);
        return new DemoAnimatedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final DemoAnimatedViewHolder holder, int position) {
        holder.setItem(items.get(position));

        final boolean isExpanded = position == mExpandedPosition;
        holder.hiddenText.setVisibility(isExpanded?View.VISIBLE:View.GONE);
        holder.itemView.setActivated(isExpanded);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int oldPosition = mExpandedPosition;
                mExpandedPosition = isExpanded ? -1: holder.getAdapterPosition();
                TransitionManager.beginDelayedTransition(recyclerView);

                if (items.size() < 6) { // Short list demo
                    notifyDataSetChanged();
                } else {
                    if (oldPosition != -1) {
                        notifyItemChanged(oldPosition);
                    }

                    notifyItemChanged(holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }
}