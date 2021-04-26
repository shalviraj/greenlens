package p298d.p299a.p300a.p301a.p413z0;

import java.util.Iterator;

/* renamed from: d.a.a.a.z0.a */
public final class C7651a<E> implements Iterable<E> {

    /* renamed from: j */
    public static final C7651a<Object> f15150j = new C7651a<>();

    /* renamed from: g */
    public final E f15151g;

    /* renamed from: h */
    public final C7651a<E> f15152h;

    /* renamed from: i */
    public final int f15153i;

    /* renamed from: d.a.a.a.z0.a$a */
    public static class C7652a<E> implements Iterator<E> {

        /* renamed from: g */
        public C7651a<E> f15154g;

        public C7652a(C7651a<E> aVar) {
            this.f15154g = aVar;
        }

        public boolean hasNext() {
            return this.f15154g.f15153i > 0;
        }

        public E next() {
            C7651a<E> aVar = this.f15154g;
            E e = aVar.f15151g;
            this.f15154g = aVar.f15152h;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7651a() {
        this.f15153i = 0;
        this.f15151g = null;
        this.f15152h = null;
    }

    public C7651a(E e, C7651a<E> aVar) {
        this.f15151g = e;
        this.f15152h = aVar;
        this.f15153i = aVar.f15153i + 1;
    }

    /* renamed from: d */
    public final C7651a<E> mo25234d(Object obj) {
        if (this.f15153i == 0) {
            return this;
        }
        if (this.f15151g.equals(obj)) {
            return this.f15152h;
        }
        C7651a<E> d = this.f15152h.mo25234d(obj);
        return d == this.f15152h ? this : new C7651a<>(this.f15151g, d);
    }

    /* renamed from: e */
    public final C7651a<E> mo25235e(int i) {
        if (i >= 0 && i <= this.f15153i) {
            return i == 0 ? this : this.f15152h.mo25235e(i - 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator<E> iterator() {
        return new C7652a(mo25235e(0));
    }
}
