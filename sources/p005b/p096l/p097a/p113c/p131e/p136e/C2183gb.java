package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: b.l.a.c.e.e.gb */
public final class C2183gb implements C2208hb<Mac> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12463a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
