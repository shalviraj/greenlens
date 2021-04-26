package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C5480R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int INVALID_ITEM_POSITION = -1;
    @Nullable
    private BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    /* access modifiers changed from: private */
    public ImageView icon;
    @Nullable
    private ColorStateList iconTint;
    private boolean isShifting;
    @Nullable
    private MenuItemImpl itemData;
    private int itemPosition = -1;
    private final ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    @Nullable
    private Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;
    @Nullable
    private Drawable wrappedIconDrawable;

    public NavigationBarItemView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.icon = (ImageView) findViewById(C5480R.C5483id.navigation_bar_item_icon_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(C5480R.C5483id.navigation_bar_item_labels_group);
        this.labelGroup = viewGroup;
        TextView textView = (TextView) findViewById(C5480R.C5483id.navigation_bar_item_small_label_view);
        this.smallLabel = textView;
        TextView textView2 = (TextView) findViewById(C5480R.C5483id.navigation_bar_item_large_label_view);
        this.largeLabel = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.defaultMargin = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(C5480R.C5483id.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        ViewCompat.setImportantForAccessibility(textView, 2);
        ViewCompat.setImportantForAccessibility(textView2, 2);
        setFocusable(true);
        calculateTextScaleFactors(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (NavigationBarItemView.this.icon.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.tryUpdateBadgeBounds(navigationBarItemView.icon);
                    }
                }
            });
        }
    }

    private void calculateTextScaleFactors(float f, float f2) {
        this.shiftAmount = f - f2;
        this.scaleUpFactor = (f2 * 1.0f) / f;
        this.scaleDownFactor = (f * 1.0f) / f2;
    }

    @Nullable
    private FrameLayout getCustomParentForBadge(View view) {
        ImageView imageView = this.icon;
        if (view != imageView || !BadgeUtils.USE_COMPAT_PARENT) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        int minimumHeight = badgeDrawable2 != null ? badgeDrawable2.getMinimumHeight() / 2 : 0;
        return this.icon.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) this.icon.getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        int minimumWidth = badgeDrawable2 == null ? 0 : badgeDrawable2.getMinimumWidth() - this.badgeDrawable.getHorizontalOffset();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.icon.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    private boolean hasBadge() {
        return this.badgeDrawable != null;
    }

    private static void setViewLayoutParams(@NonNull View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private static void setViewScaleValues(@NonNull View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private void tryAttachBadgeToAnchor(@Nullable View view) {
        if (hasBadge() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeUtils.attachBadgeDrawable(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private void tryRemoveBadgeFromAnchor(@Nullable View view) {
        if (hasBadge()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeUtils.detachBadgeDrawable(this.badgeDrawable, view);
            }
            this.badgeDrawable = null;
        }
    }

    /* access modifiers changed from: private */
    public void tryUpdateBadgeBounds(View view) {
        if (hasBadge()) {
            BadgeUtils.setBadgeDrawableBounds(this.badgeDrawable, view, getCustomParentForBadge(view));
        }
    }

    private static void updateViewPaddingBottom(@NonNull View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Nullable
    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    @DrawableRes
    public int getItemBackgroundResId() {
        return C5480R.C5482drawable.mtrl_navigation_bar_item_background;
    }

    @Nullable
    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    @DimenRes
    public int getItemDefaultMarginResId() {
        return C5480R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    @LayoutRes
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.itemPosition;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return this.labelGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.labelGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), this.labelGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public void initialize(@NonNull MenuItemImpl menuItemImpl, int i) {
        this.itemData = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        if (!TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(menuItemImpl.getContentDescription());
        }
        TooltipCompat.setTooltipText(this, !TextUtils.isEmpty(menuItemImpl.getTooltipText()) ? menuItemImpl.getTooltipText() : menuItemImpl.getTitle());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
    }

    @NonNull
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.itemData.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 != null && badgeDrawable2.isVisible()) {
            CharSequence title = this.itemData.getTitle();
            if (!TextUtils.isEmpty(this.itemData.getContentDescription())) {
                title = this.itemData.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.badgeDrawable.getContentDescription());
        }
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            wrap.setClickable(false);
            wrap.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }
        wrap.setRoleDescription(getResources().getString(C5480R.string.item_view_role_description));
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void removeBadge() {
        tryRemoveBadgeFromAnchor(this.icon);
    }

    public void setBadge(@NonNull BadgeDrawable badgeDrawable2) {
        this.badgeDrawable = badgeDrawable2;
        ImageView imageView = this.icon;
        if (imageView != null) {
            tryAttachBadgeToAnchor(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0082, code lost:
        setViewLayoutParams(r8.icon, r8.defaultMargin, 49);
        r0 = r8.largeLabel;
        r1 = r8.scaleDownFactor;
        setViewScaleValues(r0, r1, r1, 4);
        setViewScaleValues(r8.smallLabel, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009a, code lost:
        if (r9 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009c, code lost:
        setViewLayoutParams(r0, r1, 49);
        r0 = r8.labelGroup;
        updateViewPaddingBottom(r0, ((java.lang.Integer) r0.getTag(com.google.android.material.C5480R.C5483id.mtrl_view_tag_bottom_padding)).intValue());
        r8.largeLabel.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b6, code lost:
        setViewLayoutParams(r0, r1, 17);
        updateViewPaddingBottom(r8.labelGroup, 0);
        r8.largeLabel.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c3, code lost:
        r8.smallLabel.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d1, code lost:
        if (r9 != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e5, code lost:
        if (r9 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0067, code lost:
        if (r9 != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r9) {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r8.labelVisibilityMode
            r1 = -1
            r3 = 17
            r4 = 49
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 4
            r7 = 0
            if (r0 == r1) goto L_0x00c9
            if (r0 == 0) goto L_0x0096
            r1 = 1
            if (r0 == r1) goto L_0x0056
            if (r0 == r2) goto L_0x0041
            goto L_0x00e8
        L_0x0041:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r3)
            android.widget.TextView r0 = r8.largeLabel
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r1)
            goto L_0x00e8
        L_0x0056:
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C5480R.C5483id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            if (r9 == 0) goto L_0x0082
        L_0x0069:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            float r1 = (float) r1
            float r2 = r8.shiftAmount
            float r1 = r1 + r2
            int r1 = (int) r1
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            setViewScaleValues(r0, r5, r5, r7)
            android.widget.TextView r0 = r8.smallLabel
            float r1 = r8.scaleUpFactor
            setViewScaleValues(r0, r1, r1, r6)
            goto L_0x00e8
        L_0x0082:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            float r1 = r8.scaleDownFactor
            setViewScaleValues(r0, r1, r1, r6)
            android.widget.TextView r0 = r8.smallLabel
            setViewScaleValues(r0, r5, r5, r7)
            goto L_0x00e8
        L_0x0096:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            if (r9 == 0) goto L_0x00b6
        L_0x009c:
            setViewLayoutParams(r0, r1, r4)
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C5480R.C5483id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r7)
            goto L_0x00c3
        L_0x00b6:
            setViewLayoutParams(r0, r1, r3)
            android.view.ViewGroup r0 = r8.labelGroup
            updateViewPaddingBottom(r0, r7)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r6)
        L_0x00c3:
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r6)
            goto L_0x00e8
        L_0x00c9:
            boolean r0 = r8.isShifting
            if (r0 == 0) goto L_0x00d4
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            if (r9 == 0) goto L_0x00b6
            goto L_0x009c
        L_0x00d4:
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C5480R.C5483id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            if (r9 == 0) goto L_0x0082
            goto L_0x0069
        L_0x00e8:
            r8.refreshDrawableState()
            r8.setSelected(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.smallLabel.setEnabled(z);
        this.largeLabel.setEnabled(z);
        this.icon.setEnabled(z);
        ViewCompat.setPointerIcon(this, z ? PointerIconCompat.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND) : null);
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != this.originalIconDrawable) {
            this.originalIconDrawable = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                this.wrappedIconDrawable = drawable;
                ColorStateList colorStateList = this.iconTint;
                if (colorStateList != null) {
                    DrawableCompat.setTintList(drawable, colorStateList);
                }
            }
            this.icon.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.icon.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.icon.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        this.iconTint = colorStateList;
        if (this.itemData != null && (drawable = this.wrappedIconDrawable) != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            this.wrappedIconDrawable.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        ViewCompat.setBackground(this, drawable);
    }

    public void setItemPosition(int i) {
        this.itemPosition = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.labelVisibilityMode != i) {
            this.labelVisibilityMode = i;
            MenuItemImpl menuItemImpl = this.itemData;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.isShifting != z) {
            this.isShifting = z;
            MenuItemImpl menuItemImpl = this.itemData;
            if (menuItemImpl != null) {
                setChecked(menuItemImpl.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.largeLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int i) {
        TextViewCompat.setTextAppearance(this.smallLabel, i);
        calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.smallLabel.setTextColor(colorStateList);
            this.largeLabel.setTextColor(colorStateList);
        }
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.smallLabel.setText(charSequence);
        this.largeLabel.setText(charSequence);
        MenuItemImpl menuItemImpl = this.itemData;
        if (menuItemImpl == null || TextUtils.isEmpty(menuItemImpl.getContentDescription())) {
            setContentDescription(charSequence);
        }
        MenuItemImpl menuItemImpl2 = this.itemData;
        if (menuItemImpl2 != null && !TextUtils.isEmpty(menuItemImpl2.getTooltipText())) {
            charSequence = this.itemData.getTooltipText();
        }
        TooltipCompat.setTooltipText(this, charSequence);
    }

    public boolean showsIcon() {
        return true;
    }
}
