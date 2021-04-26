package p298d.p299a.p300a.p301a.p303y0.p405l;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7173i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.x */
public final class C7581x extends C7579w implements C7547n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7581x(C7489j0 j0Var, C7489j0 j0Var2) {
        super(j0Var, j0Var2);
        C6888i.m12438e(j0Var, "lowerBound");
        C6888i.m12438e(j0Var2, "upperBound");
    }

    /* renamed from: D */
    public C7452c0 mo23565D(C7452c0 c0Var) {
        C7481g1 g1Var;
        C6888i.m12438e(c0Var, "replacement");
        C7481g1 Y = c0Var.mo25056Y();
        if (Y instanceof C7579w) {
            g1Var = Y;
        } else if (Y instanceof C7489j0) {
            C7455d0 d0Var = C7455d0.f14869a;
            C7489j0 j0Var = (C7489j0) Y;
            g1Var = C7455d0.m13428c(j0Var, j0Var.mo23545Z(true));
        } else {
            throw new C6766h();
        }
        return C5266a.m9980k2(g1Var, Y);
    }

    /* renamed from: Z */
    public C7481g1 mo23545Z(boolean z) {
        C7455d0 d0Var = C7455d0.f14869a;
        return C7455d0.m13428c(this.f15029h.mo23545Z(z), this.f15030i.mo23545Z(z));
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        C7455d0 d0Var = C7455d0.f14869a;
        return C7455d0.m13428c(this.f15029h.mo23568d0(hVar), this.f15030i.mo23568d0(hVar));
    }

    /* renamed from: c0 */
    public C7489j0 mo23548c0() {
        return this.f15029h;
    }

    /* renamed from: d0 */
    public String mo23549d0(C7150c cVar, C7173i iVar) {
        C6888i.m12438e(cVar, "renderer");
        C6888i.m12438e(iVar, "options");
        if (!iVar.mo24847m()) {
            return cVar.mo24789t(cVar.mo24792w(this.f15029h), cVar.mo24792w(this.f15030i), C5266a.m9955g1(this));
        }
        StringBuilder t = C0843a.m459t('(');
        t.append(cVar.mo24792w(this.f15029h));
        t.append("..");
        t.append(cVar.mo24792w(this.f15030i));
        t.append(')');
        return t.toString();
    }

    /* renamed from: e0 */
    public C7579w mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return new C7581x((C7489j0) eVar.mo25135g(this.f15029h), (C7489j0) eVar.mo25135g(this.f15030i));
    }

    /* renamed from: x */
    public boolean mo23573x() {
        return (this.f15029h.mo24887V().getDeclarationDescriptor() instanceof C6248w0) && C6888i.m12434a(this.f15029h.mo24887V(), this.f15030i.mo24887V());
    }
}
