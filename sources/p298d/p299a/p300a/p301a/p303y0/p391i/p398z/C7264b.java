package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.z.b */
public final class C7264b implements C7277h {

    /* renamed from: b */
    public final String f14483b;

    /* renamed from: c */
    public final C7277h[] f14484c;

    public C7264b(String str, C7277h[] hVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14483b = str;
        this.f14484c = hVarArr;
    }

    /* renamed from: a */
    public static final C7277h m13145a(String str, Iterable<? extends C7277h> iterable) {
        C6888i.m12438e(str, "debugName");
        C6888i.m12438e(iterable, "scopes");
        C7639l lVar = new C7639l();
        for (C7277h hVar : iterable) {
            if (hVar != C7277h.C7280b.f14521b) {
                if (hVar instanceof C7264b) {
                    C7277h[] hVarArr = ((C7264b) hVar).f14484c;
                    C6888i.m12438e(lVar, "$this$addAll");
                    C6888i.m12438e(hVarArr, "elements");
                    lVar.addAll(C6790h.m12344c(hVarArr));
                } else {
                    lVar.add(hVar);
                }
            }
        }
        return m13146b(str, lVar);
    }

    /* renamed from: b */
    public static final C7277h m13146b(String str, List<? extends C7277h> list) {
        C6888i.m12438e(str, "debugName");
        C6888i.m12438e(list, "scopes");
        C7639l lVar = (C7639l) list;
        int i = lVar.f15137g;
        if (i == 0) {
            return C7277h.C7280b.f14521b;
        }
        if (i == 1) {
            return (C7277h) lVar.get(0);
        }
        Object[] array = lVar.toArray(new C7277h[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new C7264b(str, (C7277h[]) array, (DefaultConstructorMarker) null);
    }

    public Set<C6717d> getClassifierNames() {
        return C5266a.m9883T0(C5266a.m10067z(this.f14484c));
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C7277h[] hVarArr = this.f14484c;
        int length = hVarArr.length;
        C6083h hVar = null;
        int i = 0;
        while (i < length) {
            C7277h hVar2 = hVarArr[i];
            i++;
            C6083h contributedClassifier = hVar2.getContributedClassifier(dVar, bVar);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof C6152i) || !((C6152i) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (hVar == null) {
                    hVar = contributedClassifier;
                }
            }
        }
        return hVar;
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        C7277h[] hVarArr = this.f14484c;
        int length = hVarArr.length;
        if (length == 0) {
            return C6798p.f13713g;
        }
        int i = 0;
        if (length == 1) {
            return hVarArr[0].getContributedDescriptors(dVar, lVar);
        }
        Collection<C6206k> collection = null;
        int length2 = hVarArr.length;
        while (i < length2) {
            C7277h hVar = hVarArr[i];
            i++;
            collection = C5266a.m9936d0(collection, hVar.getContributedDescriptors(dVar, lVar));
        }
        return collection == null ? C6800r.f13715g : collection;
    }

    public Collection<C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C7277h[] hVarArr = this.f14484c;
        int length = hVarArr.length;
        if (length == 0) {
            return C6798p.f13713g;
        }
        int i = 0;
        if (length == 1) {
            return hVarArr[0].getContributedFunctions(dVar, bVar);
        }
        Collection<C6232q0> collection = null;
        int length2 = hVarArr.length;
        while (i < length2) {
            C7277h hVar = hVarArr[i];
            i++;
            collection = C5266a.m9936d0(collection, hVar.getContributedFunctions(dVar, bVar));
        }
        return collection == null ? C6800r.f13715g : collection;
    }

    public Collection<C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C7277h[] hVarArr = this.f14484c;
        int length = hVarArr.length;
        if (length == 0) {
            return C6798p.f13713g;
        }
        int i = 0;
        if (length == 1) {
            return hVarArr[0].getContributedVariables(dVar, bVar);
        }
        Collection<C6207k0> collection = null;
        int length2 = hVarArr.length;
        while (i < length2) {
            C7277h hVar = hVarArr[i];
            i++;
            collection = C5266a.m9936d0(collection, hVar.getContributedVariables(dVar, bVar));
        }
        return collection == null ? C6800r.f13715g : collection;
    }

    public Set<C6717d> getFunctionNames() {
        C7277h[] hVarArr = this.f14484c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7277h functionNames : hVarArr) {
            C6790h.m12342b(linkedHashSet, functionNames.getFunctionNames());
        }
        return linkedHashSet;
    }

    public Set<C6717d> getVariableNames() {
        C7277h[] hVarArr = this.f14484c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7277h variableNames : hVarArr) {
            C6790h.m12342b(linkedHashSet, variableNames.getVariableNames());
        }
        return linkedHashSet;
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        for (C7277h recordLookup : this.f14484c) {
            recordLookup.recordLookup(dVar, bVar);
        }
    }

    public String toString() {
        return this.f14483b;
    }
}
