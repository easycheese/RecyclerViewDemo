package com.companionfree.demo.recyclerview.demos.demo4;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO4;

public class Demo4Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Demo4Fragment1());
        adapter.addFragment(new Demo4Fragment2());
        adapter.addFragment(new Demo4Fragment3());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Original");
        tabLayout.getTabAt(1).setText("Swipe Refresh");
        tabLayout.getTabAt(2).setText("Swipe Refresh / DiffUtil");

    }

    @Override
    public String getDemoTitle() {
        return DEMO4.toString();
    }

}
