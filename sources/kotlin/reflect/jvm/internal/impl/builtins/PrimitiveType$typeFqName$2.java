package kotlin.reflect.jvm.internal.impl.builtins;

import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

public final class PrimitiveType$typeFqName$2 extends C6890k implements C6851a<C6714b> {
    public final /* synthetic */ PrimitiveType this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimitiveType$typeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.this$0 = primitiveType;
    }

    public final C6714b invoke() {
        C6714b c = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.mo23863c(this.this$0.getTypeName());
        C6888i.m12437d(c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
        return c;
    }
}
