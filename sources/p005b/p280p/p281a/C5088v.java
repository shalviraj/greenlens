package p005b.p280p.p281a;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: b.p.a.v */
public final class C5088v<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: o */
    public static final Comparator<Comparable> f9837o = new C5089a();

    /* renamed from: g */
    public Comparator<? super K> f9838g = f9837o;

    /* renamed from: h */
    public C5096f<K, V>[] f9839h = new C5096f[16];

    /* renamed from: i */
    public final C5096f<K, V> f9840i = new C5096f<>();

    /* renamed from: j */
    public int f9841j = 0;

    /* renamed from: k */
    public int f9842k = 0;

    /* renamed from: l */
    public int f9843l = 12;

    /* renamed from: m */
    public C5088v<K, V>.C5302c f9844m;

    /* renamed from: n */
    public C5088v<K, V>.d f9845n;

    /* renamed from: b.p.a.v$a */
    public class C5089a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: b.p.a.v$b */
    public static final class C5090b<K, V> {

        /* renamed from: a */
        public C5096f<K, V> f9846a;

        /* renamed from: b */
        public int f9847b;

        /* renamed from: c */
        public int f9848c;

        /* renamed from: d */
        public int f9849d;

        /* renamed from: a */
        public void mo16905a(C5096f<K, V> fVar) {
            fVar.f9858i = null;
            fVar.f9856g = null;
            fVar.f9857h = null;
            fVar.f9864o = 1;
            int i = this.f9847b;
            if (i > 0) {
                int i2 = this.f9849d;
                if ((i2 & 1) == 0) {
                    this.f9849d = i2 + 1;
                    this.f9847b = i - 1;
                    this.f9848c++;
                }
            }
            fVar.f9856g = this.f9846a;
            this.f9846a = fVar;
            int i3 = this.f9849d + 1;
            this.f9849d = i3;
            int i4 = this.f9847b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f9849d = i3 + 1;
                this.f9847b = i4 - 1;
                this.f9848c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f9849d & i6) == i6) {
                    int i7 = this.f9848c;
                    if (i7 == 0) {
                        C5096f<K, V> fVar2 = this.f9846a;
                        C5096f<K, V> fVar3 = fVar2.f9856g;
                        C5096f<K, V> fVar4 = fVar3.f9856g;
                        fVar3.f9856g = fVar4.f9856g;
                        this.f9846a = fVar3;
                        fVar3.f9857h = fVar4;
                        fVar3.f9858i = fVar2;
                        fVar3.f9864o = fVar2.f9864o + 1;
                        fVar4.f9856g = fVar3;
                        fVar2.f9856g = fVar3;
                    } else {
                        if (i7 == 1) {
                            C5096f<K, V> fVar5 = this.f9846a;
                            C5096f<K, V> fVar6 = fVar5.f9856g;
                            this.f9846a = fVar6;
                            fVar6.f9858i = fVar5;
                            fVar6.f9864o = fVar5.f9864o + 1;
                            fVar5.f9856g = fVar6;
                        } else if (i7 != 2) {
                        }
                        this.f9848c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo16906b(int i) {
            this.f9847b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f9849d = 0;
            this.f9848c = 0;
            this.f9846a = null;
        }
    }

    /* renamed from: b.p.a.v$c */
    public final class C5091c extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: b.p.a.v$c$a */
        public class C5092a extends C5088v<K, V>.C6914e<Map.Entry<K, V>> {
            public C5092a(C5091c cVar) {
                super();
            }

            public Object next() {
                return mo16919b();
            }
        }

        public C5091c() {
        }

        public void clear() {
            C5088v.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C5088v.this.mo16889b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5092a(this);
        }

        public boolean remove(Object obj) {
            C5096f b;
            if (!(obj instanceof Map.Entry) || (b = C5088v.this.mo16889b((Map.Entry) obj)) == null) {
                return false;
            }
            C5088v.this.mo16895f(b, true);
            return true;
        }

        public int size() {
            return C5088v.this.f9841j;
        }
    }

    /* renamed from: b.p.a.v$d */
    public final class C5093d extends AbstractSet<K> {

        /* renamed from: b.p.a.v$d$a */
        public class C5094a extends C5088v<K, V>.C6914e<K> {
            public C5094a(C5093d dVar) {
                super();
            }

            public K next() {
                return mo16919b().f9861l;
            }
        }

        public C5093d() {
        }

        public void clear() {
            C5088v.this.clear();
        }

        public boolean contains(Object obj) {
            return C5088v.this.mo16890c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new C5094a(this);
        }

        public boolean remove(Object obj) {
            C5088v vVar = C5088v.this;
            C5096f c = vVar.mo16890c(obj);
            if (c != null) {
                vVar.mo16895f(c, true);
            }
            return c != null;
        }

        public int size() {
            return C5088v.this.f9841j;
        }
    }

    /* renamed from: b.p.a.v$e */
    public abstract class C5095e<T> implements Iterator<T> {

        /* renamed from: g */
        public C5096f<K, V> f9852g;

        /* renamed from: h */
        public C5096f<K, V> f9853h = null;

        /* renamed from: i */
        public int f9854i;

        public C5095e() {
            this.f9852g = C5088v.this.f9840i.f9859j;
            this.f9854i = C5088v.this.f9842k;
        }

        /* renamed from: b */
        public final C5096f<K, V> mo16919b() {
            C5096f<K, V> fVar = this.f9852g;
            C5088v vVar = C5088v.this;
            if (fVar == vVar.f9840i) {
                throw new NoSuchElementException();
            } else if (vVar.f9842k == this.f9854i) {
                this.f9852g = fVar.f9859j;
                this.f9853h = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f9852g != C5088v.this.f9840i;
        }

        public final void remove() {
            C5096f<K, V> fVar = this.f9853h;
            if (fVar != null) {
                C5088v.this.mo16895f(fVar, true);
                this.f9853h = null;
                this.f9854i = C5088v.this.f9842k;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.p.a.v$f */
    public static final class C5096f<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        public C5096f<K, V> f9856g;

        /* renamed from: h */
        public C5096f<K, V> f9857h;

        /* renamed from: i */
        public C5096f<K, V> f9858i;

        /* renamed from: j */
        public C5096f<K, V> f9859j;

        /* renamed from: k */
        public C5096f<K, V> f9860k;

        /* renamed from: l */
        public final K f9861l;

        /* renamed from: m */
        public final int f9862m;

        /* renamed from: n */
        public V f9863n;

        /* renamed from: o */
        public int f9864o;

        public C5096f() {
            this.f9861l = null;
            this.f9862m = -1;
            this.f9860k = this;
            this.f9859j = this;
        }

        public C5096f(C5096f<K, V> fVar, K k, int i, C5096f<K, V> fVar2, C5096f<K, V> fVar3) {
            this.f9856g = fVar;
            this.f9861l = k;
            this.f9862m = i;
            this.f9864o = 1;
            this.f9859j = fVar2;
            this.f9860k = fVar3;
            fVar3.f9859j = this;
            fVar2.f9860k = this;
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
                K r0 = r3.f9861l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f9863n
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
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.C5088v.C5096f.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f9861l;
        }

        public V getValue() {
            return this.f9863n;
        }

        public int hashCode() {
            K k = this.f9861l;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f9863n;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f9863n;
            this.f9863n = v;
            return v2;
        }

        public String toString() {
            return this.f9861l + "=" + this.f9863n;
        }
    }

    static {
        Class<C5088v> cls = C5088v.class;
    }

    /* renamed from: a */
    public C5096f<K, V> mo16888a(K k, boolean z) {
        int i;
        C5096f<K, V> fVar;
        C5096f<K, V> fVar2;
        C5096f<K, V> fVar3;
        C5096f<K, V> fVar4;
        C5096f<K, V> fVar5;
        C5096f<K, V> fVar6;
        K k2 = k;
        Comparator<? super K> comparator = this.f9838g;
        C5096f<K, V>[] fVarArr = this.f9839h;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        int length = i3 & (fVarArr.length - 1);
        C5096f<K, V> fVar7 = fVarArr[length];
        if (fVar7 != null) {
            Comparable comparable = comparator == f9837o ? (Comparable) k2 : null;
            while (true) {
                K k3 = fVar7.f9861l;
                int compareTo = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (compareTo == 0) {
                    return fVar7;
                }
                C5096f<K, V> fVar8 = compareTo < 0 ? fVar7.f9857h : fVar7.f9858i;
                if (fVar8 == null) {
                    fVar = fVar7;
                    i = compareTo;
                    break;
                }
                fVar7 = fVar8;
            }
        } else {
            fVar = fVar7;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5096f<K, V> fVar9 = this.f9840i;
        if (fVar != null) {
            C5096f<K, V> fVar10 = new C5096f<>(fVar, k, i3, fVar9, fVar9.f9860k);
            if (i < 0) {
                fVar.f9857h = fVar10;
            } else {
                fVar.f9858i = fVar10;
            }
            mo16893e(fVar, true);
            fVar2 = fVar10;
        } else if (comparator != f9837o || (k2 instanceof Comparable)) {
            fVar2 = new C5096f<>(fVar, k, i3, fVar9, fVar9.f9860k);
            fVarArr[length] = fVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i4 = this.f9841j;
        this.f9841j = i4 + 1;
        if (i4 > this.f9843l) {
            C5096f<K, V>[] fVarArr2 = this.f9839h;
            int length2 = fVarArr2.length;
            int i5 = length2 * 2;
            C5096f<K, V>[] fVarArr3 = new C5096f[i5];
            C5090b bVar = new C5090b();
            C5090b bVar2 = new C5090b();
            for (int i6 = 0; i6 < length2; i6++) {
                C5096f<K, V> fVar11 = fVarArr2[i6];
                if (fVar11 != null) {
                    C5096f<K, V> fVar12 = null;
                    for (C5096f<K, V> fVar13 = fVar11; fVar13 != null; fVar13 = fVar13.f9857h) {
                        fVar13.f9856g = fVar12;
                        fVar12 = fVar13;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (fVar12 == null) {
                            fVar3 = fVar12;
                            fVar12 = null;
                        } else {
                            fVar3 = fVar12.f9856g;
                            fVar12.f9856g = null;
                            for (C5096f<K, V> fVar14 = fVar12.f9858i; fVar14 != null; fVar14 = fVar14.f9857h) {
                                fVar14.f9856g = fVar3;
                                fVar3 = fVar14;
                            }
                        }
                        if (fVar12 == null) {
                            break;
                        }
                        if ((fVar12.f9862m & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        fVar12 = fVar3;
                    }
                    bVar.mo16906b(i7);
                    bVar2.mo16906b(i8);
                    C5096f<K, V> fVar15 = null;
                    while (fVar11 != null) {
                        fVar11.f9856g = fVar15;
                        C5096f<K, V> fVar16 = fVar11;
                        fVar11 = fVar11.f9857h;
                        fVar15 = fVar16;
                    }
                    while (true) {
                        if (fVar15 != null) {
                            C5096f<K, V> fVar17 = fVar15.f9856g;
                            fVar15.f9856g = null;
                            C5096f<K, V> fVar18 = fVar15.f9858i;
                            while (true) {
                                C5096f<K, V> fVar19 = fVar18;
                                fVar4 = fVar17;
                                fVar17 = fVar19;
                                if (fVar17 == null) {
                                    break;
                                }
                                fVar17.f9856g = fVar4;
                                fVar18 = fVar17.f9857h;
                            }
                        } else {
                            fVar4 = fVar15;
                            fVar15 = null;
                        }
                        if (fVar15 == null) {
                            break;
                        }
                        if ((fVar15.f9862m & length2) == 0) {
                            bVar.mo16905a(fVar15);
                        } else {
                            bVar2.mo16905a(fVar15);
                        }
                        fVar15 = fVar4;
                    }
                    if (i7 > 0) {
                        fVar5 = bVar.f9846a;
                        if (fVar5.f9856g != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar5 = null;
                    }
                    fVarArr3[i6] = fVar5;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        fVar6 = bVar2.f9846a;
                        if (fVar6.f9856g != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        fVar6 = null;
                    }
                    fVarArr3[i9] = fVar6;
                }
            }
            this.f9839h = fVarArr3;
            this.f9843l = (i5 / 4) + (i5 / 2);
        }
        this.f9842k++;
        return fVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p280p.p281a.C5088v.C5096f<K, V> mo16889b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            b.p.a.v$f r0 = r4.mo16890c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f9863n
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
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.C5088v.mo16889b(java.util.Map$Entry):b.p.a.v$f");
    }

    /* renamed from: c */
    public C5096f<K, V> mo16890c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo16888a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        Arrays.fill(this.f9839h, (Object) null);
        this.f9841j = 0;
        this.f9842k++;
        C5096f<K, V> fVar = this.f9840i;
        C5096f<K, V> fVar2 = fVar.f9859j;
        while (fVar2 != fVar) {
            C5096f<K, V> fVar3 = fVar2.f9859j;
            fVar2.f9860k = null;
            fVar2.f9859j = null;
            fVar2 = fVar3;
        }
        fVar.f9860k = fVar;
        fVar.f9859j = fVar;
    }

    public boolean containsKey(Object obj) {
        return mo16890c(obj) != null;
    }

    /* renamed from: e */
    public final void mo16893e(C5096f<K, V> fVar, boolean z) {
        while (fVar != null) {
            C5096f<K, V> fVar2 = fVar.f9857h;
            C5096f<K, V> fVar3 = fVar.f9858i;
            int i = 0;
            int i2 = fVar2 != null ? fVar2.f9864o : 0;
            int i3 = fVar3 != null ? fVar3.f9864o : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C5096f<K, V> fVar4 = fVar3.f9857h;
                C5096f<K, V> fVar5 = fVar3.f9858i;
                int i5 = fVar5 != null ? fVar5.f9864o : 0;
                if (fVar4 != null) {
                    i = fVar4.f9864o;
                }
                int i6 = i - i5;
                if (i6 != -1 && (i6 != 0 || z)) {
                    mo16899i(fVar3);
                }
                mo16898h(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C5096f<K, V> fVar6 = fVar2.f9857h;
                C5096f<K, V> fVar7 = fVar2.f9858i;
                int i7 = fVar7 != null ? fVar7.f9864o : 0;
                if (fVar6 != null) {
                    i = fVar6.f9864o;
                }
                int i8 = i - i7;
                if (i8 != 1 && (i8 != 0 || z)) {
                    mo16898h(fVar2);
                }
                mo16899i(fVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                fVar.f9864o = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.f9864o = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f9856g;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C5088v<K, V>.C5302c cVar = this.f9844m;
        if (cVar != null) {
            return cVar;
        }
        C5088v<K, V>.C5302c cVar2 = new C5091c();
        this.f9844m = cVar2;
        return cVar2;
    }

    /* renamed from: f */
    public void mo16895f(C5096f<K, V> fVar, boolean z) {
        C5096f<K, V> fVar2;
        int i;
        C5096f<K, V> fVar3;
        if (z) {
            C5096f<K, V> fVar4 = fVar.f9860k;
            fVar4.f9859j = fVar.f9859j;
            fVar.f9859j.f9860k = fVar4;
            fVar.f9860k = null;
            fVar.f9859j = null;
        }
        C5096f<K, V> fVar5 = fVar.f9857h;
        C5096f<K, V> fVar6 = fVar.f9858i;
        C5096f<K, V> fVar7 = fVar.f9856g;
        int i2 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                mo16896g(fVar, fVar5);
                fVar.f9857h = null;
            } else if (fVar6 != null) {
                mo16896g(fVar, fVar6);
                fVar.f9858i = null;
            } else {
                mo16896g(fVar, (C5096f<K, V>) null);
            }
            mo16893e(fVar7, false);
            this.f9841j--;
            this.f9842k++;
            return;
        }
        if (fVar5.f9864o > fVar6.f9864o) {
            do {
                fVar2 = fVar5;
                fVar5 = fVar5.f9858i;
            } while (fVar5 != null);
        } else {
            do {
                C5096f<K, V> fVar8 = fVar6;
                fVar6 = fVar6.f9857h;
                fVar3 = fVar8;
            } while (fVar6 != null);
            fVar2 = fVar3;
        }
        mo16895f(fVar2, false);
        C5096f<K, V> fVar9 = fVar.f9857h;
        if (fVar9 != null) {
            i = fVar9.f9864o;
            fVar2.f9857h = fVar9;
            fVar9.f9856g = fVar2;
            fVar.f9857h = null;
        } else {
            i = 0;
        }
        C5096f<K, V> fVar10 = fVar.f9858i;
        if (fVar10 != null) {
            i2 = fVar10.f9864o;
            fVar2.f9858i = fVar10;
            fVar10.f9856g = fVar2;
            fVar.f9858i = null;
        }
        fVar2.f9864o = Math.max(i, i2) + 1;
        mo16896g(fVar, fVar2);
    }

    /* renamed from: g */
    public final void mo16896g(C5096f<K, V> fVar, C5096f<K, V> fVar2) {
        C5096f<K, V> fVar3 = fVar.f9856g;
        fVar.f9856g = null;
        if (fVar2 != null) {
            fVar2.f9856g = fVar3;
        }
        if (fVar3 == null) {
            int i = fVar.f9862m;
            C5096f<K, V>[] fVarArr = this.f9839h;
            fVarArr[i & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f9857h == fVar) {
            fVar3.f9857h = fVar2;
        } else {
            fVar3.f9858i = fVar2;
        }
    }

    public V get(Object obj) {
        C5096f c = mo16890c(obj);
        if (c != null) {
            return c.f9863n;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo16898h(C5096f<K, V> fVar) {
        C5096f<K, V> fVar2 = fVar.f9857h;
        C5096f<K, V> fVar3 = fVar.f9858i;
        C5096f<K, V> fVar4 = fVar3.f9857h;
        C5096f<K, V> fVar5 = fVar3.f9858i;
        fVar.f9858i = fVar4;
        if (fVar4 != null) {
            fVar4.f9856g = fVar;
        }
        mo16896g(fVar, fVar3);
        fVar3.f9857h = fVar;
        fVar.f9856g = fVar3;
        int i = 0;
        int max = Math.max(fVar2 != null ? fVar2.f9864o : 0, fVar4 != null ? fVar4.f9864o : 0) + 1;
        fVar.f9864o = max;
        if (fVar5 != null) {
            i = fVar5.f9864o;
        }
        fVar3.f9864o = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    public final void mo16899i(C5096f<K, V> fVar) {
        C5096f<K, V> fVar2 = fVar.f9857h;
        C5096f<K, V> fVar3 = fVar.f9858i;
        C5096f<K, V> fVar4 = fVar2.f9857h;
        C5096f<K, V> fVar5 = fVar2.f9858i;
        fVar.f9857h = fVar5;
        if (fVar5 != null) {
            fVar5.f9856g = fVar;
        }
        mo16896g(fVar, fVar2);
        fVar2.f9858i = fVar;
        fVar.f9856g = fVar2;
        int i = 0;
        int max = Math.max(fVar3 != null ? fVar3.f9864o : 0, fVar5 != null ? fVar5.f9864o : 0) + 1;
        fVar.f9864o = max;
        if (fVar4 != null) {
            i = fVar4.f9864o;
        }
        fVar2.f9864o = Math.max(max, i) + 1;
    }

    public Set<K> keySet() {
        C5088v<K, V>.d dVar = this.f9845n;
        if (dVar != null) {
            return dVar;
        }
        C5088v<K, V>.d dVar2 = new C5093d();
        this.f9845n = dVar2;
        return dVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C5096f a = mo16888a(k, true);
        V v2 = a.f9863n;
        a.f9863n = v;
        return v2;
    }

    public V remove(Object obj) {
        C5096f c = mo16890c(obj);
        if (c != null) {
            mo16895f(c, true);
        }
        if (c != null) {
            return c.f9863n;
        }
        return null;
    }

    public int size() {
        return this.f9841j;
    }
}
