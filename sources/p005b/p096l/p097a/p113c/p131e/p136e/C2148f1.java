package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.e.f1 */
public final class C2148f1 extends AbstractList<String> implements RandomAccess, C2342n {

    /* renamed from: g */
    public final C2342n f3848g;

    public C2148f1(C2342n nVar) {
        this.f3848g = nVar;
    }

    /* renamed from: N */
    public final void mo12625N(C2317lm lmVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final C2342n mo12626f() {
        return this;
    }

    /* renamed from: g */
    public final List<?> mo12627g() {
        return this.f3848g.mo12627g();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C2318m) this.f3848g).get(i);
    }

    /* renamed from: i */
    public final Object mo12629i(int i) {
        return this.f3848g.mo12629i(i);
    }

    public final Iterator<String> iterator() {
        return new C2123e1(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2098d1(this, i);
    }

    public final int size() {
        return this.f3848g.size();
    }
}
