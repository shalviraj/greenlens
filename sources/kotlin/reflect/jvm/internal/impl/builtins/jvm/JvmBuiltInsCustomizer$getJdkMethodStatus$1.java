package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6345e;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;
import p298d.p344x.p346c.C6888i;

public final class JvmBuiltInsCustomizer$getJdkMethodStatus$1 implements C7624c<C6046e> {
    public final /* synthetic */ JvmBuiltInsCustomizer this$0;

    public JvmBuiltInsCustomizer$getJdkMethodStatus$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.this$0 = jvmBuiltInsCustomizer;
    }

    public final Iterable<C6046e> getNeighbors(C6046e eVar) {
        Collection<C7452c0> supertypes = eVar.getTypeConstructor().getSupertypes();
        C6888i.m12437d(supertypes, "it.typeConstructor.supertypes");
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (C7452c0 V : supertypes) {
            C6083h declarationDescriptor = V.mo24887V().getDeclarationDescriptor();
            C6345e eVar2 = null;
            C6083h original = declarationDescriptor == null ? null : declarationDescriptor.getOriginal();
            C6046e eVar3 = original instanceof C6046e ? (C6046e) original : null;
            if (eVar3 != null) {
                eVar2 = jvmBuiltInsCustomizer.getJavaAnalogue(eVar3);
            }
            if (eVar2 != null) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }
}
