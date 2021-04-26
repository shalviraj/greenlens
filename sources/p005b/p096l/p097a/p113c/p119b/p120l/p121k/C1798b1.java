package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: b.l.a.c.b.l.k.b1 */
public final class C1798b1 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f3147a;

    /* renamed from: b */
    public final C1794a1 f3148b;

    public C1798b1(C1794a1 a1Var) {
        this.f3148b = a1Var;
    }

    /* renamed from: a */
    public final synchronized void mo12047a() {
        Context context = this.f3147a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f3147a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f3148b.mo12044a();
            mo12047a();
        }
    }
}
