package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.i5 */
public final class C2227i5 extends C2049b2<C2540v5, C2492t5> {
    public C2227i5(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final void mo12422a(C2072c0 c0Var) {
        C2540v5 v5Var = (C2540v5) c0Var;
        C2252j5.m3551h(v5Var.mo13051t());
        if (v5Var.mo13050s() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2540v5.m4292u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2540v5 v5Var = (C2540v5) c0Var;
        C2468s5 w = C2492t5.m4183w();
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2492t5) w.f3908h).zzb = 0;
        byte[] a = C2402pb.m4002a(v5Var.mo13050s());
        C2317lm I = C2317lm.m3705I(a, 0, a.length);
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2492t5) w.f3908h).zze = I;
        C2588x5 t = v5Var.mo13051t();
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        C2492t5.m4181A((C2492t5) w.f3908h, t);
        return (C2492t5) w.mo12691c();
    }
}
