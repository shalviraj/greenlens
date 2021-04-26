package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.b8 */
public final class C3127b8 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3170f3 f5327g;

    /* renamed from: h */
    public final /* synthetic */ C3163e8 f5328h;

    public C3127b8(C3163e8 e8Var, C3170f3 f3Var) {
        this.f5328h = e8Var;
        this.f5327g = f3Var;
    }

    public final void run() {
        synchronized (this.f5328h) {
            this.f5328h.f5495a = false;
            if (!this.f5328h.f5497c.mo14227w()) {
                this.f5328h.f5497c.f5638a.mo14329d().f5806m.mo14414a("Connected to remote service");
                C3175f8 f8Var = this.f5328h.f5497c;
                C3170f3 f3Var = this.f5327g;
                f8Var.mo14126h();
                Objects.requireNonNull(f3Var, "null reference");
                f8Var.f5521d = f3Var;
                f8Var.mo14223s();
                f8Var.mo14225u();
            }
        }
    }
}
