package p005b.p096l.p097a.p113c.p131e.p136e;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* renamed from: b.l.a.c.e.e.d5 */
public final class C2102d5 {

    /* renamed from: a */
    public KeyStore f3707a = null;

    public C2102d5() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f3707a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
