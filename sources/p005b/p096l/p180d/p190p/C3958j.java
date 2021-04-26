package p005b.p096l.p180d.p190p;

import java.util.Objects;
import p005b.p096l.p180d.p215w.C4283a;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.j */
public final /* synthetic */ class C3958j implements Runnable {

    /* renamed from: g */
    public final C3947c0 f7250g;

    /* renamed from: h */
    public final C4284b f7251h;

    public C3958j(C3947c0 c0Var, C4284b bVar) {
        this.f7250g = c0Var;
        this.f7251h = bVar;
    }

    public void run() {
        C4283a<T> aVar;
        C3947c0 c0Var = this.f7250g;
        C4284b<T> bVar = this.f7251h;
        int i = C3961m.f7255g;
        if (c0Var.f7227b == C3945b0.f7223a) {
            synchronized (c0Var) {
                aVar = c0Var.f7226a;
                c0Var.f7226a = null;
                c0Var.f7227b = bVar;
            }
            Objects.requireNonNull((C3943a0) aVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
