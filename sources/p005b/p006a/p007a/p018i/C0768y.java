package p005b.p006a.p007a.p018i;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import p005b.p006a.p007a.p022m.C0795a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6899t;

/* renamed from: b.a.a.i.y */
public final class C0768y implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ ViewPager2 f504g;

    /* renamed from: h */
    public final /* synthetic */ C0795a f505h;

    /* renamed from: i */
    public final /* synthetic */ C6899t f506i;

    /* renamed from: j */
    public final /* synthetic */ Handler f507j;

    public C0768y(ViewPager2 viewPager2, C0795a aVar, C6899t tVar, Handler handler) {
        this.f504g = viewPager2;
        this.f505h = aVar;
        this.f506i = tVar;
        this.f507j = handler;
    }

    public void run() {
        int itemCount = this.f505h.getItemCount();
        C6899t tVar = this.f506i;
        int i = tVar.f13799g;
        if (itemCount == i) {
            tVar.f13799g = 0;
        } else {
            tVar.f13799g = i + 1;
        }
        ViewPager2 viewPager2 = this.f504g;
        int i2 = tVar.f13799g;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        int width = viewPager2.getWidth();
        C6888i.m12438e(viewPager2, "$this$setCurrentItemSlow");
        C6888i.m12438e(accelerateDecelerateInterpolator, "interpolator");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (i2 - viewPager2.getCurrentItem()) * width});
        C6899t tVar2 = new C6899t();
        tVar2.f13799g = 0;
        ofInt.addUpdateListener(new C0769z(viewPager2, tVar2));
        ofInt.addListener(new C0740a0(viewPager2));
        C6888i.m12437d(ofInt, "animator");
        ofInt.setInterpolator(accelerateDecelerateInterpolator);
        ofInt.setDuration(750);
        ofInt.start();
        this.f507j.postDelayed(this, 2500);
    }
}
