package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p180d.p191q.p192f.C3982b;

/* renamed from: b.l.d.q.f.g.f0 */
public class C4010f0 extends C4000c {

    /* renamed from: g */
    public final /* synthetic */ String f7346g;

    /* renamed from: h */
    public final /* synthetic */ ExecutorService f7347h;

    /* renamed from: i */
    public final /* synthetic */ long f7348i;

    /* renamed from: j */
    public final /* synthetic */ TimeUnit f7349j;

    public C4010f0(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.f7346g = str;
        this.f7347h = executorService;
        this.f7348i = j;
        this.f7349j = timeUnit;
    }

    /* renamed from: a */
    public void mo15511a() {
        try {
            C3982b bVar = C3982b.f7289a;
            bVar.mo15496b("Executing shutdown hook for " + this.f7346g);
            this.f7347h.shutdown();
            if (!this.f7347h.awaitTermination(this.f7348i, this.f7349j)) {
                bVar.mo15496b(this.f7346g + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f7347h.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C3982b.f7289a.mo15496b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f7346g}));
            this.f7347h.shutdownNow();
        }
    }
}
