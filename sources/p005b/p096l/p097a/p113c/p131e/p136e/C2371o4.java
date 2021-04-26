package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.o4 */
public final class C2371o4 extends C2049b2<C2590x7, C2105d8> {
    public C2371o4(C2395p4 p4Var, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12422a(C2072c0 c0Var) {
        C1960d.m2819l1(((C2590x7) c0Var).mo13105s());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2072c0 mo12423b(C2317lm lmVar) {
        return C2590x7.m4375t(lmVar, C2605xm.m4408a());
    }

    /* renamed from: c */
    public final Object mo12424c(C2072c0 c0Var) {
        C2590x7 x7Var = (C2590x7) c0Var;
        ECParameterSpec g2 = C1960d.m2800g2(C1960d.m2742P1(x7Var.mo13105s().mo12380s().mo12738s()));
        KeyPairGenerator a = C2058bb.f3640h.mo12428a("EC");
        a.initialize(g2);
        KeyPair generateKeyPair = a.generateKeyPair();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        C2155f8 x = C2180g8.m3420x();
        if (x.f3909i) {
            x.mo12689a();
            x.f3909i = false;
        }
        ((C2180g8) x.f3908h).zzb = 0;
        C2030a8 s = x7Var.mo13105s();
        if (x.f3909i) {
            x.mo12689a();
            x.f3909i = false;
        }
        C2180g8.m3416B((C2180g8) x.f3908h, s);
        C2317lm J = C2317lm.m3706J(w.getAffineX().toByteArray());
        if (x.f3909i) {
            x.mo12689a();
            x.f3909i = false;
        }
        ((C2180g8) x.f3908h).zzf = J;
        C2317lm J2 = C2317lm.m3706J(w.getAffineY().toByteArray());
        if (x.f3909i) {
            x.mo12689a();
            x.f3909i = false;
        }
        ((C2180g8) x.f3908h).zzg = J2;
        C2180g8 g8Var = (C2180g8) x.mo12691c();
        C2080c8 w2 = C2105d8.m3201w();
        if (w2.f3909i) {
            w2.mo12689a();
            w2.f3909i = false;
        }
        ((C2105d8) w2.f3908h).zzb = 0;
        if (w2.f3909i) {
            w2.mo12689a();
            w2.f3909i = false;
        }
        C2105d8.m3204z((C2105d8) w2.f3908h, g8Var);
        C2317lm J3 = C2317lm.m3706J(eCPrivateKey.getS().toByteArray());
        if (w2.f3909i) {
            w2.mo12689a();
            w2.f3909i = false;
        }
        ((C2105d8) w2.f3908h).zzf = J3;
        return (C2105d8) w2.mo12691c();
    }
}
