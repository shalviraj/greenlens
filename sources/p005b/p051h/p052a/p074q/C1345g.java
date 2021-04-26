package p005b.p051h.p052a.p074q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p051h.p052a.C0933e;
import p005b.p051h.p052a.C0934f;
import p005b.p051h.p052a.p055m.C0962a;
import p005b.p051h.p052a.p055m.C0974m;
import p005b.p051h.p052a.p055m.C0979p;
import p005b.p051h.p052a.p055m.C0983t;
import p005b.p051h.p052a.p055m.p058v.C1086k;
import p005b.p051h.p052a.p055m.p058v.C1090l;
import p005b.p051h.p052a.p055m.p058v.C1108r;
import p005b.p051h.p052a.p055m.p058v.C1115w;
import p005b.p051h.p052a.p055m.p062w.C1157l;
import p005b.p051h.p052a.p055m.p064x.p067e.C1270a;
import p005b.p051h.p052a.p074q.p075h.C1353g;
import p005b.p051h.p052a.p074q.p075h.C1354h;
import p005b.p051h.p052a.p074q.p076i.C1364e;
import p005b.p051h.p052a.p078s.C1376f;
import p005b.p051h.p052a.p078s.C1380j;
import p005b.p051h.p052a.p078s.p079k.C1390d;

/* renamed from: b.h.a.q.g */
public final class C1345g<R> implements C1340b, C1353g, C1344f {

    /* renamed from: D */
    public static final boolean f1721D = Log.isLoggable("Request", 2);
    @GuardedBy("requestLock")

    /* renamed from: A */
    public int f1722A;
    @GuardedBy("requestLock")

    /* renamed from: B */
    public boolean f1723B;
    @Nullable

    /* renamed from: C */
    public RuntimeException f1724C;
    @Nullable

    /* renamed from: a */
    public final String f1725a;

    /* renamed from: b */
    public final C1390d f1726b;

    /* renamed from: c */
    public final Object f1727c;
    @Nullable

    /* renamed from: d */
    public final C1342d<R> f1728d;

    /* renamed from: e */
    public final C1341c f1729e;

    /* renamed from: f */
    public final Context f1730f;

    /* renamed from: g */
    public final C0933e f1731g;
    @Nullable

    /* renamed from: h */
    public final Object f1732h;

    /* renamed from: i */
    public final Class<R> f1733i;

    /* renamed from: j */
    public final C1339a<?> f1734j;

    /* renamed from: k */
    public final int f1735k;

    /* renamed from: l */
    public final int f1736l;

    /* renamed from: m */
    public final C0934f f1737m;

    /* renamed from: n */
    public final C1354h<R> f1738n;
    @Nullable

    /* renamed from: o */
    public final List<C1342d<R>> f1739o;

    /* renamed from: p */
    public final C1364e<? super R> f1740p;

    /* renamed from: q */
    public final Executor f1741q;
    @GuardedBy("requestLock")

    /* renamed from: r */
    public C1115w<R> f1742r;
    @GuardedBy("requestLock")

    /* renamed from: s */
    public C1090l.C1096d f1743s;
    @GuardedBy("requestLock")

    /* renamed from: t */
    public long f1744t;

    /* renamed from: u */
    public volatile C1090l f1745u;
    @GuardedBy("requestLock")

    /* renamed from: v */
    public C1346a f1746v;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: w */
    public Drawable f1747w;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: x */
    public Drawable f1748x;
    @GuardedBy("requestLock")
    @Nullable

    /* renamed from: y */
    public Drawable f1749y;
    @GuardedBy("requestLock")

    /* renamed from: z */
    public int f1750z;

