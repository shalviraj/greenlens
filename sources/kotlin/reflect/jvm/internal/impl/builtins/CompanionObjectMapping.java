package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    private static final Set<C6713a> classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        StandardNames standardNames = StandardNames.INSTANCE;
        ArrayList arrayList = new ArrayList(C5266a.m9892V(set, 10));
        for (PrimitiveType primitiveFqName : set) {
            arrayList.add(StandardNames.getPrimitiveFqName(primitiveFqName));
        }
        C6714b i = StandardNames.FqNames.string.mo23883i();
        C6888i.m12437d(i, "string.toSafe()");
        List J = C6790h.m12323J(arrayList, i);
        C6714b i2 = StandardNames.FqNames._boolean.mo23883i();
        C6888i.m12437d(i2, "_boolean.toSafe()");
        List J2 = C6790h.m12323J(J, i2);
        C6714b i3 = StandardNames.FqNames._enum.mo23883i();
        C6888i.m12437d(i3, "_enum.toSafe()");
        List<C6714b> J3 = C6790h.m12323J(J2, i3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6714b l : J3) {
            linkedHashSet.add(C6713a.m12239l(l));
        }
        classIds = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    public final Set<C6713a> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    public final Set<C6713a> getClassIds() {
        return classIds;
    }
}
