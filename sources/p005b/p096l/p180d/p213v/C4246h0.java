package p005b.p096l.p180d.p213v;

import android.util.Log;

/* renamed from: b.l.d.v.h0 */
public final class C4246h0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4244g0 f7862g;

    /* renamed from: h */
    public final /* synthetic */ C4248i0 f7863h;

    public C4246h0(C4248i0 i0Var, C4244g0 g0Var) {
        this.f7863h = i0Var;
        this.f7862g = g0Var;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f7863h.f7865a.mo15825c(this.f7862g.f7852a);
        this.f7862g.mo15831a();
    }
}
