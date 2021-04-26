package p005b.p096l.p175c.p177b;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.c.b.n */
public abstract class C3789n<E> extends C3788m<E> implements List<E>, RandomAccess {

    /* renamed from: h */
    public static final C3784i0<Object> f6996h = new C3790a(C3802x.f7010k, 0);

    /* renamed from: b.l.c.b.n$a */
    public static class C3790a<E> extends C3759a<E> {

        /* renamed from: i */
        public final C3789n<E> f6997i;

        public C3790a(C3789n<E> nVar, int i) {
            super(nVar.size(), i);
            this.f6997i = nVar;
        }
    }

    /* renamed from: b.l.c.b.n$b */
    public class C3791b extends C3789n<E> {

        /* renamed from: i */
        public final transient int f6998i;

        /* renamed from: j */
        public final transient int f6999j;

        public C3791b(int i, int i2) {
            this.f6998i = i;
            this.f6999j = i2;
        }

        /* renamed from: E */
        public C3789n<E> subList(int i, int i2) {
            C1960d.m2869y(i, i2, this.f6999j);
            C3789n nVar = C3789n.this;
            int i3 = this.f6998i;
            return nVar.subList(i + i3, i2 + i3);
        }

        /* renamed from: e */
        public Object[] mo15273e() {
            return C3789n.this.mo15273e();
        }

        public E get(int i) {
            C1960d.m2857v(i, this.f6999j);
            return C3789n.this.get(i + this.f6998i);
        }

        public Iterator iterator() {
            return listIterator();
        }

        /* renamed from: l */
        public int mo15274l() {
            return C3789n.this.mo15275q() + this.f6998i + this.f6999j;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }

        /* renamed from: q */
        public int mo15275q() {
            return C3789n.this.mo15275q() + this.f6998i;
        }

        public int size() {
            return this.f6999j;
        }
    }

    /* renamed from: B */
    public static <E> C3789n<E> m7164B(E e) {
        int i = 0;
        Object[] objArr = {e};
        while (i < 1) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException(C0843a.m444e("at index ", i));
            }
        }
        return new C3802x(objArr, 1);
    }

    /* renamed from: A */
    public C3784i0<E> listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? f6996h : new C3790a(this, i);
        }
        throw new IndexOutOfBoundsException(C1960d.m2813k(i, size, "index"));
    }

    /* renamed from: E */
    public C3789n<E> subList(int i, int i2) {
        C1960d.m2869y(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C3802x.f7010k;
        }
        return new C3791b(i, i3);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: d */
    public int mo15272d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C1960d.m2725K(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object K : this) {
                    if (it.hasNext()) {
                        if (!C1960d.m2725K(K, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: w */
    public C3784i0<E> listIterator() {
        return listIterator(0);
    }
}
