package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import androidx.annotation.BinderThread;
import java.lang.ref.WeakReference;
import p005b.p096l.p097a.p113c.p148i.p149b.C3402e;
import p005b.p096l.p097a.p113c.p148i.p149b.C3409l;

/* renamed from: b.l.a.c.b.l.k.c0 */
public final class C1802c0 extends C3402e {

    /* renamed from: a */
    public final WeakReference<C1876x> f3155a;

    public C1802c0(C1876x xVar) {
        this.f3155a = new WeakReference<>(xVar);
    }

    @BinderThread
    /* renamed from: g0 */
    public final void mo12065g0(C3409l lVar) {
        C1876x xVar = (C1876x) this.f3155a.get();
        if (xVar != null) {
            C1853p0 p0Var = xVar.f3320a;
            p0Var.f3280e.sendMessage(p0Var.f3280e.obtainMessage(1, new C1814f0(xVar, xVar, lVar)));
        }
    }
}
