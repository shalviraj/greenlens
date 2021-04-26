package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.ha */
public final class C2813ha implements C2800ga {

    /* renamed from: a */
    public static final C2910p3<Boolean> f4821a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f4822b;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        f4821a = n3Var.mo13516b("measurement.sdk.screen.manual_screen_view_logging", true);
        f4822b = n3Var.mo13516b("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    /* renamed from: a */
    public final boolean mo13357a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13358b() {
        return f4821a.mo13563c().booleanValue();
    }

    /* renamed from: c */
    public final boolean mo13359c() {
        return f4822b.mo13563c().booleanValue();
    }
}
