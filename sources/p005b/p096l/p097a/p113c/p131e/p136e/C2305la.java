package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: b.l.a.c.e.e.la */
public final class C2305la extends ThreadLocal<Cipher> {
    public final Object initialValue() {
        try {
            return C2058bb.f3637e.mo12428a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
