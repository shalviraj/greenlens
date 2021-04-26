package p005b.p051h.p052a.p055m.p058v.p059c0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.h.a.m.v.c0.i */
public final class C1031i implements C1023b {

    /* renamed from: a */
    public final C1028g<C1032a, Object> f1095a = new C1028g<>();

    /* renamed from: b */
    public final C1033b f1096b = new C1033b();

    /* renamed from: c */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f1097c = new HashMap();

    /* renamed from: d */
    public final Map<Class<?>, C1022a<?>> f1098d = new HashMap();

    /* renamed from: e */
    public final int f1099e;

    /* renamed from: f */
    public int f1100f;

    /* renamed from: b.h.a.m.v.c0.i$a */
    public static final class C1032a implements C1038l {

        /* renamed from: a */
        public final C1033b f1101a;

        /* renamed from: b */
        public int f1102b;

        /* renamed from: c */
        public Class<?> f1103c;

        public C1032a(C1033b bVar) {
            this.f1101a = bVar;
        }

        /* renamed from: a */
        public void mo10907a() {
            this.f1101a.mo10891c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1032a)) {
                return false;
            }
            C1032a aVar = (C1032a) obj;
            return this.f1102b == aVar.f1102b && this.f1103c == aVar.f1103c;
        }

        public int hashCode() {
            int i = this.f1102b * 31;
            Class<?> cls = this.f1103c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("Key{size=");
            u.append(this.f1102b);
            u.append("array=");
            u.append(this.f1103c);
            u.append('}');
            return u.toString();
        }
    }

    /* renamed from: b.h.a.m.v.c0.i$b */
    public static final class C1033b extends C1024c<C1032a> {
        /* renamed from: a */
        public C1038l mo10889a() {
            return new C1032a(this);
        }

        /* renamed from: d */
        public C1032a mo10911d(int i, Class<?> cls) {
            C1032a aVar = (C1032a) mo10890b();
            aVar.f1102b = i;
            aVar.f1103c = cls;
            return aVar;
        }
    }

    public C1031i(int i) {
        this.f1099e = i;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public synchronized void mo10884a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000f
            monitor-enter(r1)     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.mo10903g(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x000f:
            r0 = 20
            if (r2 >= r0) goto L_0x0017
            r0 = 15
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            int r2 = r1.f1099e     // Catch:{ all -> 0x0020 }
            int r2 = r2 / 2
            r1.mo10903g(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.p059c0.C1031i.mo10884a(int):void");
    }

    /* renamed from: b */
    public synchronized void mo10885b() {
        mo10903g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo10886c(int i, Class<T> cls) {
        C1032a aVar;
        aVar = (C1032a) this.f1096b.mo10890b();
        aVar.f1102b = i;
        aVar.f1103c = cls;
        return mo10905i(aVar, cls);
    }

    /* renamed from: d */
    public synchronized <T> void mo10887d(T t) {
        Class<?> cls = t.getClass();
        C1022a<?> h = mo10904h(cls);
        int b = h.mo10881b(t);
        int c = h.mo10882c() * b;
        int i = 1;
        if (c <= this.f1099e / 2) {
            C1032a d = this.f1096b.mo10911d(b, cls);
            this.f1095a.mo10898b(d, t);
            NavigableMap<Integer, Integer> j = mo10906j(cls);
            Integer num = (Integer) j.get(Integer.valueOf(d.f1102b));
            Integer valueOf = Integer.valueOf(d.f1102b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            j.put(valueOf, Integer.valueOf(i));
            this.f1100f += c;
            mo10903g(this.f1099e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T mo10888e(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.mo10906j(r7)     // Catch:{ all -> 0x004d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x004d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x004d }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f1100f     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f1099e     // Catch:{ all -> 0x004d }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x004d }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            b.h.a.m.v.c0.i$b r6 = r5.f1096b     // Catch:{ all -> 0x004d }
            int r0 = r0.intValue()     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.i$a r6 = r6.mo10911d(r0, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x003a:
            b.h.a.m.v.c0.i$b r0 = r5.f1096b     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.l r0 = r0.mo10890b()     // Catch:{ all -> 0x004d }
            b.h.a.m.v.c0.i$a r0 = (p005b.p051h.p052a.p055m.p058v.p059c0.C1031i.C1032a) r0     // Catch:{ all -> 0x004d }
            r0.f1102b = r6     // Catch:{ all -> 0x004d }
            r0.f1103c = r7     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x0047:
            java.lang.Object r6 = r5.mo10905i(r6, r7)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p051h.p052a.p055m.p058v.p059c0.C1031i.mo10888e(int, java.lang.Class):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo10902f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> j = mo10906j(cls);
        Integer num = (Integer) j.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                j.remove(valueOf);
            } else {
                j.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
    }

    /* renamed from: g */
    public final void mo10903g(int i) {
        while (this.f1100f > i) {
            Object c = this.f1095a.mo10899c();
            Objects.requireNonNull(c, "Argument must not be null");
            C1022a<?> h = mo10904h(c.getClass());
            this.f1100f -= h.mo10882c() * h.mo10881b(c);
            mo10902f(h.mo10881b(c), c.getClass());
            if (Log.isLoggable(h.mo10880a(), 2)) {
                String a = h.mo10880a();
                StringBuilder u = C0843a.m460u("evicted: ");
                u.append(h.mo10881b(c));
                Log.v(a, u.toString());
            }
        }
    }

    /* renamed from: h */
    public final <T> C1022a<T> mo10904h(Class<T> cls) {
        C1022a<T> aVar = this.f1098d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C1030h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C1027f();
            } else {
                StringBuilder u = C0843a.m460u("No array pool found for: ");
                u.append(cls.getSimpleName());
                throw new IllegalArgumentException(u.toString());
            }
            this.f1098d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: i */
    public final <T> T mo10905i(C1032a aVar, Class<T> cls) {
        C1022a<T> h = mo10904h(cls);
        T a = this.f1095a.mo10897a(aVar);
        if (a != null) {
            this.f1100f -= h.mo10882c() * h.mo10881b(a);
            mo10902f(h.mo10881b(a), cls);
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(h.mo10880a(), 2)) {
            String a2 = h.mo10880a();
            StringBuilder u = C0843a.m460u("Allocated ");
            u.append(aVar.f1102b);
            u.append(" bytes");
            Log.v(a2, u.toString());
        }
        return h.newArray(aVar.f1102b);
    }

    /* renamed from: j */
    public final NavigableMap<Integer, Integer> mo10906j(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f1097c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1097c.put(cls, treeMap);
        return treeMap;
    }
}
