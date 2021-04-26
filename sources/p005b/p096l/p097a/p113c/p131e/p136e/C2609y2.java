package p005b.p096l.p097a.p113c.p131e.p136e;

@Deprecated
/* renamed from: b.l.a.c.e.e.y2 */
public final class C2609y2 {

    /* renamed from: a */
    public static final C2181g9 f4474a = m4412a(16);

    /* renamed from: b */
    public static final C2181g9 f4475b;

    static {
        m4412a(32);
        m4413b(16, 16);
        m4413b(32, 16);
        C2375o8 o8Var = C2375o8.SHA256;
        f4475b = m4414c(16, 16, 32, 16, o8Var);
        m4414c(32, 16, 32, 32, o8Var);
        C2156f9 v = C2181g9.m3429v();
        new C2490t3();
        v.mo12639f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        C2107da daVar = C2107da.TINK;
        v.mo12641h(daVar);
        C2181g9 g9Var = (C2181g9) v.mo12691c();
        C2156f9 v2 = C2181g9.m3429v();
        new C2101d4();
        v2.mo12639f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v2.mo12641h(daVar);
        C2181g9 g9Var2 = (C2181g9) v2.mo12691c();
    }

    /* renamed from: a */
    public static C2181g9 m4412a(int i) {
        C2029a7 u = C2054b7.m3050u();
        if (u.f3909i) {
            u.mo12689a();
            u.f3909i = false;
        }
        ((C2054b7) u.f3908h).zzb = i;
        C2156f9 v = C2181g9.m3429v();
        v.mo12640g(((C2054b7) u.mo12691c()).mo12441n());
        new C2346n3();
        v.mo12639f("type.googleapis.com/google.crypto.tink.AesGcmKey");
        v.mo12641h(C2107da.TINK);
        return (C2181g9) v.mo12691c();
    }

    /* renamed from: b */
    public static C2181g9 m4413b(int i, int i2) {
        C2445r6 v = C2469s6.m4121v();
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2469s6) v.f3908h).zze = i;
        C2517u6 t = C2541v6.m4297t();
        if (t.f3909i) {
            t.mo12689a();
            t.f3909i = false;
        }
        ((C2541v6) t.f3908h).zzb = 16;
        C2541v6 v6Var = (C2541v6) t.mo12691c();
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        C2469s6.m4123x((C2469s6) v.f3908h, v6Var);
        C2156f9 v2 = C2181g9.m3429v();
        v2.mo12640g(((C2469s6) v.mo12691c()).mo12441n());
        new C2274k3();
        v2.mo12639f("type.googleapis.com/google.crypto.tink.AesEaxKey");
        v2.mo12641h(C2107da.TINK);
        return (C2181g9) v2.mo12691c();
    }

    /* renamed from: c */
    public static C2181g9 m4414c(int i, int i2, int i3, int i4, C2375o8 o8Var) {
        C2228i6 v = C2253j6.m3558v();
        C2301l6 t = C2325m6.m3749t();
        if (t.f3909i) {
            t.mo12689a();
            t.f3909i = false;
        }
        ((C2325m6) t.f3908h).zzb = 16;
        C2325m6 m6Var = (C2325m6) t.mo12691c();
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        C2253j6.m3561y((C2253j6) v.f3908h, m6Var);
        if (v.f3909i) {
            v.mo12689a();
            v.f3909i = false;
        }
        ((C2253j6) v.f3908h).zze = i;
        C2253j6 j6Var = (C2253j6) v.mo12691c();
        C2495t8 v2 = C2519u8.m4245v();
        C2567w8 u = C2591x8.m4381u();
        if (u.f3909i) {
            u.mo12689a();
            u.f3909i = false;
        }
        ((C2591x8) u.f3908h).zzb = o8Var.mo12866a();
        if (u.f3909i) {
            u.mo12689a();
            u.f3909i = false;
        }
        ((C2591x8) u.f3908h).zze = i4;
        C2591x8 x8Var = (C2591x8) u.mo12691c();
        if (v2.f3909i) {
            v2.mo12689a();
            v2.f3909i = false;
        }
        C2519u8.m4248y((C2519u8) v2.f3908h, x8Var);
        if (v2.f3909i) {
            v2.mo12689a();
            v2.f3909i = false;
        }
        ((C2519u8) v2.f3908h).zze = 32;
        C2519u8 u8Var = (C2519u8) v2.mo12691c();
        C2078c6 v3 = C2103d6.m3192v();
        if (v3.f3909i) {
            v3.mo12689a();
            v3.f3909i = false;
        }
        C2103d6.m3194x((C2103d6) v3.f3908h, j6Var);
        if (v3.f3909i) {
            v3.mo12689a();
            v3.f3909i = false;
        }
        C2103d6.m3195y((C2103d6) v3.f3908h, u8Var);
        C2156f9 v4 = C2181g9.m3429v();
        v4.mo12640g(((C2103d6) v3.mo12691c()).mo12441n());
        new C2100d3();
        v4.mo12639f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        v4.mo12641h(C2107da.TINK);
        return (C2181g9) v4.mo12691c();
    }
}
