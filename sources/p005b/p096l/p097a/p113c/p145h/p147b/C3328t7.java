package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.t7 */
public final class C3328t7 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3352v9 f5979g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5980h;

    /* renamed from: i */
    public final /* synthetic */ C3309s f5981i;

    /* renamed from: j */
    public final /* synthetic */ C3175f8 f5982j;

    public C3328t7(C3175f8 f8Var, C3352v9 v9Var, boolean z, C3309s sVar, String str) {
        this.f5982j = f8Var;
        this.f5979g = v9Var;
        this.f5980h = z;
        this.f5981i = sVar;
    }

    public final void run() {
        C3175f8 f8Var = this.f5982j;
        C3170f3 f3Var = f8Var.f5521d;
        if (f3Var == null) {
            f8Var.f5638a.mo14329d().f5799f.mo14414a("Discarding data. Failed to send event to service");
            return;
        }
        Objects.requireNonNull(this.f5979g, "null reference");
        this.f5982j.mo14228x(f3Var, this.f5980h ? null : this.f5981i, this.f5979g);
        this.f5982j.mo14223s();
    }
}
