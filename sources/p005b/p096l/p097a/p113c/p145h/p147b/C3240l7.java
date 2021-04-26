package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p122m.p123v.C1948a;

/* renamed from: b.l.a.c.h.b.l7 */
public final class C3240l7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5713g;

    /* renamed from: h */
    public final /* synthetic */ C3175f8 f5714h;

    public C3240l7(C3175f8 f8Var, C3352v9 v9Var) {
        this.f5714h = f8Var;
        this.f5713g = v9Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5714h;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Objects.requireNonNull(this.f5713g, "null reference");
            f3Var.mo14157A0(this.f5713g);
            this.f5714h.f5638a.mo14469v().mo14265m();
            this.f5714h.mo14228x(f3Var, (C1948a) null, this.f5713g);
            this.f5714h.mo14223s();
        } catch (RemoteException e) {
            this.f5714h.f5638a.mo14329d().f5799f.mo14415b("Failed to send app launch to the service", e);
        }
    }
}
