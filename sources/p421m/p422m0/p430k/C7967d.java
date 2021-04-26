package p421m.p422m0.p430k;

import java.security.KeyStore;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;

/* renamed from: m.m0.k.d */
public final class C7967d extends C7976h {

    /* renamed from: e */
    public static final boolean f15996e;

    /* renamed from: f */
    public static final C7968a f15997f;

    /* renamed from: d */
    public final Provider f15998d;

    /* renamed from: m.m0.k.d$a */
    public static final class C7968a {
        public C7968a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final boolean mo25768a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }
    }

    /* renamed from: m.m0.k.d$b */
    public static final class C7969b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C7969b f15999a = new C7969b();
    }

    static {
        C7968a aVar = new C7968a((DefaultConstructorMarker) null);
        f15997f = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable() && aVar.mo25768a(2, 1, 0)) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f15996e = z;
    }

    public C7967d() {
        Provider newProvider = Conscrypt.newProvider();
        C6888i.m12437d(newProvider, "Conscrypt.newProvider()");
        this.f15998d = newProvider;
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
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
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.mo25753d(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        super.mo25754f(sSLSocket);
        return null;
    }

    /* renamed from: l */
    public SSLContext mo25765l() {
        SSLContext instance = SSLContext.getInstance("TLS", this.f15998d);
        C6888i.m12437d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }

    /* renamed from: m */
    public SSLSocketFactory mo25767m(X509TrustManager x509TrustManager) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        SSLContext instance = SSLContext.getInstance("TLS", this.f15998d);
        C6888i.m12437d(instance, "SSLContext.getInstance(\"TLS\", provider)");
        instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
        SSLSocketFactory socketFactory = instance.getSocketFactory();
        C6888i.m12437d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* renamed from: n */
    public X509TrustManager mo25766n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        C6888i.m12437d(instance, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = instance.getTrustManagers();
        C6888i.m12436c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, C7969b.f15999a);
            return x509TrustManager;
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
        return null;
    }
}
