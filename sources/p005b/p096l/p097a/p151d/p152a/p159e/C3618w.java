package p005b.p096l.p097a.p151d.p152a.p159e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: b.l.a.d.a.e.w */
public final class C3618w extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f6678a;

    public C3618w(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f6678a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C3618w.class) {
            if (this == obj) {
                return true;
            }
            C3618w wVar = (C3618w) obj;
            return this.f6678a == wVar.f6678a && get() == wVar.get();
        }
    }

    public final int hashCode() {
        return this.f6678a;
    }
}
