package p005b.p096l.p180d.p213v;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: b.l.d.v.i0 */
public final class C4248i0 extends Binder {

    /* renamed from: a */
    public final C4240e0 f7865a;

    public C4248i0(C4240e0 e0Var) {
        this.f7865a = e0Var;
    }

    /* renamed from: a */
    public final void mo15839a(C4244g0 g0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f7865a.mo15824b(g0Var.f7852a)) {
                g0Var.mo15831a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f7865a.f7839g.execute(new C4246h0(this, g0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
