package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.n7 */
public final class C3262n7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5777g;

    /* renamed from: h */
    public final /* synthetic */ Bundle f5778h;

    /* renamed from: i */
    public final /* synthetic */ C3175f8 f5779i;

    public C3262n7(C3175f8 f8Var, C3352v9 v9Var, Bundle bundle) {
        this.f5779i = f8Var;
        this.f5777g = v9Var;
        this.f5778h = bundle;
    }

    public final void run() {
        C3175f8 f8Var = this.f5779i;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to send default event parameters to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f5777g, "null reference");
            f3Var.mo14169c1(this.f5778h, this.f5777g);
        } catch (RemoteException e) {
            this.f5779i.f5638a.mo14329d().f5799f.mo14415b("Failed to send default event parameters to service", e);
        }
    }
}
