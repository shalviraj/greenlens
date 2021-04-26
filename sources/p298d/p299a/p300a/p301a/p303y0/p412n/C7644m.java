package p298d.p299a.p300a.p301a.p303y0.p412n;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6905z;

/* renamed from: d.a.a.a.y0.n.m */
public final class C7644m<T> extends AbstractSet<T> {

    /* renamed from: g */
    public Object f15143g;

    /* renamed from: h */
    public int f15144h;

    /* renamed from: d.a.a.a.y0.n.m$a */
    public static final class C7645a<T> implements Iterator<T>, Object {

        /* renamed from: g */
        public final Iterator<T> f15145g;

        public C7645a(T[] tArr) {
            C6888i.m12438e(tArr, "array");
            this.f15145g = C5266a.m9857O2(tArr);
        }

        public boolean hasNext() {
            return this.f15145g.hasNext();
        }

        public T next() {
            return this.f15145g.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d.a.a.a.y0.n.m$b */
    public static final class C7646b {
        /* renamed from: a */
        public static final <T> C7644m<T> m13874a() {
            return new C7644m<>((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: d.a.a.a.y0.n.m$c */
    public static final class C7647c<T> implements Iterator<T>, Object {

        /* renamed from: g */
        public final T f15146g;

        /* renamed from: h */
        public boolean f15147h = true;

        public C7647c(T t) {
            this.f15146g = t;
        }

        public boolean hasNext() {
            return this.f15147h;
        }

        public T next() {
            if (this.f15147h) {
                this.f15147h = false;
                return this.f15146g;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C7644m() {
    }

    public C7644m(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* renamed from: d */
    public static final <T> C7644m<T> m13873d() {
        return new C7644m<>((DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(T r7) {
        /*
            r6 = this;
            int r0 = r6.f15144h
            r1 = 1
            if (r0 != 0) goto L_0x0008
            r6.f15143g = r7
            goto L_0x0077
        L_0x0008:
            r2 = 0
            if (r0 != r1) goto L_0x0020
            java.lang.Object r0 = r6.f15143g
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r7)
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r3 = r6.f15143g
            r0[r2] = r3
            r0[r1] = r7
            r6.f15143g = r0
            goto L_0x0077
        L_0x0020:
            r3 = 5
            if (r0 >= r3) goto L_0x0065
            java.lang.Object r0 = r6.f15143g
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = p005b.p291q.p292a.C5266a.m9948f0(r0, r7)
            if (r3 == 0) goto L_0x0033
            return r2
        L_0x0033:
            int r3 = r6.f15144h
            r4 = 4
            if (r3 != r4) goto L_0x0054
            int r3 = r0.length
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            java.lang.String r0 = "elements"
            p298d.p344x.p346c.C6888i.m12438e(r4, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r2 = p005b.p291q.p292a.C5266a.m9957g3(r3)
            r0.<init>(r2)
            p005b.p291q.p292a.C5266a.m10030s4(r4, r0)
            r0.add(r7)
            goto L_0x0062
        L_0x0054:
            int r3 = r3 + r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r2 = "java.util.Arrays.copyOf(this, newSize)"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            int r2 = r0.length
            int r2 = r2 - r1
            r0[r2] = r7
        L_0x0062:
            r6.f15143g = r0
            goto L_0x0077
        L_0x0065:
            java.lang.Object r0 = r6.f15143g
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            java.util.Objects.requireNonNull(r0, r3)
            java.util.Set r0 = p298d.p344x.p346c.C6905z.m12472a(r0)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L_0x0077
            return r2
        L_0x0077:
            int r7 = r6.f15144h
            int r7 = r7 + r1
            r6.f15144h = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p412n.C7644m.add(java.lang.Object):boolean");
    }

    public void clear() {
        this.f15143g = null;
        this.f15144h = 0;
    }

    public boolean contains(Object obj) {
        int i = this.f15144h;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return C6888i.m12434a(this.f15143g, obj);
        }
        if (i < 5) {
            Object obj2 = this.f15143g;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C5266a.m9948f0((Object[]) obj2, obj);
        }
        Object obj3 = this.f15143g;
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public Iterator<T> iterator() {
        Set a;
        int i = this.f15144h;
        if (i == 0) {
            a = Collections.emptySet();
        } else if (i == 1) {
            return new C7647c(this.f15143g);
        } else {
            if (i < 5) {
                Object obj = this.f15143g;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
                return new C7645a((Object[]) obj);
            }
            Object obj2 = this.f15143g;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            a = C6905z.m12472a(obj2);
        }
        return a.iterator();
    }

    public final int size() {
        return this.f15144h;
    }
}
