package p005b.p006a.p007a.p018i;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: b.a.a.i.a0 */
public final class C0740a0 implements Animator.AnimatorListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPager2 f451a;

    public C0740a0(ViewPager2 viewPager2) {
        this.f451a = viewPager2;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f451a.endFakeDrag();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f451a.beginFakeDrag();
    }
}
