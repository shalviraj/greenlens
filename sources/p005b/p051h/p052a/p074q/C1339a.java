package p005b.p051h.p052a.p074q;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Objects;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0976o;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p055m.p064x.p065c.C1231i;
import p005b.p051h.p052a.p055m.p064x.p065c.C1232j;
import p005b.p051h.p052a.p055m.p064x.p065c.C1239l;
import p005b.p051h.p052a.p055m.p064x.p065c.C1252q;
import p005b.p051h.p052a.p074q.C1339a;
import p005b.p051h.p052a.p077r.C1365a;
import p005b.p051h.p052a.p078s.C1370b;
import p005b.p051h.p052a.p078s.C1380j;

/* renamed from: b.h.a.q.a */
public abstract class C1339a<T extends C1339a<T>> implements Cloneable {
    @Nullable

    /* renamed from: A */
    public Resources.Theme f1695A;

    /* renamed from: B */
    public boolean f1696B;

    /* renamed from: C */
    public boolean f1697C;

    /* renamed from: D */
    public boolean f1698D;

    /* renamed from: E */
    public boolean f1699E;

    /* renamed from: F */
    public boolean f1700F;

    /* renamed from: g */
    public int f1701g;

    /* renamed from: h */
    public float f1702h = 1.0f;
    @NonNull

    /* renamed from: i */
    public C1086k f1703i = C1086k.f1253c;
    @NonNull

    /* renamed from: j */
    public C0934f f1704j = C0934f.NORMAL;
    @Nullable

    /* renamed from: k */
    public Drawable f1705k;

    /* renamed from: l */
    public int f1706l;
    @Nullable

    /* renamed from: m */
    public Drawable f1707m;

    /* renamed from: n */
    public int f1708n;

    /* renamed from: o */
    public boolean f1709o = true;

    /* renamed from: p */
    public int f1710p = -1;

    /* renamed from: q */
    public int f1711q = -1;
    @NonNull

    /* renamed from: r */
    public C0974m f1712r;

    /* renamed from: s */
    public boolean f1713s;

    /* renamed from: t */
    public boolean f1714t;
    @Nullable

    /* renamed from: u */
    public Drawable f1715u;

    /* renamed from: v */
    public int f1716v;
    @NonNull

    /* renamed from: w */
    public C0979p f1717w;
    @NonNull

    /* renamed from: x */
    public Map<Class<?>, C0983t<?>> f1718x;
    @NonNull

    /* renamed from: y */
    public Class<?> f1719y;

    /* renamed from: z */
    public boolean f1720z;

    public C1339a() {
        C1365a aVar = C1365a.f1775b;
        this.f1712r = C1365a.f1775b;
        this.f1714t = true;
        this.f1717w = new C0979p();
        this.f1718x = new C1370b();
        this.f1719y = Object.class;
        this.f1699E = true;
    }

