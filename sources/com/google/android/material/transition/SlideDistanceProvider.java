package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0033Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C5480R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p005b.p035e.p036a.p037a.C0843a;

public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;
    @C0033Px
    private int slideDistance = -1;
    private int slideEdge;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
        this.slideEdge = i;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, @C0033Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX, translationX);
        } else if (i == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException(C0843a.m444e("Invalid slide direction: ", i));
        }
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, @C0033Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX);
        } else if (i == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX);
        } else {
            throw new IllegalArgumentException(C0843a.m444e("Invalid slide direction: ", i));
        }
    }

    private static Animator createTranslationXAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i = this.slideDistance;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(C5480R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @C0033Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@C0033Px int i) {
        if (i >= 0) {
            this.slideDistance = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i) {
        this.slideEdge = i;
    }
}
