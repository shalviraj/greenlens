package p005b.p096l.p180d.p191q.p192f.p195g;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Date;
import p005b.p096l.p180d.p191q.p192f.C3982b;
import p005b.p096l.p180d.p191q.p192f.p195g.C3998b0;
import p005b.p096l.p180d.p191q.p192f.p202m.C4184f;

/* renamed from: b.l.d.q.f.g.k */
public class C4019k implements C3998b0.C3999a {

    /* renamed from: a */
    public final /* synthetic */ C4032q f7364a;

    public C4019k(C4032q qVar) {
        this.f7364a = qVar;
    }

    /* renamed from: a */
    public void mo15529a(@NonNull C4184f fVar, @NonNull Thread thread, @NonNull Throwable th) {
        C4032q qVar = this.f7364a;
        synchronized (qVar) {
            C3982b bVar = C3982b.f7289a;
            bVar.mo15496b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            try {
                C4039s0.m7441a(qVar.f7392e.mo15519c(new C4023m(qVar, new Date(), th, thread, fVar)));
            } catch (Exception e) {
                if (C3982b.f7289a.mo15495a(6)) {
                    Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                }
            }
        }
    }
}
