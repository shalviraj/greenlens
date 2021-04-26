package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;

/* renamed from: b.l.a.c.h.b.j7 */
public final class C3218j7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5641g;

    /* renamed from: h */
    public final /* synthetic */ C3352v9 f5642h;

    /* renamed from: i */
    public final /* synthetic */ C3175f8 f5643i;

    public C3218j7(C3175f8 f8Var, AtomicReference atomicReference, C3352v9 v9Var) {
        this.f5643i = f8Var;
        this.f5641g = atomicReference;
        this.f5642h = v9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f5641g) {
            try {
                C2980u8.m5384b();
                if (!this.f5643i.f5638a.f5848g.mo14197r((String) null, C3134c3.f5411u0) || this.f5643i.f5638a.mo14464q().mo14147s().mo14234e()) {
                    C3175f8 f8Var = this.f5643i;
                    C3170f3 f3Var = f8Var.f5521d;
                    if (f3Var == null) {
                        f8Var.f5638a.mo14329d().f5799f.mo14414a("Failed to get app instance id");
                        this.f5641g.notify();
                        return;
                    }
                    Objects.requireNonNull(this.f5642h, "null reference");
                    this.f5641g.set(f3Var.mo14163Q(this.f5642h));
                    String str = (String) this.f5641g.get();
                    if (str != null) {
                        this.f5643i.f5638a.mo14466s().f5897g.set(str);
                        this.f5643i.f5638a.mo14464q().f5427g.mo14128b(str);
                    }
                    this.f5643i.mo14223s();
                    atomicReference = this.f5641g;
                    atomicReference.notify();
                    return;
                }
                this.f5643i.f5638a.mo14329d().f5804k.mo14414a("Analytics storage consent denied; will not get app instance id");
                this.f5643i.f5638a.mo14466s().f5897g.set((Object) null);
                this.f5643i.f5638a.mo14464q().f5427g.mo14128b((String) null);
                this.f5641g.set((Object) null);
                this.f5641g.notify();
            } catch (RemoteException e) {
                try {
                    this.f5643i.f5638a.mo14329d().f5799f.mo14415b("Failed to get app instance id", e);
                    atomicReference = this.f5641g;
                } catch (Throwable th) {
                    this.f5641g.notify();
                    throw th;
                }
            }
        }
    }
}
