package p005b.p096l.p164b.p165a.p173d;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b.l.b.a.d.x */
public final class C3747x implements Iterable<T> {

    /* renamed from: g */
    public final /* synthetic */ Object f6928g;

    /* renamed from: b.l.b.a.d.x$a */
    public class C3748a implements Iterator<T> {

        /* renamed from: g */
        public final int f6929g;

        /* renamed from: h */
        public int f6930h = 0;

        public C3748a() {
            this.f6929g = Array.getLength(C3747x.this.f6928g);
        }

        public boolean hasNext() {
            return this.f6930h < this.f6929g;
        }

        public T next() {
            if (hasNext()) {
                Object obj = C3747x.this.f6928g;
                int i = this.f6930h;
                this.f6930h = i + 1;
                return Array.get(obj, i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C3747x(Object obj) {
        this.f6928g = obj;
    }

    public Iterator<T> iterator() {
        return new C3748a();
    }
}
