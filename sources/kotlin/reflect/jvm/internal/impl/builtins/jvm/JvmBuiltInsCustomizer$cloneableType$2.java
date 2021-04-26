package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltInsCustomizer$cloneableType$2 extends C6890k implements C6851a<C7489j0> {
    public final /* synthetic */ C7441m $storageManager;
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$cloneableType$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, C7441m mVar) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
        this.$storageManager = mVar;
    }

    public final C7489j0 invoke() {
        return C5266a.m9867Q0(this.this$0.getSettings().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new C6025b0(this.$storageManager, this.this$0.getSettings().getOwnerModuleDescriptor())).getDefaultType();
    }
}
