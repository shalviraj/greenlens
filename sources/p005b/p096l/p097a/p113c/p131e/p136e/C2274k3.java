package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.k3 */
public final class C2274k3 extends C2099d2<C2397p6> {
    public C2274k3() {
        super(C2397p6.class, new C2200h3(C2464s1.class));
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2397p6.m3988v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        C2397p6 p6Var = (C2397p6) c0Var;
        C2426qb.m4030b(p6Var.mo12909s(), 0);
        C2426qb.m4029a(p6Var.mo12911u().mo12755l());
        if (p6Var.mo12910t().mo13052s() != 12 && p6Var.mo12910t().mo13052s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* renamed from: g */
    public final C2049b2<C2469s6, C2397p6> mo12370g() {
        return new C2225i3(this, C2469s6.class);
    }
}
