package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7628g;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.i */
public abstract class C7281i implements C7277h {
    public Set<C6717d> getClassifierNames() {
        return null;
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return null;
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        return C6798p.f13713g;
    }

    public Collection<? extends C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return C6798p.f13713g;
    }

    public Collection<? extends C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return C6798p.f13713g;
    }

    public Set<C6717d> getFunctionNames() {
        Collection<C6206k> contributedDescriptors = getContributedDescriptors(C7268d.f14503r, C7628g.f15112a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : contributedDescriptors) {
            if (next instanceof C6232q0) {
                C6717d name = ((C6232q0) next).getName();
                C6888i.m12437d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<C6717d> getVariableNames() {
        Collection<C6206k> contributedDescriptors = getContributedDescriptors(C7268d.f14504s, C7628g.f15112a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : contributedDescriptors) {
            if (next instanceof C6232q0) {
                C6717d name = ((C6232q0) next).getName();
                C6888i.m12437d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        getContributedFunctions(dVar, bVar);
    }
}
