package p421m.p422m0.p430k.p431i;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.p433m.C7999c;

/* renamed from: m.m0.k.i.b */
public final class C7980b extends C7999c {

    /* renamed from: a */
    public final X509TrustManager f16016a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f16017b;

    public C7980b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        C6888i.m12438e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f16016a = x509TrustManager;
        this.f16017b = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List<Certificate> mo25782a(List<? extends Certificate> list, String str) {
        C6888i.m12438e(list, "chain");
        C6888i.m12438e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f16017b.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            C6888i.m12437d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7980b) && ((C7980b) obj).f16016a == this.f16016a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f16016a);
    }
}
