package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.InvalidAlgorithmParameterException;

/* renamed from: b.l.a.c.e.e.h4 */
public final class C2201h4 extends C2049b2<C2302l7, C2254j7> {
    public C2201h4(C2226i4 i4Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12422a(C2072c0 c0Var) {
        C2302l7 l7Var = (C2302l7) c0Var;
        if (l7Var.mo12786s() != 64) {
            int s = l7Var.mo12786s();
            StringBuilder sb = new StringBuilder(61);
            sb.append("invalid key size: ");
            sb.append(s);
            sb.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb.toString());
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2302l7.m3682t(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2229i7 v = C2254j7.m3567v();
        byte[] a = C2402pb.m4002a(((C2302l7) c0Var).mo12786s());
        C2317lm I = C2317lm.m3705I(a, 0, a.length);
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2254j7) v.f3908h).zze = I;
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2254j7) v.f3908h).zzb = 0;
        return (C2254j7) v.mo12691c();
    }
}
