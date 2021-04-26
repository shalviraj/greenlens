package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.ba */
public final class C2731ba implements C2717aa {

    /* renamed from: a */
    public static final C2910p3<Boolean> f4660a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f4661b;

    /* renamed from: c */
    public static final C2910p3<Boolean> f4662c;

    /* renamed from: d */
    public static final C2910p3<Boolean> f4663d;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        f4660a = n3Var.mo13516b("measurement.sdk.collection.enable_extend_user_property_size", true);
        f4661b = n3Var.mo13516b("measurement.sdk.collection.last_deep_link_referrer2", true);
        f4662c = n3Var.mo13516b("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f4663d = n3Var.mo13516b("measurement.sdk.collection.last_gclid_from_referrer2", false);
        n3Var.mo13515a("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo13237a() {
        return f4660a.mo13563c().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo13238b() {
        return f4661b.mo13563c().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13239c() {
        return f4662c.mo13563c().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo13240d() {
        return f4663d.mo13563c().booleanValue();
    }
}
