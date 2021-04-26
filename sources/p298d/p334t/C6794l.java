package p298d.p334t;

import java.util.Iterator;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.l */
public abstract class C6794l implements Iterator<Boolean>, C6875a {
    public final Boolean next() {
        return Boolean.valueOf(nextBoolean());
    }

    public abstract boolean nextBoolean();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
