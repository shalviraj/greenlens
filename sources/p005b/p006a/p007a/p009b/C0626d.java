package p005b.p006a.p007a.p009b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import p005b.p096l.p097a.p113c.p142g.C3071b;
import p298d.p344x.p346c.C6888i;
import p441p.p442a.C8091a;

/* renamed from: b.a.a.b.d */
public final class C0626d extends C3071b {

    /* renamed from: h */
    public boolean f287h;

    public C0626d(Context context, boolean z) {
        super(context);
        this.f287h = z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6888i.m12438e(motionEvent, "event");
        if (this.f287h) {
            int action = motionEvent.getAction();
            if (action == 0) {
                ViewParent parent = getParent();
                C6888i.m12437d(parent, "parent");
                parent.getParent().requestDisallowInterceptTouchEvent(true);
                C8091a.f16272d.mo26043a("Inside if of action down", new Object[0]);
            } else if (action == 1) {
                ViewParent parent2 = getParent();
                C6888i.m12437d(parent2, "parent");
                parent2.getParent().requestDisallowInterceptTouchEvent(false);
                C8091a.f16272d.mo26043a("Inside if of action up", new Object[0]);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
