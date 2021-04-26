package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;

/* renamed from: b.l.a.c.h.b.m7 */
public final class C3251m7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3371x6 f5746g;

    /* renamed from: h */
    public final /* synthetic */ C3175f8 f5747h;

    public C3251m7(C3175f8 f8Var, C3371x6 x6Var) {
        this.f5747h = f8Var;
        this.f5746g = x6Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5747h;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to send current screen to service");
            return;
        }
        try {
            C3371x6 x6Var = this.f5746g;
            if (x6Var == null) {
                f3Var.mo14159C0(0, (String) null, (String) null, f8Var.f5638a.f5842a.getPackageName());
            } else {
                f3Var.mo14159C0(x6Var.f6094c, x6Var.f6092a, x6Var.f6093b, f8Var.f5638a.f5842a.getPackageName());
            }
            this.f5747h.mo14223s();
        } catch (RemoteException e) {
            this.f5747h.f5638a.mo14329d().f5799f.mo14415b("Failed to send current screen to the service", e);
        }
    }
}
