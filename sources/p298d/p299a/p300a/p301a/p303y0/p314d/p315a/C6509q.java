package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7194h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.q */
public final class C6509q implements C7194h {
    /* renamed from: a */
    public C7194h.C7196b mo23592a(C6019a aVar, C6019a aVar2, C6046e eVar) {
        C7194h.C7196b bVar = C7194h.C7196b.UNKNOWN;
        C6888i.m12438e(aVar, "superDescriptor");
        C6888i.m12438e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C6207k0) || !(aVar instanceof C6207k0)) {
            return bVar;
        }
        C6207k0 k0Var = (C6207k0) aVar2;
        C6207k0 k0Var2 = (C6207k0) aVar;
        return !C6888i.m12434a(k0Var.getName(), k0Var2.getName()) ? bVar : (!C5266a.m9773A2(k0Var) || !C5266a.m9773A2(k0Var2)) ? (C5266a.m9773A2(k0Var) || C5266a.m9773A2(k0Var2)) ? C7194h.C7196b.INCOMPATIBLE : bVar : C7194h.C7196b.OVERRIDABLE;
    }

    /* renamed from: b */
    public C7194h.C7195a mo23593b() {
        return C7194h.C7195a.BOTH;
    }
}
