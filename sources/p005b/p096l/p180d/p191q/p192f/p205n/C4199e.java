package p005b.p096l.p180d.p191q.p192f.p205n;

/* renamed from: b.l.d.q.f.n.e */
public class C4199e {

    /* renamed from: a */
    public final String f7788a;

    /* renamed from: b */
    public final String f7789b;

    /* renamed from: c */
    public final StackTraceElement[] f7790c;

    /* renamed from: d */
    public final C4199e f7791d;

    public C4199e(Throwable th, C4198d dVar) {
        this.f7788a = th.getLocalizedMessage();
        this.f7789b = th.getClass().getName();
        this.f7790c = dVar.mo15793a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f7791d = cause != null ? new C4199e(cause, dVar) : null;
    }
}
