package p005b.p096l.p175c.p177b;

import java.util.Iterator;
import java.util.Objects;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.e0 */
public abstract class C3770e0<F, T> implements Iterator<T> {

    /* renamed from: g */
    public final Iterator<? extends F> f6954g;

    public C3770e0(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f6954g = it;
    }

    public final boolean hasNext() {
        return this.f6954g.hasNext();
    }

    public final T next() {
        return ((C3792o.C3793a) this.f6954g.next()).mo15201d();
    }

    public final void remove() {
        this.f6954g.remove();
    }
}