    /* renamed from: b.h.a.q.g$a */
    public enum C1346a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public C1345g(Context context, C0933e eVar, @NonNull Object obj, @Nullable Object obj2, Class<R> cls, C1339a<?> aVar, int i, int i2, C0934f fVar, C1354h<R> hVar, @Nullable C1342d<R> dVar, @Nullable List<C1342d<R>> list, C1341c cVar, C1090l lVar, C1364e<? super R> eVar2, Executor executor) {
        C0933e eVar3 = eVar;
        this.f1725a = f1721D ? String.valueOf(hashCode()) : null;
        this.f1726b = new C1390d.C1392b();
        this.f1727c = obj;
        this.f1730f = context;
        this.f1731g = eVar3;
        this.f1732h = obj2;
        this.f1733i = cls;
        this.f1734j = aVar;
        this.f1735k = i;
        this.f1736l = i2;
        this.f1737m = fVar;
        this.f1738n = hVar;
        this.f1728d = dVar;
        this.f1739o = list;
        this.f1729e = cVar;
        this.f1745u = lVar;
        this.f1740p = eVar2;
        this.f1741q = executor;
        this.f1746v = C1346a.PENDING;
        if (this.f1724C == null && eVar3.f870h) {
            this.f1724C = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11181a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1727c
            monitor-enter(r0)
            r5.mo11197e()     // Catch:{ all -> 0x00b3 }
            b.h.a.s.k.d r1 = r5.f1726b     // Catch:{ all -> 0x00b3 }
            r1.mo11267a()     // Catch:{ all -> 0x00b3 }
            int r1 = p005b.p051h.p052a.p078s.C1376f.f1793b     // Catch:{ all -> 0x00b3 }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00b3 }
            r5.f1744t = r1     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = r5.f1732h     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x003e
            int r1 = r5.f1735k     // Catch:{ all -> 0x00b3 }
            int r2 = r5.f1736l     // Catch:{ all -> 0x00b3 }
            boolean r1 = p005b.p051h.p052a.p078s.C1380j.m1477j(r1, r2)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0029
            int r1 = r5.f1735k     // Catch:{ all -> 0x00b3 }
            r5.f1750z = r1     // Catch:{ all -> 0x00b3 }
            int r1 = r5.f1736l     // Catch:{ all -> 0x00b3 }
            r5.f1722A = r1     // Catch:{ all -> 0x00b3 }
        L_0x0029:
            android.graphics.drawable.Drawable r1 = r5.mo11199g()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x0031
            r1 = 5
            goto L_0x0032
        L_0x0031:
            r1 = 3
        L_0x0032:
            b.h.a.m.v.r r2 = new b.h.a.m.v.r     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
            r5.mo11205m(r2, r1)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x003e:
            b.h.a.q.g$a r1 = r5.f1746v     // Catch:{ all -> 0x00b3 }
            b.h.a.q.g$a r2 = p005b.p051h.p052a.p074q.C1345g.C1346a.RUNNING     // Catch:{ all -> 0x00b3 }
            if (r1 == r2) goto L_0x00ab
            b.h.a.q.g$a r3 = p005b.p051h.p052a.p074q.C1345g.C1346a.COMPLETE     // Catch:{ all -> 0x00b3 }
            if (r1 != r3) goto L_0x0051
            b.h.a.m.v.w<R> r1 = r5.f1742r     // Catch:{ all -> 0x00b3 }
            b.h.a.m.a r2 = p005b.p051h.p052a.p055m.C0962a.MEMORY_CACHE     // Catch:{ all -> 0x00b3 }
            r5.mo11206n(r1, r2)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x0051:
            b.h.a.q.g$a r1 = p005b.p051h.p052a.p074q.C1345g.C1346a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b3 }
            r5.f1746v = r1     // Catch:{ all -> 0x00b3 }
            int r3 = r5.f1735k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f1736l     // Catch:{ all -> 0x00b3 }
            boolean r3 = p005b.p051h.p052a.p078s.C1380j.m1477j(r3, r4)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0067
            int r3 = r5.f1735k     // Catch:{ all -> 0x00b3 }
            int r4 = r5.f1736l     // Catch:{ all -> 0x00b3 }
            r5.mo11196d(r3, r4)     // Catch:{ all -> 0x00b3 }
            goto L_0x006c
        L_0x0067:
            b.h.a.q.h.h<R> r3 = r5.f1738n     // Catch:{ all -> 0x00b3 }
            r3.mo11214h(r5)     // Catch:{ all -> 0x00b3 }
        L_0x006c:
            b.h.a.q.g$a r3 = r5.f1746v     // Catch:{ all -> 0x00b3 }
            if (r3 == r2) goto L_0x0072
            if (r3 != r1) goto L_0x008b
        L_0x0072:
            b.h.a.q.c r1 = r5.f1729e     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007f
            boolean r1 = r1.mo11189c(r5)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r1 = 0
            goto L_0x0080
        L_0x007f:
            r1 = 1
        L_0x0080:
            if (r1 == 0) goto L_0x008b
            b.h.a.q.h.h<R> r1 = r5.f1738n     // Catch:{ all -> 0x00b3 }
            android.graphics.drawable.Drawable r2 = r5.mo11200h()     // Catch:{ all -> 0x00b3 }
            r1.mo11212e(r2)     // Catch:{ all -> 0x00b3 }
        L_0x008b:
            boolean r1 = f1721D     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r1.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            long r2 = r5.f1744t     // Catch:{ all -> 0x00b3 }
            double r2 = p005b.p051h.p052a.p078s.C1376f.m1460a(r2)     // Catch:{ all -> 0x00b3 }
            r1.append(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b3 }
            r5.mo11204l(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00a9:
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            return
        L_0x00ab:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b3 }
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b3 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1345g.mo11181a():void");
    }

