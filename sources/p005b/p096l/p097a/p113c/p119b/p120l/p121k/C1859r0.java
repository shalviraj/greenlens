package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p131e.p134c.C2016c;

/* renamed from: b.l.a.c.b.l.k.r0 */
public final class C1859r0 extends C2016c {

    /* renamed from: a */
    public final /* synthetic */ C1853p0 f3296a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1859r0(C1853p0 p0Var, Looper looper) {
        super(looper);
        this.f3296a = p0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C1849o0 o0Var = (C1849o0) message.obj;
            C1853p0 p0Var = this.f3296a;
            Objects.requireNonNull(o0Var);
            p0Var.f3276a.lock();
            try {
                if (p0Var.f3286k == o0Var.f3266a) {
                    o0Var.mo12043a();
                }
            } finally {
                p0Var.f3276a.unlock();
            }
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
