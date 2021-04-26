package p005b.p096l.p097a.p113c.p131e.p140i;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: b.l.a.c.e.i.z3 */
public final class C3040z3 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f5180a;

    public C3040z3(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f5180a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C3040z3.class) {
            if (this == obj) {
                return true;
            }
            C3040z3 z3Var = (C3040z3) obj;
            return this.f5180a == z3Var.f5180a && get() == z3Var.get();
        }
    }

    public final int hashCode() {
        return this.f5180a;
    }
}
