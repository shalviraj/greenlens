package p005b.p096l.p097a.p113c.p150j;

import java.util.concurrent.Callable;

/* renamed from: b.l.a.c.j.f0 */
public final class C3426f0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3423e0 f6195g;

    /* renamed from: h */
    public final /* synthetic */ Callable f6196h;

    public C3426f0(C3423e0 e0Var, Callable callable) {
        this.f6195g = e0Var;
        this.f6196h = callable;
    }

    public final void run() {
        try {
            this.f6195g.mo14695q(this.f6196h.call());
        } catch (Exception e) {
            this.f6195g.mo14694p(e);
        }
    }
}
