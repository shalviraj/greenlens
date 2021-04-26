package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Objects;
import java.util.concurrent.Callable;
import p005b.p096l.p097a.p113c.p131e.p140i.C2980u8;

/* renamed from: b.l.a.c.h.b.f9 */
public final class C3176f9 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ C3352v9 f5527a;

    /* renamed from: b */
    public final /* synthetic */ C3220j9 f5528b;

    public C3176f9(C3220j9 j9Var, C3352v9 v9Var) {
        this.f5528b = j9Var;
        this.f5527a = v9Var;
    }

    public final Object call() {
        C2980u8.m5384b();
        if (this.f5528b.mo14341G().mo14197r((String) null, C3134c3.f5415w0)) {
            C3220j9 j9Var = this.f5528b;
            String str = this.f5527a.f6029g;
            Objects.requireNonNull(str, "null reference");
            if (!j9Var.mo14349O(str).mo14234e() || !C3177g.m5991b(this.f5527a.f6028B).mo14234e()) {
                this.f5528b.mo14329d().f5807n.mo14414a("Analytics storage consent denied. Returning null app instance id");
                return null;
            }
        }
        return this.f5528b.mo14367r(this.f5527a).mo14115z();
    }
}
