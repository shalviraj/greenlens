package p298d.p334t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6875a;

/* renamed from: d.t.q */
public final class C6799q implements Map, Serializable, C6875a {

    /* renamed from: g */
    public static final C6799q f13714g = new C6799q();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            C6888i.m12438e((Void) obj, "value");
        }
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C6800r.f13715g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C6800r.f13715g;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C6798p.f13713g;
    }
}
