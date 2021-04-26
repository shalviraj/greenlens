package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;

/* renamed from: b.l.a.c.e.e.y4 */
public final class C2611y4 {

    /* renamed from: a */
    public final String f4476a;

    /* renamed from: b */
    public final int f4477b;

    /* renamed from: c */
    public C2613y6 f4478c;

    /* renamed from: d */
    public C2028a6 f4479d;

    /* renamed from: e */
    public int f4480e;

    /* renamed from: f */
    public C2254j7 f4481f;

    public C2611y4(C2181g9 g9Var) {
        String s = g9Var.mo12674s();
        this.f4476a = s;
        if (s.equals(C2585x2.f4426b)) {
            try {
                C2054b7 t = C2054b7.m3049t(g9Var.mo12675t(), C2605xm.m4408a());
                this.f4478c = (C2613y6) C2537v2.m4282d(g9Var);
                this.f4477b = t.mo12426s();
            } catch (C2246j e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (s.equals(C2585x2.f4425a)) {
            try {
                C2103d6 u = C2103d6.m3191u(g9Var.mo12675t(), C2605xm.m4408a());
                this.f4479d = (C2028a6) C2537v2.m4282d(g9Var);
                this.f4480e = u.mo12513s().mo12735t();
                this.f4477b = this.f4480e + u.mo12514t().mo13027t();
            } catch (C2246j e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (s.equals(C2251j4.f3955a)) {
            try {
                C2302l7 t2 = C2302l7.m3682t(g9Var.mo12675t(), C2605xm.m4408a());
                this.f4481f = (C2254j7) C2537v2.m4282d(g9Var);
                this.f4477b = t2.mo12786s();
            } catch (C2246j e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(s);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }
}
