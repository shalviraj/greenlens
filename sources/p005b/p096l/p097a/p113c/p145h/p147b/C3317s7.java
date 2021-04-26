package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.s7 */
public final class C3317s7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5958g;

    /* renamed from: h */
    public final /* synthetic */ C3175f8 f5959h;

    public C3317s7(C3175f8 f8Var, C3352v9 v9Var) {
        this.f5959h = f8Var;
        this.f5958g = v9Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5959h;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to send consent settings to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f5958g, "null reference");
            f3Var.mo14160D(this.f5958g);
            this.f5959h.mo14223s();
        } catch (RemoteException e) {
            this.f5959h.f5638a.mo14329d().f5799f.mo14415b("Failed to send consent settings to the service", e);
        }
    }
}
