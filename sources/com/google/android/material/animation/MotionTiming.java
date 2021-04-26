package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;

public class MotionTiming {
    private long delay = 0;
    private long duration = 300;
    @Nullable
    private TimeInterpolator interpolator = null;
    private int repeatCount = 0;
    private int repeatMode = 1;

    public MotionTiming(long j, long j2) {
        this.delay = j;
        this.duration = j2;
    }

    public MotionTiming(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.delay = j;
        this.duration = j2;
        this.interpolator = timeInterpolator;
    }

    @NonNull
    public static MotionTiming createFromAnimator(@NonNull ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), getInterpolatorCompat(valueAnimator));
        motionTiming.repeatCount = valueAnimator.getRepeatCount();
        motionTiming.repeatMode = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    private static TimeInterpolator getInterpolatorCompat(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator2 = valueAnimator.getInterpolator();
        return ((interpolator2 instanceof AccelerateDecelerateInterpolator) || interpolator2 == null) ? AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR : interpolator2 instanceof AccelerateInterpolator ? AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR : interpolator2 instanceof DecelerateInterpolator ? AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR : interpolator2;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() == motionTiming.getDelay() && getDuration() == motionTiming.getDuration() && getRepeatCount() == motionTiming.getRepeatCount() && getRepeatMode() == motionTiming.getRepeatMode()) {
            return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
        }
        return false;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.interpolator;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        int hashCode = getInterpolator().getClass().hashCode();
        int repeatCount2 = getRepeatCount();
        return getRepeatMode() + ((repeatCount2 + ((hashCode + (((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31)) * 31)) * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder t = C0843a.m459t(10);
        t.append(getClass().getName());
        t.append('{');
        t.append(Integer.toHexString(System.identityHashCode(this)));
        t.append(" delay: ");
        t.append(getDelay());
        t.append(" duration: ");
        t.append(getDuration());
        t.append(" interpolator: ");
        t.append(getInterpolator().getClass());
        t.append(" repeatCount: ");
        t.append(getRepeatCount());
        t.append(" repeatMode: ");
        t.append(getRepeatMode());
        t.append("}\n");
        return t.toString();
    }
}
