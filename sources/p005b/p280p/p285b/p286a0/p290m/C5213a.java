package p005b.p280p.p285b.p286a0.p290m;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: b.p.b.a0.m.a */
public final class C5213a implements C5218f {

    /* renamed from: a */
    public final X509TrustManager f10248a;

    /* renamed from: b */
    public final Method f10249b;

    public C5213a(X509TrustManager x509TrustManager, Method method) {
        this.f10249b = method;
        this.f10248a = x509TrustManager;
    }

    /* renamed from: a */
    public X509Certificate mo17120a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f10249b.invoke(this.f10248a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }
}
