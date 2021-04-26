package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.w7 */
public final class C3361w7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f6071g;

    /* renamed from: h */
    public final /* synthetic */ String f6072h;

    /* renamed from: i */
    public final /* synthetic */ C3352v9 f6073i;

    /* renamed from: j */
    public final /* synthetic */ C3035yb f6074j;

    /* renamed from: k */
    public final /* synthetic */ C3175f8 f6075k;

    public C3361w7(C3175f8 f8Var, String str, String str2, C3352v9 v9Var, C3035yb ybVar) {
        this.f6075k = f8Var;
        this.f6071g = str;
        this.f6072h = str2;
        this.f6073i = v9Var;
        this.f6074j = ybVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C3175f8 f8Var = this.f6075k;
            C3170f3 f3Var = f8Var.f5521d;
            if (f3Var == null) {
                f8Var.f5638a.mo14329d().f5799f.mo14416c("Failed to get conditional properties; not connected to service", this.f6071g, this.f6072h);
            } else {
                Objects.requireNonNull(this.f6073i, "null reference");
                arrayList = C3297q9.m6340W(f3Var.mo14171r(this.f6071g, this.f6072h, this.f6073i));
                this.f6075k.mo14223s();
            }
        } catch (RemoteException e) {
            this.f6075k.f5638a.mo14329d().f5799f.mo14417d("Failed to get conditional properties; remote exception", this.f6071g, this.f6072h, e);
        } catch (Throwable th) {
            this.f6075k.f5638a.mo14467t().mo14531V(this.f6074j, arrayList);
            throw th;
        }
        this.f6075k.f5638a.mo14467t().mo14531V(this.f6074j, arrayList);
    }
}
