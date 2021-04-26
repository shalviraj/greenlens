package p298d.p414b0;

import java.util.Iterator;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.u */
public final class C7683u<T, R> implements C7668h<R> {

    /* renamed from: a */
    public final C7668h<T> f15206a;

    /* renamed from: b */
    public final C6862l<T, R> f15207b;

    /* renamed from: d.b0.u$a */
    public static final class C7684a implements Iterator<R>, C6875a {

        /* renamed from: g */
        public final Iterator<T> f15208g;

        /* renamed from: h */
        public final /* synthetic */ C7683u f15209h;

        public C7684a(C7683u uVar) {
            this.f15209h = uVar;
            this.f15208g = uVar.f15206a.iterator();
        }

        public boolean hasNext() {
            return this.f15208g.hasNext();
        }

        public R next() {
            return this.f15209h.f15207b.invoke(this.f15208g.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7683u(C7668h<? extends T> hVar, C6862l<? super T, ? extends R> lVar) {
        C6888i.m12438e(hVar, "sequence");
        C6888i.m12438e(lVar, "transformer");
        this.f15206a = hVar;
        this.f15207b = lVar;
    }

    public Iterator<R> iterator() {
        return new C7684a(this);
    }
}
