package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.ea */
public final class C2773ea implements C2759da {

    /* renamed from: a */
    public static final C2910p3<Boolean> f4702a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f4703b;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        n3Var.mo13515a("measurement.id.lifecycle.app_in_background_parameter", 0);
        f4702a = n3Var.mo13516b("measurement.lifecycle.app_backgrounded_engagement", false);
        n3Var.mo13516b("measurement.lifecycle.app_backgrounded_tracking", true);
        f4703b = n3Var.mo13516b("measurement.lifecycle.app_in_background_parameter", false);
        n3Var.mo13515a("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    /* renamed from: a */
    public final boolean mo13296a() {
        return f4702a.mo13563c().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo13297b() {
        return f4703b.mo13563c().booleanValue();
    }
}
