package p005b.p096l.p097a.p113c.p145h.p147b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.MainThread;
import p005b.p096l.p097a.p113c.p131e.p140i.C2819i3;
import p005b.p096l.p097a.p113c.p131e.p140i.C2857l2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2869m1;

/* renamed from: b.l.a.c.h.b.e4 */
public final class C3159e4 implements ServiceConnection {

    /* renamed from: a */
    public final String f5484a;

    /* renamed from: b */
    public final /* synthetic */ C3171f4 f5485b;

    public C3159e4(C3171f4 f4Var, String str) {
        this.f5485b = f4Var;
        this.f5484a = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                int i = C2857l2.f4880a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                C2819i3 m1Var = queryLocalInterface instanceof C2819i3 ? (C2819i3) queryLocalInterface : new C2869m1(iBinder);
                if (m1Var == null) {
                    this.f5485b.f5505a.mo14329d().f5802i.mo14414a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f5485b.f5505a.mo14329d().f5807n.mo14414a("Install Referrer Service connected");
                this.f5485b.f5505a.mo14331f().mo14420q(new C3147d4(this, m1Var, this));
            } catch (Exception e) {
                this.f5485b.f5505a.mo14329d().f5802i.mo14415b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f5485b.f5505a.mo14329d().f5802i.mo14414a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5485b.f5505a.mo14329d().f5807n.mo14414a("Install Referrer Service disconnected");
    }
}
