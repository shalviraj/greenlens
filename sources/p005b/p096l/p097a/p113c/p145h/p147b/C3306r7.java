package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: b.l.a.c.h.b.r7 */
public final class C3306r7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5930g;

    /* renamed from: h */
    public final /* synthetic */ C3175f8 f5931h;

    public C3306r7(C3175f8 f8Var, C3352v9 v9Var) {
        this.f5931h = f8Var;
        this.f5930g = v9Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5931h;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Objects.requireNonNull(this.f5930g, "null reference");
            f3Var.mo14161K(this.f5930g);
            this.f5931h.mo14223s();
        } catch (RemoteException e) {
            this.f5931h.f5638a.mo14329d().f5799f.mo14415b("Failed to send measurementEnabled to the service", e);
        }
    }
}
