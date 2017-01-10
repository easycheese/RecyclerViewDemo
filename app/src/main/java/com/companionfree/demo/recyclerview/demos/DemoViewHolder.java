package com.companionfree.demo.recyclerview.demos;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.main.DataItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DemoViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.vh_demo_text)
    TextView name;

    @Nullable
    @BindView(R.id.vh_demo_image)
    public ImageView image;

    private DataItem item;

    public DemoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Toast.makeText(context, "Clicked: " + item.name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setItem(DataItem item) {
        this.item = item;
        name.setText(item.name);
        Context context = itemView.getContext();
        if (image != null) {
            image.setImageDrawable(context.getDrawable(item.imageRes));
        }
        int color;
        if (item.isAndroid) {
             color = R.color.colorAndroid;
        } else {
            color = android.R.color.white;
        }
        int colorVal = ContextCompat.getColor(context, color);
        itemView.setBackgroundColor(colorVal);
    }
}
