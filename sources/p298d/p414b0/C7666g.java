package p298d.p414b0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.b0.g */
public final class C7666g<T> implements C7668h<T> {

    /* renamed from: a */
    public final C6851a<T> f15187a;

    /* renamed from: b */
    public final C6862l<T, T> f15188b;

    /* renamed from: d.b0.g$a */
    public static final class C7667a implements Iterator<T>, C6875a {

        /* renamed from: g */
        public T f15189g;

        /* renamed from: h */
        public int f15190h = -2;

        /* renamed from: i */
        public final /* synthetic */ C7666g f15191i;

        public C7667a(C7666g gVar) {
            this.f15191i = gVar;
        }

        /* renamed from: b */
        public final void mo25261b() {
            T t;
            if (this.f15190h == -2) {
                t = this.f15191i.f15187a.invoke();
            } else {
                C6862l<T, T> lVar = this.f15191i.f15188b;
                T t2 = this.f15189g;
                C6888i.m12436c(t2);
                t = lVar.invoke(t2);
            }
            this.f15189g = t;
            this.f15190h = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f15190h < 0) {
                mo25261b();
            }
            return this.f15190h == 1;
        }

        public T next() {
            if (this.f15190h < 0) {
                mo25261b();
            }
            if (this.f15190h != 0) {
                T t = this.f15189g;
                Objects.requireNonNull(t, "null cannot be cast to non-null type T");
                this.f15190h = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7666g(C6851a<? extends T> aVar, C6862l<? super T, ? extends T> lVar) {
        C6888i.m12438e(aVar, "getInitialValue");
        C6888i.m12438e(lVar, "getNextValue");
        this.f15187a = aVar;
        this.f15188b = lVar;
    }

    public Iterator<T> iterator() {
        return new C7667a(this);
    }
}
