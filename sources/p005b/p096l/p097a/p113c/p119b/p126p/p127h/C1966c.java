package p005b.p096l.p097a.p113c.p119b.p126p.p127h;

import android.os.Process;

/* renamed from: b.l.a.c.b.p.h.c */
public final class C1966c implements Runnable {

    /* renamed from: g */
    public final Runnable f3528g;

    public C1966c(Runnable runnable, int i) {
        this.f3528g = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f3528g.run();
    }
}
