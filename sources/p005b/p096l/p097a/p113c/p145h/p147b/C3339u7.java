package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.u7 */
public final class C3339u7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5997g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5998h;

    /* renamed from: i */
    public final /* synthetic */ C3118b f5999i;

    /* renamed from: j */
    public final /* synthetic */ C3175f8 f6000j;

    public C3339u7(C3175f8 f8Var, C3352v9 v9Var, boolean z, C3118b bVar, C3118b bVar2) {
        this.f6000j = f8Var;
        this.f5997g = v9Var;
        this.f5998h = z;
        this.f5999i = bVar;
    }

    public final void run() {
        C3175f8 f8Var = this.f6000j;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Objects.requireNonNull(this.f5997g, "null reference");
        this.f6000j.mo14228x(f3Var, this.f5998h ? null : this.f5999i, this.f5997g);
        this.f6000j.mo14223s();
    }
}
