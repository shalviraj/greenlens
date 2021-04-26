package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.p4 */
public final class C2395p4 extends C2417q2<C2105d8, C2180g8> {
    public C2395p4() {
        super(C2105d8.class, new C2347n4(C2560w1.class));
    }

    /* renamed from: h */
    public static final void m3978h(C2105d8 d8Var) {
        if (d8Var.mo12517u().mo12755l() != 0) {
            C2426qb.m4030b(d8Var.mo12515s(), 0);
            C1960d.m2819l1(d8Var.mo12516t().mo12671t());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: a */
    public final String mo12366a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: b */
    public final C2056b9 mo12367b() {
        return C2056b9.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2072c0 mo12368c(C2317lm lmVar) {
        return C2105d8.m3200v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12369d(C2072c0 c0Var) {
        m3978h((C2105d8) c0Var);
    }

    /* renamed from: g */
    public final C2049b2<C2590x7, C2105d8> mo12370g() {
        return new C2371o4(this, C2590x7.class);
    }
}
