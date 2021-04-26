package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p097a.p113c.p119b.p126p.p127h.C1965b;

/* renamed from: b.l.a.c.b.l.k.q0 */
public final class C1856q0 {

    /* renamed from: a */
    public static final ExecutorService f3292a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1965b("GAC_Executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3292a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
