package com.companionfree.demo.recyclerview.demos.demo2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public class CustomItemDecoration extends RecyclerView.ItemDecoration {

    private Drawable itemDecoration;

    public CustomItemDecoration(Drawable divider) {
        itemDecoration = divider;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        if (parent.getChildAdapterPosition(view) == 0) { // Skip for first items
            return;
        }

        outRect.top = itemDecoration.getIntrinsicHeight();
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

        int dividerLeft = parent.getPaddingLeft();
        int dividerRight = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int dividerTop = child.getBottom() + params.bottomMargin;
            int dividerBottom = dividerTop + itemDecoration.getIntrinsicHeight();

            int maxCount = 10;
            int divisor = dividerRight / maxCount;
            for (int imageCount = 0 ; imageCount < maxCount ; imageCount++) {
                Drawable d = itemDecoration.getConstantState().newDrawable();
                d.setBounds(dividerLeft + divisor * imageCount, dividerTop, divisor * (imageCount + 1), dividerBottom);
                d.draw(c);
            }
        }
    }
}
