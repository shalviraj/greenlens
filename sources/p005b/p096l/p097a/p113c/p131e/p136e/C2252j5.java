package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.j5 */
public final class C2252j5 extends C2099d2<C2492t5> {
    public C2252j5() {
        super(C2492t5.class, new C2202h5(C2249j2.class));
    }

    /* renamed from: h */
    public static void m3551h(C2588x5 x5Var) {
        if (x5Var.mo13104s() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (x5Var.mo13104s() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2492t5.m4182v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final void mo12369d(C2072c0 c0Var) {
        C2492t5 t5Var = (C2492t5) c0Var;
        C2426qb.m4030b(t5Var.mo13008s(), 0);
        if (t5Var.mo13009t().mo12755l() == 32) {
            m3551h(t5Var.mo13010u());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    /* renamed from: g */
    public final C2049b2<C2540v5, C2492t5> mo12370g() {
        return new C2227i5(C2540v5.class);
    }
}
