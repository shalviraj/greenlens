package p416l.p417a;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p415c0.C7694h;

/* renamed from: l.a.m */
public final class C7739m extends C7755q0 {

    /* renamed from: h */
    public static final int f15284h;

    /* renamed from: i */
    public static final C7739m f15285i = new C7739m();
    private static volatile Executor pool;

    /* renamed from: l.a.m$a */
    public static final class C7740a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f15286a;

        public C7740a(AtomicInteger atomicInteger) {
            this.f15286a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder u = C0843a.m460u("CommonPool-worker-");
            u.append(this.f15286a.incrementAndGet());
            Thread thread = new Thread(runnable, u.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer I = C7694h.m13918I(str);
            if (I == null || I.intValue() < 1) {
                throw new IllegalStateException(C0843a.m451l("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = I.intValue();
        } else {
            i = -1;
        }
        f15284h = i;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        p416l.p417a.C7703b0.f15242n.mo25409w0(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25402n0(p298d.p337v.C6827f r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            java.util.concurrent.Executor r1 = pool     // Catch:{ RejectedExecutionException -> 0x0019 }
            if (r1 == 0) goto L_0x0005
            goto L_0x0012
        L_0x0005:
            monitor-enter(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            java.util.concurrent.Executor r1 = pool     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            java.util.concurrent.ExecutorService r1 = r0.mo25404q0()     // Catch:{ all -> 0x0016 }
            pool = r1     // Catch:{ all -> 0x0016 }
        L_0x0011:
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0012:
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0019 }
            goto L_0x001e
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ RejectedExecutionException -> 0x0019 }
            throw r1     // Catch:{ RejectedExecutionException -> 0x0019 }
        L_0x0019:
            l.a.b0 r1 = p416l.p417a.C7703b0.f15242n
            r1.mo25409w0(r2)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p416l.p417a.C7739m.mo25402n0(d.v.f, java.lang.Runnable):void");
    }

    /* renamed from: p0 */
    public final ExecutorService mo25403p0() {
        return Executors.newFixedThreadPool(mo25405r0(), new C7740a(new AtomicInteger()));
    }

    /* renamed from: q0 */
    public final ExecutorService mo25404q0() {
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        if (System.getSecurityManager() != null) {
            return mo25403p0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return mo25403p0();
        }
        if (f15284h < 0) {
            try {
                Object invoke = cls.getMethod("commonPool", new Class[0]).invoke((Object) null, new Object[0]);
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                Objects.requireNonNull(f15285i);
                executorService.submit(C7745n.f15293g);
                try {
                    Object invoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                    if (!(invoke2 instanceof Integer)) {
                        invoke2 = null;
                    }
                    num = (Integer) invoke2;
                } catch (Throwable unused3) {
                    num = null;
                }
                if (!(num != null && num.intValue() >= 1)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f15285i.mo25405r0())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused4) {
        }
        return executorService2 != null ? executorService2 : mo25403p0();
    }

    /* renamed from: r0 */
    public final int mo25405r0() {
        Integer valueOf = Integer.valueOf(f15284h);
        int i = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        if (availableProcessors >= 1) {
            i = availableProcessors;
        }
        return i;
    }

    public String toString() {
        return "CommonPool";
    }
}
