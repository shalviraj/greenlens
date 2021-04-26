package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.h.b.m8 */
public final class C3252m8 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ long f5748g;

    /* renamed from: h */
    public final /* synthetic */ C3340u8 f5749h;

    public C3252m8(C3340u8 u8Var, long j) {
        this.f5749h = u8Var;
        this.f5748g = j;
    }

    public final void run() {
        C3340u8 u8Var = this.f5749h;
        long j = this.f5748g;
        u8Var.mo14126h();
        u8Var.mo14606l();
        u8Var.f5638a.mo14329d().f5807n.mo14415b("Activity resumed, time", Long.valueOf(j));
        C3166f fVar = u8Var.f5638a.f5848g;
        C3110a3<Boolean> a3Var = C3134c3.f5407s0;
        if (fVar.mo14197r((String) null, a3Var)) {
            if (u8Var.f5638a.f5848g.mo14202w() || u8Var.f5638a.mo14464q().f5437q.mo14613a()) {
                C3318s8 s8Var = u8Var.f6003e;
                s8Var.f5963d.mo14126h();
                s8Var.f5962c.mo14387c();
                s8Var.f5960a = j;
                s8Var.f5961b = j;
            }
            u8Var.f6004f.mo14514a();
        } else {
            u8Var.f6004f.mo14514a();
            if (u8Var.f5638a.f5848g.mo14202w()) {
                C3318s8 s8Var2 = u8Var.f6003e;
                s8Var2.f5963d.mo14126h();
                s8Var2.f5962c.mo14387c();
                s8Var2.f5960a = j;
                s8Var2.f5961b = j;
            }
        }
        C3329t8 t8Var = u8Var.f6002d;
        t8Var.f5983a.mo14126h();
        if (t8Var.f5983a.f5638a.mo14460j()) {
            if (!t8Var.f5983a.f5638a.f5848g.mo14197r((String) null, a3Var)) {
                t8Var.f5983a.f5638a.mo14464q().f5437q.mo14614b(false);
            }
            Objects.requireNonNull((C1959c) t8Var.f5983a.f5638a.f5855n);
            t8Var.mo14599b(System.currentTimeMillis(), false);
        }
    }
}
