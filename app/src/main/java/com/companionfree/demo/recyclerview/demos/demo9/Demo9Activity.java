package com.companionfree.demo.recyclerview.demos.demo9;


import com.companionfree.demo.recyclerview.demos.DemoBaseActivity;
import com.companionfree.demo.recyclerview.demos.fragment.DemoOriginalFragment;
import com.companionfree.demo.recyclerview.main.ViewPagerAdapter;

import static com.companionfree.demo.recyclerview.Demo.DEMO9;

public class Demo9Activity extends DemoBaseActivity {

    @Override
    public void setupLayout() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DemoOriginalFragment());
        adapter.addFragment(new Demo9Fragment1());
        adapter.addFragment(new Demo9Fragment2());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Original");
        tabLayout.getTabAt(1).setText("Short List");
        tabLayout.getTabAt(2).setText("Long List");

    }

    @Override
    public String getDemoTitle() {
        return DEMO9.toString();
    }

}
