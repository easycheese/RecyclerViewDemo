package com.companionfree.demo.recyclerview.util;


import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.util.DiffUtil;

import com.companionfree.demo.recyclerview.R;
import com.companionfree.demo.recyclerview.main.DataItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemManager {

    private static ArrayList<DataItem> items;

    public static ArrayList<DataItem> getItems(Context ctx) {
        if (items == null) {
            createItems(ctx);
        }
        return items;
    }

    public static ArrayList<DataItem> shuffleList() {
        Collections.shuffle(items);
        return items;
    }

    public static DiffUtil.DiffResult calculateDiff(final List<DataItem> oldList, final List<DataItem> newList) {
         return DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public int getOldListSize() {
                return oldList.size();
            }

            @Override
            public int getNewListSize() {
                return newList.size();
            }

            @Override
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                return oldList.get(oldItemPosition).name.equals(newList.get(newItemPosition).name);
            }

            @Override
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                return oldList.get(oldItemPosition).name.equals(newList.get(newItemPosition).name);
            }
        });

    }

    private static void createItems(Context ctx) {
        items = new ArrayList<>();
        String[] names = ctx.getResources().getStringArray(R.array.foods);
        for (String name : names) {
            items.add(new DataItem(name, getImage()));
        }

        String[] androids = ctx.getResources().getStringArray(R.array.androids);
        for (String name : androids) {
            items.add(new DataItem(name));
        }
        Collections.shuffle(items);
    }


    private static @DrawableRes int getImage() {
        @DrawableRes int image = 0;
        switch ((int)(Math.random() * 6)) {
            case 0:
                image = R.drawable.ic_looks_one_black_24dp;
                break;
            case 1:
                image = R.drawable.ic_looks_two_black_24dp;
                break;
            case 2:
                image = R.drawable.ic_looks_3_black_24dp;
                break;
            case 3:
                image = R.drawable.ic_looks_4_black_24dp;
                break;
            case 4:
                image = R.drawable.ic_looks_5_black_24dp;
                break;
            case 5:
                image = R.drawable.ic_looks_6_black_24dp;
                break;
        }
        return image;
    }
}
