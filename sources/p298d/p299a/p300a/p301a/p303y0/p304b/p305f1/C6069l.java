package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.f1.l */
public final class C6069l implements C6060h {

    /* renamed from: g */
    public final C6060h f11932g;

    /* renamed from: h */
    public final C6862l<C6714b, Boolean> f11933h;

    public C6069l(C6060h hVar, C6862l<? super C6714b, Boolean> lVar) {
        C6888i.m12438e(hVar, "delegate");
        C6888i.m12438e(lVar, "fqNameFilter");
        C6888i.m12438e(hVar, "delegate");
        C6888i.m12438e(lVar, "fqNameFilter");
        this.f11932g = hVar;
        this.f11933h = lVar;
    }

    /* renamed from: e */
    public final boolean mo23176e(C6055c cVar) {
        C6714b fqName = cVar.getFqName();
        return fqName != null && this.f11933h.invoke(fqName).booleanValue();
    }

    public boolean isEmpty() {
        C6060h<C6055c> hVar = this.f11932g;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            for (C6055c e : hVar) {
                if (mo23176e(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Iterator<C6055c> iterator() {
        C6060h hVar = this.f11932g;
        ArrayList arrayList = new ArrayList();
        for (Object next : hVar) {
            if (mo23176e((C6055c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: j */
    public C6055c mo23168j(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        if (this.f11933h.invoke(bVar).booleanValue()) {
            return this.f11932g.mo23168j(bVar);
        }
        return null;
    }

    /* renamed from: v */
    public boolean mo23169v(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        if (this.f11933h.invoke(bVar).booleanValue()) {
            return this.f11932g.mo23169v(bVar);
        }
        return false;
    }
}
