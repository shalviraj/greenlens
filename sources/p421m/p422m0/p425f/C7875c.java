package p421m.p422m0.p425f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7876d;

/* renamed from: m.m0.f.c */
public final class C7875c {

    /* renamed from: a */
    public boolean f15636a;

    /* renamed from: b */
    public C7873a f15637b;

    /* renamed from: c */
    public final List<C7873a> f15638c = new ArrayList();

    /* renamed from: d */
    public boolean f15639d;

    /* renamed from: e */
    public final C7876d f15640e;

    /* renamed from: f */
    public final String f15641f;

    public C7875c(C7876d dVar, String str) {
        C6888i.m12438e(dVar, "taskRunner");
        C6888i.m12438e(str, "name");
        this.f15640e = dVar;
        this.f15641f = str;
    }

    /* renamed from: a */
    public final void mo25589a() {
        byte[] bArr = C7867c.f15619a;
        synchronized (this.f15640e) {
            if (mo25590b()) {
                this.f15640e.mo25598e(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo25590b() {
        C7873a aVar = this.f15637b;
        if (aVar != null) {
            C6888i.m12436c(aVar);
            if (aVar.f15634d) {
                this.f15639d = true;
            }
        }
        boolean z = false;
        for (int size = this.f15638c.size() - 1; size >= 0; size--) {
            if (this.f15638c.get(size).f15634d) {
                C7873a aVar2 = this.f15638c.get(size);
                if (C7876d.f15644j.mo25604a().isLoggable(Level.FINE)) {
                    C5266a.m9995n(aVar2, this, "canceled");
                }
                this.f15638c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25591c(p421m.p422m0.p425f.C7873a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            m.m0.f.d r0 = r2.f15640e
            monitor-enter(r0)
            boolean r1 = r2.f15636a     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r3.f15634d     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0023
            m.m0.f.d$b r4 = p421m.p422m0.p425f.C7876d.f15644j     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = p421m.p422m0.p425f.C7876d.f15643i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p005b.p291q.p292a.C5266a.m9995n(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            m.m0.f.d$b r4 = p421m.p422m0.p425f.C7876d.f15644j     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = p421m.p422m0.p425f.C7876d.f15643i     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p005b.p291q.p292a.C5266a.m9995n(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x003a:
            r1 = 0
            boolean r3 = r2.mo25592d(r3, r4, r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            m.m0.f.d r3 = r2.f15640e     // Catch:{ all -> 0x0048 }
            r3.mo25598e(r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p425f.C7875c.mo25591c(m.m0.f.a, long):void");
    }

    /* renamed from: d */
    public final boolean mo25592d(C7873a aVar, long j, boolean z) {
        StringBuilder sb;
        String str;
        C6888i.m12438e(aVar, "task");
        C6888i.m12438e(this, "queue");
        C7875c cVar = aVar.f15631a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f15631a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c = this.f15640e.f15651g.mo25602c();
        long j2 = c + j;
        int indexOf = this.f15638c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f15632b <= j2) {
                C7876d.C7878b bVar = C7876d.f15644j;
                if (C7876d.f15643i.isLoggable(Level.FINE)) {
                    C5266a.m9995n(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f15638c.remove(indexOf);
        }
        aVar.f15632b = j2;
        C7876d.C7878b bVar2 = C7876d.f15644j;
        if (C7876d.f15643i.isLoggable(Level.FINE)) {
            if (z) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(C5266a.m9893V0(j2 - c));
            C5266a.m9995n(aVar, this, sb.toString());
        }
        Iterator<C7873a> it = this.f15638c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f15632b - c > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f15638c.size();
        }
        this.f15638c.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo25593e() {
        byte[] bArr = C7867c.f15619a;
        synchronized (this.f15640e) {
            this.f15636a = true;
            if (mo25590b()) {
                this.f15640e.mo25598e(this);
            }
        }
    }

    public String toString() {
        return this.f15641f;
    }
}
