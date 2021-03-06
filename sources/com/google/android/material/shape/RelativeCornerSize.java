package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@FloatRange(from = 0.0d, mo101to = 1.0d) float f) {
        this.percent = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeCornerSize)) {
            return false;
        }
        return this.percent == ((RelativeCornerSize) obj).percent;
    }

    public float getCornerSize(@NonNull RectF rectF) {
        return rectF.height() * this.percent;
    }

    @FloatRange(from = 0.0d, mo101to = 1.0d)
    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}
