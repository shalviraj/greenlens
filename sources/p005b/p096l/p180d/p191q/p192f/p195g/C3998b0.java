package p005b.p096l.p180d.p191q.p192f.p195g;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;

/* renamed from: b.l.d.q.f.g.b0 */
public class C3998b0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C3999a f7305a;

    /* renamed from: b */
    public final C4184f f7306b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f7307c;

    /* renamed from: d */
    public final AtomicBoolean f7308d = new AtomicBoolean(false);

    /* renamed from: b.l.d.q.f.g.b0$a */
    public interface C3999a {
    }

    public C3998b0(C3999a aVar, C4184f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7305a = aVar;
        this.f7306b = fVar;
        this.f7307c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C3982b bVar;
        String str;
        this.f7308d.set(true);
        if (thread == null) {
            try {
                bVar = C3982b.f7289a;
                str = "Could not handle uncaught exception; null thread";
            } catch (Exception e) {
                C3982b bVar2 = C3982b.f7289a;
                if (bVar2.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
                }
                bVar2.mo15496b("Completed exception processing. Invoking default exception handler.");
            } catch (Throwable th2) {
                C3982b.f7289a.mo15496b("Completed exception processing. Invoking default exception handler.");
                this.f7307c.uncaughtException(thread, th);
                this.f7308d.set(false);
                throw th2;
            }
        } else if (th == null) {
            bVar = C3982b.f7289a;
            str = "Could not handle uncaught exception; null throwable";
        } else {
            ((C4019k) this.f7305a).mo15529a(this.f7306b, thread, th);
            C3982b.f7289a.mo15496b("Completed exception processing. Invoking default exception handler.");
            this.f7307c.uncaughtException(thread, th);
            this.f7308d.set(false);
        }
        bVar.mo15497c(str);
        C3982b.f7289a.mo15496b("Completed exception processing. Invoking default exception handler.");
        this.f7307c.uncaughtException(thread, th);
        this.f7308d.set(false);
    }
}
