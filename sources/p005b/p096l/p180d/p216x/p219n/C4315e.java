package p005b.p096l.p180d.p216x.p219n;

import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p180d.p216x.C4297k;

/* renamed from: b.l.d.x.n.e */
public class C4315e {

    /* renamed from: d */
    public static final long f8017d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f8018e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C4297k f8019a = C4297k.m7868c();
    @GuardedBy("this")

    /* renamed from: b */
    public long f8020b;
    @GuardedBy("this")

    /* renamed from: c */
    public int f8021c;

    /* renamed from: a */
    public synchronized boolean mo15950a() {
        return this.f8021c == 0 || this.f8019a.mo15905a() > this.f8020b;
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
    /* renamed from: b */
    public synchronized void mo15951b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 1
            if (r7 < r0) goto L_0x000b
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x0016
        L_0x000b:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0016
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x0022
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            r6.f8021c = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            monitor-exit(r6)
            return
        L_0x001f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r7     // Catch:{ all -> 0x006e }
        L_0x0022:
            int r0 = r6.f8021c     // Catch:{ all -> 0x006e }
            int r0 = r0 + r2
            r6.f8021c = r0     // Catch:{ all -> 0x006e }
            monitor-enter(r6)     // Catch:{ all -> 0x006e }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x0034
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0035
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            if (r1 != 0) goto L_0x003d
            long r0 = f8017d     // Catch:{ all -> 0x003b }
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0061
        L_0x003b:
            r7 = move-exception
            goto L_0x006c
        L_0x003d:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = r6.f8021c     // Catch:{ all -> 0x003b }
            double r2 = (double) r7     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.pow(r0, r2)     // Catch:{ all -> 0x003b }
            b.l.d.x.k r7 = r6.f8019a     // Catch:{ all -> 0x003b }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x003b }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x003b }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = r0 + r2
            long r2 = f8018e     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x003b }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
        L_0x0061:
            b.l.d.x.k r7 = r6.f8019a     // Catch:{ all -> 0x006e }
            long r2 = r7.mo15905a()     // Catch:{ all -> 0x006e }
            long r2 = r2 + r0
            r6.f8020b = r2     // Catch:{ all -> 0x006e }
            monitor-exit(r6)
            return
        L_0x006c:
            monitor-exit(r6)     // Catch:{ all -> 0x006e }
            throw r7     // Catch:{ all -> 0x006e }
        L_0x006e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p216x.p219n.C4315e.mo15951b(int):void");
    }
}
