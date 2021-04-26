package p298d.p299a.p300a.p301a.p303y0.p326e.p330z;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6681t;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.e.z.e */
public final class C6707e {

    /* renamed from: a */
    public final List<C6667q> f13596a;

    public C6707e(C6681t tVar) {
        C6888i.m12438e(tVar, "typeTable");
        List<C6667q> list = tVar.f13462i;
        int i = 0;
        if ((tVar.f13461h & 1) == 1) {
            int i2 = tVar.f13463j;
            C6888i.m12437d(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
            for (T next : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    C6667q qVar = (C6667q) next;
                    if (i >= i2) {
                        Objects.requireNonNull(qVar);
                        C6667q.C6673c A = C6667q.m12068A(qVar);
                        A.f13393j |= 2;
                        A.f13395l = true;
                        qVar = A.mo23805l();
                        if (!qVar.mo23687g()) {
                            throw new C7134v();
                        }
                    }
                    arrayList.add(qVar);
                    i = i3;
                } else {
                    C6790h.m12333T();
                    throw null;
                }
            }
            list = arrayList;
        }
        C6888i.m12437d(list, "run {\n        val originalTypes = typeTable.typeList\n        if (typeTable.hasFirstNullable()) {\n            val firstNullable = typeTable.firstNullable\n            typeTable.typeList.mapIndexed { i, type ->\n                if (i >= firstNullable) {\n                    type.toBuilder().setNullable(true).build()\n                } else type\n            }\n        } else originalTypes\n    }");
        this.f13596a = list;
    }

    /* renamed from: a */
    public final C6667q mo23845a(int i) {
        return this.f13596a.get(i);
    }
}
