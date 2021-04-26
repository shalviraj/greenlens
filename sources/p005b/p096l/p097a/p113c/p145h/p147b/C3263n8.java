package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.n8 */
public final class C3263n8 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ long f5780g;

    /* renamed from: h */
    public final /* synthetic */ C3340u8 f5781h;

    public C3263n8(C3340u8 u8Var, long j) {
        this.f5781h = u8Var;
        this.f5780g = j;
    }

    public final void run() {
        C3340u8 u8Var = this.f5781h;
        long j = this.f5780g;
        u8Var.mo14126h();
        u8Var.mo14606l();
        u8Var.f5638a.mo14329d().f5807n.mo14415b("Activity paused, time", Long.valueOf(j));
        C3296q8 q8Var = u8Var.f6004f;
        Objects.requireNonNull((C1959c) q8Var.f5909b.f5638a.f5855n);
        C3285p8 p8Var = new C3285p8(q8Var, System.currentTimeMillis(), j);
        q8Var.f5908a = p8Var;
        q8Var.f5909b.f6001c.postDelayed(p8Var, 2000);
        if (u8Var.f5638a.f5848g.mo14202w()) {
            u8Var.f6003e.f5962c.mo14387c();
        }
        C3329t8 t8Var = u8Var.f6002d;
        if (!t8Var.f5983a.f5638a.f5848g.mo14197r((String) null, C3134c3.f5407s0)) {
            t8Var.f5983a.f5638a.mo14464q().f5437q.mo14614b(true);
        }
    }
}
