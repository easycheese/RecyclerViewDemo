package com.companionfree.demo.recyclerview;

import android.content.Context;
import android.content.Intent;

import com.companionfree.demo.recyclerview.demos.demo1.Demo1Activity;
import com.companionfree.demo.recyclerview.demos.demo2.Demo2Activity;
import com.companionfree.demo.recyclerview.demos.demo3.Demo3Activity;
import com.companionfree.demo.recyclerview.demos.demo4.Demo4Activity;
import com.companionfree.demo.recyclerview.demos.demo5.Demo5Activity;
import com.companionfree.demo.recyclerview.demos.demo6.Demo6Activity;
import com.companionfree.demo.recyclerview.demos.demo7.Demo7Activity;
import com.companionfree.demo.recyclerview.demos.demo8.Demo8Activity;
import com.companionfree.demo.recyclerview.demos.demo9.Demo9Activity;

public enum Demo {

    DEMO1 {
        @Override
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo1Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 1 - Layout Managers";
        }
    },
    DEMO2 {
        @Override
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo2Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 2 - Dividers";
        }
    },
    DEMO3 {
        @Override
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo3Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 3 - Snap Helper";
        }
    },
    DEMO4 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo4Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 4 - Swipe to Refresh / DiffUtil";
        }
    },

    DEMO5 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo5Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 5 - Endless Scrolling";
        }
    },
    DEMO6 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo6Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 6 - Swipe to Dismiss";
        }
    },
    DEMO7 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo7Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 7 - Drag to Reorder";
        }
    },
    DEMO8 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo8Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 8 - Fling Listener";
        }
    },
    DEMO9 {
        public Intent getIntent(Context ctx) {
            return new Intent(ctx, Demo9Activity.class);
        }

        @Override
        public String toString() {
            return "Demo 9 - Selected / Animated Item Layouts";
        }
    };

    public abstract Intent getIntent(Context ctx);
    private static Demo[] demos;

    public static Demo getDemo(int demo) {
        if (demos == null) {
            demos = Demo.values();
        }
        return demos[demo];
    }
}
