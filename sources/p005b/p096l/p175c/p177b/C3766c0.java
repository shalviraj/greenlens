package p005b.p096l.p175c.p177b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.c0 */
public class C3766c0<E> extends C3796r<E> implements SortedSet<E> {

    /* renamed from: g */
    public final C3762b0<E> f6950g;

    public C3766c0(C3762b0<E> b0Var) {
        this.f6950g = b0Var;
    }

    public Comparator<? super E> comparator() {
        return this.f6950g.comparator();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [b.l.c.b.b0<E>, b.l.c.b.o] */
    /* renamed from: d */
    public C3792o mo15174d() {
        return this.f6950g;
    }

    public E first() {
        C3792o.C3793a<E> C = this.f6950g.mo15150C();
        if (C != null) {
            return C.mo15201d();
        }
        throw new NoSuchElementException();
    }

    public SortedSet<E> headSet(E e) {
        return this.f6950g.mo15151O(e, C3771f.OPEN).mo15153c();
    }

    public Iterator<E> iterator() {
        return new C3794p(this.f6950g.entrySet().iterator());
    }

    public E last() {
        C3792o.C3793a<E> y = this.f6950g.mo15160y();
        if (y != null) {
            return y.mo15201d();
        }
        throw new NoSuchElementException();
    }

    public SortedSet<E> subSet(E e, E e2) {
        return this.f6950g.mo15152Q(e, C3771f.CLOSED, e2, C3771f.OPEN).mo15153c();
    }

    public SortedSet<E> tailSet(E e) {
        return this.f6950g.mo15156m(e, C3771f.CLOSED).mo15153c();
    }
}
