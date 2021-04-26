package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.l5 */
public final class C2300l5 extends C2049b2<C2519u8, C2447r8> {
    public C2300l5(C2324m5 m5Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12422a(C2072c0 c0Var) {
        C2519u8 u8Var = (C2519u8) c0Var;
        if (u8Var.mo13027t() >= 16) {
            C2324m5.m3743i(u8Var.mo13026s());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2519u8.m4244u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2519u8 u8Var = (C2519u8) c0Var;
        C2423q8 w = C2447r8.m4077w();
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2447r8) w.f3908h).zzb = 0;
        C2591x8 s = u8Var.mo13026s();
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        C2447r8.m4074A((C2447r8) w.f3908h, s);
        byte[] a = C2402pb.m4002a(u8Var.mo13027t());
        C2317lm I = C2317lm.m3705I(a, 0, a.length);
        if (w.f3909i) {
            w.mo12689a();
            w.f3909i = false;
        }
        ((C2447r8) w.f3908h).zzf = I;
        return (C2447r8) w.mo12691c();
    }
}
