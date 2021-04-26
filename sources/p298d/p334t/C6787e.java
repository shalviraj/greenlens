package p298d.p334t;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6884e;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.e */
public final class C6787e<T> implements Collection<T>, C6875a {

    /* renamed from: g */
    public final T[] f13704g;

    /* renamed from: h */
    public final boolean f13705h;

    public C6787e(T[] tArr, boolean z) {
        C6888i.m12438e(tArr, "values");
        this.f13704g = tArr;
        this.f13705h = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C5266a.m9948f0(this.f13704g, obj);
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

    public boolean isEmpty() {
        return this.f13704g.length == 0;
    }

    public Iterator<T> iterator() {
        return C5266a.m9857O2(this.f13704g);
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

    public final int size() {
        return this.f13704g.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f13704g;
        boolean z = this.f13705h;
        Class<Object[]> cls = Object[].class;
        C6888i.m12438e(tArr, "$this$copyToArrayOfAny");
        if (z && C6888i.m12434a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }

    public <T> T[] toArray(T[] tArr) {
        return C6884e.m12431b(this, tArr);
    }
}
