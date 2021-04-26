package p298d.p334t;

import java.util.Iterator;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.t */
public final class C6802t<T> implements Iterable<C6801s<? extends T>>, C6875a {

    /* renamed from: g */
    public final C6851a<Iterator<T>> f13718g;

    public C6802t(C6851a<? extends Iterator<? extends T>> aVar) {
        C6888i.m12438e(aVar, "iteratorFactory");
        this.f13718g = aVar;
    }

    public Iterator<C6801s<T>> iterator() {
        return new C6803u(this.f13718g.invoke());
    }
}
