package p005b.p096l.p180d.p213v;

import android.content.Intent;
import android.util.Log;

/* renamed from: b.l.d.v.f0 */
public final /* synthetic */ class C4242f0 implements Runnable {

    /* renamed from: g */
    public final C4244g0 f7849g;

    /* renamed from: h */
    public final Intent f7850h;

    public C4242f0(C4244g0 g0Var, Intent intent) {
        this.f7849g = g0Var;
        this.f7850h = intent;
    }

    public final void run() {
        C4244g0 g0Var = this.f7849g;
        String action = this.f7850h.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        g0Var.mo15831a();
    }
}
