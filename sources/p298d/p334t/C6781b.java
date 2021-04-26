package p298d.p334t;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.b */
public abstract class C6781b<E> extends C6779a<E> implements List<E>, C6875a {

    /* renamed from: d.t.b$a */
    public class C6782a implements Iterator<E>, C6875a {

        /* renamed from: g */
        public int f13698g;

        public C6782a() {
        }

        public boolean hasNext() {
            return this.f13698g < C6781b.this.mo23951e();
        }

        public E next() {
            if (hasNext()) {
                C6781b bVar = C6781b.this;
                int i = this.f13698g;
                this.f13698g = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: d.t.b$b */
    public class C6783b extends C6781b<E>.C0000a implements ListIterator<E>, C6875a {
        public C6783b(int i) {
            super();
            int e = C6781b.this.mo23951e();
            if (i < 0 || i > e) {
                throw new IndexOutOfBoundsException(C0843a.m446g("index: ", i, ", size: ", e));
            }
            this.f13698g = i;
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.f13698g > 0;
        }

        public int nextIndex() {
            return this.f13698g;
        }

        public E previous() {
            if (hasPrevious()) {
                C6781b bVar = C6781b.this;
                int i = this.f13698g - 1;
                this.f13698g = i;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f13698g - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: d.t.b$c */
    public static final class C6784c<E> extends C6781b<E> implements RandomAccess {

        /* renamed from: g */
        public int f13701g;

        /* renamed from: h */
        public final C6781b<E> f13702h;

        /* renamed from: i */
        public final int f13703i;

        public C6784c(C6781b<? extends E> bVar, int i, int i2) {
            C6888i.m12438e(bVar, "list");
            this.f13702h = bVar;
            this.f13703i = i;
            int e = bVar.mo23951e();
            if (i < 0 || i2 > e) {
                StringBuilder x = C0843a.m463x("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                x.append(e);
                throw new IndexOutOfBoundsException(x.toString());
            } else if (i <= i2) {
                this.f13701g = i2 - i;
            } else {
                throw new IllegalArgumentException(C0843a.m446g("fromIndex: ", i, " > toIndex: ", i2));
            }
        }

        /* renamed from: e */
        public int mo23951e() {
            return this.f13701g;
        }

        public E get(int i) {
            int i2 = this.f13701g;
            if (i >= 0 && i < i2) {
                return this.f13702h.get(this.f13703i + i);
            }
            throw new IndexOutOfBoundsException(C0843a.m446g("index: ", i, ", size: ", i2));
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C6888i.m12438e(this, "c");
        C6888i.m12438e(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object a : this) {
                if (!C6888i.m12434a(a, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    public int hashCode() {
        C6888i.m12438e(this, "c");
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C6888i.m12434a(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C6782a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C6888i.m12434a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C6783b(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C6783b(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C6784c(this, i, i2);
    }
}
