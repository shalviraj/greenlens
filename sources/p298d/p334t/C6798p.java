package p298d.p334t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6884e;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.p */
public final class C6798p implements List, Serializable, RandomAccess, C6875a {

    /* renamed from: g */
    public static final C6798p f13713g = new C6798p();

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            C6888i.m12438e((Void) obj, "element");
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C6888i.m12438e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            C6888i.m12438e((Void) obj, "element");
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C6797o.f13712g;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            C6888i.m12438e((Void) obj, "element");
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C6797o.f13712g;
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C6797o.f13712g;
        }
        throw new IndexOutOfBoundsException(C0843a.m444e("Index: ", i));
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C0843a.m446g("fromIndex: ", i, ", toIndex: ", i2));
    }

    public Object[] toArray() {
        return C6884e.m12430a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C6884e.m12431b(this, tArr);
    }

    public String toString() {
        return "[]";
    }
}
