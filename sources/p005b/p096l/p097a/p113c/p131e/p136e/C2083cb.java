package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: b.l.a.c.e.e.cb */
public final class C2083cb implements C2208hb<Cipher> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12463a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
