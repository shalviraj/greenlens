package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(CompanionObjectMapping companionObjectMapping, C6046e eVar) {
        C6888i.m12438e(companionObjectMapping, "<this>");
        C6888i.m12438e(eVar, "classDescriptor");
        if (C7193g.m13036p(eVar)) {
            Set<C6713a> classIds = companionObjectMapping.getClassIds();
            C6713a g = C7255a.m13134g(eVar);
            if (C6790h.m12348e(classIds, g == null ? null : g.mo23855g())) {
                return true;
            }
        }
        return false;
    }
}
