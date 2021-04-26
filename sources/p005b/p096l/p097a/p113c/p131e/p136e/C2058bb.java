package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p131e.p136e.C2208hb;

/* renamed from: b.l.a.c.e.e.bb */
public final class C2058bb<T_WRAPPER extends C2208hb<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    public static final Logger f3634b = Logger.getLogger(C2058bb.class.getName());

    /* renamed from: c */
    public static final List<Provider> f3635c;

    /* renamed from: d */
    public static final boolean f3636d = true;

    /* renamed from: e */
    public static final C2058bb<C2083cb, Cipher> f3637e = new C2058bb<>(new C2083cb());

    /* renamed from: f */
    public static final C2058bb<C2183gb, Mac> f3638f = new C2058bb<>(new C2183gb());

    /* renamed from: g */
    public static final C2058bb<C2108db, KeyAgreement> f3639g = new C2058bb<>(new C2108db());

    /* renamed from: h */
    public static final C2058bb<C2158fb, KeyPairGenerator> f3640h = new C2058bb<>(new C2158fb());

    /* renamed from: i */
    public static final C2058bb<C2133eb, KeyFactory> f3641i = new C2058bb<>(new C2133eb());

    /* renamed from: a */
    public final T_WRAPPER f3642a;

    static {
        if (C1960d.m2843r1()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f3634b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f3635c = arrayList;
        } else {
            f3635c = new ArrayList();
        }
    }

    public C2058bb(T_WRAPPER t_wrapper) {
        this.f3642a = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo12428a(String str) {
        Exception exc = null;
        for (Provider a : f3635c) {
            try {
                return this.f3642a.mo12463a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f3636d) {
            return this.f3642a.mo12463a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
