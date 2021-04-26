package p298d.p299a.p300a.p301a.p303y0.p405l;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7173i;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.y */
public final class C7583y extends C7579w implements C7464e1 {

    /* renamed from: j */
    public final C7579w f15031j;

    /* renamed from: k */
    public final C7452c0 f15032k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7583y(C7579w wVar, C7452c0 c0Var) {
        super(wVar.f15029h, wVar.f15030i);
        C6888i.m12438e(wVar, "origin");
        C6888i.m12438e(c0Var, "enhancement");
        this.f15031j = wVar;
        this.f15032k = c0Var;
    }

    /* renamed from: O */
    public C7481g1 mo25070O() {
        return this.f15031j;
    }

    /* renamed from: Z */
    public C7481g1 mo23545Z(boolean z) {
        return C5266a.m9865P4(this.f15031j.mo23545Z(z), this.f15032k.mo25056Y().mo23545Z(z));
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return C5266a.m9865P4(this.f15031j.mo23547b0(hVar), this.f15032k);
    }

    /* renamed from: c0 */
    public C7489j0 mo23548c0() {
        return this.f15031j.mo23548c0();
    }

    /* renamed from: d0 */
    public String mo23549d0(C7150c cVar, C7173i iVar) {
        C6888i.m12438e(cVar, "renderer");
        C6888i.m12438e(iVar, "options");
        if (iVar.mo24843k()) {
            return cVar.mo24792w(this.f15032k);
        }
        return this.f15031j.mo23549d0(cVar, iVar);
    }

    /* renamed from: e0 */
    public C7583y mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return new C7583y((C7579w) eVar.mo25135g(this.f15031j), eVar.mo25135g(this.f15032k));
    }

    /* renamed from: z */
    public C7452c0 mo25071z() {
        return this.f15032k;
    }
}
