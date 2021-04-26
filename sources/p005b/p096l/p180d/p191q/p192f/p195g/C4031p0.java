package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p005b.p096l.p097a.p113c.p150j.C3414a;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.q.f.g.p0 */
public final /* synthetic */ class C4031p0 implements C3414a {

    /* renamed from: a */
    public final CountDownLatch f7386a;

    public C4031p0(CountDownLatch countDownLatch) {
        this.f7386a = countDownLatch;
    }

    /* renamed from: a */
    public Object mo14670a(C3428h hVar) {
        CountDownLatch countDownLatch = this.f7386a;
        ExecutorService executorService = C4039s0.f7417a;
        countDownLatch.countDown();
        return null;
    }
}
