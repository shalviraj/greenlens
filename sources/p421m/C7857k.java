package p421m;

import androidx.renderscript.ScriptIntrinsicBLAS;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

/* renamed from: m.k */
public final class C7857k {

    /* renamed from: b */
    public static final Comparator<String> f15584b = new C7858a();

    /* renamed from: c */
    public static final Map<String, C7857k> f15585c = new LinkedHashMap();

    /* renamed from: d */
    public static final C7857k f15586d;

    /* renamed from: e */
    public static final C7857k f15587e;

    /* renamed from: f */
    public static final C7857k f15588f;

    /* renamed from: g */
    public static final C7857k f15589g;

    /* renamed from: h */
    public static final C7857k f15590h;

    /* renamed from: i */
    public static final C7857k f15591i;

    /* renamed from: j */
    public static final C7857k f15592j;

    /* renamed from: k */
    public static final C7857k f15593k;

    /* renamed from: l */
    public static final C7857k f15594l;

    /* renamed from: m */
    public static final C7857k f15595m;

    /* renamed from: n */
    public static final C7857k f15596n;

    /* renamed from: o */
    public static final C7857k f15597o;

    /* renamed from: p */
    public static final C7857k f15598p;

    /* renamed from: q */
    public static final C7857k f15599q;

    /* renamed from: r */
    public static final C7857k f15600r;

    /* renamed from: s */
    public static final C7857k f15601s;

    /* renamed from: t */
    public static final C7859b f15602t;

    /* renamed from: a */
    public final String f15603a;

    /* renamed from: m.k$a */
    public static final class C7858a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C6888i.m12438e(str, "a");
            C6888i.m12438e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt == charAt2) {
                        i++;
                    } else if (C6888i.m12440g(charAt, charAt2) < 0) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    /* renamed from: m.k$b */
    public static final class C7859b {
        public C7859b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public static final C7857k m14272a(C7859b bVar, String str, int i) {
            C7857k kVar = new C7857k(str, (DefaultConstructorMarker) null);
            C7857k.f15585c.put(str, kVar);
            return kVar;
        }

        /* renamed from: b */
        public final synchronized C7857k mo25575b(String str) {
            C7857k kVar;
            C6888i.m12438e(str, "javaName");
            Map<String, C7857k> map = C7857k.f15585c;
            kVar = map.get(str);
            if (kVar == null) {
                kVar = map.get(mo25576c(str));
                if (kVar == null) {
                    kVar = new C7857k(str, (DefaultConstructorMarker) null);
                }
                map.put(str, kVar);
            }
            return kVar;
        }

        /* renamed from: c */
        public final String mo25576c(String str) {
            if (C7694h.m13910A(str, "TLS_", false, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                String substring = str.substring(4);
                C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            } else if (!C7694h.m13910A(str, "SSL_", false, 2)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                String substring2 = str.substring(4);
                C6888i.m12437d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                return sb2.toString();
            }
        }
    }

    static {
        C7859b bVar = new C7859b((DefaultConstructorMarker) null);
        f15602t = bVar;
        C7859b.m14272a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        C7859b.m14272a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        C7859b.m14272a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        C7859b.m14272a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        C7859b.m14272a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        C7859b.m14272a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        C7859b.m14272a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        f15586d = C7859b.m14272a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        C7859b.m14272a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        C7859b.m14272a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        C7859b.m14272a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        C7859b.m14272a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        C7859b.m14272a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        C7859b.m14272a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        C7859b.m14272a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        C7859b.m14272a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        C7859b.m14272a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        C7859b.m14272a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        C7859b.m14272a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C7859b.m14272a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        C7859b.m14272a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        C7859b.m14272a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        C7859b.m14272a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        C7859b.m14272a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f15587e = C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f15588f = C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", ScriptIntrinsicBLAS.UNIT);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        C7859b.m14272a(bVar, "TLS_PSK_WITH_RC4_128_SHA", 138);
        C7859b.m14272a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        C7859b.m14272a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        C7859b.m14272a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", ScriptIntrinsicBLAS.LEFT);
        C7859b.m14272a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f15589g = C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f15590h = C7859b.m14272a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        C7859b.m14272a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        C7859b.m14272a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        C7859b.m14272a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        C7859b.m14272a(bVar, "TLS_FALLBACK_SCSV", 22016);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f15591i = C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f15592j = C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        C7859b.m14272a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        C7859b.m14272a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        C7859b.m14272a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        C7859b.m14272a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        C7859b.m14272a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f15593k = C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f15594l = C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        C7859b.m14272a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f15595m = C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f15596n = C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        C7859b.m14272a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        C7859b.m14272a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        C7859b.m14272a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f15597o = C7859b.m14272a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f15598p = C7859b.m14272a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        C7859b.m14272a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        C7859b.m14272a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f15599q = C7859b.m14272a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        f15600r = C7859b.m14272a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        f15601s = C7859b.m14272a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        C7859b.m14272a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        C7859b.m14272a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public C7857k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15603a = str;
    }

    public String toString() {
        return this.f15603a;
    }
}
