package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.Iterator;
import java.util.LinkedHashSet;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.a */
public final class C7186a extends C7213t {

    /* renamed from: a */
    public static final C7186a f14408a = new C7186a();

    /* renamed from: a */
    public static final void m13014a(C6046e eVar, LinkedHashSet<C6046e> linkedHashSet, C7277h hVar, boolean z) {
        boolean z2;
        for (C6206k kVar : C5266a.m9985l1(hVar, C7268d.f14502q, (C6862l) null, 2, (Object) null)) {
            if (kVar instanceof C6046e) {
                C6046e eVar2 = (C6046e) kVar;
                int i = C7193g.f14418a;
                if (eVar2 != null) {
                    Iterator<C7452c0> it = eVar2.getTypeConstructor().getSupertypes().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C7193g.m13041u(it.next(), eVar.getOriginal())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        linkedHashSet.add(kVar);
                    }
                    if (z) {
                        C7277h unsubstitutedInnerClassesScope = eVar2.getUnsubstitutedInnerClassesScope();
                        C6888i.m12437d(unsubstitutedInnerClassesScope, "descriptor.unsubstitutedInnerClassesScope");
                        m13014a(eVar, linkedHashSet, unsubstitutedInnerClassesScope, z);
                    }
                } else {
                    C7193g.m13021a(24);
                    throw null;
                }
            }
        }
    }
}
