package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6621c;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6651m;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6699a;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.w */
public final class C7406w implements C7375g {

    /* renamed from: a */
    public final C6705c f14807a;

    /* renamed from: b */
    public final C6699a f14808b;

    /* renamed from: c */
    public final C6862l<C6713a, C6234r0> f14809c;

    /* renamed from: d */
    public final Map<C6713a, C6621c> f14810d;

    public C7406w(C6651m mVar, C6705c cVar, C6699a aVar, C6862l<? super C6713a, ? extends C6234r0> lVar) {
        C6888i.m12438e(mVar, "proto");
        C6888i.m12438e(cVar, "nameResolver");
        C6888i.m12438e(aVar, "metadataVersion");
        C6888i.m12438e(lVar, "classSource");
        this.f14807a = cVar;
        this.f14808b = aVar;
        this.f14809c = lVar;
        List<C6621c> list = mVar.f13281m;
        C6888i.m12437d(list, "proto.class_List");
        int g3 = C5266a.m9957g3(C5266a.m9892V(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(g3 < 16 ? 16 : g3);
        for (T next : list) {
            linkedHashMap.put(C5266a.m9973j1(this.f14807a, ((C6621c) next).f13091k), next);
        }
        this.f14810d = linkedHashMap;
    }

    /* renamed from: a */
    public C7320f mo23641a(C6713a aVar) {
        C6888i.m12438e(aVar, "classId");
        C6621c cVar = this.f14810d.get(aVar);
        if (cVar == null) {
            return null;
        }
        return new C7320f(this.f14807a, cVar, this.f14808b, this.f14809c.invoke(aVar));
    }
}
