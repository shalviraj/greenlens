package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.SystemClock;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;

/* renamed from: b.l.a.c.e.i.w */
public abstract class C2997w implements Runnable {

    /* renamed from: g */
    public final long f5094g = System.currentTimeMillis();

    /* renamed from: h */
    public final long f5095h;

    /* renamed from: i */
    public final boolean f5096i;

    /* renamed from: j */
    public final /* synthetic */ C2790g0 f5097j;

    public C2997w(C2790g0 g0Var, boolean z) {
        this.f5097j = g0Var;
        Objects.requireNonNull((C1959c) g0Var.f4739b);
        Objects.requireNonNull((C1959c) g0Var.f4739b);
        this.f5095h = SystemClock.elapsedRealtime();
        this.f5096i = z;
    }

    /* renamed from: a */
    public abstract void mo13214a();

    /* renamed from: b */
    public void mo13298b() {
    }

    public final void run() {
        if (this.f5097j.f4744g) {
            mo13298b();
            return;
        }
        try {
            mo13214a();
        } catch (Exception e) {
            this.f5097j.mo13337a(e, false, this.f5096i);
            mo13298b();
        }
    }
}
