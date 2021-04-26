package p298d.p334t;

import java.util.Iterator;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.v */
public abstract class C6804v implements Iterator<Integer>, C6875a {
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
