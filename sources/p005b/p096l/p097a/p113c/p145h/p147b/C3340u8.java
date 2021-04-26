package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import p005b.p096l.p097a.p113c.p131e.p140i.C2916p9;

/* renamed from: b.l.a.c.h.b.u8 */
public final class C3340u8 extends C3111a4 {

    /* renamed from: c */
    public Handler f6001c;

    /* renamed from: d */
    public final C3329t8 f6002d = new C3329t8(this);

    /* renamed from: e */
    public final C3318s8 f6003e = new C3318s8(this);

    /* renamed from: f */
    public final C3296q8 f6004f = new C3296q8(this);

    public C3340u8(C3281p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: k */
    public final boolean mo14067k() {
        return false;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo14606l() {
        mo14126h();
        if (this.f6001c == null) {
            this.f6001c = new C2916p9(Looper.getMainLooper());
        }
    }
}
