package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C5480R;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class NavigationRailItemView extends NavigationBarItemView {
    public NavigationRailItemView(@NonNull Context context) {
        super(context);
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return C5480R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @LayoutRes
    public int getItemLayoutResId() {
        return C5480R.layout.mtrl_navigation_rail_item;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
