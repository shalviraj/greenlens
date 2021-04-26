package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.l.a.c.e.e.w */
public final class C2558w<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: h */
    public static final C2558w f4383h;

    /* renamed from: g */
    public boolean f4384g = true;

    static {
        C2558w wVar = new C2558w();
        f4383h = wVar;
        wVar.f4384g = false;
    }

    public C2558w() {
    }

    public C2558w(Map<K, V> map) {
        super(map);
    }

    /* renamed from: b */
    public static int m4328b(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = C2196h.f3910a;
            int i = r0;
            for (byte b : (byte[]) obj) {
                i = (i * 31) + b;
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C2121e)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final C2558w<K, V> mo13070a() {
        return isEmpty() ? new C2558w<>() : new C2558w<>(this);
    }

    /* renamed from: c */
    public final void mo13071c() {
        if (!this.f4384g) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo13071c();
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
            i += m4328b(entry.getValue()) ^ m4328b(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        mo13071c();
        Charset charset = C2196h.f3910a;
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        mo13071c();
        for (Object next : map.keySet()) {
            Charset charset = C2196h.f3910a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        mo13071c();
        return super.remove(obj);
    }
}
