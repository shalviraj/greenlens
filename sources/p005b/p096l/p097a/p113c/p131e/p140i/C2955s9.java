package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.s9 */
public final class C2955s9 implements C2942r9 {

    /* renamed from: a */
    public static final C2910p3<Boolean> f5003a;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        n3Var.mo13516b("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f5003a = n3Var.mo13516b("measurement.collection.redundant_engagement_removal_enabled", false);
        n3Var.mo13515a("measurement.id.collection.redundant_engagement_removal_enabled", 0);
    }

    /* renamed from: a */
    public final boolean mo13651a() {
        return f5003a.mo13563c().booleanValue();
    }
}
