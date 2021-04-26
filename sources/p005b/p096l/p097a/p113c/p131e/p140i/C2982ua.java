package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.ua */
public final class C2982ua implements C2969ta {

    /* renamed from: a */
    public static final C2910p3<Boolean> f5073a;

    /* renamed from: b */
    public static final C2910p3<Double> f5074b;

    /* renamed from: c */
    public static final C2910p3<Long> f5075c;

    /* renamed from: d */
    public static final C2910p3<Long> f5076d;

    /* renamed from: e */
    public static final C2910p3<String> f5077e;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        f5073a = n3Var.mo13516b("measurement.test.boolean_flag", false);
        f5074b = new C2858l3(n3Var, Double.valueOf(-3.0d));
        f5075c = n3Var.mo13515a("measurement.test.int_flag", -2);
        f5076d = n3Var.mo13515a("measurement.test.long_flag", -1);
        f5077e = new C2871m3(n3Var, "measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final boolean mo13755a() {
        return f5073a.mo13563c().booleanValue();
    }

    /* renamed from: b */
    public final double mo13756b() {
        return f5074b.mo13563c().doubleValue();
    }

    /* renamed from: c */
    public final long mo13757c() {
        return f5075c.mo13563c().longValue();
    }

    /* renamed from: d */
    public final long mo13758d() {
        return f5076d.mo13563c().longValue();
    }

    /* renamed from: e */
    public final String mo13759e() {
        return f5077e.mo13563c();
    }
}
