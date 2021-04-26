package p298d.p414b0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.f */
public final class C7664f<T, R, E> implements C7668h<E> {

    /* renamed from: a */
    public final C7668h<T> f15181a;

    /* renamed from: b */
    public final C6862l<T, R> f15182b;

    /* renamed from: c */
    public final C6862l<R, Iterator<E>> f15183c;

    /* renamed from: d.b0.f$a */
    public static final class C7665a implements Iterator<E>, C6875a {

        /* renamed from: g */
        public final Iterator<T> f15184g;

        /* renamed from: h */
        public Iterator<? extends E> f15185h;

        /* renamed from: i */
        public final /* synthetic */ C7664f f15186i;

        public C7665a(C7664f fVar) {
            this.f15186i = fVar;
            this.f15184g = fVar.f15181a.iterator();
        }

        /* renamed from: b */
        public final boolean mo25257b() {
            Iterator<? extends E> it = this.f15185h;
            if (it != null && !it.hasNext()) {
                this.f15185h = null;
            }
            while (true) {
                if (this.f15185h == null) {
                    if (this.f15184g.hasNext()) {
                        T next = this.f15184g.next();
                        C7664f fVar = this.f15186i;
                        Iterator<? extends E> invoke = fVar.f15183c.invoke(fVar.f15182b.invoke(next));
                        if (invoke.hasNext()) {
                            this.f15185h = invoke;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return mo25257b();
        }

        public E next() {
            if (mo25257b()) {
                Iterator<? extends E> it = this.f15185h;
                C6888i.m12436c(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7664f(C7668h<? extends T> hVar, C6862l<? super T, ? extends R> lVar, C6862l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C6888i.m12438e(hVar, "sequence");
        C6888i.m12438e(lVar, "transformer");
        C6888i.m12438e(lVar2, "iterator");
        this.f15181a = hVar;
        this.f15182b = lVar;
        this.f15183c = lVar2;
    }

    public Iterator<E> iterator() {
        return new C7665a(this);
    }
}
