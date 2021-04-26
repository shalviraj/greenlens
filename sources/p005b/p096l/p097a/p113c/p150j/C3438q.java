package p005b.p096l.p097a.p113c.p150j;

import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.q */
public final class C3438q implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3428h f6218g;

    /* renamed from: h */
    public final /* synthetic */ C3437p f6219h;

    public C3438q(C3437p pVar, C3428h hVar) {
        this.f6219h = pVar;
        this.f6218g = hVar;
    }

    public final void run() {
        try {
            C3428h a = this.f6219h.f6216b.mo14670a(this.f6218g);
            if (a == null) {
                C3437p pVar = this.f6219h;
                pVar.f6217c.mo14694p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C3430j.f6199b;
            a.mo14683e(executor, this.f6219h);
            a.mo14682d(executor, this.f6219h);
            a.mo14679a(executor, this.f6219h);
        } catch (C3425f e) {
            if (e.getCause() instanceof Exception) {
                this.f6219h.f6217c.mo14694p((Exception) e.getCause());
            } else {
                this.f6219h.f6217c.mo14694p(e);
            }
        } catch (Exception e2) {
            this.f6219h.f6217c.mo14694p(e2);
        }
    }
}
