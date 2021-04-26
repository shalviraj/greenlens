package p005b.p096l.p097a.p113c.p131e.p136e;

@Deprecated
/* renamed from: b.l.a.c.e.e.x4 */
public final class C2587x4 {

    /* renamed from: a */
    public static final byte[] f4431a;

    /* renamed from: b */
    public static final C2181g9 f4432b;

    static {
        byte[] bArr = new byte[0];
        f4431a = bArr;
        C2279k8 k8Var = C2279k8.NIST_P256;
        C2375o8 o8Var = C2375o8.SHA256;
        C2446r7 r7Var = C2446r7.UNCOMPRESSED;
        C2181g9 g9Var = C2609y2.f4474a;
        C2107da daVar = C2107da.TINK;
        C2375o8 o8Var2 = o8Var;
        C2181g9 g9Var2 = g9Var;
        byte[] bArr2 = bArr;
        f4432b = m4370a(k8Var, o8Var2, r7Var, g9Var2, daVar, bArr2);
        C2279k8 k8Var2 = k8Var;
        m4370a(k8Var2, o8Var2, C2446r7.COMPRESSED, g9Var2, C2107da.RAW, bArr2);
        m4370a(k8Var2, o8Var2, r7Var, C2609y2.f4475b, daVar, bArr2);
    }

    /* renamed from: a */
    public static C2181g9 m4370a(C2279k8 k8Var, C2375o8 o8Var, C2446r7 r7Var, C2181g9 g9Var, C2107da daVar, byte[] bArr) {
        C2566w7 u = C2590x7.m4376u();
        C2230i8 v = C2255j8.m3575v();
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        C2255j8.m3578y((C2255j8) v.f3908h, k8Var);
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2255j8) v.f3908h).zze = o8Var.mo12866a();
        C2317lm I = C2317lm.m3705I(bArr, 0, bArr.length);
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2255j8) v.f3908h).zzf = I;
        C2255j8 j8Var = (C2255j8) v.mo12691c();
        C2494t7 t = C2518u7.m4238t();
        if (t.f3909i) {
            t.mo12689a();
            t.f3909i = false;
        }
        C2518u7.m4241w((C2518u7) t.f3908h, g9Var);
        C2518u7 u7Var = (C2518u7) t.mo12691c();
        C2638z7 v2 = C2030a8.m2991v();
        if (v2.f3909i) {
            v2.mo12689a();
            v2.f3909i = false;
        }
        C2030a8.m2994y((C2030a8) v2.f3908h, j8Var);
        if (v2.f3909i) {
            v2.mo12689a();
            v2.f3909i = false;
        }
        C2030a8.m2995z((C2030a8) v2.f3908h, u7Var);
        if (v2.f3909i) {
            v2.mo12689a();
            v2.f3909i = false;
        }
        C2030a8.m2990A((C2030a8) v2.f3908h, r7Var);
        C2030a8 a8Var = (C2030a8) v2.mo12691c();
        if (u.f3909i) {
            u.mo12689a();
            u.f3909i = false;
        }
        C2590x7.m4378w((C2590x7) u.f3908h, a8Var);
        C2156f9 v3 = C2181g9.m3429v();
        new C2395p4();
        v3.mo12639f("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        v3.mo12641h(daVar);
        v3.mo12640g(((C2590x7) u.mo12691c()).mo12441n());
        return (C2181g9) v3.mo12691c();
    }
}
