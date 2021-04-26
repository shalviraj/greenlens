package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: b.l.a.c.e.e.eb */
public final class C2133eb implements C2208hb<KeyFactory> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12463a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
