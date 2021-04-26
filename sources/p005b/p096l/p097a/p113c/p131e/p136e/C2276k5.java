package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: b.l.a.c.e.e.k5 */
public final class C2276k5 extends C2074c2<C2249j2, C2447r8> {
    public C2276k5(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12425a(Object obj) {
        C2447r8 r8Var = (C2447r8) obj;
        C2375o8 s = r8Var.mo12969t().mo13106s();
        SecretKeySpec secretKeySpec = new SecretKeySpec(r8Var.mo12970u().mo12797K(), "HMAC");
        int t = r8Var.mo12969t().mo13107t();
        int ordinal = s.ordinal();
        if (ordinal == 1) {
            return new C2354nb(new C2330mb("HMACSHA1", secretKeySpec), t);
        }
        if (ordinal == 2) {
            return new C2354nb(new C2330mb("HMACSHA384", secretKeySpec), t);
        }
        if (ordinal == 3) {
            return new C2354nb(new C2330mb("HMACSHA256", secretKeySpec), t);
        }
        if (ordinal == 4) {
            return new C2354nb(new C2330mb("HMACSHA512", secretKeySpec), t);
        }
        if (ordinal == 5) {
            return new C2354nb(new C2330mb("HMACSHA224", secretKeySpec), t);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
