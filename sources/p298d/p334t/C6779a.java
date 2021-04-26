package p298d.p334t;

import java.util.Collection;
import java.util.Iterator;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6884e;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.a */
public abstract class C6779a<E> implements Collection<E>, C6875a {

    /* renamed from: d.t.a$a */
    public static final class C6780a extends C6890k implements C6862l<E, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ C6779a f13697g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6780a(C6779a aVar) {
            super(1);
            this.f13697g = aVar;
        }

        public Object invoke(Object obj) {
            return obj == this.f13697g ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C6888i.m12434a(a, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract int mo23951e();

    public boolean isEmpty() {
        return mo23951e() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo23951e();
    }

    public Object[] toArray() {
        return C6884e.m12430a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C6888i.m12438e(tArr, "array");
        return C6884e.m12431b(this, tArr);
    }

    public String toString() {
        return C6790h.m12369w(this, ", ", "[", "]", 0, (CharSequence) null, new C6780a(this), 24);
    }
}
