package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;

/* renamed from: b.l.a.c.h.b.s4 */
public final class C3314s4 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3118b f5950g;

    /* renamed from: h */
    public final /* synthetic */ C3205i5 f5951h;

    public C3314s4(C3205i5 i5Var, C3118b bVar) {
        this.f5951h = i5Var;
        this.f5950g = bVar;
    }

    public final void run() {
        this.f5951h.f5605a.mo14360k();
        if (this.f5950g.f5304i.mo14428V() == null) {
            C3220j9 j9Var = this.f5951h.f5605a;
            C3118b bVar = this.f5950g;
            Objects.requireNonNull(j9Var);
            String str = bVar.f5302g;
            Objects.requireNonNull(str, "null reference");
            C3352v9 D = j9Var.mo14339D(str);
            if (D != null) {
                j9Var.mo14366q(bVar, D);
                return;
            }
            return;
        }
        C3220j9 j9Var2 = this.f5951h.f5605a;
        C3118b bVar2 = this.f5950g;
        Objects.requireNonNull(j9Var2);
        String str2 = bVar2.f5302g;
        Objects.requireNonNull(str2, "null reference");
        C3352v9 D2 = j9Var2.mo14339D(str2);
        if (D2 != null) {
            j9Var2.mo14365p(bVar2, D2);
        }
    }
}
