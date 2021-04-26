package p005b.p006a.p007a.p009b;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.appfoundry.previewer.custom.DotIndicator;

/* renamed from: b.a.a.b.g */
public final class C0630g extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    public final /* synthetic */ DotIndicator f294a;

    public C0630g(DotIndicator dotIndicator) {
        this.f294a = dotIndicator;
    }

    public void onPageSelected(int i) {
        DotIndicator dotIndicator = this.f294a;
        int i2 = i % dotIndicator.f10874w;
        ViewPager2 viewPager2 = dotIndicator.f10858g;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) != null) {
            DotIndicator dotIndicator2 = this.f294a;
            if (dotIndicator2.f10874w > 0) {
                Animator animator = dotIndicator2.f10867p;
                if (animator != null && animator.isRunning()) {
                    Animator animator2 = this.f294a.f10867p;
                    if (animator2 != null) {
                        animator2.end();
                    }
                    Animator animator3 = this.f294a.f10867p;
                    if (animator3 != null) {
                        animator3.cancel();
                    }
                }
                Animator animator4 = this.f294a.f10866o;
                if (animator4 != null && animator4.isRunning()) {
                    Animator animator5 = this.f294a.f10866o;
                    if (animator5 != null) {
                        animator5.end();
                    }
                    Animator animator6 = this.f294a.f10866o;
                    if (animator6 != null) {
                        animator6.cancel();
                    }
                }
                DotIndicator dotIndicator3 = this.f294a;
                int i3 = dotIndicator3.f10873v;
                if (i3 >= 0) {
                    View childAt = dotIndicator3.getChildAt(i3);
                    DotIndicator dotIndicator4 = this.f294a;
                    dotIndicator4.f10870s = childAt;
                    if (childAt != null) {
                        childAt.setBackgroundResource(dotIndicator4.f10865n);
                        DotIndicator dotIndicator5 = this.f294a;
                        Animator animator7 = dotIndicator5.f10867p;
                        if (animator7 != null) {
                            animator7.setTarget(dotIndicator5.f10870s);
                        }
                        Animator animator8 = this.f294a.f10867p;
                        if (animator8 != null) {
                            animator8.start();
                        }
                    }
                }
                DotIndicator dotIndicator6 = this.f294a;
                dotIndicator6.f10871t = dotIndicator6.getChildAt(i2);
                DotIndicator dotIndicator7 = this.f294a;
                View view = dotIndicator7.f10871t;
                if (view != null) {
                    view.setBackgroundResource(dotIndicator7.f10864m);
                    DotIndicator dotIndicator8 = this.f294a;
                    View view2 = dotIndicator8.f10871t;
                    if (view2 != null) {
                        int i4 = dotIndicator8.f10872u;
                        int[][] iArr = {new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}};
                        float alpha = ((float) Color.alpha(i4)) * 0.75f;
                        if (!Float.isNaN(alpha)) {
                            Color.argb(Math.round(alpha), Color.red(i4), Color.green(i4), Color.blue(i4));
                            view2.setBackgroundTintList(new ColorStateList(iArr, new int[]{i4, i4, i4, i4}));
                        } else {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                    }
                    DotIndicator dotIndicator9 = this.f294a;
                    Animator animator9 = dotIndicator9.f10866o;
                    if (animator9 != null) {
                        animator9.setTarget(dotIndicator9.f10871t);
                    }
                    Animator animator10 = this.f294a.f10866o;
                    if (animator10 != null) {
                        animator10.start();
                    }
                }
                this.f294a.f10873v = i2;
            }
        }
    }
}
