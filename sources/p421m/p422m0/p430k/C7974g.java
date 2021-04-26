package p421m.p422m0.p430k;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;

/* renamed from: m.m0.k.g */
public final class C7974g extends C7976h {

    /* renamed from: e */
    public static final boolean f16010e;

    /* renamed from: f */
    public static final C7975a f16011f;

    /* renamed from: d */
    public final Provider f16012d = new OpenJSSE();

    /* renamed from: m.m0.k.g$a */
    public static final class C7975a {
        public C7975a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C7975a aVar = new C7975a((DefaultConstructorMarker) null);
        f16011f = aVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f16010e = z;
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                C6888i.m12438e(list, "protocols");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (((C7835d0) next) != C7835d0.HTTP_1_0) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C5266a.m9892V(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C7835d0) it2.next()).f15512g);
                }
                Object[] array = arrayList2.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.mo25753d(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
                return applicationProtocol;
            }
        } else {
            super.mo25754f(sSLSocket);
        }
        return null;
    }

    /* renamed from: l */
    public SSLContext mo25765l() {
        SSLContext instance = SSLContext.getInstance("TLSv1.3", this.f16012d);
        C6888i.m12437d(instance, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return instance;
    }

    /* renamed from: n */
    public X509TrustManager mo25766n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f16012d);
        instance.init((KeyStore) null);
        C6888i.m12437d(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        C6888i.m12436c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder u = C0843a.m460u("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C6888i.m12437d(arrays, "java.util.Arrays.toString(this)");
        u.append(arrays);
        throw new IllegalStateException(u.toString().toString());
    }

    /* renamed from: o */
    public X509TrustManager mo25756o(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }
}
