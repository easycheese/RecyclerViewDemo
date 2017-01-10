package com.companionfree.demo.recyclerview.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.companionfree.demo.recyclerview.Demo;
import com.companionfree.demo.recyclerview.R;

import butterknife.BindView;
import butterknife.ButterKnife;

class MainViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.vh_main_text)
    TextView name;

    private Demo demo;

    MainViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();

                context.startActivity(demo.getIntent(context));
            }
        });
    }

    void setItem(Demo demo) {
        this.demo = demo;
        name.setText(demo.toString());
    }
}
