package p005b.p096l.p224e.p226e0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.l.e.e0.s */
public final class C4372s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: n */
    public static final Comparator<Comparable> f8088n = new C4373a();

    /* renamed from: g */
    public Comparator<? super K> f8089g;

    /* renamed from: h */
    public C4379e<K, V> f8090h;

    /* renamed from: i */
    public int f8091i = 0;

    /* renamed from: j */
    public int f8092j = 0;

    /* renamed from: k */
    public final C4379e<K, V> f8093k = new C4379e<>();

    /* renamed from: l */
    public C4372s<K, V>.b f8094l;

    /* renamed from: m */
    public C4372s<K, V>.C5302c f8095m;

    /* renamed from: b.l.e.e0.s$a */
    public class C4373a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: b.l.e.e0.s$b */
    public class C4374b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: b.l.e.e0.s$b$a */
        public class C4375a extends C4372s<K, V>.d<Map.Entry<K, V>> {
            public C4375a(C4374b bVar) {
                super();
            }

            public Object next() {
                return mo16029b();
            }
        }

        public C4374b() {
        }

        public void clear() {
            C4372s.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C4372s.this.mo16001b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4375a(this);
        }

        public boolean remove(Object obj) {
            C4379e b;
            if (!(obj instanceof Map.Entry) || (b = C4372s.this.mo16001b((Map.Entry) obj)) == null) {
                return false;
            }
            C4372s.this.mo16007f(b, true);
            return true;
        }

        public int size() {
            return C4372s.this.f8091i;
        }
    }

    /* renamed from: b.l.e.e0.s$c */
    public final class C4376c extends AbstractSet<K> {

        /* renamed from: b.l.e.e0.s$c$a */
        public class C4377a extends C4372s<K, V>.d<K> {
            public C4377a(C4376c cVar) {
                super();
            }

            public K next() {
                return mo16029b().f8107l;
            }
        }

        public C4376c() {
        }

        public void clear() {
            C4372s.this.clear();
        }

        public boolean contains(Object obj) {
            return C4372s.this.mo16002c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new C4377a(this);
        }

        public boolean remove(Object obj) {
            C4372s sVar = C4372s.this;
            C4379e c = sVar.mo16002c(obj);
            if (c != null) {
                sVar.mo16007f(c, true);
            }
            return c != null;
        }

        public int size() {
            return C4372s.this.f8091i;
        }
    }

    /* renamed from: b.l.e.e0.s$d */
    public abstract class C4378d<T> implements Iterator<T> {

        /* renamed from: g */
        public C4379e<K, V> f8098g;

        /* renamed from: h */
        public C4379e<K, V> f8099h = null;

        /* renamed from: i */
        public int f8100i;

        public C4378d() {
            this.f8098g = C4372s.this.f8093k.f8105j;
            this.f8100i = C4372s.this.f8092j;
        }

        /* renamed from: b */
        public final C4379e<K, V> mo16029b() {
            C4379e<K, V> eVar = this.f8098g;
            C4372s sVar = C4372s.this;
            if (eVar == sVar.f8093k) {
                throw new NoSuchElementException();
            } else if (sVar.f8092j == this.f8100i) {
                this.f8098g = eVar.f8105j;
                this.f8099h = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f8098g != C4372s.this.f8093k;
        }

        public final void remove() {
            C4379e<K, V> eVar = this.f8099h;
            if (eVar != null) {
                C4372s.this.mo16007f(eVar, true);
                this.f8099h = null;
                this.f8100i = C4372s.this.f8092j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.l.e.e0.s$e */
    public static final class C4379e<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        public C4379e<K, V> f8102g;

        /* renamed from: h */
        public C4379e<K, V> f8103h;

        /* renamed from: i */
        public C4379e<K, V> f8104i;

        /* renamed from: j */
        public C4379e<K, V> f8105j;

        /* renamed from: k */
        public C4379e<K, V> f8106k;

        /* renamed from: l */
        public final K f8107l;

        /* renamed from: m */
        public V f8108m;

        /* renamed from: n */
        public int f8109n;

        public C4379e() {
            this.f8107l = null;
            this.f8106k = this;
            this.f8105j = this;
        }

        public C4379e(C4379e<K, V> eVar, K k, C4379e<K, V> eVar2, C4379e<K, V> eVar3) {
            this.f8102g = eVar;
            this.f8107l = k;
            this.f8109n = 1;
            this.f8105j = eVar2;
            this.f8106k = eVar3;
            eVar3.f8105j = this;
            eVar2.f8106k = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f8107l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f8108m
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.C4372s.C4379e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f8107l;
        }

        public V getValue() {
            return this.f8108m;
        }

        public int hashCode() {
            K k = this.f8107l;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f8108m;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f8108m;
            this.f8108m = v;
            return v2;
        }

        public String toString() {
            return this.f8107l + "=" + this.f8108m;
        }
    }

    static {
        Class<C4372s> cls = C4372s.class;
    }

    public C4372s() {
        Comparator<Comparable> comparator = f8088n;
        this.f8089g = comparator;
    }

    /* renamed from: a */
    public C4379e<K, V> mo16000a(K k, boolean z) {
        int i;
        C4379e<K, V> eVar;
        Comparator<? super K> comparator = this.f8089g;
        C4379e<K, V> eVar2 = this.f8090h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f8088n ? (Comparable) k : null;
            while (true) {
                K k2 = eVar2.f8107l;
                i = comparable != null ? comparable.compareTo(k2) : comparator.compare(k, k2);
                if (i == 0) {
                    return eVar2;
                }
                C4379e<K, V> eVar3 = i < 0 ? eVar2.f8103h : eVar2.f8104i;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C4379e<K, V> eVar4 = this.f8093k;
        if (eVar2 != null) {
            eVar = new C4379e<>(eVar2, k, eVar4, eVar4.f8106k);
            if (i < 0) {
                eVar2.f8103h = eVar;
            } else {
                eVar2.f8104i = eVar;
            }
            mo16005e(eVar2, true);
        } else if (comparator != f8088n || (k instanceof Comparable)) {
            eVar = new C4379e<>(eVar2, k, eVar4, eVar4.f8106k);
            this.f8090h = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f8091i++;
        this.f8092j++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p224e.p226e0.C4372s.C4379e<K, V> mo16001b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.l.e.e0.s$e r0 = r4.mo16002c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f8108m
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.C4372s.mo16001b(java.util.Map$Entry):b.l.e.e0.s$e");
    }

    /* renamed from: c */
    public C4379e<K, V> mo16002c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo16000a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        this.f8090h = null;
        this.f8091i = 0;
        this.f8092j++;
        C4379e<K, V> eVar = this.f8093k;
        eVar.f8106k = eVar;
        eVar.f8105j = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo16002c(obj) != null;
    }

    /* renamed from: e */
    public final void mo16005e(C4379e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C4379e<K, V> eVar2 = eVar.f8103h;
            C4379e<K, V> eVar3 = eVar.f8104i;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f8109n : 0;
            int i3 = eVar3 != null ? eVar3.f8109n : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C4379e<K, V> eVar4 = eVar3.f8103h;
                C4379e<K, V> eVar5 = eVar3.f8104i;
                int i5 = eVar5 != null ? eVar5.f8109n : 0;
                if (eVar4 != null) {
                    i = eVar4.f8109n;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo16011i(eVar3);
                }
                mo16010h(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C4379e<K, V> eVar6 = eVar2.f8103h;
                C4379e<K, V> eVar7 = eVar2.f8104i;
                int i7 = eVar7 != null ? eVar7.f8109n : 0;
                if (eVar6 != null) {
                    i = eVar6.f8109n;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo16010h(eVar2);
                }
                mo16011i(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f8109n = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f8109n = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f8102g;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C4372s<K, V>.b bVar = this.f8094l;
        if (bVar != null) {
            return bVar;
        }
        C4372s<K, V>.b bVar2 = new C4374b();
        this.f8094l = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public void mo16007f(C4379e<K, V> eVar, boolean z) {
        C4379e<K, V> eVar2;
        int i;
        C4379e<K, V> eVar3;
        if (z) {
            C4379e<K, V> eVar4 = eVar.f8106k;
            eVar4.f8105j = eVar.f8105j;
            eVar.f8105j.f8106k = eVar4;
        }
        C4379e<K, V> eVar5 = eVar.f8103h;
        C4379e<K, V> eVar6 = eVar.f8104i;
        C4379e<K, V> eVar7 = eVar.f8102g;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                mo16008g(eVar, eVar5);
                eVar.f8103h = null;
            } else if (eVar6 != null) {
                mo16008g(eVar, eVar6);
                eVar.f8104i = null;
            } else {
                mo16008g(eVar, (C4379e<K, V>) null);
            }
            mo16005e(eVar7, false);
            this.f8091i--;
            this.f8092j++;
            return;
        }
        if (eVar5.f8109n > eVar6.f8109n) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f8104i;
            } while (eVar5 != null);
        } else {
            do {
                C4379e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.f8103h;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        mo16007f(eVar2, false);
        C4379e<K, V> eVar9 = eVar.f8103h;
        if (eVar9 != null) {
            i = eVar9.f8109n;
            eVar2.f8103h = eVar9;
            eVar9.f8102g = eVar2;
            eVar.f8103h = null;
        } else {
            i = 0;
        }
        C4379e<K, V> eVar10 = eVar.f8104i;
        if (eVar10 != null) {
            i2 = eVar10.f8109n;
            eVar2.f8104i = eVar10;
            eVar10.f8102g = eVar2;
            eVar.f8104i = null;
        }
        eVar2.f8109n = Math.max(i, i2) + 1;
        mo16008g(eVar, eVar2);
    }

    /* renamed from: g */
    public final void mo16008g(C4379e<K, V> eVar, C4379e<K, V> eVar2) {
        C4379e<K, V> eVar3 = eVar.f8102g;
        eVar.f8102g = null;
        if (eVar2 != null) {
            eVar2.f8102g = eVar3;
        }
        if (eVar3 == null) {
            this.f8090h = eVar2;
        } else if (eVar3.f8103h == eVar) {
            eVar3.f8103h = eVar2;
        } else {
            eVar3.f8104i = eVar2;
        }
    }

    public V get(Object obj) {
        C4379e c = mo16002c(obj);
        if (c != null) {
            return c.f8108m;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo16010h(C4379e<K, V> eVar) {
        C4379e<K, V> eVar2 = eVar.f8103h;
        C4379e<K, V> eVar3 = eVar.f8104i;
        C4379e<K, V> eVar4 = eVar3.f8103h;
        C4379e<K, V> eVar5 = eVar3.f8104i;
        eVar.f8104i = eVar4;
        if (eVar4 != null) {
            eVar4.f8102g = eVar;
        }
        mo16008g(eVar, eVar3);
        eVar3.f8103h = eVar;
        eVar.f8102g = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f8109n : 0, eVar4 != null ? eVar4.f8109n : 0) + 1;
        eVar.f8109n = max;
        if (eVar5 != null) {
            i = eVar5.f8109n;
        }
        eVar3.f8109n = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    public final void mo16011i(C4379e<K, V> eVar) {
        C4379e<K, V> eVar2 = eVar.f8103h;
        C4379e<K, V> eVar3 = eVar.f8104i;
        C4379e<K, V> eVar4 = eVar2.f8103h;
        C4379e<K, V> eVar5 = eVar2.f8104i;
        eVar.f8103h = eVar5;
        if (eVar5 != null) {
            eVar5.f8102g = eVar;
        }
        mo16008g(eVar, eVar2);
        eVar2.f8104i = eVar;
        eVar.f8102g = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f8109n : 0, eVar5 != null ? eVar5.f8109n : 0) + 1;
        eVar.f8109n = max;
        if (eVar4 != null) {
            i = eVar4.f8109n;
        }
        eVar2.f8109n = Math.max(max, i) + 1;
    }

    public Set<K> keySet() {
        C4372s<K, V>.C5302c cVar = this.f8095m;
        if (cVar != null) {
            return cVar;
        }
        C4372s<K, V>.C5302c cVar2 = new C4376c();
        this.f8095m = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C4379e a = mo16000a(k, true);
        V v2 = a.f8108m;
        a.f8108m = v;
        return v2;
    }

    public V remove(Object obj) {
        C4379e c = mo16002c(obj);
        if (c != null) {
            mo16007f(c, true);
        }
        if (c != null) {
            return c.f8108m;
        }
        return null;
    }

    public int size() {
        return this.f8091i;
    }
}
