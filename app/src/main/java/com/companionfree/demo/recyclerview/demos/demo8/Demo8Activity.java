package com.companionfree.demo.recyclerview.demos.demo8;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.demos.fragment.DemoOriginalFragment;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO8;

public class Demo8Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DemoOriginalFragment());
        adapter.addFragment(new Demo8Fragment1());
        adapter.addFragment(new Demo8Fragment2());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Original");
        tabLayout.getTabAt(1).setText("Consume");
        tabLayout.getTabAt(2).setText("Don't Consume");

    }

    @Override
    public String getDemoTitle() {
        return DEMO8.toString();
    }

}
