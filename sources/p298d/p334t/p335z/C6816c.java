package p298d.p334t.p335z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p298d.p334t.C6786d;
import p298d.p334t.p335z.C6808a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6878d;

/* renamed from: d.t.z.c */
public final class C6816c<E> extends C6786d<E> implements Set<E>, C6878d {

    /* renamed from: g */
    public final C6808a<E, ?> f13741g;

    public C6816c(C6808a<E, ?> aVar) {
        C6888i.m12438e(aVar, "backing");
        this.f13741g = aVar;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        C6888i.m12438e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f13741g.clear();
    }

    public boolean contains(Object obj) {
        return this.f13741g.mo24097h(obj) >= 0;
    }

    /* renamed from: e */
    public int mo23983e() {
        return this.f13741g.f13724h;
    }

    public boolean isEmpty() {
        return this.f13741g.isEmpty();
    }

    public Iterator<E> iterator() {
        C6808a<E, ?> aVar = this.f13741g;
        Objects.requireNonNull(aVar);
        return new C6808a.C6813e(aVar);
    }

    public boolean remove(Object obj) {
        C6808a<E, ?> aVar = this.f13741g;
        aVar.mo24087c();
        int h = aVar.mo24097h(obj);
        if (h < 0) {
            h = -1;
        } else {
            aVar.mo24104m(h);
        }
        return h >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13741g.mo24087c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13741g.mo24087c();
        return super.retainAll(collection);
    }
}
