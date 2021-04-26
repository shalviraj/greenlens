package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: b.l.c.b.m */
public abstract class C3788m<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: g */
    public static final Object[] f6995g = new Object[0];

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public abstract int mo15272d(Object[] objArr, int i);

    /* renamed from: e */
    public abstract Object[] mo15273e();

    /* renamed from: l */
    public abstract int mo15274l();

    /* renamed from: q */
    public abstract int mo15275q();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f6995g);
    }

    public final <T> T[] toArray(T[] tArr) {
        Objects.requireNonNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] e = mo15273e();
            if (e != null) {
                return Arrays.copyOfRange(e, mo15275q(), mo15274l(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo15272d(tArr, 0);
        return tArr;
    }
}
