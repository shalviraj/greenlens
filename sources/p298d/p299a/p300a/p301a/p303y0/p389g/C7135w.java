package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: d.a.a.a.y0.g.w */
public class C7135w extends AbstractList<String> implements RandomAccess, C7113n {

    /* renamed from: g */
    public final C7113n f14250g;

    /* renamed from: d.a.a.a.y0.g.w$a */
    public class C7136a implements ListIterator<String> {

        /* renamed from: g */
        public ListIterator<String> f14251g;

        /* renamed from: h */
        public final /* synthetic */ int f14252h;

        public C7136a(int i) {
            this.f14252h = i;
            this.f14251g = C7135w.this.f14250g.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f14251g.hasNext();
        }

        public boolean hasPrevious() {
            return this.f14251g.hasPrevious();
        }

        public Object next() {
            return this.f14251g.next();
        }

        public int nextIndex() {
            return this.f14251g.nextIndex();
        }

        public Object previous() {
            return this.f14251g.previous();
        }

        public int previousIndex() {
            return this.f14251g.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d.a.a.a.y0.g.w$b */
    public class C7137b implements Iterator<String> {

        /* renamed from: g */
        public Iterator<String> f14254g;

        public C7137b() {
            this.f14254g = C7135w.this.f14250g.iterator();
        }

        public boolean hasNext() {
            return this.f14254g.hasNext();
        }

        public Object next() {
            return this.f14254g.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7135w(C7113n nVar) {
        this.f14250g = nVar;
    }

    /* renamed from: L */
    public List<?> mo24703L() {
        return this.f14250g.mo24703L();
    }

    /* renamed from: P */
    public void mo24704P(C7085c cVar) {
        throw new UnsupportedOperationException();
    }

    public Object get(int i) {
        return (String) this.f14250g.get(i);
    }

    public Iterator<String> iterator() {
        return new C7137b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C7136a(i);
    }

    public int size() {
        return this.f14250g.size();
    }

    /* renamed from: t */
    public C7085c mo24713t(int i) {
        return this.f14250g.mo24713t(i);
    }

    /* renamed from: z */
    public C7113n mo24714z() {
        return this;
    }
}
