package p005b.p096l.p180d.p213v;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p096l.p097a.p113c.p119b.p126p.p127h.C1964a;

/* renamed from: b.l.d.v.e0 */
public abstract class C4240e0 extends Service {
    @VisibleForTesting

    /* renamed from: g */
    public final ExecutorService f7839g;

    /* renamed from: h */
    public Binder f7840h;

    /* renamed from: i */
    public final Object f7841i;

    /* renamed from: j */
    public int f7842j;

    /* renamed from: k */
    public int f7843k;

    public C4240e0() {
        String simpleName = getClass().getSimpleName();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1964a(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7839g = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f7841i = new Object();
        this.f7843k = 0;
    }

    /* renamed from: a */
    public final void mo15823a(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.f7841i) {
            int i = this.f7843k - 1;
            this.f7843k = i;
            if (i == 0) {
                stopSelfResult(this.f7842j);
            }
        }
    }

    /* renamed from: b */
    public abstract boolean mo15824b(Intent intent);

    /* renamed from: c */
    public abstract void mo15825c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f7840h == null) {
            this.f7840h = new C4248i0(this);
        }
        return this.f7840h;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f7841i) {
            this.f7842j = i2;
            this.f7843k++;
        }
        Intent poll = C4280y.m7833a().f7934d.poll();
        if (poll == null) {
            mo15823a(intent);
            return 2;
        } else if (mo15824b(poll)) {
            mo15823a(intent);
            return 2;
        } else {
            this.f7839g.execute(new C4236c0(this, poll, intent));
            return 3;
        }
    }
}
