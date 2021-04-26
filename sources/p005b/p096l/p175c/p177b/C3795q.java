package p005b.p096l.p175c.p177b;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.q */
public abstract class C3795q<E> implements C3792o.C3793a<E> {
    public boolean equals(Object obj) {
        if (!(obj instanceof C3792o.C3793a)) {
            return false;
        }
        C3792o.C3793a aVar = (C3792o.C3793a) obj;
        return getCount() == aVar.getCount() && C1960d.m2725K(mo15201d(), aVar.mo15201d());
    }

    public int hashCode() {
        Object d = mo15201d();
        return (d == null ? 0 : d.hashCode()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(mo15201d());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        return valueOf + " x " + count;
    }
}
