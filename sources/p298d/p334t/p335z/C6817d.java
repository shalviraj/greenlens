package p298d.p334t.p335z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p298d.p334t.p335z.C6808a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.t.z.d */
public final class C6817d<V> extends C6817d<V> implements Collection<V>, Object {

    /* renamed from: g */
    public final C6808a<?, V> f13742g;

    public C6817d(C6808a<?, V> aVar) {
        C6888i.m12438e(aVar, "backing");
        this.f13742g = aVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        C6888i.m12438e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f13742g.clear();
    }

    public boolean contains(Object obj) {
        return this.f13742g.mo24099i(obj) >= 0;
    }

    public boolean isEmpty() {
        return this.f13742g.isEmpty();
    }

    public Iterator<V> iterator() {
        C6808a<?, V> aVar = this.f13742g;
        Objects.requireNonNull(aVar);
        return new C6808a.C6814f(aVar);
    }

    public boolean remove(Object obj) {
        C6808a<?, V> aVar = this.f13742g;
        aVar.mo24087c();
        int i = aVar.mo24099i(obj);
        if (i < 0) {
            return false;
        }
        aVar.mo24104m(i);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, d.t.z.d] */
    public boolean removeAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13742g.mo24087c();
        return C6817d.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, d.t.z.d] */
    public boolean retainAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13742g.mo24087c();
        return C6817d.super.retainAll(collection);
    }

    public final int size() {
        return this.f13742g.f13724h;
    }
}
