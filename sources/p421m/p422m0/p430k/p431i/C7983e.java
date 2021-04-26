package p421m.p422m0.p430k.p431i;

import javax.net.ssl.SSLSocket;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.p422m0.p430k.p431i.C7984f;
import p421m.p422m0.p430k.p431i.C7991j;

/* renamed from: m.m0.k.i.e */
public final class C7983e implements C7991j.C7992a {

    /* renamed from: a */
    public final /* synthetic */ String f16022a;

    public C7983e(String str) {
        this.f16022a = str;
    }

    /* renamed from: a */
    public boolean mo25788a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C6888i.m12437d(name, "sslSocket.javaClass.name");
        return C7694h.m13910A(name, C0843a.m454o(new StringBuilder(), this.f16022a, '.'), false, 2);
    }

    /* renamed from: b */
    public C7993k mo25789b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C7984f.C7985a aVar = C7984f.f16024g;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (cls2 != null && (!C6888i.m12434a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        C6888i.m12436c(cls2);
        return new C7984f(cls2);
    }
}
