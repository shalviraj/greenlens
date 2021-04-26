package kotlin.reflect.jvm.internal.impl.builtins;

import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

public enum UnsignedType {
    UBYTE(r1),
    USHORT(r2),
    UINT(r4),
    ULONG(r6);
    
    private final C6713a arrayClassId;
    private final C6713a classId;
    private final C6717d typeName;

    private UnsignedType(C6713a aVar) {
        this.classId = aVar;
        C6717d j = aVar.mo23859j();
        C6888i.m12437d(j, "classId.shortClassName");
        this.typeName = j;
        this.arrayClassId = new C6713a(aVar.mo23856h(), C6717d.m12270l(C6888i.m12444k(j.mo23886e(), "Array")));
    }

    public final C6713a getArrayClassId() {
        return this.arrayClassId;
    }

    public final C6713a getClassId() {
        return this.classId;
    }

    public final C6717d getTypeName() {
        return this.typeName;
    }
}
