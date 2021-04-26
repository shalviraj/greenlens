package p298d.p337v;

import p298d.p337v.C6825e;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.v.g */
public final class C6831g extends C6890k implements C6866p<C6827f, C6827f.C6828a, C6827f> {

    /* renamed from: g */
    public static final C6831g f13752g = new C6831g();

    public C6831g() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        C6822c cVar;
        C6827f fVar = (C6827f) obj;
        C6827f.C6828a aVar = (C6827f.C6828a) obj2;
        C6888i.m12438e(fVar, "acc");
        C6888i.m12438e(aVar, "element");
        C6827f minusKey = fVar.minusKey(aVar.getKey());
        C6832h hVar = C6832h.f13753g;
        if (minusKey == hVar) {
            return aVar;
        }
        int i = C6825e.f13750c;
        C6825e.C6826a aVar2 = C6825e.C6826a.f13751g;
        C6825e eVar = (C6825e) minusKey.get(aVar2);
        if (eVar == null) {
            cVar = new C6822c(minusKey, aVar);
        } else {
            C6827f minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == hVar) {
                return new C6822c(aVar, eVar);
            }
            cVar = new C6822c(new C6822c(minusKey2, aVar), eVar);
        }
        return cVar;
    }
}
