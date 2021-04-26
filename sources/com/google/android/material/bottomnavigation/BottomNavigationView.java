package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import com.google.android.material.C5480R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationView extends NavigationBarView {
    public static final int MAX_ITEM_COUNT = 5;

    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5480R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C5480R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C5480R.styleable.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(obtainTintedStyledAttributes.getBoolean(C5480R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        obtainTintedStyledAttributes.recycle();
        if (shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
    }

    private void addCompatibilityTopDivider(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(ContextCompat.getColor(context, C5480R.C5481color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C5480R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @NonNull
    public NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new BottomNavigationMenuView(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }
}
