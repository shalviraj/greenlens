package p298d.p414b0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.t */
public final class C7681t<T> implements C7668h<T> {

    /* renamed from: a */
    public final C7668h<T> f15200a;

    /* renamed from: b */
    public final C6862l<T, Boolean> f15201b;

    /* renamed from: d.b0.t$a */
    public static final class C7682a implements Iterator<T>, C6875a {

        /* renamed from: g */
        public final Iterator<T> f15202g;

        /* renamed from: h */
        public int f15203h = -1;

        /* renamed from: i */
        public T f15204i;

        /* renamed from: j */
        public final /* synthetic */ C7681t f15205j;

        public C7682a(C7681t tVar) {
            this.f15205j = tVar;
            this.f15202g = tVar.f15200a.iterator();
        }

        /* renamed from: b */
        public final void mo25266b() {
            if (this.f15202g.hasNext()) {
                T next = this.f15202g.next();
                if (this.f15205j.f15201b.invoke(next).booleanValue()) {
                    this.f15203h = 1;
                    this.f15204i = next;
                    return;
                }
            }
            this.f15203h = 0;
        }

        public boolean hasNext() {
            if (this.f15203h == -1) {
                mo25266b();
            }
            return this.f15203h == 1;
        }

        public T next() {
            if (this.f15203h == -1) {
                mo25266b();
            }
            if (this.f15203h != 0) {
                T t = this.f15204i;
                this.f15204i = null;
                this.f15203h = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7681t(C7668h<? extends T> hVar, C6862l<? super T, Boolean> lVar) {
        C6888i.m12438e(hVar, "sequence");
        C6888i.m12438e(lVar, "predicate");
        this.f15200a = hVar;
        this.f15201b = lVar;
    }

    public Iterator<T> iterator() {
        return new C7682a(this);
    }
}
