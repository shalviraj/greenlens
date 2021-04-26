package p005b.p280p.p285b;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.j */
public final class C5235j {

    /* renamed from: e */
    public static final C5232h[] f10398e;

    /* renamed from: f */
    public static final C5235j f10399f;

    /* renamed from: g */
    public static final C5235j f10400g;

    /* renamed from: h */
    public static final C5235j f10401h = new C5237b(false).mo17143a();

    /* renamed from: a */
    public final boolean f10402a;

    /* renamed from: b */
    public final boolean f10403b;

    /* renamed from: c */
    public final String[] f10404c;

    /* renamed from: d */
    public final String[] f10405d;

    /* renamed from: b.p.b.j$b */
    public static final class C5237b {

        /* renamed from: a */
        public boolean f10406a;

        /* renamed from: b */
        public String[] f10407b;

        /* renamed from: c */
        public String[] f10408c;

        /* renamed from: d */
        public boolean f10409d;

        public C5237b(C5235j jVar) {
            this.f10406a = jVar.f10402a;
            this.f10407b = jVar.f10404c;
            this.f10408c = jVar.f10405d;
            this.f10409d = jVar.f10403b;
        }

        public C5237b(boolean z) {
            this.f10406a = z;
        }

        /* renamed from: a */
        public C5235j mo17143a() {
            return new C5235j(this, (C5236a) null);
        }

        /* renamed from: b */
        public C5237b mo17144b(String... strArr) {
            if (!this.f10406a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10407b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C5237b mo17145c(C5265z... zVarArr) {
            if (this.f10406a) {
                String[] strArr = new String[zVarArr.length];
                for (int i = 0; i < zVarArr.length; i++) {
                    strArr[i] = zVarArr[i].f10525g;
                }
                mo17146d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: d */
        public C5237b mo17146d(String... strArr) {
            if (!this.f10406a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f10408c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        C5232h[] hVarArr = {C5232h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, C5232h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, C5232h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, C5232h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, C5232h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, C5232h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C5232h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C5232h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, C5232h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, C5232h.TLS_RSA_WITH_AES_128_GCM_SHA256, C5232h.TLS_RSA_WITH_AES_128_CBC_SHA, C5232h.TLS_RSA_WITH_AES_256_CBC_SHA, C5232h.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f10398e = hVarArr;
        C5237b bVar = new C5237b(true);
        String[] strArr = new String[13];
        for (int i = 0; i < 13; i++) {
            strArr[i] = hVarArr[i].f10389g;
        }
        bVar.mo17144b(strArr);
        C5265z zVar = C5265z.TLS_1_0;
        bVar.mo17145c(C5265z.TLS_1_2, C5265z.TLS_1_1, zVar);
        if (bVar.f10406a) {
            bVar.f10409d = true;
            C5235j a = bVar.mo17143a();
            f10399f = a;
            C5237b bVar2 = new C5237b(a);
            bVar2.mo17145c(zVar);
            if (bVar2.f10406a) {
                bVar2.f10409d = true;
                f10400g = bVar2.mo17143a();
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public C5235j(C5237b bVar, C5236a aVar) {
        this.f10402a = bVar.f10406a;
        this.f10404c = bVar.f10407b;
        this.f10405d = bVar.f10408c;
        this.f10403b = bVar.f10409d;
    }

    /* renamed from: b */
    public static boolean m9696b(String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                byte[] bArr = C5134i.f9953a;
                if (Arrays.asList(strArr2).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo17139a(SSLSocket sSLSocket) {
        if (!this.f10402a) {
            return false;
        }
        String[] strArr = this.f10405d;
        if (strArr != null && !m9696b(strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f10404c;
        return strArr2 == null || m9696b(strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5235j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C5235j jVar = (C5235j) obj;
        boolean z = this.f10402a;
        if (z != jVar.f10402a) {
            return false;
        }
        return !z || (Arrays.equals(this.f10404c, jVar.f10404c) && Arrays.equals(this.f10405d, jVar.f10405d) && this.f10403b == jVar.f10403b);
    }

    public int hashCode() {
        if (this.f10402a) {
            return ((((527 + Arrays.hashCode(this.f10404c)) * 31) + Arrays.hashCode(this.f10405d)) * 31) + (this.f10403b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        C5265z zVar;
        List list;
        if (!this.f10402a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f10404c;
        List list2 = null;
        String str2 = "[all enabled]";
        int i = 0;
        if (strArr != null) {
            if (strArr == null) {
                list = null;
            } else {
                C5232h[] hVarArr = new C5232h[strArr.length];
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.f10404c;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str3 = strArr2[i2];
                    C5232h hVar = C5232h.TLS_RSA_WITH_NULL_MD5;
                    if (str3.startsWith("SSL_")) {
                        StringBuilder u = C0843a.m460u("TLS_");
                        u.append(str3.substring(4));
                        str3 = u.toString();
                    }
                    hVarArr[i2] = C5232h.valueOf(str3);
                    i2++;
                }
                list = C5134i.m9464i(hVarArr);
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr3 = this.f10405d;
        if (strArr3 != null) {
            if (strArr3 != null) {
                C5265z[] zVarArr = new C5265z[strArr3.length];
                while (true) {
                    String[] strArr4 = this.f10405d;
                    if (i < strArr4.length) {
                        String str4 = strArr4[i];
                        str4.hashCode();
                        str4.hashCode();
                        char c = 65535;
                        switch (str4.hashCode()) {
                            case -503070503:
                                if (str4.equals("TLSv1.1")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -503070502:
                                if (str4.equals("TLSv1.2")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 79201641:
                                if (str4.equals("SSLv3")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 79923350:
                                if (str4.equals("TLSv1")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                zVar = C5265z.TLS_1_1;
                                break;
                            case 1:
                                zVar = C5265z.TLS_1_2;
                                break;
                            case 2:
                                zVar = C5265z.SSL_3_0;
                                break;
                            case 3:
                                zVar = C5265z.TLS_1_0;
                                break;
                            default:
                                throw new IllegalArgumentException(C0843a.m451l("Unexpected TLS version: ", str4));
                        }
                        zVarArr[i] = zVar;
                        i++;
                    } else {
                        list2 = C5134i.m9464i(zVarArr);
                    }
                }
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f10403b + ")";
    }
}
