package p298d.p299a.p300a.p301a.p303y0.p405l;

import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.f0 */
public final class C7471f0 extends C7487i1 {

    /* renamed from: h */
    public final C7441m f14897h;

    /* renamed from: i */
    public final C6851a<C7452c0> f14898i;

    /* renamed from: j */
    public final C7437i<C7452c0> f14899j;

    public C7471f0(C7441m mVar, C6851a<? extends C7452c0> aVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(aVar, "computation");
        this.f14897h = mVar;
        this.f14898i = aVar;
        this.f14899j = mVar.mo25018a(aVar);
    }

    /* renamed from: X */
    public C7452c0 mo23544X(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return new C7471f0(this.f14897h, new C7463e0(eVar, this));
    }

    /* renamed from: Z */
    public C7452c0 mo25088Z() {
        return (C7452c0) this.f14899j.invoke();
    }

    /* renamed from: a0 */
    public boolean mo25089a0() {
        C7417e.C7426h hVar = (C7417e.C7426h) this.f14899j;
        return (hVar.f14842i == C7417e.C7432n.NOT_COMPUTED || hVar.f14842i == C7417e.C7432n.COMPUTING) ? false : true;
    }
}
