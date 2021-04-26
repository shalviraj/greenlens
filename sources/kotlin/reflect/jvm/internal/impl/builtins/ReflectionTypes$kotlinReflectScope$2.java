package kotlin.reflect.jvm.internal.impl.builtins;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

public final class ReflectionTypes$kotlinReflectScope$2 extends C6890k implements C6851a<C7277h> {
    public final /* synthetic */ C6021a0 $module;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionTypes$kotlinReflectScope$2(C6021a0 a0Var) {
        super(0);
        this.$module = a0Var;
    }

    public final C7277h invoke() {
        return this.$module.mo23088G(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
    }
}
