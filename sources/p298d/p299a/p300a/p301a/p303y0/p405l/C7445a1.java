package p298d.p299a.p300a.p301a.p303y0.p405l;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.l.a1 */
public final class C7445a1 implements C6862l<C6714b, Boolean> {
    public Object invoke(Object obj) {
        C6714b bVar = (C6714b) obj;
        if (bVar != null) {
            return Boolean.valueOf(!bVar.equals(StandardNames.FqNames.unsafeVariance));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }
}
