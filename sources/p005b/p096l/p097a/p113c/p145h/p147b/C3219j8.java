package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.ArrayList;

/* renamed from: b.l.a.c.h.b.j8 */
public final class C3219j8 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3220j9 f5644g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f5645h;

    public C3219j8(C3220j9 j9Var, Runnable runnable) {
        this.f5644g = j9Var;
        this.f5645h = runnable;
    }

    public final void run() {
        this.f5644g.mo14360k();
        C3220j9 j9Var = this.f5644g;
        Runnable runnable = this.f5645h;
        j9Var.mo14331f().mo14126h();
        if (j9Var.f5662o == null) {
            j9Var.f5662o = new ArrayList();
        }
        j9Var.f5662o.add(runnable);
        this.f5644g.mo14357h();
    }
}
