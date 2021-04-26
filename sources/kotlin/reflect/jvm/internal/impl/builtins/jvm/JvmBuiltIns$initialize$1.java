package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltIns$initialize$1 extends C6890k implements C6851a<JvmBuiltIns.Settings> {
    public final /* synthetic */ boolean $isAdditionalBuiltInsFeatureSupported;
    public final /* synthetic */ C6021a0 $moduleDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(C6021a0 a0Var, boolean z) {
        super(0);
        this.$moduleDescriptor = a0Var;
        this.$isAdditionalBuiltInsFeatureSupported = z;
    }

    public final JvmBuiltIns.Settings invoke() {
        return new JvmBuiltIns.Settings(this.$moduleDescriptor, this.$isAdditionalBuiltInsFeatureSupported);
    }
}
