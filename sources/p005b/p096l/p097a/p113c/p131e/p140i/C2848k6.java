package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.l.a.c.e.i.k6 */
public final class C2848k6<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: h */
    public static final C2848k6 f4871h;

    /* renamed from: g */
    public boolean f4872g = true;

    static {
        C2848k6 k6Var = new C2848k6();
        f4871h = k6Var;
        k6Var.f4872g = false;
    }

    public C2848k6() {
    }

    public C2848k6(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    public static int m4897a(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = C2990v5.f5088a;
            int i = r0;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C2925q5)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo13447b() {
        if (!this.f4872g) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo13447b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m4897a(entry.getValue()) ^ m4897a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        mo13447b();
        Charset charset = C2990v5.f5088a;
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo13447b();
        for (Object next : map.keySet()) {
            Charset charset = C2990v5.f5088a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo13447b();
        return super.remove(obj);
    }
}
