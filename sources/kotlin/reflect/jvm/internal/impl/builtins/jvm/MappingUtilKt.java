package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7569u0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7577v0;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class MappingUtilKt {
    public static final C7577v0 createMappedTypeParametersSubstitution(C6046e eVar, C6046e eVar2) {
        C6888i.m12438e(eVar, "from");
        C6888i.m12438e(eVar2, "to");
        int size = eVar.getDeclaredTypeParameters().size();
        int size2 = eVar2.getDeclaredTypeParameters().size();
        List<C6248w0> declaredTypeParameters = eVar.getDeclaredTypeParameters();
        C6888i.m12437d(declaredTypeParameters, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(declaredTypeParameters, 10));
        for (C6248w0 typeConstructor : declaredTypeParameters) {
            arrayList.add(typeConstructor.getTypeConstructor());
        }
        List<C6248w0> declaredTypeParameters2 = eVar2.getDeclaredTypeParameters();
        C6888i.m12437d(declaredTypeParameters2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(declaredTypeParameters2, 10));
        for (C6248w0 defaultType : declaredTypeParameters2) {
            C7489j0 defaultType2 = defaultType.getDefaultType();
            C6888i.m12437d(defaultType2, "it.defaultType");
            arrayList2.add(C5266a.m9794E(defaultType2));
        }
        Map Y = C6790h.m12338Y(C6790h.m12353g0(arrayList, arrayList2));
        boolean z = true & true;
        C6888i.m12438e(Y, "map");
        return new C7569u0(Y, false);
    }
}
