package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.GuardedBy;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* renamed from: b.l.a.c.h.b.l4 */
public final class C3237l4 extends Thread {

    /* renamed from: g */
    public final Object f5703g;

    /* renamed from: h */
    public final BlockingQueue<C3226k4<?>> f5704h;
    @GuardedBy("threadLifeCycleLock")

    /* renamed from: i */
    public boolean f5705i = false;

    /* renamed from: j */
    public final /* synthetic */ C3248m4 f5706j;

    public C3237l4(C3248m4 m4Var, String str, BlockingQueue<C3226k4<?>> blockingQueue) {
        this.f5706j = m4Var;
        Objects.requireNonNull(blockingQueue, "null reference");
        this.f5703g = new Object();
        this.f5704h = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo14390a() {
        synchronized (this.f5706j.f5735i) {
            if (!this.f5705i) {
                this.f5706j.f5736j.release();
                this.f5706j.f5735i.notifyAll();
                C3248m4 m4Var = this.f5706j;
                if (this == m4Var.f5729c) {
                    m4Var.f5729c = null;
                } else if (this == m4Var.f5730d) {
                    m4Var.f5730d = null;
                } else {
                    m4Var.f5638a.mo14329d().f5799f.mo14414a("Current scheduler thread is neither worker nor network");
                }
                this.f5705i = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo14391b(InterruptedException interruptedException) {
        this.f5706j.f5638a.mo14329d().f5802i.mo14415b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        mo14390a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0012
            b.l.a.c.h.b.m4 r2 = r6.f5706j     // Catch:{ InterruptedException -> 0x000d }
            java.util.concurrent.Semaphore r2 = r2.f5736j     // Catch:{ InterruptedException -> 0x000d }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000d }
            r1 = r0
            goto L_0x0002
        L_0x000d:
            r2 = move-exception
            r6.mo14391b(r2)
            goto L_0x0002
        L_0x0012:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x007c }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x007c }
        L_0x001a:
            java.util.concurrent.BlockingQueue<b.l.a.c.h.b.k4<?>> r2 = r6.f5704h     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007c }
            b.l.a.c.h.b.k4 r2 = (p005b.p096l.p097a.p113c.p145h.p147b.C3226k4) r2     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0033
            boolean r3 = r2.f5680h     // Catch:{ all -> 0x007c }
            if (r0 == r3) goto L_0x002b
            r3 = 10
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x007c }
            r2.run()     // Catch:{ all -> 0x007c }
            goto L_0x001a
        L_0x0033:
            java.lang.Object r2 = r6.f5703g     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<b.l.a.c.h.b.k4<?>> r3 = r6.f5704h     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0079 }
            if (r3 != 0) goto L_0x004f
            b.l.a.c.h.b.m4 r3 = r6.f5706j     // Catch:{ all -> 0x0079 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0079 }
            java.lang.Object r3 = r6.f5703g     // Catch:{ InterruptedException -> 0x004b }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r3 = move-exception
            r6.mo14391b(r3)     // Catch:{ all -> 0x0079 }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            b.l.a.c.h.b.m4 r2 = r6.f5706j     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.f5735i     // Catch:{ all -> 0x007c }
            monitor-enter(r2)     // Catch:{ all -> 0x007c }
            java.util.concurrent.BlockingQueue<b.l.a.c.h.b.k4<?>> r3 = r6.f5704h     // Catch:{ all -> 0x0076 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0074
            b.l.a.c.h.b.m4 r0 = r6.f5706j     // Catch:{ all -> 0x0076 }
            b.l.a.c.h.b.p4 r0 = r0.f5638a     // Catch:{ all -> 0x0076 }
            b.l.a.c.h.b.f r0 = r0.f5848g     // Catch:{ all -> 0x0076 }
            b.l.a.c.h.b.a3<java.lang.Boolean> r1 = p005b.p096l.p097a.p113c.p145h.p147b.C3134c3.f5401p0     // Catch:{ all -> 0x0076 }
            r3 = 0
            boolean r0 = r0.mo14197r(r3, r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            r6.mo14390a()     // Catch:{ all -> 0x0076 }
        L_0x006f:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            r6.mo14390a()
            return
        L_0x0074:
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            goto L_0x001a
        L_0x0076:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r6.mo14390a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3237l4.run():void");
    }
}
