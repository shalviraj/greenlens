package p298d.p299a.p300a.p301a.p303y0.p412n;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.y0.n.l */
public class C7639l<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: g */
    public int f15137g;

    /* renamed from: h */
    public Object f15138h;

    /* renamed from: d.a.a.a.y0.n.l$b */
    public static class C7641b<T> implements Iterator<T> {

        /* renamed from: g */
        public static final C7641b f15139g = new C7641b();

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d.a.a.a.y0.n.l$c */
    public class C7642c extends C7643d<E> {

        /* renamed from: h */
        public final int f15140h;

        public C7642c() {
            super((C7640a) null);
            this.f15140h = C7639l.this.modCount;
        }

        /* renamed from: b */
        public void mo25217b() {
            if (C7639l.this.modCount != this.f15140h) {
                StringBuilder u = C0843a.m460u("ModCount: ");
                u.append(C7639l.this.modCount);
                u.append("; expected: ");
                u.append(this.f15140h);
                throw new ConcurrentModificationException(u.toString());
            }
        }

        public void remove() {
            mo25217b();
            C7639l.this.clear();
        }
    }

    /* renamed from: d.a.a.a.y0.n.l$d */
    public static abstract class C7643d<T> implements Iterator<T> {

        /* renamed from: g */
        public boolean f15142g;

        public C7643d(C7640a aVar) {
        }

        /* renamed from: b */
        public abstract void mo25217b();

        public final boolean hasNext() {
            return !this.f15142g;
        }

        public final T next() {
            if (!this.f15142g) {
                this.f15142g = true;
                mo25217b();
                return C7639l.this.f15138h;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m13867d(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f15137g)) {
            StringBuilder v = C0843a.m461v("Index: ", i, ", Size: ");
            v.append(this.f15137g);
            throw new IndexOutOfBoundsException(v.toString());
        }
        if (i2 == 0) {
            this.f15138h = e;
        } else if (i2 == 1 && i == 0) {
            this.f15138h = new Object[]{e, this.f15138h};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            if (i2 == 1) {
                objArr[0] = this.f15138h;
            } else {
                Object[] objArr2 = (Object[]) this.f15138h;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f15137g - i);
            }
            objArr[i] = e;
            this.f15138h = objArr;
        }
        this.f15137g++;
        this.modCount++;
    }

    public boolean add(E e) {
        int i = this.f15137g;
        if (i == 0) {
            this.f15138h = e;
        } else if (i == 1) {
            this.f15138h = new Object[]{this.f15138h, e};
        } else {
            Object[] objArr = (Object[]) this.f15138h;
            int length = objArr.length;
            if (i >= length) {
                int H = C0843a.m432H(length, 3, 2, 1);
                int i2 = i + 1;
                if (H < i2) {
                    H = i2;
                }
                Object[] objArr2 = new Object[H];
                this.f15138h = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f15137g] = e;
        }
        this.f15137g++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f15138h = null;
        this.f15137g = 0;
        this.modCount++;
    }

    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f15137g)) {
            return i2 == 1 ? this.f15138h : ((Object[]) this.f15138h)[i];
        }
        StringBuilder v = C0843a.m461v("Index: ", i, ", Size: ");
        v.append(this.f15137g);
        throw new IndexOutOfBoundsException(v.toString());
    }

    public Iterator<E> iterator() {
        int i = this.f15137g;
        if (i == 0) {
            return C7641b.f15139g;
        }
        if (i == 1) {
            return new C7642c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m13867d(3);
        throw null;
    }

    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f15137g)) {
            StringBuilder v = C0843a.m461v("Index: ", i, ", Size: ");
            v.append(this.f15137g);
            throw new IndexOutOfBoundsException(v.toString());
        }
        if (i2 == 1) {
            e = this.f15138h;
            this.f15138h = null;
        } else {
            E[] eArr = (Object[]) this.f15138h;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f15138h = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f15137g - 1] = null;
            }
            e = e2;
        }
        this.f15137g--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f15137g)) {
            StringBuilder v = C0843a.m461v("Index: ", i, ", Size: ");
            v.append(this.f15137g);
            throw new IndexOutOfBoundsException(v.toString());
        } else if (i2 == 1) {
            E e2 = this.f15138h;
            this.f15138h = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f15138h;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public int size() {
        return this.f15137g;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = this.f15137g;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f15138h;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.f15138h;
                    return tArr2;
                }
            } else if (length < i) {
                T[] copyOf = Arrays.copyOf((Object[]) this.f15138h, i, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                m13867d(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f15138h, 0, tArr, 0, i);
            }
            int i2 = this.f15137g;
            if (length > i2) {
                tArr[i2] = null;
            }
            return tArr;
        }
        m13867d(4);
        throw null;
    }
}
