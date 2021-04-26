package kotlin.reflect.jvm.internal.impl.builtins;

import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

public enum UnsignedArrayType {
    UBYTEARRAY(r1),
    USHORTARRAY(r2),
    UINTARRAY(r4),
    ULONGARRAY(r6);
    
    private final C6713a classId;
    private final C6717d typeName;

    private UnsignedArrayType(C6713a aVar) {
        this.classId = aVar;
        C6717d j = aVar.mo23859j();
        C6888i.m12437d(j, "classId.shortClassName");
        this.typeName = j;
    }

    public final C6717d getTypeName() {
        return this.typeName;
    }
}
