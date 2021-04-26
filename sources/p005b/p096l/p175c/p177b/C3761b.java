package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.b */
public abstract class C3761b<E> extends C3763c<E> implements Serializable {
    /* renamed from: D */
    public final boolean mo15140D(E e, int i, int i2) {
        C1960d.m2861w(i, "oldCount");
        C1960d.m2861w(i2, "newCount");
        throw null;
    }

    /* renamed from: S */
    public final int mo15141S(Object obj) {
        throw null;
    }

    public final void clear() {
        throw null;
    }

    /* renamed from: e */
    public final int mo15143e() {
        throw null;
    }

    public final Iterator<E> iterator() {
        return new C3799u(this, entrySet().iterator());
    }

    /* renamed from: k */
    public final int mo15145k(Object obj, int i) {
        if (i != 0) {
            C1960d.m2841r(i > 0, "occurrences cannot be negative: %s", i);
            throw null;
        }
        throw null;
    }

    /* renamed from: l */
    public final Iterator<E> mo15146l() {
        Objects.requireNonNull(this);
        throw null;
    }

    /* renamed from: o */
    public final int mo15147o(E e, int i) {
        if (i != 0) {
            C1960d.m2841r(i > 0, "occurrences cannot be negative: %s", i);
            throw null;
        }
        throw null;
    }

    /* renamed from: q */
    public final Iterator<C3792o.C3793a<E>> mo15148q() {
        Objects.requireNonNull(this);
        throw null;
    }

    public final int size() {
        return C1960d.m2714G0(0);
    }
}
