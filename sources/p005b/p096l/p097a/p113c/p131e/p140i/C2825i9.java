package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.i9 */
public final class C2825i9 implements C2812h9 {

    /* renamed from: a */
    public static final C2910p3<Boolean> f4844a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f4845b;

    /* renamed from: c */
    public static final C2910p3<Boolean> f4846c;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        n3Var.mo13516b("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f4844a = n3Var.mo13516b("measurement.audience.refresh_event_count_filters_timestamp", false);
        f4845b = n3Var.mo13516b("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f4846c = n3Var.mo13516b("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo13378a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13379b() {
        return f4844a.mo13563c().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13380c() {
        return f4845b.mo13563c().booleanValue();
    }

    /* renamed from: d */
    public final boolean mo13381d() {
        return f4846c.mo13563c().booleanValue();
    }
}
