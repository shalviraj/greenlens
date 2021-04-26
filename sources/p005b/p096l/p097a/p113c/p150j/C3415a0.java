package p005b.p096l.p097a.p113c.p150j;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.a0 */
public final class C3415a0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3428h f6183g;

    /* renamed from: h */
    public final /* synthetic */ C3447z f6184h;

    public C3415a0(C3447z zVar, C3428h hVar) {
        this.f6184h = zVar;
        this.f6183g = hVar;
    }

    public final void run() {
        try {
            C3428h<TContinuationResult> a = this.f6184h.f6240b.mo14700a(this.f6183g.mo14688j());
            if (a == null) {
                C3447z zVar = this.f6184h;
                zVar.f6241c.mo14694p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3430j.f6199b;
            a.mo14683e(executor, this.f6184h);
            a.mo14682d(executor, this.f6184h);
            a.mo14679a(executor, this.f6184h);
        } catch (C3425f e) {
            if (e.getCause() instanceof Exception) {
                this.f6184h.f6241c.mo14694p((Exception) e.getCause());
                return;
            }
            this.f6184h.f6241c.mo14694p(e);
        } catch (CancellationException unused) {
            this.f6184h.f6241c.mo14696r();
        } catch (Exception e2) {
            this.f6184h.f6241c.mo14694p(e2);
        }
    }
}
