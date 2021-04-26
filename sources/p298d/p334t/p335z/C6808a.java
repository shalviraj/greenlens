package p298d.p334t.p335z;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.p347a0.C6877c;

/* renamed from: d.t.z.a */
public final class C6808a<K, V> implements Map<K, V>, C6877c {

    /* renamed from: s */
    public static final C6809a f13722s = new C6809a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public int f13723g;

    /* renamed from: h */
    public int f13724h;

    /* renamed from: i */
    public C6816c<K> f13725i;

    /* renamed from: j */
    public C6817d<V> f13726j;

    /* renamed from: k */
    public C6815b<K, V> f13727k;

    /* renamed from: l */
    public boolean f13728l;

    /* renamed from: m */
    public K[] f13729m;

    /* renamed from: n */
    public V[] f13730n = null;

    /* renamed from: o */
    public int[] f13731o = new int[8];

    /* renamed from: p */
    public int[] f13732p;

    /* renamed from: q */
    public int f13733q;

    /* renamed from: r */
    public int f13734r;

    /* renamed from: d.t.z.a$a */
    public static final class C6809a {
        public C6809a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: d.t.z.a$b */
    public static final class C6810b<K, V> extends C6812d<K, V> implements Iterator<Map.Entry<K, V>>, Object {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6810b(C6808a<K, V> aVar) {
            super(aVar);
            C6888i.m12438e(aVar, "map");
        }

