package p005b.p096l.p175c.p177b;

import java.util.NoSuchElementException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3789n;

/* renamed from: b.l.c.b.a */
public abstract class C3759a<E> extends C3784i0<E> {

    /* renamed from: g */
    public final int f6944g;

    /* renamed from: h */
    public int f6945h;

    public C3759a(int i, int i2) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException(C1960d.m2813k(i2, i, "index"));
        }
        this.f6944g = i;
        this.f6945h = i2;
    }

    public final boolean hasNext() {
        return this.f6945h < this.f6944g;
    }

    public final boolean hasPrevious() {
        return this.f6945h > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f6945h;
            this.f6945h = i + 1;
            return ((C3789n.C3790a) this).f6997i.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f6945h;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f6945h - 1;
            this.f6945h = i;
            return ((C3789n.C3790a) this).f6997i.get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f6945h - 1;
    }
}
