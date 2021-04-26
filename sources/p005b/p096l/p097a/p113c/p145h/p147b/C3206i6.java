package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.i6 */
public final class C3206i6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5608g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5609h;

    public C3206i6(C3294q6 q6Var, AtomicReference atomicReference) {
        this.f5609h = q6Var;
        this.f5608g = atomicReference;
    }

    public final void run() {
        synchronized (this.f5608g) {
            try {
                AtomicReference atomicReference = this.f5608g;
                C3281p4 p4Var = this.f5609h.f5638a;
                atomicReference.set(Integer.valueOf(p4Var.f5848g.mo14195p(p4Var.mo14457b().mo14241m(), C3134c3.f5357N)));
                this.f5608g.notify();
            } catch (Throwable th) {
                this.f5608g.notify();
                throw th;
            }
        }
    }
}
