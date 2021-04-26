package p005b.p096l.p180d.p191q.p192f.p195g;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.q.f.g.s0 */
public final class C4039s0 {

    /* renamed from: a */
    public static final ExecutorService f7417a = C1960d.m2817l("awaitEvenIfOnMainThread task continuation executor");

    /* renamed from: a */
    public static <T> T m7441a(C3428h<T> hVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.mo14685g(f7417a, new C4031p0(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (hVar.mo14692n()) {
            return hVar.mo14688j();
        }
        if (hVar.mo14690l()) {
            throw new CancellationException("Task is already canceled");
        } else if (hVar.mo14691m()) {
            throw new IllegalStateException(hVar.mo14687i());
        } else {
            throw new TimeoutException();
        }
    }
}
