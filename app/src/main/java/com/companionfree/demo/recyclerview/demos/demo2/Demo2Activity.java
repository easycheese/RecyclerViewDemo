package com.companionfree.demo.recyclerview.demos.demo2;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.demos.fragment.DemoOriginalFragment;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO2;

public class Demo2Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DemoOriginalFragment());
        adapter.addFragment(new Demo2Fragment1());
        adapter.addFragment(new Demo2Fragment2());
        adapter.addFragment(new Demo2Fragment3());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Original");
        tabLayout.getTabAt(1).setText("Vertical");
        tabLayout.getTabAt(2).setText("Horizontal");
        tabLayout.getTabAt(3).setText("Custom");

        
    }

    @Override
    public String getDemoTitle() {
        return DEMO2.toString();
    }

}
