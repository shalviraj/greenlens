package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

/* renamed from: b.l.a.c.b.l.k.k0 */
public final class C1837k0 extends C2016c {

    /* renamed from: a */
    public final /* synthetic */ C1834j0 f3260a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1837k0(C1834j0 j0Var, Looper looper) {
        super(looper);
        this.f3260a = j0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C1834j0 j0Var = this.f3260a;
            j0Var.f3236b.lock();
            try {
                if (j0Var.mo12147m()) {
                    j0Var.mo12146l();
                }
            } finally {
                j0Var.f3236b.unlock();
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C1834j0.m2467k(this.f3260a);
        }
    }
}
