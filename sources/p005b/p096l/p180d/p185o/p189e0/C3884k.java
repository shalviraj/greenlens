package p005b.p096l.p180d.p185o.p189e0;

import android.os.Handler;
import android.os.HandlerThread;
import com.amplitude.api.Constants;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2031a9;
import p005b.p096l.p180d.C3825d;

/* renamed from: b.l.d.o.e0.k */
public final class C3884k {

    /* renamed from: h */
    public static final C1955a f7157h = new C1955a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a */
    public final C3825d f7158a;

    /* renamed from: b */
    public volatile long f7159b;

    /* renamed from: c */
    public volatile long f7160c;

    /* renamed from: d */
    public final long f7161d = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;

    /* renamed from: e */
    public final HandlerThread f7162e;

    /* renamed from: f */
    public final Handler f7163f;

    /* renamed from: g */
    public final Runnable f7164g;

    public C3884k(C3825d dVar) {
        f7157h.mo12285d("Initializing TokenRefresher", new Object[0]);
        this.f7158a = dVar;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f7162e = handlerThread;
        handlerThread.start();
        this.f7163f = new C2031a9(handlerThread.getLooper());
        dVar.mo15344a();
        this.f7164g = new C3882j(this, dVar.f7043b);
    }
}
