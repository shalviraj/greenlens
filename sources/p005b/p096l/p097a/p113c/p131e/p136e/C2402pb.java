package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.SecureRandom;

/* renamed from: b.l.a.c.e.e.pb */
public final class C2402pb {

    /* renamed from: a */
    public static final ThreadLocal<SecureRandom> f4199a = new C2378ob();

    /* renamed from: a */
    public static byte[] m4002a(int i) {
        byte[] bArr = new byte[i];
        f4199a.get().nextBytes(bArr);
        return bArr;
    }
}
