package p298d.p334t;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.o */
public final class C6797o implements ListIterator, C6875a {

    /* renamed from: g */
    public static final C6797o f13712g = new C6797o();

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
