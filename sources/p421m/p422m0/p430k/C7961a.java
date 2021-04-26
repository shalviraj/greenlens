package p421m.p422m0.p430k;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;
import p421m.p422m0.p430k.p431i.C7978a;
import p421m.p422m0.p430k.p431i.C7980b;
import p421m.p422m0.p430k.p431i.C7984f;
import p421m.p422m0.p430k.p431i.C7986g;
import p421m.p422m0.p430k.p431i.C7989i;
import p421m.p422m0.p430k.p431i.C7991j;
import p421m.p422m0.p430k.p431i.C7993k;
import p421m.p422m0.p433m.C7999c;

/* renamed from: m.m0.k.a */
public final class C7961a extends C7976h {

    /* renamed from: e */
    public static final boolean f15984e = (C7976h.f16015c.mo25775c() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: f */
    public static final C7961a f15985f = null;

    /* renamed from: d */
    public final List<C7993k> f15986d;

    public C7961a() {
        C7993k[] kVarArr = new C7993k[4];
        kVarArr[0] = C6888i.m12434a("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new C7978a() : null;
        C7984f.C7985a aVar = C7984f.f16024g;
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
        this.f15986d = arrayList;
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

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<? extends C7835d0> list) {
        T t;
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        Iterator<T> it = this.f15986d.iterator();
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

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        T t;
        C6888i.m12438e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f15986d.iterator();
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

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public boolean mo25755h(String str) {
        C6888i.m12438e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: o */
    public X509TrustManager mo25756o(SSLSocketFactory sSLSocketFactory) {
        T t;
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f15986d.iterator();
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
