package p421m.p422m0.p430k.p431i;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;

/* renamed from: m.m0.k.i.j */
public final class C7991j implements C7993k {

    /* renamed from: a */
    public C7993k f16035a;

    /* renamed from: b */
    public final C7992a f16036b;

    /* renamed from: m.m0.k.i.j$a */
    public interface C7992a {
        /* renamed from: a */
        boolean mo25788a(SSLSocket sSLSocket);

        /* renamed from: b */
        C7993k mo25789b(SSLSocket sSLSocket);
    }

    public C7991j(C7992a aVar) {
        C6888i.m12438e(aVar, "socketAdapterFactory");
        this.f16036b = aVar;
    }

    /* renamed from: a */
    public boolean mo25776a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        return this.f16036b.mo25788a(sSLSocket);
    }

    /* renamed from: b */
    public String mo25777b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C7993k g = mo25790g(sSLSocket);
        if (g != null) {
            return g.mo25777b(sSLSocket);
        }
        return null;
    }

    /* renamed from: c */
    public X509TrustManager mo25778c(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        C5266a.m9805F4(sSLSocketFactory);
        return null;
    }

    /* renamed from: d */
    public boolean mo25779d(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        C5266a.m9975j3(sSLSocketFactory);
        return false;
    }

    /* renamed from: e */
    public boolean mo25780e() {
        return true;
    }

    /* renamed from: f */
    public void mo25781f(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        C7993k g = mo25790g(sSLSocket);
        if (g != null) {
            g.mo25781f(sSLSocket, str, list);
        }
    }

    /* renamed from: g */
    public final synchronized C7993k mo25790g(SSLSocket sSLSocket) {
        if (this.f16035a == null && this.f16036b.mo25788a(sSLSocket)) {
            this.f16035a = this.f16036b.mo25789b(sSLSocket);
        }
        return this.f16035a;
    }
}
