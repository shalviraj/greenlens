package p005b.p096l.p097a.p113c.p131e.p140i;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: b.l.a.c.e.i.x2 */
public final class C3013x2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C3026y2 f5134a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3013x2(C3026y2 y2Var) {
        super((Handler) null);
        this.f5134a = y2Var;
    }

    public final void onChange(boolean z) {
        C3026y2 y2Var = this.f5134a;
        synchronized (y2Var.f5152d) {
            y2Var.f5153e = null;
            C2910p3.f4931h.incrementAndGet();
        }
        synchronized (y2Var) {
            for (C3039z2 a : y2Var.f5154f) {
                a.mo13991a();
            }
        }
    }
}
