package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();
    private static final HashMap<C6713a, C6713a> arrayClassIdToUnsignedClassId = new HashMap<>();
    private static final Set<C6717d> arrayClassesShortNames;
    private static final Set<C6717d> unsignedArrayTypeNames;
    private static final HashMap<UnsignedArrayType, C6717d> unsignedArrayTypeToArrayCall;
    private static final HashMap<C6713a, C6713a> unsignedClassIdToArrayClassId = new HashMap<>();
    private static final Set<C6717d> unsignedTypeNames;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        for (UnsignedType typeName : values) {
            arrayList.add(typeName.getTypeName());
        }
        unsignedTypeNames = C6790h.m12349e0(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(4);
        for (UnsignedArrayType typeName2 : values2) {
            arrayList2.add(typeName2.getTypeName());
        }
        unsignedArrayTypeNames = C6790h.m12349e0(arrayList2);
        C6768j[] jVarArr = {new C6768j(UnsignedArrayType.UBYTEARRAY, C6717d.m12270l("ubyteArrayOf")), new C6768j(UnsignedArrayType.USHORTARRAY, C6717d.m12270l("ushortArrayOf")), new C6768j(UnsignedArrayType.UINTARRAY, C6717d.m12270l("uintArrayOf")), new C6768j(UnsignedArrayType.ULONGARRAY, C6717d.m12270l("ulongArrayOf"))};
        C6888i.m12438e(jVarArr, "pairs");
        HashMap<UnsignedArrayType, C6717d> hashMap = new HashMap<>(C5266a.m9957g3(4));
        C6790h.m12326M(hashMap, jVarArr);
        unsignedArrayTypeToArrayCall = hashMap;
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < 4; i2++) {
            linkedHashSet.add(values3[i2].getArrayClassId().mo23859j());
        }
        arrayClassesShortNames = linkedHashSet;
        UnsignedType[] values4 = UnsignedType.values();
        while (i < 4) {
            UnsignedType unsignedType = values4[i];
            i++;
            arrayClassIdToUnsignedClassId.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            unsignedClassIdToArrayClassId.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    public static final boolean isUnsignedType(C7452c0 c0Var) {
        C6083h declarationDescriptor;
        C6888i.m12438e(c0Var, "type");
        if (!C7460d1.m13450p(c0Var) && (declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor()) != null) {
            return INSTANCE.isUnsignedClass(declarationDescriptor);
        }
        return false;
    }

    public final C6713a getUnsignedClassIdByArrayClassId(C6713a aVar) {
        C6888i.m12438e(aVar, "arrayClassId");
        return arrayClassIdToUnsignedClassId.get(aVar);
    }

    public final boolean isShortNameOfUnsignedArray(C6717d dVar) {
        C6888i.m12438e(dVar, "name");
        return arrayClassesShortNames.contains(dVar);
    }

    public final boolean isUnsignedClass(C6206k kVar) {
        C6888i.m12438e(kVar, "descriptor");
        C6206k containingDeclaration = kVar.getContainingDeclaration();
        return (containingDeclaration instanceof C6032c0) && C6888i.m12434a(((C6032c0) containingDeclaration).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && unsignedTypeNames.contains(kVar.getName());
    }
}
