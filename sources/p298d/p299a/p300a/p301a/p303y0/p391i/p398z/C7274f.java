package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.f */
public final class C7274f extends C7281i {

    /* renamed from: b */
    public final C7277h f14514b;

    public C7274f(C7277h hVar) {
        C6888i.m12438e(hVar, "workerScope");
        this.f14514b = hVar;
    }

    public Set<C6717d> getClassifierNames() {
        return this.f14514b.getClassifierNames();
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C6083h contributedClassifier = this.f14514b.getContributedClassifier(dVar, bVar);
        if (contributedClassifier == null) {
            return null;
        }
        C6046e eVar = contributedClassifier instanceof C6046e ? (C6046e) contributedClassifier : null;
        if (eVar != null) {
            return eVar;
        }
        if (contributedClassifier instanceof C6246v0) {
            return (C6246v0) contributedClassifier;
        }
        return null;
    }

    public Collection getContributedDescriptors(C7268d dVar, C6862l lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        C7268d.C7269a aVar = C7268d.f14488c;
        int i = C7268d.f14497l & dVar.f14508b;
        C7268d dVar2 = i == 0 ? null : new C7268d(i, dVar.f14507a);
        if (dVar2 == null) {
            return C6798p.f13713g;
        }
        Collection<C6206k> contributedDescriptors = this.f14514b.getContributedDescriptors(dVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : contributedDescriptors) {
            if (next instanceof C6152i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Set<C6717d> getFunctionNames() {
        return this.f14514b.getFunctionNames();
    }

    public Set<C6717d> getVariableNames() {
        return this.f14514b.getVariableNames();
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        this.f14514b.recordLookup(dVar, bVar);
    }

    public String toString() {
        return C6888i.m12444k("Classes from ", this.f14514b);
    }
}
