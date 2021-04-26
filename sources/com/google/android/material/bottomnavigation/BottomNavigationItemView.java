package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.DimenRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.C5480R;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@NonNull Context context) {
        super(context);
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return C5480R.dimen.design_bottom_navigation_margin;
    }

    @LayoutRes
    public int getItemLayoutResId() {
        return C5480R.layout.design_bottom_navigation_item;
    }
}
