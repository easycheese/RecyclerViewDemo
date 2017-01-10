package com.companionfree.demo.recyclerview.demos.demo1;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO1;

public class Demo1Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Demo1Fragment1());
        adapter.addFragment(new Demo1Fragment2());
        adapter.addFragment(new Demo1Fragment3());
        adapter.addFragment(new Demo1Fragment4());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Vertical");
        tabLayout.getTabAt(1).setText("Horizontal");
        tabLayout.getTabAt(2).setText("Grid");
        tabLayout.getTabAt(3).setText("Staggered Grid");
    }

    @Override
    public String getDemoTitle() {
        return DEMO1.toString();
    }

}
