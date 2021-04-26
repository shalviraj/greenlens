package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: b.l.a.c.e.e.e4 */
public final class C2126e4 extends ThreadLocal<Cipher> {
    public final Object initialValue() {
        try {
            return C2058bb.f3637e.mo12428a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
