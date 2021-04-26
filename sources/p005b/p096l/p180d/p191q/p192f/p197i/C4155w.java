package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b.l.d.q.f.i.w */
public final class C4155w<E> implements List<E>, RandomAccess {

    /* renamed from: g */
    public final List<E> f7712g;

    public C4155w(List<E> list) {
        this.f7712g = Collections.unmodifiableList(list);
    }

    public void add(int i, @NonNull E e) {
        this.f7712g.add(i, e);
    }

    public boolean add(@NonNull E e) {
        return this.f7712g.add(e);
    }

    public boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f7712g.addAll(i, collection);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f7712g.addAll(collection);
    }

    public void clear() {
        this.f7712g.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f7712g.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f7712g.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f7712g.equals(obj);
    }

    @NonNull
    public E get(int i) {
        return this.f7712g.get(i);
    }

    public int hashCode() {
        return this.f7712g.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f7712g.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f7712g.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f7712g.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f7712g.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f7712g.listIterator();
    }

    @NonNull
    public ListIterator<E> listIterator(int i) {
        return this.f7712g.listIterator(i);
    }

    public E remove(int i) {
        return this.f7712g.remove(i);
    }

    public boolean remove(@Nullable Object obj) {
        return this.f7712g.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f7712g.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f7712g.retainAll(collection);
    }

    @NonNull
    public E set(int i, @NonNull E e) {
        return this.f7712g.set(i, e);
    }

    public int size() {
        return this.f7712g.size();
    }

    @NonNull
    public List<E> subList(int i, int i2) {
        return this.f7712g.subList(i, i2);
    }

    @Nullable
    public Object[] toArray() {
        return this.f7712g.toArray();
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f7712g.toArray(tArr);
    }
}
