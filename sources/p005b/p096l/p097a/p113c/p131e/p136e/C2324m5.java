package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.m5 */
public final class C2324m5 extends C2099d2<C2447r8> {
    public C2324m5() {
        super(C2447r8.class, new C2276k5(C2249j2.class));
    }

    /* renamed from: h */
    public static final void m3742h(C2447r8 r8Var) {
        C2426qb.m4030b(r8Var.mo12968s(), 0);
        if (r8Var.mo12970u().mo12755l() >= 16) {
            m3743i(r8Var.mo12969t());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: i */
    public static void m3743i(C2591x8 x8Var) {
        if (x8Var.mo13107t() >= 10) {
            int ordinal = x8Var.mo13106s().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (x8Var.mo13107t() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (x8Var.mo13107t() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (x8Var.mo13107t() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (x8Var.mo13107t() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (x8Var.mo13107t() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2447r8.m4076v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        m3742h((C2447r8) c0Var);
    }

    /* renamed from: g */
    public final C2049b2<C2519u8, C2447r8> mo12370g() {
        return new C2300l5(this, C2519u8.class);
    }
}
