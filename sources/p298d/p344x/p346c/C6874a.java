package p298d.p344x.p346c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.x.c.a */
public final class C6874a<T> implements Iterator<T>, C6875a {

    /* renamed from: g */
    public int f13778g;

    /* renamed from: h */
    public final T[] f13779h;

    public C6874a(T[] tArr) {
        C6888i.m12438e(tArr, "array");
        this.f13779h = tArr;
    }

    public boolean hasNext() {
        return this.f13778g < this.f13779h.length;
    }

    public T next() {
        try {
            T[] tArr = this.f13779h;
            int i = this.f13778g;
            this.f13778g = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f13778g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
