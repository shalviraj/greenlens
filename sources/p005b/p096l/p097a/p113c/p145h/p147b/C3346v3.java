package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;

/* renamed from: b.l.a.c.h.b.v3 */
public final class C3346v3 extends BroadcastReceiver {

    /* renamed from: a */
    public final C3220j9 f6011a;

    /* renamed from: b */
    public boolean f6012b;

    /* renamed from: c */
    public boolean f6013c;

    static {
        Class<C3346v3> cls = C3346v3.class;
    }

    public C3346v3(C3220j9 j9Var) {
        this.f6011a = j9Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo14607a() {
        this.f6011a.mo14347M();
        this.f6011a.mo14331f().mo14126h();
        this.f6011a.mo14331f().mo14126h();
        if (this.f6012b) {
            this.f6011a.mo14329d().f5807n.mo14414a("Unregistering connectivity change receiver");
            this.f6012b = false;
            this.f6013c = false;
            try {
                this.f6011a.f5658k.f5842a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6011a.mo14329d().f5799f.mo14415b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.f6011a.mo14347M();
        String action = intent.getAction();
        this.f6011a.mo14329d().f5807n.mo14415b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C3324t3 t3Var = this.f6011a.f5649b;
            C3220j9.m6111F(t3Var);
            boolean l = t3Var.mo14591l();
            if (this.f6013c != l) {
                this.f6013c = l;
                this.f6011a.mo14331f().mo14420q(new C3335u3(this, l));
                return;
            }
            return;
        }
        this.f6011a.mo14329d().f5802i.mo14415b("NetworkBroadcastReceiver received unknown action", action);
    }
}
