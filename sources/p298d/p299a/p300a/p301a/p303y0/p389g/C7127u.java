package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: d.a.a.a.y0.g.u */
public class C7127u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: l */
    public static final /* synthetic */ int f14234l = 0;

    /* renamed from: g */
    public final int f14235g;

    /* renamed from: h */
    public List<C7127u<K, V>.b> f14236h = Collections.emptyList();

    /* renamed from: i */
    public Map<K, V> f14237i = Collections.emptyMap();

    /* renamed from: j */
    public boolean f14238j;

    /* renamed from: k */
    public volatile C7127u<K, V>.d f14239k;

    /* renamed from: d.a.a.a.y0.g.u$a */
    public static class C7128a {

        /* renamed from: a */
        public static final Iterator<Object> f14240a = new C7129a();

        /* renamed from: b */
        public static final Iterable<Object> f14241b = new C7130b();

        /* renamed from: d.a.a.a.y0.g.u$a$a */
        public static class C7129a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: d.a.a.a.y0.g.u$a$b */
        public static class C7130b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C7128a.f14240a;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.g.u$b */
    public class C7131b implements Comparable<C7127u<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: g */
        public final K f14242g;

        /* renamed from: h */
        public V f14243h;

        public C7131b(K k, V v) {
            this.f14242g = k;
            this.f14243h = v;
        }

        public C7131b(C7127u uVar, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            C7127u.this = uVar;
            this.f14242g = (Comparable) entry.getKey();
            this.f14243h = value;
        }

        public int compareTo(Object obj) {
            return this.f14242g.compareTo(((C7131b) obj).f14242g);
        }

        public boolean equals(Object obj) {
            boolean z;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f14242g;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f14243h;
                Object value = entry.getValue();
                if (v == null) {
                    z = value == null;
                } else {
                    z = v.equals(value);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f14242g;
        }

        public V getValue() {
            return this.f14243h;
        }

        public int hashCode() {
            K k = this.f14242g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f14243h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C7127u uVar = C7127u.this;
            int i = C7127u.f14234l;
            uVar.mo24734b();
            V v2 = this.f14243h;
            this.f14243h = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f14242g);
            String valueOf2 = String.valueOf(this.f14243h);
            return C0843a.m456q(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }
    }

    /* renamed from: d.a.a.a.y0.g.u$c */
    public class C7132c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: g */
        public int f14245g = -1;

        /* renamed from: h */
        public boolean f14246h;

        /* renamed from: i */
        public Iterator<Map.Entry<K, V>> f14247i;

        public C7132c(C7126t tVar) {
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo24758b() {
            if (this.f14247i == null) {
                this.f14247i = C7127u.this.f14237i.entrySet().iterator();
            }
            return this.f14247i;
        }

        public boolean hasNext() {
            if (this.f14245g + 1 < C7127u.this.f14236h.size() || mo24758b().hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            this.f14246h = true;
            int i = this.f14245g + 1;
            this.f14245g = i;
            return (Map.Entry) (i < C7127u.this.f14236h.size() ? C7127u.this.f14236h.get(this.f14245g) : mo24758b().next());
        }

        public void remove() {
            if (this.f14246h) {
                this.f14246h = false;
                C7127u uVar = C7127u.this;
                int i = C7127u.f14234l;
                uVar.mo24734b();
                if (this.f14245g < C7127u.this.f14236h.size()) {
                    C7127u uVar2 = C7127u.this;
                    int i2 = this.f14245g;
                    this.f14245g = i2 - 1;
                    uVar2.mo24744i(i2);
                    return;
                }
                mo24758b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: d.a.a.a.y0.g.u$d */
    public class C7133d extends AbstractSet<Map.Entry<K, V>> {
        public C7133d(C7126t tVar) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C7127u.this.mo24743h((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C7127u.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C7127u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7132c((C7126t) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C7127u.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C7127u.this.size();
        }
    }

    public C7127u(int i, C7126t tVar) {
        this.f14235g = i;
    }

    /* renamed from: a */
    public final int mo24733a(K k) {
        int size = this.f14236h.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f14236h.get(size).f14242g);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f14236h.get(i2).f14242g);
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

    /* renamed from: b */
    public final void mo24734b() {
        if (this.f14238j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo24735c(int i) {
        return this.f14236h.get(i);
    }

    public void clear() {
        mo24734b();
        if (!this.f14236h.isEmpty()) {
            this.f14236h.clear();
        }
        if (!this.f14237i.isEmpty()) {
            this.f14237i.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo24733a(comparable) >= 0 || this.f14237i.containsKey(comparable);
    }

    /* renamed from: e */
    public int mo24738e() {
        return this.f14236h.size();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f14239k == null) {
            this.f14239k = new C7133d((C7126t) null);
        }
        return this.f14239k;
    }

    /* renamed from: f */
    public Iterable<Map.Entry<K, V>> mo24740f() {
        return this.f14237i.isEmpty() ? C7128a.f14241b : this.f14237i.entrySet();
    }

    /* renamed from: g */
    public final SortedMap<K, V> mo24741g() {
        mo24734b();
        if (this.f14237i.isEmpty() && !(this.f14237i instanceof TreeMap)) {
            this.f14237i = new TreeMap();
        }
        return (SortedMap) this.f14237i;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo24733a(comparable);
        if (a >= 0) {
            return this.f14236h.get(a).f14243h;
        }
        return this.f14237i.get(comparable);
    }

    /* renamed from: h */
    public V mo24743h(K k, V v) {
        mo24734b();
        int a = mo24733a(k);
        if (a >= 0) {
            C7131b bVar = this.f14236h.get(a);
            C7127u.this.mo24734b();
            V v2 = bVar.f14243h;
            bVar.f14243h = v;
            return v2;
        }
        mo24734b();
        if (this.f14236h.isEmpty() && !(this.f14236h instanceof ArrayList)) {
            this.f14236h = new ArrayList(this.f14235g);
        }
        int i = -(a + 1);
        if (i >= this.f14235g) {
            return mo24741g().put(k, v);
        }
        int size = this.f14236h.size();
        int i2 = this.f14235g;
        if (size == i2) {
            C7131b remove = this.f14236h.remove(i2 - 1);
            mo24741g().put(remove.f14242g, remove.f14243h);
        }
        this.f14236h.add(i, new C7131b(k, v));
        return null;
    }

    /* renamed from: i */
    public final V mo24744i(int i) {
        mo24734b();
        V v = this.f14236h.remove(i).f14243h;
        if (!this.f14237i.isEmpty()) {
            Iterator it = mo24741g().entrySet().iterator();
            this.f14236h.add(new C7131b(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v;
    }

    public V remove(Object obj) {
        mo24734b();
        Comparable comparable = (Comparable) obj;
        int a = mo24733a(comparable);
        if (a >= 0) {
            return mo24744i(a);
        }
        if (this.f14237i.isEmpty()) {
            return null;
        }
        return this.f14237i.remove(comparable);
    }

    public int size() {
        return this.f14237i.size() + this.f14236h.size();
    }
}
