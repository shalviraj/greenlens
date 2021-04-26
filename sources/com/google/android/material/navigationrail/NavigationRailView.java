package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.google.android.material.C5480R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    public static final int DEFAULT_MENU_GRAVITY = 49;
    public static final int MAX_ITEM_COUNT = 7;
    @Nullable
    private View headerView;
    private final int topMargin;

    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    public NavigationRailView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5480R.attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C5480R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.topMargin = getResources().getDimensionPixelSize(C5480R.dimen.mtrl_navigation_rail_margin);
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(getContext(), attributeSet, C5480R.styleable.NavigationRailView, i, i2, new int[0]);
        int resourceId = obtainTintedStyledAttributes.getResourceId(C5480R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            addHeaderView(resourceId);
        }
        setMenuGravity(obtainTintedStyledAttributes.getInt(C5480R.styleable.NavigationRailView_menuGravity, 49));
        obtainTintedStyledAttributes.recycle();
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private boolean isHeaderViewVisible() {
        View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        int paddingLeft = getPaddingLeft();
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + paddingLeft + suggestedMinimumWidth), BasicMeasure.EXACTLY);
    }

    public void addHeaderView(@LayoutRes int i) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public void addHeaderView(@NonNull View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    @NonNull
    public NavigationRailMenuView createNavigationBarMenuView(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    @Nullable
    public View getHeaderView() {
        return this.headerView;
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i5 = this.topMargin;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int makeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(makeMinWidthSpec, i2);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), makeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }
}
