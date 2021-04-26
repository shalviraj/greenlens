package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.g6 */
public final class C3184g6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5548g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5549h;

    public C3184g6(C3294q6 q6Var, AtomicReference atomicReference) {
        this.f5549h = q6Var;
        this.f5548g = atomicReference;
    }

    public final void run() {
        String str;
        synchronized (this.f5548g) {
            try {
                AtomicReference atomicReference = this.f5548g;
                C3281p4 p4Var = this.f5549h.f5638a;
                C3166f fVar = p4Var.f5848g;
                String m = p4Var.mo14457b().mo14241m();
                C3110a3<String> a3Var = C3134c3.f5355L;
                Objects.requireNonNull(fVar);
                if (m == null) {
                    str = null;
                } else {
                    str = fVar.f5500c.mo14156b(m, a3Var.f5250a);
                }
                atomicReference.set(a3Var.mo14064a(str));
                this.f5548g.notify();
            } catch (Throwable th) {
                this.f5548g.notify();
                throw th;
            }
        }
    }
}
