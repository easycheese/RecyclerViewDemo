package com.companionfree.demo.recyclerview.demos;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.companionfree.demo.recyclerview.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class DemoBaseActivity extends AppCompatActivity{

    @BindView(R.id.demo_tabs)
    public TabLayout tabLayout;

    @BindView(R.id.demo_pager)
    public ViewPager viewPager;

    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    private static final String EXTRA_DEMO = "extra_demo";

    private Unbinder unbinder;

    public abstract void setupLayout();
    public abstract String getDemoTitle();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        unbinder = ButterKnife.bind(this);

        setupLayout();
        setSupportActionBar(toolbar);
        setTitle(getDemoTitle());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        Log.d("DemoBase", "Destroying");
        super.onDestroy();
    }
}
