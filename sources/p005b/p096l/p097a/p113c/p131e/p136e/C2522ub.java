package p005b.p096l.p097a.p113c.p131e.p136e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: b.l.a.c.e.e.ub */
public final class C2522ub extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f4343a;

    public C2522ub(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f4343a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2522ub.class) {
            if (this == obj) {
                return true;
            }
            C2522ub ubVar = (C2522ub) obj;
            return this.f4343a == ubVar.f4343a && get() == ubVar.get();
        }
    }

    public final int hashCode() {
        return this.f4343a;
    }
}
