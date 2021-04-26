package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.k */
public final class C7232k extends C7227g<C6768j<? extends C6713a, ? extends C6717d>> {

    /* renamed from: b */
    public final C6713a f14462b;

    /* renamed from: c */
    public final C6717d f14463c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7232k(C6713a aVar, C6717d dVar) {
        super(new C6768j(aVar, dVar));
        C6888i.m12438e(aVar, "enumClassId");
        C6888i.m12438e(dVar, "enumEntryName");
        this.f14462b = aVar;
        this.f14463c = dVar;
    }

    /* renamed from: a */
    public C7452c0 mo24893a(C6021a0 a0Var) {
        C6888i.m12438e(a0Var, "module");
        C6046e N0 = C5266a.m9849N0(a0Var, this.f14462b);
        C7489j0 j0Var = null;
        if (N0 != null) {
            if (!C7193g.m13037q(N0)) {
                N0 = null;
            }
            if (N0 != null) {
                j0Var = N0.getDefaultType();
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        StringBuilder u = C0843a.m460u("Containing class for error-class based enum entry ");
        u.append(this.f14462b);
        u.append('.');
        u.append(this.f14463c);
        C7489j0 d = C7570v.m13783d(u.toString());
        C6888i.m12437d(d, "createErrorType(\"Containing class for error-class based enum entry $enumClassId.$enumEntryName\")");
        return d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14462b.mo23859j());
        sb.append('.');
        sb.append(this.f14463c);
        return sb.toString();
    }
}
