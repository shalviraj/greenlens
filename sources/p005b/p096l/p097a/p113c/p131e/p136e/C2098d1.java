package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.ListIterator;

/* renamed from: b.l.a.c.e.e.d1 */
public final class C2098d1 implements ListIterator<String> {

    /* renamed from: g */
    public final ListIterator<String> f3701g;

    /* renamed from: h */
    public final /* synthetic */ int f3702h;

    /* renamed from: i */
    public final /* synthetic */ C2148f1 f3703i;

    public C2098d1(C2148f1 f1Var, int i) {
        this.f3703i = f1Var;
        this.f3702h = i;
        this.f3701g = f1Var.f3848g.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3701g.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f3701g.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f3701g.next();
    }

    public final int nextIndex() {
        return this.f3701g.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f3701g.previous();
    }

    public final int previousIndex() {
        return this.f3701g.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
