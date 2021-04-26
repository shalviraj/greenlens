package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.j.b.d0 */
public final class C7312d0 extends C6890k implements C6862l<Integer, C6083h> {

    /* renamed from: g */
    public final /* synthetic */ C7306c0 f14576g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7312d0(C7306c0 c0Var) {
        super(1);
        this.f14576g = c0Var;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C7306c0 c0Var = this.f14576g;
        C6713a j1 = C5266a.m9973j1(c0Var.f14561a.f14761b, intValue);
        if (j1.f13612c) {
            return null;
        }
        C6021a0 a0Var = c0Var.f14561a.f14760a.f14740b;
        C6888i.m12438e(a0Var, "<this>");
        C6888i.m12438e(j1, "classId");
        C6083h O0 = C5266a.m9855O0(a0Var, j1);
        if (O0 instanceof C6246v0) {
            return (C6246v0) O0;
        }
        return null;
    }
}
