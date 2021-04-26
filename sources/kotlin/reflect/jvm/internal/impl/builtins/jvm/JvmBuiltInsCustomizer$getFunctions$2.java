package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

public final class JvmBuiltInsCustomizer$getFunctions$2 extends C6890k implements C6862l<C7277h, Collection<? extends C6232q0>> {
    public final /* synthetic */ C6717d $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(C6717d dVar) {
        super(1);
        this.$name = dVar;
    }

    public final Collection<C6232q0> invoke(C7277h hVar) {
        C6888i.m12438e(hVar, "it");
        return hVar.getContributedFunctions(this.$name, C6260d.FROM_BUILTINS);
    }
}
