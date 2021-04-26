package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.z3 */
public final class C2634z3 extends C2049b2<C2082ca, C2032aa> {
    public C2634z3(C2026a4 a4Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12422a(C2072c0 c0Var) {
        C2082ca caVar = (C2082ca) c0Var;
        if (caVar.mo12460s().isEmpty() || !caVar.mo12461t()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2082ca.m3136v(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2082ca caVar = (C2082ca) c0Var;
        C2640z9 v = C2032aa.m3001v();
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        C2032aa.m3004y((C2032aa) v.f3908h, caVar);
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2032aa) v.f3908h).zzb = 0;
        return (C2032aa) v.mo12691c();
    }
}
