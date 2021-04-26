package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.ArrayList;
import java.util.Iterator;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.m */
public final class C7386m implements C7375g {

    /* renamed from: a */
    public final C6035d0 f14769a;

    public C7386m(C6035d0 d0Var) {
        C6888i.m12438e(d0Var, "packageFragmentProvider");
        this.f14769a = d0Var;
    }

    /* renamed from: a */
    public C7320f mo23641a(C6713a aVar) {
        C7320f a;
        C6888i.m12438e(aVar, "classId");
        C6035d0 d0Var = this.f14769a;
        C6714b h = aVar.mo23856h();
        C6888i.m12437d(h, "classId.packageFqName");
        Iterator it = ((ArrayList) C5266a.m10005o3(d0Var, h)).iterator();
        while (it.hasNext()) {
            C6032c0 c0Var = (C6032c0) it.next();
            if ((c0Var instanceof C7387n) && (a = ((C7387n) c0Var).mo24994x().mo23641a(aVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
