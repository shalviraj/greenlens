package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.SecureRandom;

/* renamed from: b.l.a.c.e.e.ob */
public final class C2378ob extends ThreadLocal<SecureRandom> {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
