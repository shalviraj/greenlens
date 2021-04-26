package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.e.cm */
public abstract class C2094cm<E> extends AbstractList<E> implements C2171g<E> {

    /* renamed from: g */
    public boolean f3693g = true;

    /* renamed from: a */
    public final boolean mo12473a() {
        return this.f3693g;
    }

    public boolean add(E e) {
        mo12479d();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo12479d();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo12479d();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void mo12477b() {
        this.f3693g = false;
    }

    public void clear() {
        mo12479d();
        super.clear();
    }

    /* renamed from: d */
    public final void mo12479d() {
        if (!this.f3693g) {
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
        mo12479d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo12479d();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo12479d();
        return super.retainAll(collection);
    }
}
