package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7199k;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.i.z.e */
public abstract class C7271e extends C7281i {
    public static final /* synthetic */ C6736l<Object>[] $$delegatedProperties = {C6902w.m12462c(new C6896q(C6902w.m12460a(C7271e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final C7437i allDescriptors$delegate;
    private final C6046e containingClass;

    /* renamed from: d.a.a.a.y0.i.z.e$a */
    public static final class C7272a extends C6890k implements C6851a<List<? extends C6206k>> {

        /* renamed from: g */
        public final /* synthetic */ C7271e f14511g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7272a(C7271e eVar) {
            super(0);
            this.f14511g = eVar;
        }

        public Object invoke() {
            List<C6244v> computeDeclaredFunctions = this.f14511g.computeDeclaredFunctions();
            return C6790h.m12322I(computeDeclaredFunctions, this.f14511g.createFakeOverrides(computeDeclaredFunctions));
        }
    }

    /* renamed from: d.a.a.a.y0.i.z.e$b */
    public static final class C7273b extends C7199k {

        /* renamed from: a */
        public final /* synthetic */ ArrayList<C6206k> f14512a;

        /* renamed from: b */
        public final /* synthetic */ C7271e f14513b;

        public C7273b(ArrayList<C6206k> arrayList, C7271e eVar) {
            this.f14512a = arrayList;
            this.f14513b = eVar;
        }

        /* renamed from: a */
        public void mo23273a(C6023b bVar) {
            C6888i.m12438e(bVar, "fakeOverride");
            C7201m.m13073r(bVar, (C6862l<C6023b, C6777r>) null);
            this.f14512a.add(bVar);
        }

        /* renamed from: e */
        public void mo23274e(C6023b bVar, C6023b bVar2) {
            C6888i.m12438e(bVar, "fromSuper");
            C6888i.m12438e(bVar2, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f14513b.getContainingClass() + ": " + bVar + " vs " + bVar2).toString());
        }
    }

    public C7271e(C7441m mVar, C6046e eVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(eVar, "containingClass");
        this.containingClass = eVar;
        this.allDescriptors$delegate = mVar.mo25018a(new C7272a(this));
    }

    /* access modifiers changed from: private */
    public final List<C6206k> createFakeOverrides(List<? extends C6244v> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<C7452c0> supertypes = this.containingClass.getTypeConstructor().getSupertypes();
        C6888i.m12437d(supertypes, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (C7452c0 memberScope : supertypes) {
            C6790h.m12342b(arrayList2, C5266a.m9985l1(memberScope.getMemberScope(), (C7268d) null, (C6862l) null, 3, (Object) null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof C6023b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            C6717d name = ((C6023b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C6717d dVar = (C6717d) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((C6023b) next3) instanceof C6244v);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                C7201m mVar = C7201m.f14431d;
                if (booleanValue) {
                    collection = new ArrayList();
                    for (T next4 : list) {
                        if (C6888i.m12434a(((C6244v) next4).getName(), dVar)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C6798p.f13713g;
                }
                mVar.mo24879h(dVar, list2, collection, this.containingClass, new C7273b(arrayList, this));
            }
        }
        return C5266a.m9897W(arrayList);
    }

    private final List<C6206k> getAllDescriptors() {
        return (List) C5266a.m9884T1(this.allDescriptors$delegate, $$delegatedProperties[0]);
    }

    public abstract List<C6244v> computeDeclaredFunctions();

    public final C6046e getContainingClass() {
        return this.containingClass;
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        return !dVar.mo24916a(C7268d.f14501p.f14508b) ? C6798p.f13713g : getAllDescriptors();
    }

    public Collection<C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        List<C6206k> allDescriptors = getAllDescriptors();
        C7639l lVar = new C7639l();
        for (T next : allDescriptors) {
            if ((next instanceof C6232q0) && C6888i.m12434a(((C6232q0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }

    public Collection<C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        List<C6206k> allDescriptors = getAllDescriptors();
        C7639l lVar = new C7639l();
        for (T next : allDescriptors) {
            if ((next instanceof C6207k0) && C6888i.m12434a(((C6207k0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }
}
