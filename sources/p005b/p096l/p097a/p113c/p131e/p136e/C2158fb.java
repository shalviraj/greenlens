package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: b.l.a.c.e.e.fb */
public final class C2158fb implements C2208hb<KeyPairGenerator> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12463a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
