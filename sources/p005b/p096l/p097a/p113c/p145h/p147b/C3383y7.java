package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.y7 */
public final class C3383y7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3170f3 f6126g;

    /* renamed from: h */
    public final /* synthetic */ C3163e8 f6127h;

    public C3383y7(C3163e8 e8Var, C3170f3 f3Var) {
        this.f6127h = e8Var;
        this.f6126g = f3Var;
    }

    public final void run() {
        synchronized (this.f6127h) {
            this.f6127h.f5495a = false;
            if (!this.f6127h.f5497c.mo14227w()) {
                this.f6127h.f5497c.f5638a.mo14329d().f5807n.mo14414a("Connected to service");
                C3175f8 f8Var = this.f6127h.f5497c;
                C3170f3 f3Var = this.f6126g;
                f8Var.mo14126h();
                Objects.requireNonNull(f3Var, "null reference");
                f8Var.f5521d = f3Var;
                f8Var.mo14223s();
                f8Var.mo14225u();
            }
        }
    }
}
