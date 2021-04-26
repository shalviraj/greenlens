package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.k8 */
public final class C2850k8 implements C2837j8 {

    /* renamed from: a */
    public static final C2910p3<Boolean> f4873a;

    /* renamed from: b */
    public static final C2910p3<Boolean> f4874b;

    static {
        C2884n3 n3Var = new C2884n3(C2793g3.m4771a("com.google.android.gms.measurement"));
        f4873a = n3Var.mo13516b("measurement.frontend.directly_maybe_log_error_events", false);
        f4874b = n3Var.mo13516b("measurement.upload.directly_maybe_log_error_events", true);
        n3Var.mo13515a("measurement.id.frontend.directly_maybe_log_error_events", 0);
    }

    /* renamed from: a */
    public final boolean mo13436a() {
        return f4873a.mo13563c().booleanValue();
    }

    /* renamed from: b */
    public final boolean mo13437b() {
        return f4874b.mo13563c().booleanValue();
    }
}
