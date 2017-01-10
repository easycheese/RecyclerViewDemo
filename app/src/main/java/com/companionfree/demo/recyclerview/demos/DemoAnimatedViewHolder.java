package com.companionfree.demo.recyclerview.demos;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.main.DataItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoAnimatedViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.vh_demo_text)
    TextView name;

    @BindView(R.id.vh_demo_hidden_text)
    public TextView hiddenText;

    private DataItem item;

    public DemoAnimatedViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setItem(DataItem item) {
        if (this.item == item) {
            return;
        }
        this.item = item;
        name.setText(item.name);
        hiddenText.setText(item.name + " hidden");
    }
}
