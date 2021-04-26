package p421m.p422m0.p430k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.C7835d0;

/* renamed from: m.m0.k.f */
public class C7972f extends C7976h {

    /* renamed from: d */
    public static final boolean f16008d;

    /* renamed from: e */
    public static final C7973a f16009e = new C7973a((DefaultConstructorMarker) null);

    /* renamed from: m.m0.k.f$a */
    public static final class C7973a {
        public C7973a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            m.m0.k.f$a r0 = new m.m0.k.f$a
            r1 = 0
            r0.<init>(r1)
            f16009e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = p298d.p415c0.C7694h.m13918I(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            f16008d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p430k.C7972f.<clinit>():void");
    }

    /* renamed from: d */
    public void mo25753d(SSLSocket sSLSocket, String str, List<C7835d0> list) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        C6888i.m12438e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        C6888i.m12437d(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    /* renamed from: f */
    public String mo25754f(SSLSocket sSLSocket) {
        C6888i.m12438e(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (applicationProtocol.equals("")) {
                    return null;
                }
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    /* renamed from: o */
    public X509TrustManager mo25756o(SSLSocketFactory sSLSocketFactory) {
        C6888i.m12438e(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
