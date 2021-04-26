package p005b.p006a.p007a.p018i;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Objects;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6899t;

/* renamed from: b.a.a.i.z */
public final class C0769z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPager2 f508a;

    /* renamed from: b */
    public final /* synthetic */ C6899t f509b;

    public C0769z(ViewPager2 viewPager2, C6899t tVar) {
        this.f508a = viewPager2;
        this.f509b = tVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C6888i.m12437d(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        this.f508a.fakeDragBy(-((float) (intValue - this.f509b.f13799g)));
        this.f509b.f13799g = intValue;
    }
}
