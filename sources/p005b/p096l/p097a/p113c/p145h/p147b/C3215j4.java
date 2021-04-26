package p005b.p096l.p097a.p113c.p145h.p147b;

import java.lang.Thread;

/* renamed from: b.l.a.c.h.b.j4 */
public final class C3215j4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f5636a;

    /* renamed from: b */
    public final /* synthetic */ C3248m4 f5637b;

    public C3215j4(C3248m4 m4Var, String str) {
        this.f5637b = m4Var;
        this.f5636a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f5637b.f5638a.mo14329d().f5799f.mo14415b(this.f5636a, th);
    }
}