        public Object next() {
            int i = this.f13737g;
            C6808a<K, V> aVar = this.f13739i;
            if (i < aVar.f13734r) {
                this.f13737g = i + 1;
                this.f13738h = i;
                C6811c cVar = new C6811c(aVar, i);
                mo24118b();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d.t.z.a$c */
    public static final class C6811c<K, V> implements Map.Entry<K, V>, Object {

        /* renamed from: g */
        public final C6808a<K, V> f13735g;

        /* renamed from: h */
        public final int f13736h;

        public C6811c(C6808a<K, V> aVar, int i) {
            C6888i.m12438e(aVar, "map");
            this.f13735g = aVar;
            this.f13736h = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C6888i.m12434a(entry.getKey(), getKey()) && C6888i.m12434a(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f13735g.f13729m[this.f13736h];
        }

        public V getValue() {
            V[] vArr = this.f13735g.f13730n;
            C6888i.m12436c(vArr);
            return vArr[this.f13736h];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f13735g.mo24087c();
            V[] b = this.f13735g.mo24086b();
            int i = this.f13736h;
            V v2 = b[i];
            b[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: d.t.z.a$d */
    public static class C6812d<K, V> {

        /* renamed from: g */
        public int f13737g;

        /* renamed from: h */
        public int f13738h = -1;

        /* renamed from: i */
        public final C6808a<K, V> f13739i;

        public C6812d(C6808a<K, V> aVar) {
            C6888i.m12438e(aVar, "map");
            this.f13739i = aVar;
            mo24118b();
        }

        /* renamed from: b */
        public final void mo24118b() {
            while (true) {
                int i = this.f13737g;
                C6808a<K, V> aVar = this.f13739i;
                if (i < aVar.f13734r && aVar.f13731o[i] < 0) {
                    this.f13737g = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f13737g < this.f13739i.f13734r;
        }

        public final void remove() {
            this.f13739i.mo24087c();
            this.f13739i.mo24104m(this.f13738h);
            this.f13738h = -1;
        }
    }

    /* renamed from: d.t.z.a$e */
    public static final class C6813e<K, V> extends C6812d<K, V> implements Iterator<K>, Object {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6813e(C6808a<K, V> aVar) {
            super(aVar);
            C6888i.m12438e(aVar, "map");
        }

        public K next() {
            int i = this.f13737g;
            C6808a<K, V> aVar = this.f13739i;
            if (i < aVar.f13734r) {
                this.f13737g = i + 1;
                this.f13738h = i;
                K k = aVar.f13729m[i];
                mo24118b();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d.t.z.a$f */
    public static final class C6814f<K, V> extends C6812d<K, V> implements Iterator<V>, Object {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6814f(C6808a<K, V> aVar) {
            super(aVar);
            C6888i.m12438e(aVar, "map");
        }

        public V next() {
            int i = this.f13737g;
            C6808a<K, V> aVar = this.f13739i;
            if (i < aVar.f13734r) {
                this.f13737g = i + 1;
                this.f13738h = i;
                V[] vArr = aVar.f13730n;
                C6888i.m12436c(vArr);
                V v = vArr[this.f13738h];
                mo24118b();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    public C6808a() {
        K[] t = C5266a.m10031t(8);
        int highestOneBit = Integer.highestOneBit(24);
        this.f13729m = t;
        this.f13732p = new int[highestOneBit];
        this.f13733q = 2;
        this.f13734r = 0;
        this.f13723g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    /* renamed from: a */
    public final int mo24085a(K k) {
        mo24087c();
        while (true) {
            int k2 = mo24101k(k);
            int i = this.f13733q * 2;
            int length = this.f13732p.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f13732p;
                int i3 = iArr[k2];
                if (i3 <= 0) {
                    int i4 = this.f13734r;
                    K[] kArr = this.f13729m;
                    if (i4 >= kArr.length) {
                        mo24095g(1);
                    } else {
                        int i5 = i4 + 1;
                        this.f13734r = i5;
                        kArr[i4] = k;
                        this.f13731o[i4] = k2;
                        iArr[k2] = i5;
                        this.f13724h++;
                        if (i2 > this.f13733q) {
                            this.f13733q = i2;
                        }
                        return i4;
                    }
                } else if (C6888i.m12434a(this.f13729m[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        mo24103l(this.f13732p.length * 2);
                        break;
                    }
                    k2 = k2 == 0 ? this.f13732p.length - 1 : k2 - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final V[] mo24086b() {
        V[] vArr = this.f13730n;
        if (vArr != null) {
            return vArr;
        }
        V[] t = C5266a.m10031t(this.f13729m.length);
        this.f13730n = t;
        return t;
    }

    /* renamed from: c */
    public final void mo24087c() {
        if (this.f13728l) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo24087c();
        int i = this.f13734r - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f13731o;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f13732p[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        C5266a.m9804F3(this.f13729m, 0, this.f13734r);
        V[] vArr = this.f13730n;
        if (vArr != null) {
            C5266a.m9804F3(vArr, 0, this.f13734r);
        }
        this.f13724h = 0;
        this.f13734r = 0;
    }

    public boolean containsKey(Object obj) {
        return mo24097h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo24099i(obj) >= 0;
    }

    /* renamed from: e */
    public final boolean mo24091e(Collection<?> collection) {
        C6888i.m12438e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo24094f((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [d.t.z.b<K, V>, java.util.Set<java.util.Map$Entry<K, V>>] */
    /* JADX WARNING: type inference failed for: r0v1, types: [d.t.z.b<K, V>, d.t.z.b, java.util.Set<java.util.Map$Entry<K, V>>] */
    public final Set<Map.Entry<K, V>> entrySet() {
        ? r0 = this.f13727k;
        if (r0 != 0) {
            return r0;
        }
        ? bVar = new C6815b(this);
        this.f13727k = bVar;
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (!(this.f13724h == map.size() && mo24091e(map.entrySet()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo24094f(Map.Entry<? extends K, ? extends V> entry) {
        C6888i.m12438e(entry, "entry");
        int h = mo24097h(entry.getKey());
        if (h < 0) {
            return false;
        }
        V[] vArr = this.f13730n;
        C6888i.m12436c(vArr);
        return C6888i.m12434a(vArr[h], entry.getValue());
    }

    /* renamed from: g */
    public final void mo24095g(int i) {
        int i2;
        V[] vArr;
        int i3 = this.f13734r;
        int i4 = i + i3;
        K[] kArr = this.f13729m;
        if (i4 > kArr.length) {
            int length = (kArr.length * 3) / 2;
            if (i4 <= length) {
                i4 = length;
            }
            C6888i.m12438e(kArr, "$this$copyOfUninitializedElements");
            K[] copyOf = Arrays.copyOf(kArr, i4);
            C6888i.m12437d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.f13729m = copyOf;
            V[] vArr2 = this.f13730n;
            if (vArr2 != null) {
                C6888i.m12438e(vArr2, "$this$copyOfUninitializedElements");
                vArr = Arrays.copyOf(vArr2, i4);
                C6888i.m12437d(vArr, "java.util.Arrays.copyOf(this, newSize)");
            } else {
                vArr = null;
            }
            this.f13730n = vArr;
            int[] copyOf2 = Arrays.copyOf(this.f13731o, i4);
            C6888i.m12437d(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
            this.f13731o = copyOf2;
            if (i4 < 1) {
                i4 = 1;
            }
            i2 = Integer.highestOneBit(i4 * 3);
            if (i2 <= this.f13732p.length) {
                return;
            }
        } else if ((i3 + i4) - this.f13724h > kArr.length) {
            i2 = this.f13732p.length;
        } else {
            return;
        }
        mo24103l(i2);
    }

    public V get(Object obj) {
        int h = mo24097h(obj);
        if (h < 0) {
            return null;
        }
        V[] vArr = this.f13730n;
        C6888i.m12436c(vArr);
        return vArr[h];
    }

    /* renamed from: h */
    public final int mo24097h(K k) {
        int k2 = mo24101k(k);
        int i = this.f13733q;
        while (true) {
            int i2 = this.f13732p[k2];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C6888i.m12434a(this.f13729m[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            k2 = k2 == 0 ? this.f13732p.length - 1 : k2 - 1;
        }
    }

    public int hashCode() {
        C6810b bVar = new C6810b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.f13737g;
            C6808a<K, V> aVar = bVar.f13739i;
            if (i2 < aVar.f13734r) {
                bVar.f13737g = i2 + 1;
                bVar.f13738h = i2;
                K k = aVar.f13729m[i2];
                int hashCode = k != null ? k.hashCode() : 0;
                V[] vArr = bVar.f13739i.f13730n;
                C6888i.m12436c(vArr);
                V v = vArr[bVar.f13738h];
                int hashCode2 = v != null ? v.hashCode() : 0;
                bVar.mo24118b();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int mo24099i(V v) {
        int i = this.f13734r;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f13731o[i] >= 0) {
                V[] vArr = this.f13730n;
                C6888i.m12436c(vArr);
                if (C6888i.m12434a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.f13724h == 0;
    }

    /* renamed from: k */
    public final int mo24101k(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.f13723g;
    }

    public final Set<K> keySet() {
        C6816c<K> cVar = this.f13725i;
        if (cVar != null) {
            return cVar;
        }
        C6816c<K> cVar2 = new C6816c<>(this);
        this.f13725i = cVar2;
        return cVar2;
    }

    /* renamed from: l */
    public final void mo24103l(int i) {
        boolean z;
        int i2;
        if (this.f13734r > this.f13724h) {
            V[] vArr = this.f13730n;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.f13734r;
                if (i3 >= i2) {
                    break;
                }
                if (this.f13731o[i3] >= 0) {
                    K[] kArr = this.f13729m;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            C5266a.m9804F3(this.f13729m, i4, i2);
            if (vArr != null) {
                C5266a.m9804F3(vArr, i4, this.f13734r);
            }
            this.f13734r = i4;
        }
        int[] iArr = this.f13732p;
        if (i != iArr.length) {
            this.f13732p = new int[i];
            this.f13723g = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            int length = iArr.length;
            C6888i.m12438e(iArr, "$this$fill");
            Arrays.fill(iArr, 0, length, 0);
        }
        int i5 = 0;
        while (i5 < this.f13734r) {
            int i6 = i5 + 1;
            int k = mo24101k(this.f13729m[i5]);
            int i7 = this.f13733q;
            while (true) {
                int[] iArr2 = this.f13732p;
                if (iArr2[k] == 0) {
                    iArr2[k] = i6;
                    this.f13731o[i5] = k;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                k = k == 0 ? iArr2.length - 1 : k - 1;
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24104m(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f13729m
            p005b.p291q.p292a.C5266a.m9798E3(r0, r12)
            int[] r0 = r11.f13731o
            r0 = r0[r12]
            int r1 = r11.f13733q
            int r1 = r1 * 2
            int[] r2 = r11.f13732p
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x0015
            r1 = r2
        L_0x0015:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L_0x0019:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0023
            int[] r0 = r11.f13732p
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0024
        L_0x0023:
            r0 = r5
        L_0x0024:
            int r4 = r4 + 1
            int r5 = r11.f13733q
            if (r4 <= r5) goto L_0x002f
            int[] r0 = r11.f13732p
            r0[r1] = r2
            goto L_0x005e
        L_0x002f:
            int[] r5 = r11.f13732p
            r7 = r5[r0]
            if (r7 != 0) goto L_0x0038
            r5[r1] = r2
            goto L_0x005e
        L_0x0038:
            if (r7 >= 0) goto L_0x003d
            r5[r1] = r6
            goto L_0x0055
        L_0x003d:
            K[] r5 = r11.f13729m
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.mo24101k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f13732p
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x0057
            r9[r1] = r7
            int[] r4 = r11.f13731o
            r4[r8] = r1
        L_0x0055:
            r1 = r0
            r4 = r2
        L_0x0057:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x0019
            int[] r0 = r11.f13732p
            r0[r1] = r6
        L_0x005e:
            int[] r0 = r11.f13731o
            r0[r12] = r6
            int r12 = r11.f13724h
            int r12 = r12 + r6
            r11.f13724h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p334t.p335z.C6808a.mo24104m(int):void");
    }

    public V put(K k, V v) {
        mo24087c();
        int a = mo24085a(k);
        V[] b = mo24086b();
        if (a < 0) {
            int i = (-a) - 1;
            V v2 = b[i];
            b[i] = v;
            return v2;
        }
        b[a] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C6888i.m12438e(map, "from");
        mo24087c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            mo24095g(entrySet.size());
            for (Map.Entry next : entrySet) {
                int a = mo24085a(next.getKey());
                Object[] b = mo24086b();
                if (a >= 0) {
                    b[a] = next.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!C6888i.m12434a(next.getValue(), b[i])) {
                        b[i] = next.getValue();
                    }
                }
            }
        }
    }

    public V remove(Object obj) {
        mo24087c();
        int h = mo24097h(obj);
        if (h < 0) {
            h = -1;
        } else {
            mo24104m(h);
        }
        if (h < 0) {
            return null;
        }
        V[] vArr = this.f13730n;
        C6888i.m12436c(vArr);
        V v = vArr[h];
        C5266a.m9798E3(vArr, h);
        return v;
    }

    public final int size() {
        return this.f13724h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f13724h * 3) + 2);
        sb.append("{");
        int i = 0;
        C6810b bVar = new C6810b(this);
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            C6888i.m12438e(sb, "sb");
            int i2 = bVar.f13737g;
            C6808a<K, V> aVar = bVar.f13739i;
            if (i2 < aVar.f13734r) {
                bVar.f13737g = i2 + 1;
                bVar.f13738h = i2;
                K k = aVar.f13729m[i2];
                if (C6888i.m12434a(k, aVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k);
                }
                sb.append('=');
                V[] vArr = bVar.f13739i.f13730n;
                C6888i.m12436c(vArr);
                V v = vArr[bVar.f13738h];
                if (C6888i.m12434a(v, bVar.f13739i)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v);
                }
                bVar.mo24118b();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "sb.toString()");
        return sb2;
    }

    public final Collection<V> values() {
        C6817d<V> dVar = this.f13726j;
        if (dVar != null) {
            return dVar;
        }
        C6817d<V> dVar2 = new C6817d<>(this);
        this.f13726j = dVar2;
        return dVar2;
    }
}
