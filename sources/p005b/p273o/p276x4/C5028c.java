package p005b.p273o.p276x4;

import p005b.p273o.C4882j1;
import p005b.p273o.C4956r2;
import p005b.p273o.C5052z1;
import p005b.p273o.C5053z2;

/* renamed from: b.o.x4.c */
public class C5028c {

    /* renamed from: a */
    public final C4882j1 f9723a;

    /* renamed from: b */
    public final C5026a f9724b;

    /* renamed from: c */
    public final C4956r2 f9725c;

    /* renamed from: d */
    public C5029d f9726d;

    public C5028c(C4882j1 j1Var, C4956r2 r2Var, C5053z2 z2Var, C5052z1 z1Var) {
        this.f9723a = j1Var;
        this.f9725c = r2Var;
        this.f9724b = new C5026a(j1Var, z2Var, z1Var);
    }

    /* renamed from: a */
    public final void mo16785a() {
        this.f9726d = this.f9724b.mo16783b() ? new C5032g(this.f9723a, this.f9724b, new C5033h(this.f9725c)) : new C5030e(this.f9723a, this.f9724b, new C5031f(this.f9725c));
    }

    /* renamed from: b */
    public C5029d mo16786b() {
        if (this.f9726d == null) {
            mo16785a();
        } else if ((this.f9724b.mo16783b() || !(this.f9726d instanceof C5030e)) && (!this.f9724b.mo16783b() || !(this.f9726d instanceof C5032g))) {
            mo16785a();
        }
        return this.f9726d;
    }
}
