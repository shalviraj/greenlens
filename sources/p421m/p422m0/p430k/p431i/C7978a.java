package p421m.p422m0.p430k.p431i;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;
import p421m.p422m0.p430k.C7976h;

@SuppressLint({"NewApi"})
/* renamed from: m.m0.k.i.a */
public final class C7978a implements C7993k {

    /* renamed from: m.m0.k.i.a$a */
    public static final class C7979a {
        /* renamed from: a */
        public static final boolean m14610a() {
            return C7976h.f16015c.mo25775c() && Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: a */
    public boolean mo25776a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public String mo25777b(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
            return applicationProtocol;
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
        return C7979a.m14610a();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo25781f(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C6888i.m12437d(sSLParameters, "sslParameters");
            Object[] array = ((ArrayList) C7976h.f16015c.mo25773a(list)).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
