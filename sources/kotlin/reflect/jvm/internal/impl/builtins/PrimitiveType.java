package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Companion Companion = null;
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private final C6764f arrayTypeFqName$delegate;
    private final C6717d arrayTypeName;
    private final C6764f typeFqName$delegate;
    private final C6717d typeName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        PrimitiveType primitiveType;
        PrimitiveType primitiveType2;
        PrimitiveType primitiveType3;
        PrimitiveType primitiveType4;
        PrimitiveType primitiveType5;
        PrimitiveType primitiveType6;
        PrimitiveType primitiveType7;
        Companion = new Companion((DefaultConstructorMarker) null);
        NUMBER_TYPES = C6790h.m12327N(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    private PrimitiveType(String str) {
        C6717d l = C6717d.m12270l(str);
        C6888i.m12437d(l, "identifier(typeName)");
        this.typeName = l;
        C6717d l2 = C6717d.m12270l(C6888i.m12444k(str, "Array"));
        C6888i.m12437d(l2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = l2;
        C6765g gVar = C6765g.PUBLICATION;
        this.typeFqName$delegate = C5266a.m9885T2(gVar, new PrimitiveType$typeFqName$2(this));
        this.arrayTypeFqName$delegate = C5266a.m9885T2(gVar, new PrimitiveType$arrayTypeFqName$2(this));
    }

    public final C6714b getArrayTypeFqName() {
        return (C6714b) this.arrayTypeFqName$delegate.getValue();
    }

    public final C6717d getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final C6714b getTypeFqName() {
        return (C6714b) this.typeFqName$delegate.getValue();
    }

    public final C6717d getTypeName() {
        return this.typeName;
    }
}
