package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.g7 */
public final class C3185g7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f5550g;

    /* renamed from: h */
    public final /* synthetic */ String f5551h;

    /* renamed from: i */
    public final /* synthetic */ C3352v9 f5552i;

    /* renamed from: j */
    public final /* synthetic */ boolean f5553j;

    /* renamed from: k */
    public final /* synthetic */ C3035yb f5554k;

    /* renamed from: l */
    public final /* synthetic */ C3175f8 f5555l;

    public C3185g7(C3175f8 f8Var, String str, String str2, C3352v9 v9Var, boolean z, C3035yb ybVar) {
        this.f5555l = f8Var;
        this.f5550g = str;
        this.f5551h = str2;
        this.f5552i = v9Var;
        this.f5553j = z;
        this.f5554k = ybVar;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C3175f8 f8Var = this.f5555l;
            C3170f3 f3Var = f8Var.f5521d;
            if (f3Var == null) {
                f8Var.f5638a.mo14329d().f5799f.mo14416c("Failed to get user properties; not connected to service", this.f5550g, this.f5551h);
                this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle2);
                return;
            }
            Objects.requireNonNull(this.f5552i, "null reference");
            List<C3253m9> N0 = f3Var.mo14162N0(this.f5550g, this.f5551h, this.f5553j, this.f5552i);
            bundle = new Bundle();
            if (N0 != null) {
                for (C3253m9 next : N0) {
                    String str = next.f5754k;
                    if (str != null) {
                        bundle.putString(next.f5751h, str);
                    } else {
                        Long l = next.f5753j;
                        if (l != null) {
                            bundle.putLong(next.f5751h, l.longValue());
                        } else {
                            Double d = next.f5756m;
                            if (d != null) {
                                bundle.putDouble(next.f5751h, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f5555l.mo14223s();
                this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f5555l.f5638a.mo14329d().f5799f.mo14416c("Failed to get user properties; remote exception", this.f5550g, e);
                    this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f5555l.f5638a.mo14329d().f5799f.mo14416c("Failed to get user properties; remote exception", this.f5550g, e);
            this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f5555l.f5638a.mo14467t().mo14530U(this.f5554k, bundle2);
            throw th;
        }
    }
}
