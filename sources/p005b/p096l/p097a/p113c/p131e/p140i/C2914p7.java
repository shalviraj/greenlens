package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.ListIterator;

/* renamed from: b.l.a.c.e.i.p7 */
public final class C2914p7 implements ListIterator<String> {

    /* renamed from: g */
    public final ListIterator<String> f4941g;

    /* renamed from: h */
    public final /* synthetic */ int f4942h;

    /* renamed from: i */
    public final /* synthetic */ C2940r7 f4943i;

    public C2914p7(C2940r7 r7Var, int i) {
        this.f4943i = r7Var;
        this.f4942h = i;
        this.f4941g = r7Var.f4995g.listIterator(i);
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f4941g.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f4941g.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.f4941g.next();
    }

    public final int nextIndex() {
        return this.f4941g.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return this.f4941g.previous();
    }

    public final int previousIndex() {
        return this.f4941g.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
