package p416l.p417a;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo24460bv = {1, 0, 3}, mo24461d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0006R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo24462d2 = {"Ll/a/b0;", "Ll/a/m0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Ld/r;", "run", "()V", "C0", "", "debugStatus", "I", "Ljava/lang/Thread;", "v0", "()Ljava/lang/Thread;", "thread", "", "D0", "()Z", "isShutdownRequested", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "m", "J", "KEEP_ALIVE_NANOS", "<init>", "kotlinx-coroutines-core"}, mo24463k = 1, mo24464mv = {1, 4, 2})
/* renamed from: l.a.b0 */
public final class C7703b0 extends C7741m0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m */
    public static final long f15241m;

    /* renamed from: n */
    public static final C7703b0 f15242n;

    static {
        Long l;
        C7703b0 b0Var = new C7703b0();
        f15242n = b0Var;
        b0Var.mo25397s0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f15241m = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: C0 */
    public final synchronized void mo25314C0() {
        if (mo25315D0()) {
            debugStatus = 3;
            mo25407A0();
            notifyAll();
        }
    }

    /* renamed from: D0 */
    public final boolean mo25315D0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        _thread = null;
        mo25314C0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (mo25411y0() == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008f, code lost:
        mo25317v0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            l.a.o1 r0 = p416l.p417a.C7750o1.f15297b
            java.lang.ThreadLocal<l.a.l0> r0 = p416l.p417a.C7750o1.f15296a
            r0.set(r12)
            r0 = 0
            monitor-enter(r12)     // Catch:{ all -> 0x0083 }
            boolean r1 = r12.mo25315D0()     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0011
            r1 = 0
            goto L_0x0017
        L_0x0011:
            r1 = 1
            debugStatus = r1     // Catch:{ all -> 0x0080 }
            r12.notifyAll()     // Catch:{ all -> 0x0080 }
        L_0x0017:
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0029
            _thread = r0
            r12.mo25314C0()
            boolean r0 = r12.mo25411y0()
            if (r0 != 0) goto L_0x0028
            r12.mo25317v0()
        L_0x0028:
            return
        L_0x0029:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x002f:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0083 }
            long r5 = r12.mo25412z0()     // Catch:{ all -> 0x0083 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0062
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0083 }
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0047
            long r3 = f15241m     // Catch:{ all -> 0x0083 }
            long r3 = r3 + r10
        L_0x0047:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005c
            _thread = r0
            r12.mo25314C0()
            boolean r0 = r12.mo25411y0()
            if (r0 != 0) goto L_0x005b
            r12.mo25317v0()
        L_0x005b:
            return
        L_0x005c:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0063
            r5 = r10
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x002f
            boolean r7 = r12.mo25315D0()     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x007c
            _thread = r0
            r12.mo25314C0()
            boolean r0 = r12.mo25411y0()
            if (r0 != 0) goto L_0x007b
            r12.mo25317v0()
        L_0x007b:
            return
        L_0x007c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0083 }
            goto L_0x002f
        L_0x0080:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            _thread = r0
            r12.mo25314C0()
            boolean r0 = r12.mo25411y0()
            if (r0 != 0) goto L_0x0092
            r12.mo25317v0()
        L_0x0092:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7703b0.run():void");
    }

    /* renamed from: v0 */
    public Thread mo25317v0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
