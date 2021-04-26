package p298d.p414b0;

import java.util.Iterator;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.b */
public final class C7658b<T> implements C7668h<T>, C7660c<T> {

    /* renamed from: a */
    public final C7668h<T> f15169a;

    /* renamed from: b */
    public final int f15170b;

    /* renamed from: d.b0.b$a */
    public static final class C7659a implements Iterator<T>, C6875a {

        /* renamed from: g */
        public final Iterator<T> f15171g;

        /* renamed from: h */
        public int f15172h;

        public C7659a(C7658b bVar) {
            this.f15171g = bVar.f15169a.iterator();
            this.f15172h = bVar.f15170b;
        }

        /* renamed from: b */
        public final void mo25249b() {
            while (this.f15172h > 0 && this.f15171g.hasNext()) {
                this.f15171g.next();
                this.f15172h--;
            }
        }

        public boolean hasNext() {
            mo25249b();
            return this.f15171g.hasNext();
        }

        public T next() {
            mo25249b();
            return this.f15171g.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7658b(C7668h<? extends T> hVar, int i) {
        C6888i.m12438e(hVar, "sequence");
        this.f15169a = hVar;
        this.f15170b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    /* renamed from: a */
    public C7668h<T> mo25248a(int i) {
        int i2 = this.f15170b + i;
        return i2 < 0 ? new C7658b(this, i) : new C7658b(this.f15169a, i2);
    }

    public Iterator<T> iterator() {
        return new C7659a(this);
    }
}
