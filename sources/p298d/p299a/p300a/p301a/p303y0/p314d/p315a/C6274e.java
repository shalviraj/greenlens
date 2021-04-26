package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6071n;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6287d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7232k;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.e */
public final class C6274e extends C6890k implements C6866p<C7232k, C6264a, Boolean> {

    /* renamed from: g */
    public final /* synthetic */ C6268c f12341g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6274e(C6268c cVar) {
        super(2);
        this.f12341g = cVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C7232k kVar = (C7232k) obj;
        C6264a aVar = (C6264a) obj2;
        C6888i.m12438e(kVar, "<this>");
        C6888i.m12438e(aVar, "it");
        C6268c cVar = this.f12341g;
        String str = aVar.f12311g;
        Objects.requireNonNull(cVar);
        C6287d dVar = C6287d.f12385a;
        Iterable<C6071n> iterable = C6287d.f12386b.get(str);
        if (iterable == null) {
            iterable = C6800r.f13715g;
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(iterable, 10));
        for (C6071n name : iterable) {
            arrayList.add(name.name());
        }
        return Boolean.valueOf(arrayList.contains(kVar.f14463c.mo23889i()));
    }
}
