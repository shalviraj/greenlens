package p005b.p096l.p097a.p113c.p131e.p137f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: b.l.a.c.e.f.h */
public final class C2662h extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f4548a;

    public C2662h(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f4548a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2662h.class) {
            if (this == obj) {
                return true;
            }
            C2662h hVar = (C2662h) obj;
            return this.f4548a == hVar.f4548a && get() == hVar.get();
        }
    }

    public final int hashCode() {
        return this.f4548a;
    }
}
