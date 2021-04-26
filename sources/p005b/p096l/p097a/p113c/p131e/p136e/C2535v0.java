package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.e.v0 */
public final class C2535v0 extends AbstractSet<Map.Entry> {

    /* renamed from: g */
    public final /* synthetic */ C2559w0 f4359g;

    public /* synthetic */ C2535v0(C2559w0 w0Var) {
        this.f4359g = w0Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f4359g.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f4359g.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4359g.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C2511u0(this.f4359g);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f4359g.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f4359g.size();
    }
}
