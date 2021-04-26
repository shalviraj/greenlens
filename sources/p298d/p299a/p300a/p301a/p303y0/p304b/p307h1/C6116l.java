package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6052f0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.l */
public final class C6116l implements C6052f0 {

    /* renamed from: a */
    public final List<C6035d0> f12086a;

    public C6116l(List<? extends C6035d0> list) {
        C6888i.m12438e(list, "providers");
        this.f12086a = list;
        list.size();
        C6790h.m12349e0(list).size();
    }

    public void collectPackageFragments(C6714b bVar, Collection<C6032c0> collection) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(collection, "packageFragments");
        for (C6035d0 U : this.f12086a) {
            C5266a.m9887U(U, bVar, collection);
        }
    }

    public List<C6032c0> getPackageFragments(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C6035d0 U : this.f12086a) {
            C5266a.m9887U(U, bVar, arrayList);
        }
        return C6790h.m12337X(arrayList);
    }

    public Collection<C6714b> getSubPackagesOf(C6714b bVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C6035d0 subPackagesOf : this.f12086a) {
            hashSet.addAll(subPackagesOf.getSubPackagesOf(bVar, lVar));
        }
        return hashSet;
    }
}
