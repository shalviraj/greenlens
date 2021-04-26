package p421m;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.p426g.C7887e;

/* renamed from: m.r */
public final class C8011r {

    /* renamed from: a */
    public ExecutorService f16079a;

    /* renamed from: b */
    public final ArrayDeque<C7887e.C7888a> f16080b = new ArrayDeque<>();

    /* renamed from: c */
    public final ArrayDeque<C7887e.C7888a> f16081c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<C7887e> f16082d = new ArrayDeque<>();

    /* renamed from: a */
    public final synchronized void mo25821a() {
        Iterator<C7887e.C7888a> it = this.f16080b.iterator();
        while (it.hasNext()) {
            it.next().f15706i.mo25621f();
        }
        Iterator<C7887e.C7888a> it2 = this.f16081c.iterator();
        while (it2.hasNext()) {
            it2.next().f15706i.mo25621f();
        }
        Iterator<C7887e> it3 = this.f16082d.iterator();
        while (it3.hasNext()) {
            it3.next().mo25621f();
        }
    }

    /* renamed from: b */
    public final <T> void mo25822b(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        mo25824d();
    }

    /* renamed from: c */
    public final void mo25823c(C7887e.C7888a aVar) {
        C6888i.m12438e(aVar, NotificationCompat.CATEGORY_CALL);
        aVar.f15704g.decrementAndGet();
        mo25822b(this.f16081c, aVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final boolean mo25824d() {
        /*
            r15 = this;
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.ArrayDeque<m.m0.g.e$a> r1 = r15.f16080b     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            p298d.p344x.p346c.C6888i.m12437d(r1, r2)     // Catch:{ all -> 0x00f4 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00f4 }
            m.m0.g.e$a r2 = (p421m.p422m0.p426g.C7887e.C7888a) r2     // Catch:{ all -> 0x00f4 }
            java.util.ArrayDeque<m.m0.g.e$a> r3 = r15.f16081c     // Catch:{ all -> 0x00f4 }
            int r3 = r3.size()     // Catch:{ all -> 0x00f4 }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x004a
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f15704g     // Catch:{ all -> 0x00f4 }
            int r3 = r3.get()     // Catch:{ all -> 0x00f4 }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f15704g     // Catch:{ all -> 0x00f4 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "asyncCall"
            p298d.p344x.p346c.C6888i.m12437d(r2, r3)     // Catch:{ all -> 0x00f4 }
            r0.add(r2)     // Catch:{ all -> 0x00f4 }
            java.util.ArrayDeque<m.m0.g.e$a> r3 = r15.f16081c     // Catch:{ all -> 0x00f4 }
            r3.add(r2)     // Catch:{ all -> 0x00f4 }
            goto L_0x0013
        L_0x004a:
            monitor-enter(r15)     // Catch:{ all -> 0x00f4 }
            java.util.ArrayDeque<m.m0.g.e$a> r1 = r15.f16081c     // Catch:{ all -> 0x00f1 }
            int r1 = r1.size()     // Catch:{ all -> 0x00f1 }
            java.util.ArrayDeque<m.m0.g.e> r2 = r15.f16082d     // Catch:{ all -> 0x00f1 }
            int r2 = r2.size()     // Catch:{ all -> 0x00f1 }
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch:{ all -> 0x00f4 }
            r2 = 0
            if (r1 <= 0) goto L_0x005e
            r1 = 1
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            monitor-exit(r15)
            int r3 = r0.size()
            r4 = r2
        L_0x0065:
            if (r4 >= r3) goto L_0x00f0
            java.lang.Object r5 = r0.get(r4)
            m.m0.g.e$a r5 = (p421m.p422m0.p426g.C7887e.C7888a) r5
            monitor-enter(r15)
            java.util.concurrent.ExecutorService r6 = r15.f16079a     // Catch:{ all -> 0x00ed }
            if (r6 != 0) goto L_0x00a4
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00ed }
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ed }
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00ed }
            r13.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r7.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r14 = p421m.p422m0.C7867c.f15625g     // Catch:{ all -> 0x00ed }
            r7.append(r14)     // Catch:{ all -> 0x00ed }
            java.lang.String r14 = " Dispatcher"
            r7.append(r14)     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ed }
            java.lang.String r14 = "name"
            p298d.p344x.p346c.C6888i.m12438e(r7, r14)     // Catch:{ all -> 0x00ed }
            m.m0.b r14 = new m.m0.b     // Catch:{ all -> 0x00ed }
            r14.<init>(r7, r2)     // Catch:{ all -> 0x00ed }
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch:{ all -> 0x00ed }
            r15.f16079a = r6     // Catch:{ all -> 0x00ed }
        L_0x00a4:
            java.util.concurrent.ExecutorService r6 = r15.f16079a     // Catch:{ all -> 0x00ed }
            p298d.p344x.p346c.C6888i.m12436c(r6)     // Catch:{ all -> 0x00ed }
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            java.lang.String r7 = "executorService"
            p298d.p344x.p346c.C6888i.m12438e(r6, r7)
            m.m0.g.e r7 = r5.f15706i
            m.c0 r7 = r7.f15701v
            m.r r7 = r7.f15460g
            byte[] r7 = p421m.p422m0.C7867c.f15619a
            r6.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00c0 }
            goto L_0x00e0
        L_0x00be:
            r0 = move-exception
            goto L_0x00e3
        L_0x00c0:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch:{ all -> 0x00be }
            r7.initCause(r6)     // Catch:{ all -> 0x00be }
            m.m0.g.e r6 = r5.f15706i     // Catch:{ all -> 0x00be }
            r6.mo25627l(r7)     // Catch:{ all -> 0x00be }
            m.g r6 = r5.f15705h     // Catch:{ all -> 0x00be }
            m.m0.g.e r8 = r5.f15706i     // Catch:{ all -> 0x00be }
            r6.mo10630b(r8, r7)     // Catch:{ all -> 0x00be }
            m.m0.g.e r6 = r5.f15706i
            m.c0 r6 = r6.f15701v
            m.r r6 = r6.f15460g
            r6.mo25823c(r5)
        L_0x00e0:
            int r4 = r4 + 1
            goto L_0x0065
        L_0x00e3:
            m.m0.g.e r1 = r5.f15706i
            m.c0 r1 = r1.f15701v
            m.r r1 = r1.f15460g
            r1.mo25823c(r5)
            throw r0
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00f0:
            return r1
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00f4 }
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.C8011r.mo25824d():boolean");
    }
}
