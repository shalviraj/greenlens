package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6293g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6321c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6345e;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 */
public final class C7074x4876badb extends C6890k implements C6851a<C6046e> {
    public final /* synthetic */ C6345e $javaAnalogueDescriptor;
    public final /* synthetic */ C6046e $kotlinMutableClassIfContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7074x4876badb(C6345e eVar, C6046e eVar2) {
        super(0);
        this.$javaAnalogueDescriptor = eVar;
        this.$kotlinMutableClassIfContainer = eVar2;
    }

    public final C6046e invoke() {
        C6345e eVar = this.$javaAnalogueDescriptor;
        C6293g gVar = C6293g.f12393a;
        C6888i.m12437d(gVar, "EMPTY");
        C6046e eVar2 = this.$kotlinMutableClassIfContainer;
        Objects.requireNonNull(eVar);
        C6888i.m12438e(gVar, "javaResolverCache");
        C6328g gVar2 = eVar.f12502m;
        C6321c cVar = gVar2.f12460a;
        Objects.requireNonNull(cVar);
        C6888i.m12438e(gVar, "javaResolverCache");
        C6345e eVar3 = eVar;
        C6321c cVar2 = r2;
        C6321c cVar3 = cVar;
        C6046e eVar4 = eVar2;
        C6321c cVar4 = new C6321c(cVar.f12428a, cVar.f12429b, cVar.f12430c, cVar.f12431d, cVar.f12432e, cVar.f12433f, gVar, cVar.f12435h, cVar.f12436i, cVar.f12437j, cVar3.f12438k, cVar3.f12439l, cVar3.f12440m, cVar3.f12441n, cVar3.f12442o, cVar3.f12443p, cVar3.f12444q, cVar3.f12445r, cVar3.f12446s, cVar3.f12447t, cVar3.f12448u, cVar3.f12449v);
        C6328g gVar3 = gVar2;
        C6888i.m12438e(gVar3, "<this>");
        C6321c cVar5 = cVar2;
        C6888i.m12438e(cVar5, "components");
        C6328g gVar4 = new C6328g(cVar5, gVar3.f12461b, gVar3.f12462c);
        C6206k containingDeclaration = eVar3.getContainingDeclaration();
        C6888i.m12437d(containingDeclaration, "containingDeclaration");
        return new C6345e(gVar4, containingDeclaration, eVar3.f12500k, eVar4);
    }
}
