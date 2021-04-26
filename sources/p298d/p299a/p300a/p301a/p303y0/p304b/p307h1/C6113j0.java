package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7265c;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7281i;
import p298d.p334t.C6798p;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.j0 */
public class C6113j0 extends C7281i {

    /* renamed from: b */
    public final C6021a0 f12078b;

    /* renamed from: c */
    public final C6714b f12079c;

    public C6113j0(C6021a0 a0Var, C6714b bVar) {
        C6888i.m12438e(a0Var, "moduleDescriptor");
        C6888i.m12438e(bVar, "fqName");
        this.f12078b = a0Var;
        this.f12079c = bVar;
    }

    public Set<C6717d> getClassifierNames() {
        return C6800r.f13715g;
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        C7268d.C7269a aVar = C7268d.f14488c;
        if (!dVar.mo24916a(C7268d.f14493h)) {
            return C6798p.f13713g;
        }
        if (this.f12079c.mo23864d() && dVar.f14507a.contains(C7265c.C7267b.f14487a)) {
            return C6798p.f13713g;
        }
        Collection<C6714b> subPackagesOf = this.f12078b.getSubPackagesOf(this.f12079c, lVar);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        for (C6714b g : subPackagesOf) {
            C6717d g2 = g.mo23868g();
            C6888i.m12437d(g2, "subFqName.shortName()");
            if (lVar.invoke(g2).booleanValue()) {
                C6888i.m12438e(g2, "name");
                C6073g0 g0Var = null;
                if (!g2.f13624h) {
                    C6021a0 a0Var = this.f12078b;
                    C6714b c = this.f12079c.mo23863c(g2);
                    C6888i.m12437d(c, "fqName.child(name)");
                    C6073g0 G = a0Var.mo23088G(c);
                    if (!G.isEmpty()) {
                        g0Var = G;
                    }
                }
                C5266a.m10001o(arrayList, g0Var);
            }
        }
        return arrayList;
    }
}