    /* renamed from: i */
    public static boolean m1361i(int i, int i2) {
        return (i & i2) != 0;
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public T mo10382a(@NonNull C1339a<?> aVar) {
        if (this.f1696B) {
            return clone().mo10382a(aVar);
        }
        if (m1361i(aVar.f1701g, 2)) {
            this.f1702h = aVar.f1702h;
        }
        if (m1361i(aVar.f1701g, 262144)) {
            this.f1697C = aVar.f1697C;
        }
        if (m1361i(aVar.f1701g, 1048576)) {
            this.f1700F = aVar.f1700F;
        }
        if (m1361i(aVar.f1701g, 4)) {
            this.f1703i = aVar.f1703i;
        }
        if (m1361i(aVar.f1701g, 8)) {
            this.f1704j = aVar.f1704j;
        }
        if (m1361i(aVar.f1701g, 16)) {
            this.f1705k = aVar.f1705k;
            this.f1706l = 0;
            this.f1701g &= -33;
        }
        if (m1361i(aVar.f1701g, 32)) {
            this.f1706l = aVar.f1706l;
            this.f1705k = null;
            this.f1701g &= -17;
        }
        if (m1361i(aVar.f1701g, 64)) {
            this.f1707m = aVar.f1707m;
            this.f1708n = 0;
            this.f1701g &= -129;
        }
        if (m1361i(aVar.f1701g, 128)) {
            this.f1708n = aVar.f1708n;
            this.f1707m = null;
            this.f1701g &= -65;
        }
        if (m1361i(aVar.f1701g, 256)) {
            this.f1709o = aVar.f1709o;
        }
        if (m1361i(aVar.f1701g, 512)) {
            this.f1711q = aVar.f1711q;
            this.f1710p = aVar.f1710p;
        }
        if (m1361i(aVar.f1701g, 1024)) {
            this.f1712r = aVar.f1712r;
        }
        if (m1361i(aVar.f1701g, 4096)) {
            this.f1719y = aVar.f1719y;
        }
        if (m1361i(aVar.f1701g, 8192)) {
            this.f1715u = aVar.f1715u;
            this.f1716v = 0;
            this.f1701g &= -16385;
        }
        if (m1361i(aVar.f1701g, 16384)) {
            this.f1716v = aVar.f1716v;
            this.f1715u = null;
            this.f1701g &= -8193;
        }
        if (m1361i(aVar.f1701g, 32768)) {
            this.f1695A = aVar.f1695A;
        }
        if (m1361i(aVar.f1701g, 65536)) {
            this.f1714t = aVar.f1714t;
        }
        if (m1361i(aVar.f1701g, 131072)) {
            this.f1713s = aVar.f1713s;
        }
        if (m1361i(aVar.f1701g, 2048)) {
            this.f1718x.putAll(aVar.f1718x);
            this.f1699E = aVar.f1699E;
        }
        if (m1361i(aVar.f1701g, 524288)) {
            this.f1698D = aVar.f1698D;
        }
        if (!this.f1714t) {
            this.f1718x.clear();
            int i = this.f1701g & -2049;
            this.f1701g = i;
            this.f1713s = false;
            this.f1701g = i & -131073;
            this.f1699E = true;
        }
        this.f1701g |= aVar.f1701g;
        this.f1717w.mo10834d(aVar.f1717w);
        mo11177q();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public T mo10383b() {
        if (!this.f1720z || this.f1696B) {
            this.f1696B = true;
            return mo10389j();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public T mo10409c() {
        return mo11179w(C1239l.f1519c, new C1231i());
    }

    @CheckResult
    /* renamed from: d */
    public T clone() {
        try {
            T t = (C1339a) super.clone();
            C0979p pVar = new C0979p();
            t.f1717w = pVar;
            pVar.mo10834d(this.f1717w);
            C1370b bVar = new C1370b();
            t.f1718x = bVar;
            bVar.putAll(this.f1718x);
            t.f1720z = false;
            t.f1696B = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1339a)) {
            return false;
        }
        C1339a aVar = (C1339a) obj;
        return Float.compare(aVar.f1702h, this.f1702h) == 0 && this.f1706l == aVar.f1706l && C1380j.m1469b(this.f1705k, aVar.f1705k) && this.f1708n == aVar.f1708n && C1380j.m1469b(this.f1707m, aVar.f1707m) && this.f1716v == aVar.f1716v && C1380j.m1469b(this.f1715u, aVar.f1715u) && this.f1709o == aVar.f1709o && this.f1710p == aVar.f1710p && this.f1711q == aVar.f1711q && this.f1713s == aVar.f1713s && this.f1714t == aVar.f1714t && this.f1697C == aVar.f1697C && this.f1698D == aVar.f1698D && this.f1703i.equals(aVar.f1703i) && this.f1704j == aVar.f1704j && this.f1717w.equals(aVar.f1717w) && this.f1718x.equals(aVar.f1718x) && this.f1719y.equals(aVar.f1719y) && C1380j.m1469b(this.f1712r, aVar.f1712r) && C1380j.m1469b(this.f1695A, aVar.f1695A);
    }

    @CheckResult
    @NonNull
    /* renamed from: f */
    public T mo10386f(@NonNull Class<?> cls) {
        if (this.f1696B) {
            return clone().mo10386f(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.f1719y = cls;
        this.f1701g |= 4096;
        mo11177q();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: g */
    public T mo10387g(@NonNull C1086k kVar) {
        if (this.f1696B) {
            return clone().mo10387g(kVar);
        }
        Objects.requireNonNull(kVar, "Argument must not be null");
        this.f1703i = kVar;
        this.f1701g |= 4;
        mo11177q();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: h */
    public T mo10388h(@NonNull C1239l lVar) {
        C0976o oVar = C1239l.f1522f;
        Objects.requireNonNull(lVar, "Argument must not be null");
        return mo10395r(oVar, lVar);
    }

    public int hashCode() {
        return C1380j.m1474g(this.f1695A, C1380j.m1474g(this.f1712r, C1380j.m1474g(this.f1719y, C1380j.m1474g(this.f1718x, C1380j.m1474g(this.f1717w, C1380j.m1474g(this.f1704j, C1380j.m1474g(this.f1703i, (((((((((((((C1380j.m1474g(this.f1715u, (C1380j.m1474g(this.f1707m, (C1380j.m1474g(this.f1705k, (C1380j.m1473f(this.f1702h) * 31) + this.f1706l) * 31) + this.f1708n) * 31) + this.f1716v) * 31) + (this.f1709o ? 1 : 0)) * 31) + this.f1710p) * 31) + this.f1711q) * 31) + (this.f1713s ? 1 : 0)) * 31) + (this.f1714t ? 1 : 0)) * 31) + (this.f1697C ? 1 : 0)) * 31) + (this.f1698D ? 1 : 0))))))));
    }

    @NonNull
    /* renamed from: j */
    public T mo10389j() {
        this.f1720z = true;
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public T mo10390k() {
        return mo11176n(C1239l.f1519c, new C1231i());
    }

    @CheckResult
    @NonNull
    /* renamed from: l */
    public T mo10391l() {
        T n = mo11176n(C1239l.f1518b, new C1232j());
        n.f1699E = true;
        return n;
    }

    @CheckResult
    @NonNull
    /* renamed from: m */
    public T mo10392m() {
        T n = mo11176n(C1239l.f1517a, new C1252q());
        n.f1699E = true;
        return n;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo11176n(@androidx.annotation.NonNull p005b.p051h.p052a.p055m.p064x.p065c.C1239l r2, @androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0983t<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1696B
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.mo11176n(r2, r3)
            return r2
        L_0x000d:
            r1.mo10388h(r2)
            r2 = 0
            b.h.a.q.a r2 = r1.mo11178v(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo11176n(b.h.a.m.x.c.l, b.h.a.m.t):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: o */
    public T mo10393o(int i, int i2) {
        if (this.f1696B) {
            return clone().mo10393o(i, i2);
        }
        this.f1711q = i;
        this.f1710p = i2;
        this.f1701g |= 512;
        mo11177q();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: p */
    public T mo10394p(@NonNull C0934f fVar) {
        if (this.f1696B) {
            return clone().mo10394p(fVar);
        }
        Objects.requireNonNull(fVar, "Argument must not be null");
        this.f1704j = fVar;
        this.f1701g |= 8;
        mo11177q();
        return this;
    }

    @NonNull
    /* renamed from: q */
    public final T mo11177q() {
        if (!this.f1720z) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b.h.a.m.o, b.h.a.m.o<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo10395r(@androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0976o<Y> r2, @androidx.annotation.NonNull Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1696B
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.mo10395r(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            b.h.a.m.p r0 = r1.f1717w
            androidx.collection.ArrayMap<b.h.a.m.o<?>, java.lang.Object> r0 = r0.f1025b
            r0.put(r2, r3)
            r1.mo11177q()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo10395r(b.h.a.m.o, java.lang.Object):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: s */
    public T mo10396s(@NonNull C0974m mVar) {
        if (this.f1696B) {
            return clone().mo10396s(mVar);
        }
        Objects.requireNonNull(mVar, "Argument must not be null");
        this.f1712r = mVar;
        this.f1701g |= 1024;
        mo11177q();
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: t */
    public T mo10397t(boolean z) {
        if (this.f1696B) {
            return clone().mo10397t(true);
        }
        this.f1709o = !z;
        this.f1701g |= 256;
        mo11177q();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo10398u(@androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0983t<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            b.h.a.q.a r2 = r1.mo11178v(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo10398u(b.h.a.m.t):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo11178v(@androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0983t<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f1696B
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r2.clone()
            b.h.a.q.a r3 = r0.mo11178v(r3, r4)
            return r3
        L_0x000d:
            b.h.a.m.x.c.o r0 = new b.h.a.m.x.c.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo11180x(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo11180x(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.mo11180x(r1, r0, r4)
            java.lang.Class<b.h.a.m.x.g.c> r0 = p005b.p051h.p052a.p055m.p064x.p069g.C1282c.class
            b.h.a.m.x.g.f r1 = new b.h.a.m.x.g.f
            r1.<init>(r3)
            r2.mo11180x(r0, r1, r4)
            r2.mo11177q()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo11178v(b.h.a.m.t, boolean):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<android.graphics.Bitmap>, b.h.a.m.t] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.CheckResult
    @androidx.annotation.NonNull
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo11179w(@androidx.annotation.NonNull p005b.p051h.p052a.p055m.p064x.p065c.C1239l r2, @androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0983t<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f1696B
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.mo11179w(r2, r3)
            return r2
        L_0x000d:
            r1.mo10388h(r2)
            b.h.a.q.a r2 = r1.mo10398u(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo11179w(b.h.a.m.x.c.l, b.h.a.m.t):b.h.a.q.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [b.h.a.m.t<Y>, b.h.a.m.t, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @androidx.annotation.NonNull
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo11180x(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull p005b.p051h.p052a.p055m.C0983t<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f1696B
            if (r0 == 0) goto L_0x000d
            b.h.a.q.a r0 = r1.clone()
            b.h.a.q.a r2 = r0.mo11180x(r2, r3, r4)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Map<java.lang.Class<?>, b.h.a.m.t<?>> r0 = r1.f1718x
            r0.put(r2, r3)
            int r2 = r1.f1701g
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f1701g = r2
            r3 = 1
            r1.f1714t = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f1701g = r2
            r0 = 0
            r1.f1699E = r0
            if (r4 == 0) goto L_0x0034
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f1701g = r2
            r1.f1713s = r3
        L_0x0034:
            r1.mo11177q()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1339a.mo11180x(java.lang.Class, b.h.a.m.t, boolean):b.h.a.q.a");
    }

    @CheckResult
    @NonNull
    /* renamed from: y */
    public T mo10399y(boolean z) {
        if (this.f1696B) {
            return clone().mo10399y(z);
        }
        this.f1700F = z;
        this.f1701g |= 1048576;
        mo11177q();
        return this;
    }
}
