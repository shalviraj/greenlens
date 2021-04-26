package p005b.p096l.p097a.p113c.p131e.p136e;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.q4 */
public final class C2419q4 extends C2074c2<C2584x1, C2180g8> {
    public C2419q4(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final Object mo12425a(Object obj) {
        C2180g8 g8Var = (C2180g8) obj;
        C2030a8 t = g8Var.mo12671t();
        C2255j8 s = t.mo12380s();
        int P1 = C1960d.m2742P1(s.mo12738s());
        byte[] K = g8Var.mo12672u().mo12797K();
        byte[] K2 = g8Var.mo12673v().mo12797K();
        ECParameterSpec g2 = C1960d.m2800g2(P1);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, K), new BigInteger(1, K2));
        C1960d.m2839q1(eCPoint, g2.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, g2);
        return new C2617ya((ECPublicKey) C2058bb.f3641i.mo12428a("EC").generatePublic(eCPublicKeySpec), s.mo12740u().mo12797K(), C1960d.m2712F1(s.mo12739t()), C1960d.m2763W1(t.mo12382u()), new C2611y4(t.mo12381t().mo13025s()));
    }
}
