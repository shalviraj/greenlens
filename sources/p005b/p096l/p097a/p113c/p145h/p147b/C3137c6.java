package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.c6 */
public final class C3137c6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5447g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5448h;

    public C3137c6(C3294q6 q6Var, AtomicReference atomicReference) {
        this.f5448h = q6Var;
        this.f5447g = atomicReference;
    }

    public final void run() {
        synchronized (this.f5447g) {
            try {
                AtomicReference atomicReference = this.f5447g;
                C3281p4 p4Var = this.f5448h.f5638a;
                atomicReference.set(Boolean.valueOf(p4Var.f5848g.mo14197r(p4Var.mo14457b().mo14241m(), C3134c3.f5354K)));
                this.f5447g.notify();
            } catch (Throwable th) {
                this.f5447g.notify();
                throw th;
            }
        }
    }
}
