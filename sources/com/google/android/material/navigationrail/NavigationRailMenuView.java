package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams2;
        layoutParams2.gravity = 49;
        setLayoutParams(layoutParams2);
    }

    private int makeSharedHeightSpec(int i, int i2, int i3) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i2 / Math.max(1, i3)), 0);
    }

    private int measureChildHeight(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    private int measureSharedChildHeights(int i, int i2, int i3, View view) {
        makeSharedHeightSpec(i, i2, i3);
        int makeSharedHeightSpec = view == null ? makeSharedHeightSpec(i, i2, i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += measureChildHeight(childAt, i, makeSharedHeightSpec);
            }
        }
        return i4;
    }

    private int measureShiftingChildHeights(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = measureChildHeight(childAt, i, makeSharedHeightSpec(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + measureSharedChildHeights(i, i2, i3, childAt);
    }

    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    public boolean isTopGravity() {
        return (this.layoutParams.gravity & 112) == 48;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().getVisibleItems().size();
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState((size2 <= 1 || !isShifting(getLabelVisibilityMode(), size2)) ? measureSharedChildHeights(i, size, size2, (View) null) : measureShiftingChildHeights(i, size, size2), i2, 0));
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams2 = this.layoutParams;
        if (layoutParams2.gravity != i) {
            layoutParams2.gravity = i;
            setLayoutParams(layoutParams2);
        }
    }
}
