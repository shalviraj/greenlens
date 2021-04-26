package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.w8 */
public final class C3006w8 implements C2993v8 {

    /* renamed from: a */
    public static final C2910p3<Boolean> f5118a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f5119b;

    /* renamed from: c */
    public static final C2910p3<Boolean> f5120c;

    /* renamed from: d */
    public static final C2910p3<Long> f5121d;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        f5118a = n3Var.mo13516b("measurement.client.consent_state_v1", true);
        f5119b = n3Var.mo13516b("measurement.client.3p_consent_state_v1", true);
        f5120c = n3Var.mo13516b("measurement.service.consent_state_v1_W36", true);
        n3Var.mo13515a("measurement.id.service.consent_state_v1_W36", 0);
        f5121d = n3Var.mo13515a("measurement.service.storage_consent_support_version", 203590);
    }

    /* renamed from: a */
    public final boolean mo13805a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13806b() {
        return f5118a.mo13563c().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13807c() {
        return f5119b.mo13563c().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo13808d() {
        return f5120c.mo13563c().booleanValue();
    }

    /* renamed from: e */
    public final long mo13809e() {
        return f5121d.mo13563c().longValue();
    }
}
