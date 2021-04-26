package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.t3 */
public final class C2490t3 extends C2099d2<C2374o7> {
    public C2490t3() {
        super(C2374o7.class, new C2442r3(C2464s1.class));
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2374o7.m3913u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        C2374o7 o7Var = (C2374o7) c0Var;
        C2426qb.m4030b(o7Var.mo12864s(), 0);
        if (o7Var.mo12865t().mo12755l() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: g */
    public final C2049b2<C2422q7, C2374o7> mo12370g() {
        return new C2466s3(this, C2422q7.class);
    }
}
