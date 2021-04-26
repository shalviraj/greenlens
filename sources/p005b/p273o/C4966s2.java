package p005b.p273o;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: b.o.s2 */
public final class C4966s2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f9590a;

    public C4966s2(View view) {
        this.f9590a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9590a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
