package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: b.l.a.c.e.i.f0 */
public final class C2777f0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public final /* synthetic */ C2790g0 f4718g;

    public C2777f0(C2790g0 g0Var) {
        this.f4718g = g0Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C3023y(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C2763e0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C2721b0(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C2707a0(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C2930qa qaVar = new C2930qa();
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C2749d0(this, activity, qaVar));
        Bundle n = qaVar.mo13604n(50);
        if (n != null) {
            bundle.putAll(n);
        }
    }

    public final void onActivityStarted(Activity activity) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C3036z(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        C2790g0 g0Var = this.f4718g;
        g0Var.f4740c.execute(new C2735c0(this, activity));
    }
}
