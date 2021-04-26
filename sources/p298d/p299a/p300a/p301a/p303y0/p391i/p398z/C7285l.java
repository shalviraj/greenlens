package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6240t0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.z.l */
public final class C7285l implements C7277h {

    /* renamed from: b */
    public final C7277h f14526b;

    /* renamed from: c */
    public final C7448b1 f14527c;

    /* renamed from: d */
    public Map<C6206k, C6206k> f14528d;

    /* renamed from: e */
    public final C6764f f14529e = C5266a.m9890U2(new C7286a(this));

    /* renamed from: d.a.a.a.y0.i.z.l$a */
    public static final class C7286a extends C6890k implements C6851a<Collection<? extends C6206k>> {

        /* renamed from: g */
        public final /* synthetic */ C7285l f14530g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7286a(C7285l lVar) {
            super(0);
            this.f14530g = lVar;
        }

        public Object invoke() {
            C7285l lVar = this.f14530g;
            return lVar.mo24920a(C5266a.m9985l1(lVar.f14526b, (C7268d) null, (C6862l) null, 3, (Object) null));
        }
    }

    public C7285l(C7277h hVar, C7448b1 b1Var) {
        C6888i.m12438e(hVar, "workerScope");
        C6888i.m12438e(b1Var, "givenSubstitutor");
        this.f14526b = hVar;
        C7586z0 g = b1Var.mo25050g();
        C6888i.m12437d(g, "givenSubstitutor.substitution");
        this.f14527c = C5266a.m9871Q4(g, false, 1).mo25194c();
    }

    /* renamed from: a */
    public final <D extends C6206k> Collection<D> mo24920a(Collection<? extends D> collection) {
        if (this.f14527c.mo25051h() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5266a.m9824J(collection.size()));
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(mo24921b((C6206k) it.next()));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final <D extends C6206k> D mo24921b(D d) {
        if (this.f14527c.mo25051h()) {
            return d;
        }
        if (this.f14528d == null) {
            this.f14528d = new HashMap();
        }
        Map<C6206k, C6206k> map = this.f14528d;
        C6888i.m12436c(map);
        D d2 = map.get(d);
        if (d2 == null) {
            if (d instanceof C6240t0) {
                d2 = ((C6240t0) d).substitute(this.f14527c);
                if (d2 != null) {
                    map.put(d, d2);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(C6888i.m12444k("Unknown descriptor in scope: ", d).toString());
            }
        }
        return (C6206k) d2;
    }

    public Set<C6717d> getClassifierNames() {
        return this.f14526b.getClassifierNames();
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C6083h contributedClassifier = this.f14526b.getContributedClassifier(dVar, bVar);
        if (contributedClassifier == null) {
            return null;
        }
        return (C6083h) mo24921b(contributedClassifier);
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        return (Collection) this.f14529e.getValue();
    }

    public Collection<? extends C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return mo24920a(this.f14526b.getContributedFunctions(dVar, bVar));
    }

    public Collection<? extends C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return mo24920a(this.f14526b.getContributedVariables(dVar, bVar));
    }

    public Set<C6717d> getFunctionNames() {
        return this.f14526b.getFunctionNames();
    }

    public Set<C6717d> getVariableNames() {
        return this.f14526b.getVariableNames();
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(this, "this");
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        getContributedFunctions(dVar, bVar);
    }
}
