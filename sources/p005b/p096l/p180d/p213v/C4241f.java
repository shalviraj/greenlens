package p005b.p096l.p180d.p213v;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p005b.p096l.p097a.p113c.p119b.p126p.p127h.C1964a;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.v.f */
public final class C4241f {

    /* renamed from: e */
    public static C4241f f7844e;

    /* renamed from: a */
    public final Context f7845a;

    /* renamed from: b */
    public final ScheduledExecutorService f7846b;

    /* renamed from: c */
    public C4245h f7847c = new C4245h(this, (C4239e) null);

    /* renamed from: d */
    public int f7848d = 1;

    @VisibleForTesting
    public C4241f(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7846b = scheduledExecutorService;
        this.f7845a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C4241f m7784b(Context context) {
        C4241f fVar;
        synchronized (C4241f.class) {
            if (f7844e == null) {
                f7844e = new C4241f(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C1964a("MessengerIpcClient"))));
            }
            fVar = f7844e;
        }
        return fVar;
    }

    /* renamed from: a */
    public final synchronized <T> C3428h<T> mo15828a(C4255m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f7847c.mo15833b(mVar)) {
            C4245h hVar = new C4245h(this, (C4239e) null);
            this.f7847c = hVar;
            hVar.mo15833b(mVar);
        }
        return mVar.f7880b.f6197a;
    }
}
