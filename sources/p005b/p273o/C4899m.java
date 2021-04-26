package p005b.p273o;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

/* renamed from: b.o.m */
public class C4899m extends RelativeLayout {

    /* renamed from: k */
    public static final int f9451k = C4843g2.m8880b(28);

    /* renamed from: l */
    public static final int f9452l = C4843g2.m8880b(64);

    /* renamed from: g */
    public C4900a f9453g;

    /* renamed from: h */
    public ViewDragHelper f9454h = ViewDragHelper.create(this, 1.0f, new C4892l(this));

    /* renamed from: i */
    public boolean f9455i;

    /* renamed from: j */
    public C4901b f9456j;

    /* renamed from: b.o.m$a */
    public interface C4900a {
    }

    /* renamed from: b.o.m$b */
    public static class C4901b {

        /* renamed from: a */
        public int f9457a;

        /* renamed from: b */
        public int f9458b;

        /* renamed from: c */
        public int f9459c;

        /* renamed from: d */
        public int f9460d;

        /* renamed from: e */
        public int f9461e;

        /* renamed from: f */
        public int f9462f;

        /* renamed from: g */
        public int f9463g;

        /* renamed from: h */
        public int f9464h;

        /* renamed from: i */
        public int f9465i;
    }

    public C4899m(Context context) {
        super(context);
        setClipChildren(false);
    }

    /* renamed from: a */
    public void mo16637a(C4901b bVar) {
        int i;
        this.f9456j = bVar;
        bVar.f9464h = ((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.f9461e) - bVar.f9457a) + bVar.f9461e + bVar.f9457a + f9452l;
        int b = C4843g2.m8880b(PathInterpolatorCompat.MAX_NUM_POINTS);
        bVar.f9463g = b;
        if (bVar.f9462f == 0) {
            int i2 = (-bVar.f9461e) - f9451k;
            bVar.f9464h = i2;
            bVar.f9463g = -b;
            i = i2 / 3;
        } else {
            i = (bVar.f9458b * 2) + (bVar.f9461e / 3);
        }
        bVar.f9465i = i;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f9454h.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C4900a aVar;
        if (this.f9455i) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (aVar = this.f9453g) != null) {
            ((C5039y) aVar).f9740a.f9140i = false;
        }
        this.f9454h.processTouchEvent(motionEvent);
        return false;
    }
}
