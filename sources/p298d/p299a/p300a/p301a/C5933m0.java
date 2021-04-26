package p298d.p299a.p300a.p301a;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6081e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6086a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6116l;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6159a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6162d;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6164f;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6166h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6167i;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6168j;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6258c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6268c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6512s;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6291f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6293g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6299j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6321c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6322d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6326f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6332j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6445d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6532c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6536d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6539e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6540f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6562q;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6610h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p391i.p397y.C7262b;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7379i;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7382j;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7383k;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7397t;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7506l;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7636i;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.m0 */
public final class C5933m0 {

    /* renamed from: a */
    public static final ConcurrentMap<C5974w0, WeakReference<C6167i>> f11744a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C6167i m10750a(Class<?> cls) {
        C6888i.m12438e(cls, "$this$getOrCreateModule");
        ClassLoader e = C6173b.m11076e(cls);
        C5974w0 w0Var = new C5974w0(e);
        ConcurrentMap<C5974w0, WeakReference<C6167i>> concurrentMap = f11744a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(w0Var);
        if (weakReference != null) {
            C6167i iVar = (C6167i) weakReference.get();
            if (iVar != null) {
                C6888i.m12437d(iVar, "it");
                return iVar;
            }
            concurrentMap.remove(w0Var, weakReference);
        }
        C6888i.m12438e(e, "classLoader");
        C7417e eVar = r15;
        C7417e eVar2 = new C7417e("RuntimeModuleData");
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(eVar2, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
        C6086a0 a0Var = r3;
        C6717d p = C6717d.m12272p("<runtime module for " + e + '>');
        C6888i.m12437d(p, "special(\"<runtime module for $classLoader>\")");
        C6086a0 a0Var2 = new C6086a0(p, eVar2, jvmBuiltIns, (Map) null, (C6717d) null, 56);
        jvmBuiltIns.setBuiltInsModule(a0Var2);
        jvmBuiltIns.initialize(a0Var2, true);
        C6164f fVar = r8;
        C6164f fVar2 = new C6164f(e);
        C6536d dVar = r7;
        C6536d dVar2 = new C6536d();
        C6332j jVar = r6;
        C6332j jVar2 = new C6332j();
        C6025b0 b0Var = new C6025b0(eVar2, a0Var2);
        C6562q.C6563a aVar = C6562q.C6563a.f12854a;
        C6888i.m12438e(e, "classLoader");
        C6888i.m12438e(a0Var2, "module");
        C6888i.m12438e(eVar2, "storageManager");
        C6888i.m12438e(b0Var, "notFoundClasses");
        C5974w0 w0Var2 = w0Var;
        C6888i.m12438e(fVar2, "reflectKotlinClassFinder");
        C6888i.m12438e(dVar2, "deserializedDescriptorResolver");
        C6086a0 a0Var3 = a0Var2;
        C6888i.m12438e(jVar2, "singleModuleClassResolver");
        C6888i.m12438e(aVar, "packagePartProvider");
        C7636i iVar2 = C7636i.f15121i;
        C6268c cVar = new C6268c(eVar2, iVar2);
        C6332j jVar3 = jVar2;
        C6086a0 a0Var4 = a0Var3;
        C7417e eVar3 = eVar2;
        JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
        C6162d dVar3 = r15;
        C6162d dVar4 = new C6162d(e);
        C6299j jVar4 = C6299j.f12400a;
        C6164f fVar3 = fVar2;
        C7417e eVar4 = eVar3;
        C6299j jVar5 = jVar4;
        C6888i.m12437d(jVar4, "DO_NOTHING");
        C6166h hVar = C6166h.f12183b;
        C6166h hVar2 = hVar;
        C6293g gVar = C6293g.f12393a;
        C6293g gVar2 = gVar;
        C6166h hVar3 = hVar;
        C6888i.m12437d(gVar, "EMPTY");
        C6291f.C6292a aVar2 = C6291f.C6292a.f12392a;
        C6293g gVar3 = gVar;
        C7262b bVar = r9;
        String str = "EMPTY";
        C6798p pVar = C6798p.f13713g;
        C7262b bVar2 = new C7262b(eVar4, pVar);
        C6168j jVar6 = C6168j.f12186a;
        C6242u0.C6243a aVar3 = C6242u0.C6243a.f12261a;
        C6258c.C6259a aVar4 = C6258c.C6259a.f12272a;
        C6798p pVar2 = pVar;
        ReflectionTypes reflectionTypes = r0;
        ReflectionTypes reflectionTypes2 = new ReflectionTypes(a0Var4, b0Var);
        C6258c.C6259a aVar5 = aVar4;
        C6025b0 b0Var2 = b0Var;
        C6322d.C6323a aVar6 = C6322d.C6323a.f12450a;
        C6483l lVar = new C6483l(cVar, iVar2, new C6445d(aVar6));
        C6512s.C6513a aVar7 = C6512s.C6513a.f12758a;
        Objects.requireNonNull(C7504k.f14945b);
        C7506l lVar2 = C7504k.C7505a.f14947b;
        C6326f fVar4 = new C6326f(new C6321c(eVar, dVar3, fVar, dVar, jVar5, hVar2, gVar2, aVar2, bVar, jVar6, jVar, aVar, aVar3, aVar4, a0Var, reflectionTypes, cVar, lVar, aVar7, aVar6, lVar2, iVar2));
        C6888i.m12438e(a0Var4, "module");
        C6888i.m12438e(eVar4, "storageManager");
        String str2 = "notFoundClasses";
        C6025b0 b0Var3 = b0Var2;
        C6888i.m12438e(b0Var3, str2);
        C6888i.m12438e(fVar4, "lazyJavaPackageFragmentProvider");
        C6164f fVar5 = fVar3;
        C6888i.m12438e(fVar5, "reflectKotlinClassFinder");
        C6536d dVar5 = dVar2;
        C6888i.m12438e(dVar5, "deserializedDescriptorResolver");
        C6539e eVar5 = new C6539e(fVar5, dVar5);
        C6532c cVar2 = new C6532c(a0Var4, b0Var3, eVar4, fVar5);
        C7383k.C7384a aVar8 = C7383k.C7384a.f14759a;
        Objects.requireNonNull(C7379i.f14736a);
        C7379i iVar3 = C7379i.C7380a.f14738b;
        C6888i.m12438e(eVar4, "storageManager");
        C6888i.m12438e(a0Var4, "moduleDescriptor");
        C6888i.m12438e(aVar8, "configuration");
        C6888i.m12438e(eVar5, "classDataFinder");
        C6888i.m12438e(cVar2, "annotationAndConstantLoader");
        C6888i.m12438e(fVar4, "packageFragmentProvider");
        C6888i.m12438e(b0Var3, str2);
        C6166h hVar4 = hVar3;
        C6888i.m12438e(hVar4, "errorReporter");
        C6258c.C6259a aVar9 = aVar5;
        C6888i.m12438e(aVar9, "lookupTracker");
        C6888i.m12438e(iVar3, "contractDeserializer");
        C6888i.m12438e(lVar2, "kotlinTypeChecker");
        KotlinBuiltIns builtIns = a0Var4.getBuiltIns();
        JvmBuiltIns jvmBuiltIns3 = builtIns instanceof JvmBuiltIns ? (JvmBuiltIns) builtIns : null;
        C7397t.C7398a aVar10 = C7397t.C7398a.f14785a;
        C6540f fVar6 = C6540f.f12833a;
        C6074a customizer = jvmBuiltIns3 == null ? null : jvmBuiltIns3.getCustomizer();
        if (customizer == null) {
            customizer = C6074a.C6075a.f11983a;
        }
        C6077c customizer2 = jvmBuiltIns3 == null ? null : jvmBuiltIns3.getCustomizer();
        if (customizer2 == null) {
            customizer2 = C6077c.C6079b.f11985a;
        }
        C6077c cVar3 = customizer2;
        C6610h hVar5 = C6610h.f13014a;
        C7091f fVar7 = C6610h.f13015b;
        C7262b bVar3 = r3;
        C6025b0 b0Var4 = b0Var3;
        C6798p pVar3 = pVar2;
        C7262b bVar4 = new C7262b(eVar4, pVar3);
        C7382j jVar7 = r3;
        C6025b0 b0Var5 = b0Var4;
        C6086a0 a0Var5 = a0Var4;
        C6332j jVar8 = jVar3;
        C6536d dVar6 = dVar5;
        C7383k.C7384a aVar11 = aVar8;
        C7382j jVar9 = new C7382j(eVar4, a0Var4, aVar8, eVar5, cVar2, fVar4, aVar10, hVar4, aVar9, fVar6, pVar3, b0Var5, iVar3, customizer, cVar3, fVar7, lVar2, bVar3, (C6081e) null, 262144);
        C7382j jVar10 = jVar7;
        C6888i.m12438e(jVar10, "<set-?>");
        dVar6.f12829a = jVar10;
        C6293g gVar4 = gVar3;
        C6888i.m12437d(gVar4, str);
        JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(fVar4, gVar4);
        C6888i.m12438e(javaDescriptorResolver, "<set-?>");
        jVar3.f12471a = javaDescriptorResolver;
        ClassLoader classLoader = C6777r.class.getClassLoader();
        C6888i.m12437d(classLoader, "stdlibClassLoader");
        C7417e eVar6 = eVar4;
        JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(eVar6, new C6164f(classLoader), a0Var5, b0Var5, jvmBuiltIns2.getCustomizer(), jvmBuiltIns2.getCustomizer(), aVar11, lVar2, new C7262b(eVar6, pVar2));
        C6086a0 a0Var6 = a0Var5;
        a0Var6.mo23192D(a0Var5);
        C6116l lVar3 = new C6116l(C6790h.m12314A(javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider));
        C6888i.m12438e(lVar3, "providerForModuleContent");
        a0Var6.f11993k = lVar3;
        C6167i iVar4 = new C6167i(jVar10, new C6159a(dVar6, fVar5), (DefaultConstructorMarker) null);
        while (true) {
            ConcurrentMap<C5974w0, WeakReference<C6167i>> concurrentMap2 = f11744a;
            C5974w0 w0Var3 = w0Var2;
            WeakReference putIfAbsent = concurrentMap2.putIfAbsent(w0Var3, new WeakReference(iVar4));
            if (putIfAbsent == null) {
                return iVar4;
            }
            C6167i iVar5 = (C6167i) putIfAbsent.get();
            if (iVar5 != null) {
                return iVar5;
            }
            concurrentMap2.remove(w0Var3, putIfAbsent);
            w0Var2 = w0Var3;
        }
    }
}