    /* renamed from: b */
    public boolean mo11182b() {
        boolean z;
        synchronized (this.f1727c) {
            z = this.f1746v == C1346a.CLEARED;
        }
        return z;
    }

    /* renamed from: c */
    public boolean mo11183c() {
        boolean z;
        synchronized (this.f1727c) {
            z = this.f1746v == C1346a.COMPLETE;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        r5.f1745u.mo10986f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1727c
            monitor-enter(r0)
            r5.mo11197e()     // Catch:{ all -> 0x0043 }
            b.h.a.s.k.d r1 = r5.f1726b     // Catch:{ all -> 0x0043 }
            r1.mo11267a()     // Catch:{ all -> 0x0043 }
            b.h.a.q.g$a r1 = r5.f1746v     // Catch:{ all -> 0x0043 }
            b.h.a.q.g$a r2 = p005b.p051h.p052a.p074q.C1345g.C1346a.CLEARED     // Catch:{ all -> 0x0043 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return
        L_0x0013:
            r5.mo11198f()     // Catch:{ all -> 0x0043 }
            b.h.a.m.v.w<R> r1 = r5.f1742r     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r1 == 0) goto L_0x001e
            r5.f1742r = r3     // Catch:{ all -> 0x0043 }
            goto L_0x001f
        L_0x001e:
            r1 = r3
        L_0x001f:
            b.h.a.q.c r3 = r5.f1729e     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.mo11192f(r5)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0038
            b.h.a.q.h.h<R> r3 = r5.f1738n     // Catch:{ all -> 0x0043 }
            android.graphics.drawable.Drawable r4 = r5.mo11200h()     // Catch:{ all -> 0x0043 }
            r3.mo10650g(r4)     // Catch:{ all -> 0x0043 }
        L_0x0038:
            r5.f1746v = r2     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0042
            b.h.a.m.v.l r0 = r5.f1745u
            r0.mo10986f(r1)
        L_0x0042:
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1345g.clear():void");
    }

