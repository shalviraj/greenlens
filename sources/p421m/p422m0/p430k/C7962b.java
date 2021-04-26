package p421m.p422m0.p430k;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;
import p421m.p422m0.p430k.p431i.C7980b;
import p421m.p422m0.p430k.p431i.C7984f;
import p421m.p422m0.p430k.p431i.C7986g;
import p421m.p422m0.p430k.p431i.C7988h;
import p421m.p422m0.p430k.p431i.C7989i;
import p421m.p422m0.p430k.p431i.C7991j;
import p421m.p422m0.p430k.p431i.C7993k;
import p421m.p422m0.p430k.p431i.C7994l;
import p421m.p422m0.p433m.C7999c;
import p421m.p422m0.p433m.C8001e;

/* renamed from: m.m0.k.b */
public final class C7962b extends C7976h {

    /* renamed from: f */
    public static final boolean f15987f;

    /* renamed from: g */
    public static final C7963a f15988g = new C7963a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public final List<C7993k> f15989d;

    /* renamed from: e */
    public final C7988h f15990e;

    /* renamed from: m.m0.k.b$a */
    public static final class C7963a {
        public C7963a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: m.m0.k.b$b */
    public static final class C7964b implements C8001e {

        /* renamed from: a */
        public final X509TrustManager f15991a;

        /* renamed from: b */
        public final Method f15992b;

        public C7964b(X509TrustManager x509TrustManager, Method method) {
            C6888i.m12438e(x509TrustManager, "trustManager");
            C6888i.m12438e(method, "findByIssuerAndSignatureMethod");
            this.f15991a = x509TrustManager;
            this.f15992b = method;
        }

        /* renamed from: a */
        public X509Certificate mo25761a(X509Certificate x509Certificate) {
            C6888i.m12438e(x509Certificate, "cert");
            try {
                Object invoke = this.f15992b.invoke(this.f15991a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7964b)) {
                return false;
            }
            C7964b bVar = (C7964b) obj;
            return C6888i.m12434a(this.f15991a, bVar.f15991a) && C6888i.m12434a(this.f15992b, bVar.f15992b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f15991a;
            int i = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f15992b;
            if (method != null) {
                i = method.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("CustomTrustRootIndex(trustManager=");
            u.append(this.f15991a);
            u.append(", findByIssuerAndSignatureMethod=");
            u.append(this.f15992b);
            u.append(")");
            return u.toString();
        }
    }

    static {
        boolean z = false;
        if (C7976h.f16015c.mo25775c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f15987f = z;
    }

    public C7962b() {
        C7994l lVar;
        Method method;
        Method method2;
        C7993k[] kVarArr = new C7993k[4];
        C7994l.C7995a aVar = C7994l.f16037j;
        C6888i.m12438e("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt" + ".OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            C6888i.m12437d(cls3, "paramsClass");
            lVar = new C7994l(cls, cls2, cls3);
        } catch (Exception e) {
            C7976h.f16013a.mo25771i("unable to load android socket classes", 5, e);
            lVar = null;
        }
        kVarArr[0] = lVar;
        C7984f.C7985a aVar2 = C7984f.f16024g;
        kVarArr[1] = new C7991j(C7984f.f16023f);
        kVarArr[2] = new C7991j(C7989i.f16034a);
        kVarArr[3] = new C7991j(C7986g.f16030a);
        List C = C6790h.m12316C(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C7993k) next).mo25780e()) {
                arrayList.add(next);
            }
        }
        this.f15989d = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method = cls4.getMethod("open", new Class[]{String.class});
            method2 = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f15990e = new C7988h(method3, method, method2);
    }

    /* renamed from: b */
    public C7999c mo25752b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C6888i.m12438e(x509TrustManager, "trustManager");
        C6888i.m12438e(x509TrustManager, "trustManager");
        C7980b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new C7980b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.mo25752b(x509TrustManager);
    }

    /* renamed from: c */
    public C8001e mo25757c(X509TrustManager x509TrustManager) {
        C6888i.m12438e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            C6888i.m12437d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C7964b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo25757c(x509TrustManager);
        }
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<C7835d0> list) {
        T t;
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        Iterator<T> it = this.f15989d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C7993k) t).mo25776a(sSLSocket)) {
                break;
            }
        }
        C7993k kVar = (C7993k) t;
        if (kVar != null) {
            kVar.mo25781f(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public void mo25758e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        C6888i.m12438e(socket, "socket");
        C6888i.m12438e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        T t;
        C6888i.m12438e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f15989d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C7993k) t).mo25776a(sSLSocket)) {
                break;
            }
        }
        C7993k kVar = (C7993k) t;
        if (kVar != null) {
            return kVar.mo25777b(sSLSocket);
        }
        return null;
    }

    /* renamed from: g */
    public Object mo25759g(String str) {
        C6888i.m12438e(str, "closer");
        C7988h hVar = this.f15990e;
        Objects.requireNonNull(hVar);
        C6888i.m12438e(str, "closer");
        Method method = hVar.f16031a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f16032b;
            C6888i.m12436c(method2);
            method2.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public boolean mo25755h(String str) {
        C6888i.m12438e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: k */
    public void mo25760k(String str, Object obj) {
        C6888i.m12438e(str, "message");
        C7988h hVar = this.f15990e;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.f16033c;
                C6888i.m12436c(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C7976h.m14586j(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo25756o(SSLSocketFactory sSLSocketFactory) {
        T t;
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f15989d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C7993k) t).mo25779d(sSLSocketFactory)) {
                break;
            }
        }
        C7993k kVar = (C7993k) t;
        if (kVar != null) {
            return kVar.mo25778c(sSLSocketFactory);
        }
        return null;
    }
}
