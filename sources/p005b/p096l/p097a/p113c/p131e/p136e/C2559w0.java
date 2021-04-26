package p005b.p096l.p097a.p113c.p131e.p136e;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: b.l.a.c.e.e.w0 */
public class C2559w0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m */
    public static final /* synthetic */ int f4385m = 0;

    /* renamed from: g */
    public final int f4386g;

    /* renamed from: h */
    public List<C2487t0> f4387h = Collections.emptyList();

    /* renamed from: i */
    public Map<K, V> f4388i = Collections.emptyMap();

    /* renamed from: j */
    public boolean f4389j;

    /* renamed from: k */
    public volatile C2535v0 f4390k;

    /* renamed from: l */
    public Map<K, V> f4391l = Collections.emptyMap();

    public /* synthetic */ C2559w0(int i) {
        this.f4386g = i;
    }

    /* renamed from: a */
    public void mo12908a() {
        if (!this.f4389j) {
            this.f4388i = this.f4388i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4388i);
            this.f4391l = this.f4391l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4391l);
            this.f4389j = true;
        }
    }

    /* renamed from: b */
    public final int mo13079b() {
        return this.f4387h.size();
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo13080c(int i) {
        return this.f4387h.get(i);
    }

    public final void clear() {
        mo13089h();
        if (!this.f4387h.isEmpty()) {
            this.f4387h.clear();
        }
        if (!this.f4388i.isEmpty()) {
            this.f4388i.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo13087g(comparable) >= 0 || this.f4388i.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        mo13089h();
        int g = mo13087g(k);
        if (g >= 0) {
            C2487t0 t0Var = this.f4387h.get(g);
            t0Var.f4302i.mo13089h();
            V v2 = t0Var.f4301h;
            t0Var.f4301h = v;
            return v2;
        }
        mo13089h();
        if (this.f4387h.isEmpty() && !(this.f4387h instanceof ArrayList)) {
            this.f4387h = new ArrayList(this.f4386g);
        }
        int i = -(g + 1);
        if (i >= this.f4386g) {
            return mo13091i().put(k, v);
        }
        int size = this.f4387h.size();
        int i2 = this.f4386g;
        if (size == i2) {
            C2487t0 remove = this.f4387h.remove(i2 - 1);
            mo13091i().put(remove.f4300g, remove.f4301h);
        }
        this.f4387h.add(i, new C2487t0(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f4390k == null) {
            this.f4390k = new C2535v0(this);
        }
        return this.f4390k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2559w0)) {
            return super.equals(obj);
        }
        C2559w0 w0Var = (C2559w0) obj;
        int size = size();
        if (size != w0Var.size()) {
            return false;
        }
        int b = mo13079b();
        if (b == w0Var.mo13079b()) {
            for (int i = 0; i < b; i++) {
                if (!mo13080c(i).equals(w0Var.mo13080c(i))) {
                    return false;
                }
            }
            if (b != size) {
                return this.f4388i.equals(w0Var.f4388i);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(w0Var.entrySet());
    }

    /* renamed from: f */
    public final V mo13086f(int i) {
        mo13089h();
        V v = this.f4387h.remove(i).f4301h;
        if (!this.f4388i.isEmpty()) {
            Iterator it = mo13091i().entrySet().iterator();
            List<C2487t0> list = this.f4387h;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2487t0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: g */
    public final int mo13087g(K k) {
        int size = this.f4387h.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f4387h.get(size).f4300g);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f4387h.get(i2).f4300g);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g = mo13087g(comparable);
        if (g >= 0) {
            return this.f4387h.get(g).f4301h;
        }
        return this.f4388i.get(comparable);
    }

    /* renamed from: h */
    public final void mo13089h() {
        if (this.f4389j) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b = mo13079b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f4387h.get(i2).hashCode();
        }
        return this.f4388i.size() > 0 ? this.f4388i.hashCode() + i : i;
    }

    /* renamed from: i */
    public final SortedMap<K, V> mo13091i() {
        mo13089h();
        if (this.f4388i.isEmpty() && !(this.f4388i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4388i = treeMap;
            this.f4391l = treeMap.descendingMap();
        }
        return (SortedMap) this.f4388i;
    }

    public final V remove(Object obj) {
        mo13089h();
        Comparable comparable = (Comparable) obj;
        int g = mo13087g(comparable);
        if (g >= 0) {
            return mo13086f(g);
        }
        if (this.f4388i.isEmpty()) {
            return null;
        }
        return this.f4388i.remove(comparable);
    }

    public final int size() {
        return this.f4388i.size() + this.f4387h.size();
    }
}
