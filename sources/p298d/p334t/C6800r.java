package p298d.p334t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p298d.p344x.p346c.C6884e;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.r */
public final class C6800r implements Set, Serializable, C6875a {

    /* renamed from: g */
    public static final C6800r f13715g = new C6800r();

    public /* synthetic */ boolean add(Object obj) {
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
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C6797o.f13712g;
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

    public final /* bridge */ int size() {
        return 0;
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
