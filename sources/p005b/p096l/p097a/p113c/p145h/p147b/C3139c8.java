package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: b.l.a.c.h.b.c8 */
public final class C3139c8 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3163e8 f5451g;

    public C3139c8(C3163e8 e8Var) {
        this.f5451g = e8Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5451g.f5497c;
        Context context = f8Var.f5638a.f5842a;
        C3165ea eaVar = this.f5451g.f5497c.f5638a.f5847f;
        C3175f8.m5974q(f8Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
