package p005b.p096l.p097a.p113c.p131e.p136e;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.n4 */
public final class C2347n4 extends C2074c2<C2560w1, C2105d8> {
    public C2347n4(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12425a(Object obj) {
        C2105d8 d8Var = (C2105d8) obj;
        C2030a8 t = d8Var.mo12516t().mo12671t();
        C2255j8 s = t.mo12380s();
        int P1 = C1960d.m2742P1(s.mo12738s());
        byte[] K = d8Var.mo12517u().mo12797K();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, K), C1960d.m2800g2(P1));
        return new C2593xa((ECPrivateKey) C2058bb.f3641i.mo12428a("EC").generatePrivate(eCPrivateKeySpec), s.mo12740u().mo12797K(), C1960d.m2712F1(s.mo12739t()), C1960d.m2763W1(t.mo12382u()), new C2611y4(t.mo12381t().mo13025s()));
    }
}
