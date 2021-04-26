package p437o.p438a.p439a;

/* renamed from: o.a.a.b */
public final class C8067b implements Runnable, C8082l {

    /* renamed from: g */
    public final C8081k f16199g = new C8081k();

    /* renamed from: h */
    public final C8068c f16200h;

    /* renamed from: i */
    public volatile boolean f16201i;

    public C8067b(C8068c cVar) {
        this.f16200h = cVar;
    }

    /* renamed from: a */
    public void mo26001a(C8088q qVar, Object obj) {
        C8080j a = C8080j.m14968a(qVar, obj);
        synchronized (this) {
            this.f16199g.mo26021a(a);
            if (!this.f16201i) {
                this.f16201i = true;
                this.f16200h.f16214j.execute(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0034, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = r6.f16200h.f16220p;
        r3 = java.util.logging.Level.WARNING;
        r2.mo26019b(r3, java.lang.Thread.currentThread().getName() + " was interruppted", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        r6.f16201i = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005c, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
        L_0x0000:
            r0 = 0
            o.a.a.k r1 = r6.f16199g     // Catch:{ InterruptedException -> 0x0034 }
            r2 = 1000(0x3e8, float:1.401E-42)
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0034 }
            o.a.a.j r3 = r1.f16238a     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x000e
            long r2 = (long) r2     // Catch:{ all -> 0x002f }
            r1.wait(r2)     // Catch:{ all -> 0x002f }
        L_0x000e:
            o.a.a.j r2 = r1.mo26022b()     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x0034 }
            if (r2 != 0) goto L_0x0029
            monitor-enter(r6)     // Catch:{ InterruptedException -> 0x0034 }
            o.a.a.k r1 = r6.f16199g     // Catch:{ all -> 0x0026 }
            o.a.a.j r2 = r1.mo26022b()     // Catch:{ all -> 0x0026 }
            if (r2 != 0) goto L_0x0024
            r6.f16201i = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            r6.f16201i = r0
            return
        L_0x0024:
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ InterruptedException -> 0x0034 }
        L_0x0029:
            o.a.a.c r1 = r6.f16200h     // Catch:{ InterruptedException -> 0x0034 }
            r1.mo26004c(r2)     // Catch:{ InterruptedException -> 0x0034 }
            goto L_0x0000
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x0034 }
            throw r2     // Catch:{ InterruptedException -> 0x0034 }
        L_0x0032:
            r1 = move-exception
            goto L_0x005a
        L_0x0034:
            r1 = move-exception
            o.a.a.c r2 = r6.f16200h     // Catch:{ all -> 0x0032 }
            o.a.a.g r2 = r2.f16220p     // Catch:{ all -> 0x0032 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0032 }
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r5 = " was interruppted"
            r4.append(r5)     // Catch:{ all -> 0x0032 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0032 }
            r2.mo26019b(r3, r4, r1)     // Catch:{ all -> 0x0032 }
            r6.f16201i = r0
            return
        L_0x005a:
            r6.f16201i = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p437o.p438a.p439a.C8067b.run():void");
    }
}
