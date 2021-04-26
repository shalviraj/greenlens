package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.Objects;
import p005b.p096l.p097a.p151d.p152a.p156c.C3565a;

/* renamed from: b.l.a.d.a.b.z0 */
public final /* synthetic */ class C3563z0 implements Runnable {

    /* renamed from: g */
    public final C3480c1 f6627g;

    /* renamed from: h */
    public final int f6628h;

    /* renamed from: i */
    public final String f6629i;

    public C3563z0(C3480c1 c1Var, int i, String str) {
        this.f6627g = c1Var;
        this.f6628h = i;
        this.f6629i = str;
    }

    public final void run() {
        C3480c1 c1Var = this.f6627g;
        int i = this.f6628h;
        String str = this.f6629i;
        Objects.requireNonNull(c1Var);
        try {
            c1Var.mo14766j(i, str, 4);
        } catch (C3565a e) {
            C3480c1.f6317g.mo14884b(5, "notifyModuleCompleted failed", new Object[]{e});
        }
    }
}
