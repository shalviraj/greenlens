package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: b.l.a.c.e.i.i7 */
public final class C2823i7 extends AbstractSet<Map.Entry> {

    /* renamed from: g */
    public final /* synthetic */ C2836j7 f4841g;

    public /* synthetic */ C2823i7(C2836j7 j7Var) {
        this.f4841g = j7Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f4841g.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f4841g.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4841g.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator<Map.Entry> iterator() {
        return new C2810h7(this.f4841g);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f4841g.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f4841g.size();
    }
}
