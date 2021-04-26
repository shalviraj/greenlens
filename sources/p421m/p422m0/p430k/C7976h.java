package p421m.p422m0.p430k;

import com.segment.analytics.integrations.BasePayload;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7831c0;
import p421m.C7835d0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p433m.C7997a;
import p421m.p422m0.p433m.C7998b;
import p421m.p422m0.p433m.C7999c;
import p421m.p422m0.p433m.C8001e;
import p435n.C8040e;

/* renamed from: m.m0.k.h */
public class C7976h {

    /* renamed from: a */
    public static volatile C7976h f16013a;

    /* renamed from: b */
    public static final Logger f16014b = Logger.getLogger(C7831c0.class.getName());

    /* renamed from: c */
    public static final C7977a f16015c;

    /* renamed from: m.m0.k.h$a */
    public static final class C7977a {
        public C7977a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final List<String> mo25773a(List<? extends C7835d0> list) {
            C6888i.m12438e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((C7835d0) next) != C7835d0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C7835d0) it.next()).f15512g);
            }
            return arrayList2;
        }

        /* renamed from: b */
        public final byte[] mo25774b(List<? extends C7835d0> list) {
            C6888i.m12438e(list, "protocols");
            C8040e eVar = new C8040e();
            Iterator it = ((ArrayList) mo25773a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.mo25940v0(str.length());
                eVar.mo25947z0(str);
            }
            return eVar.mo25882A();
        }

        /* renamed from: c */
        public final boolean mo25775c() {
            return C6888i.m12434a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: m.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: m.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: m.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: m.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: m.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: m.m0.k.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    static {
        /*
            m.m0.k.h$a r0 = new m.m0.k.h$a
            r1 = 0
            r0.<init>(r1)
            f16015c = r0
            boolean r0 = r0.mo25775c()
            r2 = 0
            if (r0 == 0) goto L_0x0088
            m.m0.k.i.c r0 = p421m.p422m0.p430k.p431i.C7981c.f16020c
            java.util.Map<java.lang.String, java.lang.String> r0 = p421m.p422m0.p430k.p431i.C7981c.f16019b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = p421m.p422m0.p430k.p431i.C7981c.f16018a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "logger"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0051
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005d
        L_0x0051:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x005b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005d
        L_0x005b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005d:
            r4.setLevel(r3)
            m.m0.k.i.d r3 = p421m.p422m0.p430k.p431i.C7982d.f16021a
            r4.addHandler(r3)
            goto L_0x001b
        L_0x0066:
            m.m0.k.a r0 = p421m.p422m0.p430k.C7961a.f15985f
            boolean r0 = p421m.p422m0.p430k.C7961a.f15984e
            if (r0 == 0) goto L_0x0072
            m.m0.k.a r0 = new m.m0.k.a
            r0.<init>()
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x018c
        L_0x0077:
            m.m0.k.b$a r0 = p421m.p422m0.p430k.C7962b.f15988g
            boolean r0 = p421m.p422m0.p430k.C7962b.f15987f
            if (r0 == 0) goto L_0x0082
            m.m0.k.b r1 = new m.m0.k.b
            r1.<init>()
        L_0x0082:
            p298d.p344x.p346c.C6888i.m12436c(r1)
        L_0x0085:
            r0 = r1
            goto L_0x018c
        L_0x0088:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r4, r0)
            if (r0 == 0) goto L_0x00b0
            m.m0.k.d$a r0 = p421m.p422m0.p430k.C7967d.f15997f
            boolean r0 = p421m.p422m0.p430k.C7967d.f15996e
            if (r0 == 0) goto L_0x00ab
            m.m0.k.d r0 = new m.m0.k.d
            r0.<init>()
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x018c
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r4, r0)
            if (r0 == 0) goto L_0x00d6
            m.m0.k.c$a r0 = p421m.p422m0.p430k.C7965c.f15994f
            boolean r0 = p421m.p422m0.p430k.C7965c.f15993e
            if (r0 == 0) goto L_0x00d1
            m.m0.k.c r0 = new m.m0.k.c
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x018c
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x00fc
            m.m0.k.g$a r0 = p421m.p422m0.p430k.C7974g.f16011f
            boolean r0 = p421m.p422m0.p430k.C7974g.f16010e
            if (r0 == 0) goto L_0x00f7
            m.m0.k.g r0 = new m.m0.k.g
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x018c
        L_0x00fc:
            m.m0.k.f$a r0 = p421m.p422m0.p430k.C7972f.f16009e
            boolean r0 = p421m.p422m0.p430k.C7972f.f16008d
            if (r0 == 0) goto L_0x0108
            m.m0.k.f r0 = new m.m0.k.f
            r0.<init>()
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            if (r0 == 0) goto L_0x010d
            goto L_0x018c
        L_0x010d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            p298d.p344x.p346c.C6888i.m12437d(r0, r3)     // Catch:{ NumberFormatException -> 0x0123 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0123 }
            r3 = 9
            if (r0 < r3) goto L_0x0123
            goto L_0x0183
        L_0x0123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            m.m0.k.e r0 = new m.m0.k.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "putMethod"
            p298d.p344x.p346c.C6888i.m12437d(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "getMethod"
            p298d.p344x.p346c.C6888i.m12437d(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "removeMethod"
            p298d.p344x.p346c.C6888i.m12437d(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "clientProviderClass"
            p298d.p344x.p346c.C6888i.m12437d(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "serverProviderClass"
            p298d.p344x.p346c.C6888i.m12437d(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r1 = r0
        L_0x0183:
            if (r1 == 0) goto L_0x0187
            goto L_0x0085
        L_0x0187:
            m.m0.k.h r0 = new m.m0.k.h
            r0.<init>()
        L_0x018c:
            f16013a = r0
            java.lang.Class<m.c0> r0 = p421m.C7831c0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f16014b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p430k.C7976h.<clinit>():void");
    }

    /* renamed from: j */
    public static /* synthetic */ void m14586j(C7976h hVar, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        int i3 = i2 & 4;
        hVar.mo25771i(str, i, (Throwable) null);
    }

    /* renamed from: a */
    public void mo25769a(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
    }

    /* renamed from: b */
    public C7999c mo25752b(X509TrustManager x509TrustManager) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        return new C7997a(mo25757c(x509TrustManager));
    }

    /* renamed from: c */
    public C8001e mo25757c(X509TrustManager x509TrustManager) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C6888i.m12437d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C7998b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
    }

    /* renamed from: e */
    public void mo25758e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C6888i.m12438e(socket, "socket");
        C6888i.m12438e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: g */
    public Object mo25759g(String str) {
        C6888i.m12438e(str, "closer");
        if (f16014b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo25755h(String str) {
        C6888i.m12438e(str, "hostname");
        return true;
    }

    /* renamed from: i */
    public void mo25771i(String str, int i, Throwable th) {
        C6888i.m12438e(str, "message");
        f16014b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: k */
    public void mo25760k(String str, Object obj) {
        C6888i.m12438e(str, "message");
        if (obj == null) {
            str = C0843a.m451l(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo25771i(str, 5, (Throwable) obj);
    }

    /* renamed from: l */
    public SSLContext mo25765l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        C6888i.m12437d(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    /* renamed from: m */
    public SSLSocketFactory mo25767m(X509TrustManager x509TrustManager) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        try {
            SSLContext l = mo25765l();
            l.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l.getSocketFactory();
            C6888i.m12437d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    /* renamed from: n */
    public X509TrustManager mo25766n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            C6888i.m12437d(cls, "sslContextClass");
            Object s = C7867c.m14298s(sSLSocketFactory, cls, BasePayload.CONTEXT_KEY);
            if (s != null) {
                return (X509TrustManager) C7867c.m14298s(s, X509TrustManager.class, "trustManager");
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C6888i.m12437d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
