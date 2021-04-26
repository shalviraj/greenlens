package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;

/* renamed from: d.a.a.a.y0.d.a.j */
public final class C6411j {

    /* renamed from: a */
    public static final C6411j f12631a = new C6411j();

    /* renamed from: b */
    public static final Map<C6714b, C6717d> f12632b;

    /* renamed from: c */
    public static final Map<C6717d, List<C6717d>> f12633c;

    /* renamed from: d */
    public static final Set<C6714b> f12634d;

    /* renamed from: e */
    public static final Set<C6717d> f12635e;

    static {
        C6715c cVar = StandardNames.FqNames._enum;
        C6714b bVar = StandardNames.FqNames.map;
        Map<C6714b, C6717d> D = C6790h.m12317D(new C6768j(C5266a.m9971j(cVar, "name"), C6717d.m12270l("name")), new C6768j(C5266a.m9971j(cVar, "ordinal"), C6717d.m12270l("ordinal")), new C6768j(C5266a.m9965i(StandardNames.FqNames.collection, "size"), C6717d.m12270l("size")), new C6768j(C5266a.m9965i(bVar, "size"), C6717d.m12270l("size")), new C6768j(C5266a.m9971j(StandardNames.FqNames.charSequence, "length"), C6717d.m12270l("length")), new C6768j(C5266a.m9965i(bVar, "keys"), C6717d.m12270l("keySet")), new C6768j(C5266a.m9965i(bVar, "values"), C6717d.m12270l("values")), new C6768j(C5266a.m9965i(bVar, "entries"), C6717d.m12270l("entrySet")));
        f12632b = D;
        Set<Map.Entry<C6714b, C6717d>> entrySet = D.entrySet();
        ArrayList<C6768j> arrayList = new ArrayList<>(C5266a.m9892V(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C6768j(((C6714b) entry.getKey()).mo23868g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C6768j jVar : arrayList) {
            C6717d dVar = (C6717d) jVar.f13682h;
            Object obj = linkedHashMap.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar, obj);
            }
            ((List) obj).add((C6717d) jVar.f13681g);
        }
        f12633c = linkedHashMap;
        Set<C6714b> keySet = f12632b.keySet();
        f12634d = keySet;
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(keySet, 10));
        for (C6714b g : keySet) {
            arrayList2.add(g.mo23868g());
        }
        f12635e = C6790h.m12349e0(arrayList2);
    }
}
