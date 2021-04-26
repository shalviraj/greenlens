package p005b.p096l.p097a.p113c.p131e.p140i;

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

/* renamed from: b.l.a.c.e.i.j7 */
public class C2836j7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m */
    public static final /* synthetic */ int f4854m = 0;

    /* renamed from: g */
    public final int f4855g;

    /* renamed from: h */
    public List<C2797g7> f4856h = Collections.emptyList();

    /* renamed from: i */
    public Map<K, V> f4857i = Collections.emptyMap();

    /* renamed from: j */
    public boolean f4858j;

    /* renamed from: k */
    public volatile C2823i7 f4859k;

    /* renamed from: l */
    public Map<K, V> f4860l = Collections.emptyMap();

    public /* synthetic */ C2836j7(int i) {
        this.f4855g = i;
    }

    /* renamed from: a */
    public void mo13268a() {
        if (!this.f4858j) {
            this.f4857i = this.f4857i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4857i);
            this.f4860l = this.f4860l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4860l);
            this.f4858j = true;
        }
    }

    /* renamed from: b */
    public final int mo13420b() {
        return this.f4856h.size();
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo13421c(int i) {
        return this.f4856h.get(i);
    }

    public final void clear() {
        mo13430h();
        if (!this.f4856h.isEmpty()) {
            this.f4856h.clear();
        }
        if (!this.f4857i.isEmpty()) {
            this.f4857i.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo13428g(comparable) >= 0 || this.f4857i.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        mo13430h();
        int g = mo13428g(k);
        if (g >= 0) {
            C2797g7 g7Var = this.f4856h.get(g);
            g7Var.f4753i.mo13430h();
            V v2 = g7Var.f4752h;
            g7Var.f4752h = v;
            return v2;
        }
        mo13430h();
        if (this.f4856h.isEmpty() && !(this.f4856h instanceof ArrayList)) {
            this.f4856h = new ArrayList(this.f4855g);
        }
        int i = -(g + 1);
        if (i >= this.f4855g) {
            return mo13432i().put(k, v);
        }
        int size = this.f4856h.size();
        int i2 = this.f4855g;
        if (size == i2) {
            C2797g7 remove = this.f4856h.remove(i2 - 1);
            mo13432i().put(remove.f4751g, remove.f4752h);
        }
        this.f4856h.add(i, new C2797g7(this, k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f4859k == null) {
            this.f4859k = new C2823i7(this);
        }
        return this.f4859k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2836j7)) {
            return super.equals(obj);
        }
        C2836j7 j7Var = (C2836j7) obj;
        int size = size();
        if (size != j7Var.size()) {
            return false;
        }
        int b = mo13420b();
        if (b == j7Var.mo13420b()) {
            for (int i = 0; i < b; i++) {
                if (!mo13421c(i).equals(j7Var.mo13421c(i))) {
                    return false;
                }
            }
            if (b != size) {
                return this.f4857i.equals(j7Var.f4857i);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(j7Var.entrySet());
    }

    /* renamed from: f */
    public final V mo13427f(int i) {
        mo13430h();
        V v = this.f4856h.remove(i).f4752h;
        if (!this.f4857i.isEmpty()) {
            Iterator it = mo13432i().entrySet().iterator();
            List<C2797g7> list = this.f4856h;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2797g7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    /* renamed from: g */
    public final int mo13428g(K k) {
        int size = this.f4856h.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f4856h.get(size).f4751g);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f4856h.get(i2).f4751g);
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
        int g = mo13428g(comparable);
        if (g >= 0) {
            return this.f4856h.get(g).f4752h;
        }
        return this.f4857i.get(comparable);
    }

    /* renamed from: h */
    public final void mo13430h() {
        if (this.f4858j) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b = mo13420b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.f4856h.get(i2).hashCode();
        }
        return this.f4857i.size() > 0 ? this.f4857i.hashCode() + i : i;
    }

    /* renamed from: i */
    public final SortedMap<K, V> mo13432i() {
        mo13430h();
        if (this.f4857i.isEmpty() && !(this.f4857i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4857i = treeMap;
            this.f4860l = treeMap.descendingMap();
        }
        return (SortedMap) this.f4857i;
    }

    public final V remove(Object obj) {
        mo13430h();
        Comparable comparable = (Comparable) obj;
        int g = mo13428g(comparable);
        if (g >= 0) {
            return mo13427f(g);
        }
        if (this.f4857i.isEmpty()) {
            return null;
        }
        return this.f4857i.remove(comparable);
    }

    public final int size() {
        return this.f4857i.size() + this.f4856h.size();
    }
}
