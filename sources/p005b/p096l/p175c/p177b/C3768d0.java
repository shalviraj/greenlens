package p005b.p096l.p175c.p177b;

import java.util.Iterator;
import java.util.NavigableSet;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.c.b.d0 */
public class C3768d0<E> extends C3766c0<E> implements NavigableSet<E> {
    public C3768d0(C3762b0<E> b0Var) {
        super(b0Var);
    }

    public E ceiling(E e) {
        return C1960d.m2785d(this.f6950g.mo15156m(e, C3771f.CLOSED).mo15150C());
    }

    public Iterator<E> descendingIterator() {
        return ((C3766c0) descendingSet()).iterator();
    }

    public NavigableSet<E> descendingSet() {
        return new C3768d0(this.f6950g.mo15158s());
    }

    public E floor(E e) {
        return C1960d.m2785d(this.f6950g.mo15151O(e, C3771f.CLOSED).mo15160y());
    }

    public NavigableSet<E> headSet(E e, boolean z) {
        return new C3768d0(this.f6950g.mo15151O(e, C3771f.m7098d(z)));
    }

    public E higher(E e) {
        return C1960d.m2785d(this.f6950g.mo15156m(e, C3771f.OPEN).mo15150C());
    }

    public E lower(E e) {
        return C1960d.m2785d(this.f6950g.mo15151O(e, C3771f.OPEN).mo15160y());
    }

    public E pollFirst() {
        return C1960d.m2785d(this.f6950g.mo15159x());
    }

    public E pollLast() {
        return C1960d.m2785d(this.f6950g.mo15157p());
    }

    public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return new C3768d0(this.f6950g.mo15152Q(e, C3771f.m7098d(z), e2, C3771f.m7098d(z2)));
    }

    public NavigableSet<E> tailSet(E e, boolean z) {
        return new C3768d0(this.f6950g.mo15156m(e, C3771f.m7098d(z)));
    }
}
