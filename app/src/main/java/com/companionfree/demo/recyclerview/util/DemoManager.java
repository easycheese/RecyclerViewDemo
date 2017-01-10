package com.companionfree.demo.recyclerview.util;

import com.companionfree.demo.recyclerview.Demo;

import java.util.ArrayList;
import java.util.Collections;

public class DemoManager {

    private static ArrayList<Demo> demos;

    public static ArrayList<Demo> getDemos() {
        if (demos == null) {
            demos = new ArrayList<>();
            Collections.addAll(demos, Demo.values());
        }
        return demos;
    }
}
