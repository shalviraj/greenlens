package p298d.p334t;

import java.util.Iterator;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.u */
public final class C6803u<T> implements Iterator<C6801s<? extends T>>, C6875a {

    /* renamed from: g */
    public int f13719g;

    /* renamed from: h */
    public final Iterator<T> f13720h;

    public C6803u(Iterator<? extends T> it) {
        C6888i.m12438e(it, "iterator");
        this.f13720h = it;
    }

    public final boolean hasNext() {
        return this.f13720h.hasNext();
    }

    public Object next() {
        int i = this.f13719g;
        this.f13719g = i + 1;
        if (i >= 0) {
            return new C6801s(i, this.f13720h.next());
        }
        C6790h.m12333T();
        throw null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
