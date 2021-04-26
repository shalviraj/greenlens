package p298d.p334t;

import java.util.Iterator;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.w */
public abstract class C6805w implements Iterator<Long>, C6875a {
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
