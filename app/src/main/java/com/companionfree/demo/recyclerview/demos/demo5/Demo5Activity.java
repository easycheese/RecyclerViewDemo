package com.companionfree.demo.recyclerview.demos.demo5;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO5;

public class Demo5Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Demo5Fragment1());
        adapter.addFragment(new Demo5Fragment2());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Original");
        tabLayout.getTabAt(1).setText("Demo");

    }

    @Override
    public String getDemoTitle() {
        return DEMO5.toString();
    }

}
