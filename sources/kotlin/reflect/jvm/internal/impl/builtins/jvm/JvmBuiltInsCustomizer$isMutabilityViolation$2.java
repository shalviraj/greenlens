package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltInsCustomizer$isMutabilityViolation$2 extends C6890k implements C6862l<C6023b, Boolean> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$isMutabilityViolation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Boolean invoke(C6023b bVar) {
        return Boolean.valueOf(bVar.getKind() == C6023b.C6024a.DECLARATION && this.this$0.j2kClassMapper.isMutable((C6046e) bVar.getContainingDeclaration()));
    }
}
