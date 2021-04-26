package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6081e;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6258c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6548k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p397y.C7261a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7300a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7311d;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7379i;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7382j;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7383k;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7386m;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7387n;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7391p;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7393q;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7397t;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0.C7315a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0.C7318c;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

public final class JvmBuiltInsPackageFragmentProvider extends C7300a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(C7441m mVar, C6548k kVar, C6021a0 a0Var, C6025b0 b0Var, C6074a aVar, C6077c cVar, C7383k kVar2, C7504k kVar3, C7261a aVar2) {
        super(mVar, kVar, a0Var);
        C7441m mVar2 = mVar;
        C6021a0 a0Var2 = a0Var;
        C6025b0 b0Var2 = b0Var;
        C6888i.m12438e(mVar2, "storageManager");
        C6888i.m12438e(kVar, "finder");
        C6888i.m12438e(a0Var2, "moduleDescriptor");
        C6888i.m12438e(b0Var2, "notFoundClasses");
        C6888i.m12438e(aVar, "additionalClassPartsProvider");
        C6888i.m12438e(cVar, "platformDependentDeclarationFilter");
        C6888i.m12438e(kVar2, "deserializationConfiguration");
        C6888i.m12438e(kVar3, "kotlinTypeChecker");
        C6888i.m12438e(aVar2, "samConversionResolver");
        C7386m mVar3 = r5;
        C7386m mVar4 = new C7386m(this);
        C7311d dVar = r8;
        C7315a aVar3 = C7315a.f14580m;
        C7311d dVar2 = new C7311d(a0Var2, b0Var2, aVar3);
        C7397t.C7398a aVar4 = C7397t.C7398a.f14785a;
        C7391p pVar = C7391p.f14779a;
        C6888i.m12437d(pVar, "DO_NOTHING");
        C6258c.C6259a aVar5 = C6258c.C6259a.f12272a;
        C7382j jVar = r0;
        C7393q.C7394a aVar6 = C7393q.C7394a.f14780a;
        List A = C6790h.m12314A(new BuiltInFictitiousFunctionClassFactory(mVar2, a0Var), new JvmBuiltInClassDescriptorFactory(mVar, a0Var, (C6862l) null, 4, (DefaultConstructorMarker) null));
        Objects.requireNonNull(C7379i.f14736a);
        C7441m mVar5 = mVar;
        C6021a0 a0Var3 = a0Var;
        C7382j jVar2 = new C7382j(mVar5, a0Var3, kVar2, mVar3, dVar, this, aVar4, pVar, aVar5, aVar6, A, b0Var, C7379i.C7380a.f14738b, aVar, cVar, aVar3.f14541a, kVar3, aVar2, (C6081e) null, 262144);
        setComponents(jVar);
    }

    public C7387n findPackage(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        InputStream b = getFinder().mo23331b(bVar);
        if (b == null) {
            return null;
        }
        return C7318c.m13203D(bVar, getStorageManager(), getModuleDescriptor(), b, false);
    }
}
