package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import java.util.Collections;
import p005b.p096l.p097a.p113c.p119b.C1754b;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.C1789h;

/* renamed from: b.l.a.c.b.l.k.g0 */
public final class C1821g0 implements C1843m0 {

    /* renamed from: a */
    public final C1853p0 f3213a;

    public C1821g0(C1853p0 p0Var) {
        this.f3213a = p0Var;
    }

    /* renamed from: a */
    public final void mo12117a() {
        for (C1770a.C1779f b : this.f3213a.f3281f.values()) {
            b.mo12017b();
        }
        this.f3213a.f3288m.f3250p = Collections.emptySet();
    }

    /* renamed from: b */
    public final boolean mo12118b() {
        return true;
    }

    /* renamed from: c */
    public final void mo12119c() {
        C1853p0 p0Var = this.f3213a;
        p0Var.f3276a.lock();
        try {
            p0Var.f3286k = new C1876x(p0Var, p0Var.f3283h, p0Var.f3284i, p0Var.f3279d, p0Var.f3285j, p0Var.f3276a, p0Var.f3278c);
            p0Var.f3286k.mo12117a();
            p0Var.f3277b.signalAll();
        } finally {
            p0Var.f3276a.unlock();
        }
    }

    /* renamed from: d */
    public final <A extends C1770a.C1772b, T extends C1805d<? extends C1789h, A>> T mo12120d(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: g */
    public final void mo12121g(int i) {
    }

    /* renamed from: k */
    public final void mo12122k(Bundle bundle) {
    }

    /* renamed from: o */
    public final void mo12123o(C1754b bVar, C1770a<?> aVar, boolean z) {
    }
}
