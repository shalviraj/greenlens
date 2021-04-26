package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.k7 */
public final class C3229k7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5686g;

    /* renamed from: h */
    public final /* synthetic */ C3035yb f5687h;

    /* renamed from: i */
    public final /* synthetic */ C3175f8 f5688i;

    public C3229k7(C3175f8 f8Var, C3352v9 v9Var, C3035yb ybVar) {
        this.f5688i = f8Var;
        this.f5686g = v9Var;
        this.f5687h = ybVar;
    }

    public final void run() {
        String str = null;
        try {
            C2980u8.m5384b();
            if (!this.f5688i.f5638a.f5848g.mo14197r((String) null, C3134c3.f5411u0) || this.f5688i.f5638a.mo14464q().mo14147s().mo14234e()) {
                C3175f8 f8Var = this.f5688i;
                C3170f3 f3Var = f8Var.f5521d;
                if (f3Var == null) {
                    f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to get app instance id");
                } else {
                    Objects.requireNonNull(this.f5686g, "null reference");
                    str = f3Var.mo14163Q(this.f5686g);
                    if (str != null) {
                        this.f5688i.f5638a.mo14466s().f5897g.set(str);
                        this.f5688i.f5638a.mo14464q().f5427g.mo14128b(str);
                    }
                    this.f5688i.mo14223s();
                }
                this.f5688i.f5638a.mo14467t().mo14525P(this.f5687h, str);
            }
            this.f5688i.f5638a.mo14329d().f5804k.mo14414a("Analytics storage consent denied; will not get app instance id");
            this.f5688i.f5638a.mo14466s().f5897g.set((Object) null);
            this.f5688i.f5638a.mo14464q().f5427g.mo14128b((String) null);
            this.f5688i.f5638a.mo14467t().mo14525P(this.f5687h, str);
        } catch (RemoteException e) {
            this.f5688i.f5638a.mo14329d().f5799f.mo14415b("Failed to get app instance id", e);
        } catch (Throwable th) {
            this.f5688i.f5638a.mo14467t().mo14525P(this.f5687h, (String) null);
            throw th;
        }
    }
}
