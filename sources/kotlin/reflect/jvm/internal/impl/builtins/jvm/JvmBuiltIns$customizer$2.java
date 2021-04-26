package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6086a0;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltIns$customizer$2 extends C6890k implements C6851a<JvmBuiltInsCustomizer> {
    public final /* synthetic */ C7441m $storageManager;
    public final /* synthetic */ JvmBuiltIns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, C7441m mVar) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = mVar;
    }

    public final JvmBuiltInsCustomizer invoke() {
        C6086a0 builtInsModule = this.this$0.getBuiltInsModule();
        C6888i.m12437d(builtInsModule, "builtInsModule");
        C7441m mVar = this.$storageManager;
        final JvmBuiltIns jvmBuiltIns = this.this$0;
        return new JvmBuiltInsCustomizer(builtInsModule, mVar, new C6851a<JvmBuiltIns.Settings>() {
            public final JvmBuiltIns.Settings invoke() {
                C6851a access$getSettingsComputation$p = jvmBuiltIns.settingsComputation;
                if (access$getSettingsComputation$p != null) {
                    JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) access$getSettingsComputation$p.invoke();
                    jvmBuiltIns.settingsComputation = null;
                    return settings;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        });
    }
}
