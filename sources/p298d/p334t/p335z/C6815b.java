package p298d.p334t.p335z;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p298d.p334t.p335z.C6808a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.t.z.b */
public final class C6815b<K, V> extends C6815b<Map.Entry<K, V>, K, V> {

    /* renamed from: g */
    public final C6808a<K, V> f13740g;

    public C6815b(C6808a<K, V> aVar) {
        C6888i.m12438e(aVar, "backing");
        this.f13740g = aVar;
    }

    public boolean add(Object obj) {
        C6888i.m12438e((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C6888i.m12438e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f13740g.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C6888i.m12438e(entry, "element");
        C6888i.m12438e(entry, "element");
        return this.f13740g.mo24094f(entry);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        return this.f13740g.mo24091e(collection);
    }

    /* renamed from: e */
    public int mo24128e() {
        return this.f13740g.f13724h;
    }

    public boolean isEmpty() {
        return this.f13740g.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C6808a<K, V> aVar = this.f13740g;
        Objects.requireNonNull(aVar);
        return new C6808a.C6810b(aVar);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C6888i.m12438e(entry, "element");
        C6808a<K, V> aVar = this.f13740g;
        Objects.requireNonNull(aVar);
        C6888i.m12438e(entry, "entry");
        aVar.mo24087c();
        int h = aVar.mo24097h(entry.getKey());
        if (h < 0) {
            return false;
        }
        V[] vArr = aVar.f13730n;
        C6888i.m12436c(vArr);
        if (!C6888i.m12434a(vArr[h], entry.getValue())) {
            return false;
        }
        aVar.mo24104m(h);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractSet, d.t.z.b] */
    public boolean removeAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13740g.mo24087c();
        return C6815b.super.removeAll(collection);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractSet, d.t.z.b] */
    public boolean retainAll(Collection<? extends Object> collection) {
        C6888i.m12438e(collection, "elements");
        this.f13740g.mo24087c();
        return C6815b.super.retainAll(collection);
    }
}
