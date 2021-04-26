package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.i7 */
public final class C3207i7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5610g;

    /* renamed from: h */
    public final /* synthetic */ C3175f8 f5611h;

    public C3207i7(C3175f8 f8Var, C3352v9 v9Var) {
        this.f5611h = f8Var;
        this.f5610g = v9Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5611h;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f5610g, "null reference");
            f3Var.mo14165T0(this.f5610g);
        } catch (RemoteException e) {
            this.f5611h.f5638a.mo14329d().f5799f.mo14415b("Failed to reset data on the service: remote exception", e);
        }
        this.f5611h.mo14223s();
    }
}
