package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Iterator;

/* renamed from: b.l.a.c.e.e.e1 */
public final class C2123e1 implements Iterator<String> {

    /* renamed from: g */
    public final Iterator<String> f3814g;

    /* renamed from: h */
    public final /* synthetic */ C2148f1 f3815h;

    public C2123e1(C2148f1 f1Var) {
        this.f3815h = f1Var;
        this.f3814g = f1Var.f3848g.iterator();
    }

    public final boolean hasNext() {
        return this.f3814g.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f3814g.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
