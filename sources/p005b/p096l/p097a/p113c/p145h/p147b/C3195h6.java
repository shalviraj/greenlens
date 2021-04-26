package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.h6 */
public final class C3195h6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5582g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5583h;

    public C3195h6(C3294q6 q6Var, AtomicReference atomicReference) {
        this.f5583h = q6Var;
        this.f5582g = atomicReference;
    }

    public final void run() {
        synchronized (this.f5582g) {
            try {
                AtomicReference atomicReference = this.f5582g;
                C3281p4 p4Var = this.f5583h.f5638a;
                atomicReference.set(Long.valueOf(p4Var.f5848g.mo14194o(p4Var.mo14457b().mo14241m(), C3134c3.f5356M)));
                this.f5582g.notify();
            } catch (Throwable th) {
                this.f5582g.notify();
                throw th;
            }
        }
    }
}
