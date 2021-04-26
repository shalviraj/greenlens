package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;

public final class JvmBuiltInsCustomizer$isMutabilityViolation$1 implements C7624c<C6023b> {
    public static final JvmBuiltInsCustomizer$isMutabilityViolation$1 INSTANCE = new JvmBuiltInsCustomizer$isMutabilityViolation$1();

    public final Iterable<C6023b> getNeighbors(C6023b bVar) {
        return bVar.getOriginal().getOverriddenDescriptors();
    }
}
