package p005b.p096l.p097a.p113c.p145h.p147b;

import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b.l.a.c.h.b.m4 */
public final class C3248m4 extends C3227k5 {

    /* renamed from: k */
    public static final AtomicLong f5728k = new AtomicLong(Long.MIN_VALUE);
    @Nullable

    /* renamed from: c */
    public C3237l4 f5729c;
    @Nullable

    /* renamed from: d */
    public C3237l4 f5730d;

    /* renamed from: e */
    public final PriorityBlockingQueue<C3226k4<?>> f5731e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    public final BlockingQueue<C3226k4<?>> f5732f = new LinkedBlockingQueue();

    /* renamed from: g */
    public final Thread.UncaughtExceptionHandler f5733g = new C3215j4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    public final Thread.UncaughtExceptionHandler f5734h = new C3215j4(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i */
    public final Object f5735i = new Object();

    /* renamed from: j */
    public final Semaphore f5736j = new Semaphore(2);

    public C3248m4(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: g */
    public final void mo14332g() {
        if (Thread.currentThread() != this.f5730d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: h */
    public final void mo14126h() {
        if (Thread.currentThread() != this.f5729c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: i */
    public final boolean mo14141i() {
        return false;
    }

    /* renamed from: o */
    public final boolean mo14418o() {
        return Thread.currentThread() == this.f5729c;
    }

    /* renamed from: p */
    public final <V> Future<V> mo14419p(Callable<V> callable) {
        mo14377l();
        C3226k4 k4Var = new C3226k4(this, callable, false);
        if (Thread.currentThread() == this.f5729c) {
            if (!this.f5731e.isEmpty()) {
                this.f5638a.mo14329d().f5802i.mo14414a("Callable skipped the worker queue.");
            }
            k4Var.run();
        } else {
            mo14424u(k4Var);
        }
        return k4Var;
    }

    /* renamed from: q */
    public final void mo14420q(Runnable runnable) {
        mo14377l();
        Objects.requireNonNull(runnable, "null reference");
        mo14424u(new C3226k4(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5.length() == 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r3.mo14414a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f5638a.mo14329d().f5802i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5.length() != 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r3.mo14414a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f5638a.mo14329d().f5802i;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    @androidx.annotation.Nullable
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo14421r(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            b.l.a.c.h.b.p4 r0 = r1.f5638a     // Catch:{ all -> 0x0054 }
            b.l.a.c.h.b.m4 r0 = r0.mo14331f()     // Catch:{ all -> 0x0054 }
            r0.mo14420q(r6)     // Catch:{ all -> 0x0054 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0032
            b.l.a.c.h.b.p4 r3 = r1.f5638a
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()
            b.l.a.c.h.b.m3 r3 = r3.f5802i
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0029
            java.lang.String r4 = r4.concat(r5)
            goto L_0x002f
        L_0x0029:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x002f:
            r3.mo14414a(r4)
        L_0x0032:
            return r2
        L_0x0033:
            b.l.a.c.h.b.p4 r3 = r1.f5638a     // Catch:{ all -> 0x0054 }
            b.l.a.c.h.b.o3 r3 = r3.mo14329d()     // Catch:{ all -> 0x0054 }
            b.l.a.c.h.b.m3 r3 = r3.f5802i     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x0048
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x004e
        L_0x0048:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0054 }
            r5.<init>(r4)     // Catch:{ all -> 0x0054 }
            r4 = r5
        L_0x004e:
            r3.mo14414a(r4)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r2 = 0
            return r2
        L_0x0054:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3248m4.mo14421r(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final void mo14422s(Runnable runnable) {
        mo14377l();
        mo14424u(new C3226k4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: t */
    public final void mo14423t(Runnable runnable) {
        mo14377l();
        C3226k4 k4Var = new C3226k4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f5735i) {
            this.f5732f.add(k4Var);
            C3237l4 l4Var = this.f5730d;
            if (l4Var == null) {
                C3237l4 l4Var2 = new C3237l4(this, "Measurement Network", this.f5732f);
                this.f5730d = l4Var2;
                l4Var2.setUncaughtExceptionHandler(this.f5734h);
                this.f5730d.start();
            } else {
                synchronized (l4Var.f5703g) {
                    l4Var.f5703g.notifyAll();
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo14424u(C3226k4<?> k4Var) {
        synchronized (this.f5735i) {
            this.f5731e.add(k4Var);
            C3237l4 l4Var = this.f5729c;
            if (l4Var == null) {
                C3237l4 l4Var2 = new C3237l4(this, "Measurement Worker", this.f5731e);
                this.f5729c = l4Var2;
                l4Var2.setUncaughtExceptionHandler(this.f5733g);
                this.f5729c.start();
            } else {
                synchronized (l4Var.f5703g) {
                    l4Var.f5703g.notifyAll();
                }
            }
        }
    }
}
