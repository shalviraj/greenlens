package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.a */
public abstract class C7263a implements C7277h {
    /* renamed from: a */
    public final C7277h mo24911a() {
        return mo24912b() instanceof C7263a ? ((C7263a) mo24912b()).mo24911a() : mo24912b();
    }

    /* renamed from: b */
    public abstract C7277h mo24912b();

    public Set<C6717d> getClassifierNames() {
        return mo24912b().getClassifierNames();
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return mo24912b().getContributedClassifier(dVar, bVar);
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        return mo24912b().getContributedDescriptors(dVar, lVar);
    }

    public Collection<C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return mo24912b().getContributedFunctions(dVar, bVar);
    }

    public Collection<C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return mo24912b().getContributedVariables(dVar, bVar);
    }

    public Set<C6717d> getFunctionNames() {
        return mo24912b().getFunctionNames();
    }

    public Set<C6717d> getVariableNames() {
        return mo24912b().getVariableNames();
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        mo24912b().recordLookup(dVar, bVar);
    }
}
