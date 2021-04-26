package p421m.p422m0.p430k.p431i;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;

/* renamed from: m.m0.k.i.l */
public final class C7994l extends C7984f {

    /* renamed from: j */
    public static final C7995a f16037j = new C7995a((DefaultConstructorMarker) null);

    /* renamed from: h */
    public final Class<? super SSLSocketFactory> f16038h;

    /* renamed from: i */
    public final Class<?> f16039i;

    /* renamed from: m.m0.k.i.l$a */
    public static final class C7995a {
        public C7995a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7994l(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        C6888i.m12438e(cls, "sslSocketClass");
        C6888i.m12438e(cls2, "sslSocketFactoryClass");
        C6888i.m12438e(cls3, "paramClass");
        this.f16038h = cls2;
        this.f16039i = cls3;
    }

    /* renamed from: c */
    public X509TrustManager mo25778c(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        Object s = C7867c.m14298s(sSLSocketFactory, this.f16039i, "sslParameters");
        C6888i.m12436c(s);
        X509TrustManager x509TrustManager = (X509TrustManager) C7867c.m14298s(s, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C7867c.m14298s(s, X509TrustManager.class, "trustManager");
    }

    /* renamed from: d */
    public boolean mo25779d(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        return this.f16038h.isInstance(sSLSocketFactory);
    }
}
