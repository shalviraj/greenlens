package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;

public final class JavaToKotlinClassMapper {
    public static final JavaToKotlinClassMapper INSTANCE = new JavaToKotlinClassMapper();

    private JavaToKotlinClassMapper() {
    }

    public static /* synthetic */ C6046e mapJavaToKotlin$default(JavaToKotlinClassMapper javaToKotlinClassMapper, C6714b bVar, KotlinBuiltIns kotlinBuiltIns, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.mapJavaToKotlin(bVar, kotlinBuiltIns, num);
    }

    public final C6046e convertMutableToReadOnly(C6046e eVar) {
        C6888i.m12438e(eVar, "mutable");
        C6714b mutableToReadOnly = JavaToKotlinClassMap.INSTANCE.mutableToReadOnly(C7193g.m13027g(eVar));
        if (mutableToReadOnly != null) {
            C6046e builtInClassByFqName = C7255a.m13133f(eVar).getBuiltInClassByFqName(mutableToReadOnly);
            C6888i.m12437d(builtInClassByFqName, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return builtInClassByFqName;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "mutable" + " collection");
    }

    public final C6046e convertReadOnlyToMutable(C6046e eVar) {
        C6888i.m12438e(eVar, "readOnly");
        C6714b readOnlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(C7193g.m13027g(eVar));
        if (readOnlyToMutable != null) {
            C6046e builtInClassByFqName = C7255a.m13133f(eVar).getBuiltInClassByFqName(readOnlyToMutable);
            C6888i.m12437d(builtInClassByFqName, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return builtInClassByFqName;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "read-only" + " collection");
    }

    public final boolean isMutable(C6046e eVar) {
        C6888i.m12438e(eVar, "mutable");
        return JavaToKotlinClassMap.INSTANCE.isMutable(C7193g.m13027g(eVar));
    }

    public final boolean isMutable(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
        C6046e e = C7460d1.m13439e(c0Var);
        return e != null && isMutable(e);
    }

    public final boolean isReadOnly(C6046e eVar) {
        C6888i.m12438e(eVar, "readOnly");
        return JavaToKotlinClassMap.INSTANCE.isReadOnly(C7193g.m13027g(eVar));
    }

    public final boolean isReadOnly(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
        C6046e e = C7460d1.m13439e(c0Var);
        return e != null && isReadOnly(e);
    }

    public final C6046e mapJavaToKotlin(C6714b bVar, KotlinBuiltIns kotlinBuiltIns, Integer num) {
        C6713a aVar;
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        if (num == null || !C6888i.m12434a(bVar, JavaToKotlinClassMap.INSTANCE.getFUNCTION_N_FQ_NAME())) {
            aVar = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(bVar);
        } else {
            StandardNames standardNames = StandardNames.INSTANCE;
            aVar = StandardNames.getFunctionClassId(num.intValue());
        }
        if (aVar != null) {
            return kotlinBuiltIns.getBuiltInClassByFqName(aVar.mo23851b());
        }
        return null;
    }

    public final Collection<C6046e> mapPlatformClass(C6714b bVar, KotlinBuiltIns kotlinBuiltIns) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6046e mapJavaToKotlin$default = mapJavaToKotlin$default(this, bVar, kotlinBuiltIns, (Integer) null, 4, (Object) null);
        if (mapJavaToKotlin$default == null) {
            return C6800r.f13715g;
        }
        C6714b readOnlyToMutable = JavaToKotlinClassMap.INSTANCE.readOnlyToMutable(C7255a.m13136i(mapJavaToKotlin$default));
        if (readOnlyToMutable == null) {
            return C5266a.m9891U3(mapJavaToKotlin$default);
        }
        C6046e builtInClassByFqName = kotlinBuiltIns.getBuiltInClassByFqName(readOnlyToMutable);
        C6888i.m12437d(builtInClassByFqName, "builtIns.getBuiltInClassByFqName(kotlinMutableAnalogFqName)");
        return C6790h.m12314A(mapJavaToKotlin$default, builtInClassByFqName);
    }
}
