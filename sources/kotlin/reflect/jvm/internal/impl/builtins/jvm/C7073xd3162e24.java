package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1 */
public final class C7073xd3162e24 extends C6890k implements C6851a<C7452c0> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7073xd3162e24(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final C7452c0 invoke() {
        C7489j0 anyType = this.this$0.moduleDescriptor.getBuiltIns().getAnyType();
        C6888i.m12437d(anyType, "moduleDescriptor.builtIns.anyType");
        return anyType;
    }
}
