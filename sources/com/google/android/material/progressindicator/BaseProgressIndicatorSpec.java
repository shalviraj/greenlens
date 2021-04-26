package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.C0033Px;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C5480R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    @NonNull
    public int[] indicatorColors = new int[0];
    public int showAnimationBehavior;
    @ColorInt
    public int trackColor;
    @C0033Px
    public int trackCornerRadius;
    @C0033Px
    public int trackThickness;

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C5480R.dimen.mtrl_progress_track_thickness);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C5480R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, C5480R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, obtainStyledAttributes, C5480R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = obtainStyledAttributes.getInt(C5480R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = obtainStyledAttributes.getInt(C5480R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        loadIndicatorColors(context, obtainStyledAttributes);
        loadTrackColor(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = C5480R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C5480R.attr.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.indicatorColors = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    private void loadTrackColor(@NonNull Context context, @NonNull TypedArray typedArray) {
        int compositeARGBWithAlpha;
        int i = C5480R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            compositeARGBWithAlpha = typedArray.getColor(i, -1);
        } else {
            this.trackColor = this.indicatorColors[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
        }
        this.trackColor = compositeARGBWithAlpha;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public abstract void validateSpec();
}
