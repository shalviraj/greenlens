package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.i3 */
public final class C2225i3 extends C2049b2<C2469s6, C2397p6> {
    public C2225i3(C2274k3 k3Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12422a(C2072c0 c0Var) {
        C2469s6 s6Var = (C2469s6) c0Var;
        C2426qb.m4029a(s6Var.mo12983t());
        if (s6Var.mo12982s().mo13052s() != 12 && s6Var.mo12982s().mo13052s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2469s6.m4120u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2469s6 s6Var = (C2469s6) c0Var;
        C2373o6 w = C2397p6.m3989w();
        byte[] a = C2402pb.m4002a(s6Var.mo12983t());
        C2317lm I = C2317lm.m3705I(a, 0, a.length);
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2397p6) w.f3908h).zzf = I;
        C2541v6 s = s6Var.mo12982s();
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        C2397p6.m3992z((C2397p6) w.f3908h, s);
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2397p6) w.f3908h).zzb = 0;
        return (C2397p6) w.mo12691c();
    }
}
