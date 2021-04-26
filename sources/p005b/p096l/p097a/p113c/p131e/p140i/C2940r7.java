package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.i.r7 */
public final class C2940r7 extends AbstractList<String> implements RandomAccess, C2727b6 {

    /* renamed from: g */
    public final C2727b6 f4995g;

    public C2940r7(C2727b6 b6Var) {
        this.f4995g = b6Var;
    }

    /* renamed from: G */
    public final void mo13221G(C2937r4 r4Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final C2727b6 mo13227f() {
        return this;
    }

    /* renamed from: g */
    public final List<?> mo13228g() {
        return this.f4995g.mo13228g();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C2713a6) this.f4995g).get(i);
    }

    /* renamed from: i */
    public final Object mo13231i(int i) {
        return this.f4995g.mo13231i(i);
    }

    public final Iterator<String> iterator() {
        return new C2927q7(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C2914p7(this, i);
    }

    public final int size() {
        return this.f4995g.size();
    }
}
