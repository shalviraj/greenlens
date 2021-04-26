package p005b.p096l.p180d.p213v;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: b.l.d.v.g0 */
public final class C4244g0 {

    /* renamed from: a */
    public final Intent f7852a;

    /* renamed from: b */
    public final BroadcastReceiver.PendingResult f7853b;

    /* renamed from: c */
    public boolean f7854c = false;

    /* renamed from: d */
    public final ScheduledFuture<?> f7855d;

    public C4244g0(Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f7852a = intent;
        this.f7853b = pendingResult;
        this.f7855d = scheduledExecutorService.schedule(new C4242f0(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final synchronized void mo15831a() {
        if (!this.f7854c) {
            this.f7853b.finish();
            this.f7855d.cancel(false);
            this.f7854c = true;
        }
    }
}
