package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.i.i4 */
public abstract class C2820i4<E> extends AbstractList<E> implements C2977u5<E> {

    /* renamed from: g */
    public boolean f4835g = true;

    /* renamed from: a */
    public final boolean mo13385a() {
        return this.f4835g;
    }

    public boolean add(E e) {
        mo13387d();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo13387d();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo13387d();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo13386b() {
        this.f4835g = false;
    }

    public void clear() {
        mo13387d();
        super.clear();
    }

    /* renamed from: d */
    public final void mo13387d() {
        if (!this.f4835g) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract E remove(int i);

    public final boolean remove(Object obj) {
        mo13387d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo13387d();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo13387d();
        return super.retainAll(collection);
    }
}
