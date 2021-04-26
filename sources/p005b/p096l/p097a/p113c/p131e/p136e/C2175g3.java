package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.g3 */
public final class C2175g3 extends C2099d2<C2178g6> {
    public C2175g3() {
        super(C2178g6.class, new C2125e3(C2233ib.class));
    }

    /* renamed from: h */
    public static final void m3390h(C2178g6 g6Var) {
        C2426qb.m4030b(g6Var.mo12666s(), 0);
        C2426qb.m4029a(g6Var.mo12668u().mo12755l());
        m3391i(g6Var.mo12667t());
    }

    /* renamed from: i */
    public static final void m3391i(C2325m6 m6Var) {
        if (m6Var.mo12810s() < 12 || m6Var.mo12810s() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2178g6.m3402v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        m3390h((C2178g6) c0Var);
    }

    /* renamed from: g */
    public final C2049b2<C2253j6, C2178g6> mo12370g() {
        return new C2150f3(this, C2253j6.class);
    }
}
