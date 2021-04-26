package p421m.p422m0.p430k.p431i;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;
import p421m.p422m0.p430k.C7967d;
import p421m.p422m0.p430k.C7976h;
import p421m.p422m0.p430k.p431i.C7991j;

/* renamed from: m.m0.k.i.i */
public final class C7989i implements C7993k {

    /* renamed from: a */
    public static final C7991j.C7992a f16034a = new C7990a();

    /* renamed from: m.m0.k.i.i$a */
    public static final class C7990a implements C7991j.C7992a {
        /* renamed from: a */
        public boolean mo25788a(SSLSocket sSLSocket) {
            C6888i.m12438e(sSLSocket, "sslSocket");
            C7967d.C7968a aVar = C7967d.f15997f;
            return C7967d.f15996e && Conscrypt.isConscrypt(sSLSocket);
        }

        /* renamed from: b */
        public C7993k mo25789b(SSLSocket sSLSocket) {
            C6888i.m12438e(sSLSocket, "sslSocket");
            return new C7989i();
        }
    }

    /* renamed from: a */
    public boolean mo25776a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    /* renamed from: b */
    public String mo25777b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        if (mo25776a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
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
        C7967d.C7968a aVar = C7967d.f15997f;
        return C7967d.f15996e;
    }

    /* renamed from: f */
    public void mo25781f(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        if (mo25776a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = ((ArrayList) C7976h.f16015c.mo25773a(list)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
