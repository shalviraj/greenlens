package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: b.l.a.c.e.e.db */
public final class C2108db implements C2208hb<KeyAgreement> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12463a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
