package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.GuardedBy;

/* renamed from: b.l.a.c.h.b.a3 */
public final class C3110a3<V> {

    /* renamed from: g */
    public static final Object f5249g = new Object();

    /* renamed from: a */
    public final String f5250a;

    /* renamed from: b */
    public final C3389z2<V> f5251b;

    /* renamed from: c */
    public final V f5252c;

    /* renamed from: d */
    public final V f5253d;

    /* renamed from: e */
    public final Object f5254e = new Object();
    @GuardedBy("cachingLock")

    /* renamed from: f */
    public volatile V f5255f = null;

    public /* synthetic */ C3110a3(String str, Object obj, Object obj2, C3389z2 z2Var) {
        this.f5250a = str;
        this.f5252c = obj;
        this.f5253d = obj2;
        this.f5251b = z2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0041 */
    /* renamed from: a */
    public final V mo14064a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5254e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            b.l.a.c.h.b.ea r4 = p005b.p096l.p097a.p113c.p119b.p126p.C1960d.f3518h
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = f5249g
            monitor-enter(r4)
            boolean r0 = p005b.p096l.p097a.p113c.p145h.p147b.C3165ea.m5924a()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x001f
            V r0 = r3.f5255f     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x001b
            V r0 = r3.f5252c     // Catch:{ all -> 0x0065 }
            goto L_0x001d
        L_0x001b:
            V r0 = r3.f5255f     // Catch:{ all -> 0x0065 }
        L_0x001d:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            return r0
        L_0x001f:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            java.util.List<b.l.a.c.h.b.a3<?>> r4 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5370a     // Catch:{ SecurityException -> 0x0053 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0053 }
        L_0x0026:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0053 }
            b.l.a.c.h.b.a3 r0 = (p005b.p096l.p097a.p113c.p145h.p147b.C3110a3) r0     // Catch:{ SecurityException -> 0x0053 }
            boolean r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3165ea.m5924a()     // Catch:{ SecurityException -> 0x0053 }
            if (r1 != 0) goto L_0x004b
            r1 = 0
            b.l.a.c.h.b.z2<V> r2 = r0.f5251b     // Catch:{ IllegalStateException -> 0x0041 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r1 = r2.mo14063a()     // Catch:{ IllegalStateException -> 0x0041 }
        L_0x0041:
            java.lang.Object r2 = f5249g     // Catch:{ SecurityException -> 0x0053 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0053 }
            r0.f5255f = r1     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            goto L_0x0026
        L_0x0048:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x004b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0053 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0053 }
            throw r4     // Catch:{ SecurityException -> 0x0053 }
        L_0x0053:
            b.l.a.c.h.b.z2<V> r4 = r3.f5251b
            if (r4 != 0) goto L_0x005a
            V r4 = r3.f5252c
            return r4
        L_0x005a:
            java.lang.Object r4 = r4.mo14063a()     // Catch:{ SecurityException -> 0x0062, IllegalStateException -> 0x005f }
            return r4
        L_0x005f:
            V r4 = r3.f5252c
            return r4
        L_0x0062:
            V r4 = r3.f5252c
            return r4
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            V r4 = r3.f5252c
            return r4
        L_0x006b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3110a3.mo14064a(java.lang.Object):java.lang.Object");
    }
}
