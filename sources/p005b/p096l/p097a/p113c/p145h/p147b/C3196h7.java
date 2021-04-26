package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.h7 */
public final class C3196h7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5584g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5585h;

    /* renamed from: i */
    public final /* synthetic */ C3253m9 f5586i;

    /* renamed from: j */
    public final /* synthetic */ C3175f8 f5587j;

    public C3196h7(C3175f8 f8Var, C3352v9 v9Var, boolean z, C3253m9 m9Var) {
        this.f5587j = f8Var;
        this.f5584g = v9Var;
        this.f5585h = z;
        this.f5586i = m9Var;
    }

    public final void run() {
        C3175f8 f8Var = this.f5587j;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Discarding data. Failed to set user property");
            return;
        }
        Objects.requireNonNull(this.f5584g, "null reference");
        this.f5587j.mo14228x(f3Var, this.f5585h ? null : this.f5586i, this.f5584g);
        this.f5587j.mo14223s();
    }
}
