package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.RemoteException;
import p005b.p096l.p097a.p113c.p131e.p140i.C3035yb;

/* renamed from: b.l.a.c.h.b.p7 */
public final class C3284p7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3309s f5869g;

    /* renamed from: h */
    public final /* synthetic */ String f5870h;

    /* renamed from: i */
    public final /* synthetic */ C3035yb f5871i;

    /* renamed from: j */
    public final /* synthetic */ C3175f8 f5872j;

    public C3284p7(C3175f8 f8Var, C3309s sVar, String str, C3035yb ybVar) {
        this.f5872j = f8Var;
        this.f5869g = sVar;
        this.f5870h = str;
        this.f5871i = ybVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C3175f8 f8Var = this.f5872j;
            C3170f3 f3Var = f8Var.f5521d;
            if (f3Var == null) {
                f8Var.f5638a.mo14329d().f5799f.mo14414a("Discarding data. Failed to send event to service to bundle");
            } else {
                bArr = f3Var.mo14170l1(this.f5869g, this.f5870h);
                this.f5872j.mo14223s();
            }
        } catch (RemoteException e) {
            this.f5872j.f5638a.mo14329d().f5799f.mo14415b("Failed to send event to the service to bundle", e);
        } catch (Throwable th) {
            this.f5872j.f5638a.mo14467t().mo14528S(this.f5871i, bArr);
            throw th;
        }
        this.f5872j.f5638a.mo14467t().mo14528S(this.f5871i, bArr);
    }
}
