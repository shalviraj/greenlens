package p005b.p096l.p180d.p213v;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b.l.d.v.j0 */
public final class C4250j0 {

    /* renamed from: a */
    public static final /* synthetic */ int f7867a = 0;

    /* renamed from: a */
    public static Executor m7791a() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C4256m0.f7883a);
    }
}
