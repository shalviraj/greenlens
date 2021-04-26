package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.InvalidKeyException;

/* renamed from: b.l.a.c.e.e.i4 */
public final class C2226i4 extends C2099d2<C2254j7> {
    public C2226i4() {
        super(C2254j7.class, new C2176g4(C2536v1.class));
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2254j7.m3566u(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        C2254j7 j7Var = (C2254j7) c0Var;
        C2426qb.m4030b(j7Var.mo12736s(), 0);
        if (j7Var.mo12737t().mo12755l() != 64) {
            int l = j7Var.mo12737t().mo12755l();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(l);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb.toString());
        }
    }

    /* renamed from: g */
    public final C2049b2<C2302l7, C2254j7> mo12370g() {
        return new C2201h4(this, C2302l7.class);
    }
}