    /* renamed from: d */
    public void mo11196d(int i, int i2) {
        Object obj;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        C1346a aVar;
        C0979p pVar;
        int i4 = i;
        int i5 = i2;
        this.f1726b.mo11267a();
        Object obj2 = this.f1727c;
        synchronized (obj2) {
            try {
                boolean z4 = f1721D;
                if (z4) {
                    mo11204l("Got onSizeReady in " + C1376f.m1460a(this.f1744t));
                }
                if (this.f1746v == C1346a.WAITING_FOR_SIZE) {
                    C1346a aVar2 = C1346a.RUNNING;
                    this.f1746v = aVar2;
                    float f = this.f1734j.f1702h;
                    if (i4 != Integer.MIN_VALUE) {
                        i4 = Math.round(((float) i4) * f);
                    }
                    this.f1750z = i4;
                    if (i5 == Integer.MIN_VALUE) {
                        i3 = i5;
                    } else {
                        i3 = Math.round(f * ((float) i5));
                    }
                    this.f1722A = i3;
                    if (z4) {
                        mo11204l("finished setup for calling load in " + C1376f.m1460a(this.f1744t));
                    }
                    C1090l lVar = this.f1745u;
                    C0933e eVar = this.f1731g;
                    Object obj3 = this.f1732h;
                    C1339a<?> aVar3 = this.f1734j;
                    C0974m mVar = aVar3.f1712r;
                    int i6 = this.f1750z;
                    int i7 = this.f1722A;
                    Class<?> cls = aVar3.f1719y;
                    Class<R> cls2 = this.f1733i;
                    C0934f fVar = this.f1737m;
                    C1086k kVar = aVar3.f1703i;
                    Map<Class<?>, C0983t<?>> map = aVar3.f1718x;
                    boolean z5 = aVar3.f1713s;
                    C1346a aVar4 = aVar2;
                    boolean z6 = aVar3.f1699E;
                    C0979p pVar2 = aVar3.f1717w;
                    Object obj4 = obj2;
                    try {
                        z = aVar3.f1709o;
                        z2 = aVar3.f1697C;
                        z3 = aVar3.f1700F;
                        aVar = aVar4;
                        pVar = pVar2;
                        obj = obj4;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        C1090l.C1096d b = lVar.mo10983b(eVar, obj3, mVar, i6, i7, cls, cls2, fVar, kVar, map, z5, z6, pVar, z, z2, z3, aVar3.f1698D, this, this.f1741q);
                        try {
                            this.f1743s = b;
                            if (this.f1746v != aVar) {
                                this.f1743s = null;
                            }
                            if (z4) {
                                mo11204l("finished onSizeReady in " + C1376f.m1460a(this.f1744t));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: e */
    public final void mo11197e() {
        if (this.f1723B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: f */
    public final void mo11198f() {
        mo11197e();
        this.f1726b.mo11267a();
        this.f1738n.mo11210a(this);
        C1090l.C1096d dVar = this.f1743s;
        if (dVar != null) {
            synchronized (C1090l.this) {
                dVar.f1277a.mo10995g(dVar.f1278b);
            }
            this.f1743s = null;
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: g */
    public final Drawable mo11199g() {
        int i;
        if (this.f1749y == null) {
            C1339a<?> aVar = this.f1734j;
            Drawable drawable = aVar.f1715u;
            this.f1749y = drawable;
            if (drawable == null && (i = aVar.f1716v) > 0) {
                this.f1749y = mo11203k(i);
            }
        }
        return this.f1749y;
    }

    @GuardedBy("requestLock")
    /* renamed from: h */
    public final Drawable mo11200h() {
        int i;
        if (this.f1748x == null) {
            C1339a<?> aVar = this.f1734j;
            Drawable drawable = aVar.f1707m;
            this.f1748x = drawable;
            if (drawable == null && (i = aVar.f1708n) > 0) {
                this.f1748x = mo11203k(i);
            }
        }
        return this.f1748x;
    }

    /* renamed from: i */
    public boolean mo11201i(C1340b bVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C1339a<?> aVar;
        C0934f fVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C1339a<?> aVar2;
        C0934f fVar2;
        int size2;
        C1340b bVar2 = bVar;
        if (!(bVar2 instanceof C1345g)) {
            return false;
        }
        synchronized (this.f1727c) {
            i = this.f1735k;
            i2 = this.f1736l;
            obj = this.f1732h;
            cls = this.f1733i;
            aVar = this.f1734j;
            fVar = this.f1737m;
            List<C1342d<R>> list = this.f1739o;
            size = list != null ? list.size() : 0;
        }
        C1345g gVar = (C1345g) bVar2;
        synchronized (gVar.f1727c) {
            i3 = gVar.f1735k;
            i4 = gVar.f1736l;
            obj2 = gVar.f1732h;
            cls2 = gVar.f1733i;
            aVar2 = gVar.f1734j;
            fVar2 = gVar.f1737m;
            List<C1342d<R>> list2 = gVar.f1739o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = C1380j.f1801a;
            if ((obj == null ? obj2 == null : obj instanceof C1157l ? ((C1157l) obj).mo11052a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f1727c) {
            C1346a aVar = this.f1746v;
            if (aVar != C1346a.RUNNING) {
                if (aVar != C1346a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @GuardedBy("requestLock")
    /* renamed from: j */
    public final boolean mo11202j() {
        C1341c cVar = this.f1729e;
        return cVar == null || !cVar.getRoot().mo11188b();
    }

    @GuardedBy("requestLock")
    /* renamed from: k */
    public final Drawable mo11203k(@DrawableRes int i) {
        Resources.Theme theme = this.f1734j.f1695A;
        if (theme == null) {
            theme = this.f1730f.getTheme();
        }
        C0933e eVar = this.f1731g;
        return C1270a.m1271a(eVar, eVar, i, theme);
    }

    /* renamed from: l */
    public final void mo11204l(String str) {
        StringBuilder y = C0843a.m464y(str, " this: ");
        y.append(this.f1725a);
        Log.v("Request", y.toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public final void mo11205m(C1108r rVar, int i) {
        boolean z;
        this.f1726b.mo11267a();
        synchronized (this.f1727c) {
            Objects.requireNonNull(rVar);
            int i2 = this.f1731g.f871i;
            if (i2 <= i) {
                Log.w("Glide", "Load failed for " + this.f1732h + " with size [" + this.f1750z + "x" + this.f1722A + "]", rVar);
                if (i2 <= 4) {
                    rVar.mo11012e("Glide");
                }
            }
            this.f1743s = null;
            this.f1746v = C1346a.FAILED;
            boolean z2 = true;
            this.f1723B = true;
            try {
                List<C1342d<R>> list = this.f1739o;
                if (list != null) {
                    z = false;
                    for (C1342d<R> b : list) {
                        z |= b.mo11195b(rVar, this.f1732h, this.f1738n, mo11202j());
                    }
                } else {
                    z = false;
                }
                C1342d<R> dVar = this.f1728d;
                if (dVar == null || !dVar.mo11195b(rVar, this.f1732h, this.f1738n, mo11202j())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    mo11208p();
                }
                this.f1723B = false;
                C1341c cVar = this.f1729e;
                if (cVar != null) {
                    cVar.mo11187a(this);
                }
            } catch (Throwable th) {
                this.f1723B = false;
                throw th;
            }
        }
    }

    /* renamed from: n */
    public void mo11206n(C1115w<?> wVar, C0962a aVar) {
        this.f1726b.mo11267a();
        C1115w<?> wVar2 = null;
        try {
            synchronized (this.f1727c) {
                try {
                    this.f1743s = null;
                    if (wVar == null) {
                        mo11205m(new C1108r("Expected to receive a Resource<R> with an object of " + this.f1733i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    if (obj != null) {
                        if (this.f1733i.isAssignableFrom(obj.getClass())) {
                            C1341c cVar = this.f1729e;
                            if (!(cVar == null || cVar.mo11190d(this))) {
                                try {
                                    this.f1742r = null;
                                    this.f1746v = C1346a.COMPLETE;
                                    this.f1745u.mo10986f(wVar);
                                    return;
                                } catch (Throwable th) {
                                    wVar2 = wVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                mo11207o(wVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.f1742r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f1733i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(wVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    mo11205m(new C1108r(sb.toString()), 5);
                    this.f1745u.mo10986f(wVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (wVar2 != null) {
                this.f1745u.mo10986f(wVar2);
            }
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a1 A[Catch:{ all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.GuardedBy("requestLock")
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11207o(p005b.p051h.p052a.p055m.p058v.C1115w<R> r11, R r12, p005b.p051h.p052a.p055m.C0962a r13) {
        /*
            r10 = this;
            boolean r6 = r10.mo11202j()
            b.h.a.q.g$a r0 = p005b.p051h.p052a.p074q.C1345g.C1346a.COMPLETE
            r10.f1746v = r0
            r10.f1742r = r11
            b.h.a.e r11 = r10.f1731g
            int r11 = r11.f871i
            r0 = 3
            if (r11 > r0) goto L_0x0064
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = p005b.p035e.p036a.p037a.C0843a.m460u(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f1732h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f1750z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f1722A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f1744t
            double r0 = p005b.p051h.p052a.p078s.C1376f.m1460a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x0064:
            r11 = 1
            r10.f1723B = r11
            r7 = 0
            java.util.List<b.h.a.q.d<R>> r0 = r10.f1739o     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008a
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b6 }
            r9 = r7
        L_0x0071:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b6 }
            b.h.a.q.d r0 = (p005b.p051h.p052a.p074q.C1342d) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r10.f1732h     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r3 = r10.f1738n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo11194a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            r9 = r9 | r0
            goto L_0x0071
        L_0x008a:
            r9 = r7
        L_0x008b:
            b.h.a.q.d<R> r0 = r10.f1728d     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r2 = r10.f1732h     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r3 = r10.f1738n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.mo11194a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r11 = r7
        L_0x009e:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00ac
            b.h.a.q.i.e<? super R> r11 = r10.f1740p     // Catch:{ all -> 0x00b6 }
            b.h.a.q.i.d r11 = r11.mo11224a(r13, r6)     // Catch:{ all -> 0x00b6 }
            b.h.a.q.h.h<R> r13 = r10.f1738n     // Catch:{ all -> 0x00b6 }
            r13.mo10649b(r12, r11)     // Catch:{ all -> 0x00b6 }
        L_0x00ac:
            r10.f1723B = r7
            b.h.a.q.c r11 = r10.f1729e
            if (r11 == 0) goto L_0x00b5
            r11.mo11191e(r10)
        L_0x00b5:
            return
        L_0x00b6:
            r11 = move-exception
            r10.f1723B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p074q.C1345g.mo11207o(b.h.a.m.v.w, java.lang.Object, b.h.a.m.a):void");
    }

    @GuardedBy("requestLock")
    /* renamed from: p */
    public final void mo11208p() {
        int i;
        C1341c cVar = this.f1729e;
        if (cVar == null || cVar.mo11189c(this)) {
            Drawable drawable = null;
            if (this.f1732h == null) {
                drawable = mo11199g();
            }
            if (drawable == null) {
                if (this.f1747w == null) {
                    C1339a<?> aVar = this.f1734j;
                    Drawable drawable2 = aVar.f1705k;
                    this.f1747w = drawable2;
                    if (drawable2 == null && (i = aVar.f1706l) > 0) {
                        this.f1747w = mo11203k(i);
                    }
                }
                drawable = this.f1747w;
            }
            if (drawable == null) {
                drawable = mo11200h();
            }
            this.f1738n.mo11211c(drawable);
        }
    }

    public void pause() {
        synchronized (this.f1727c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
