package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.d4 */
public final class C2101d4 extends C2099d2<C2232ia> {
    public C2101d4() {
        super(C2232ia.class, new C2051b4(C2464s1.class));
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2232ia.m3506u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        C2232ia iaVar = (C2232ia) c0Var;
        C2426qb.m4030b(iaVar.mo12711s(), 0);
        if (iaVar.mo12712t().mo12755l() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: g */
    public final C2049b2<C2281ka, C2232ia> mo12370g() {
        return new C2076c4(this, C2281ka.class);
    }
}
