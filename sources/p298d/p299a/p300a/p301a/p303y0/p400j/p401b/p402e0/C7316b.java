package p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p402e0;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6728g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6025b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6047e0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6074a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6077c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6081e;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6258c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p391i.p397y.C7262b;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7311d;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7379i;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7382j;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7383k;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7386m;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7391p;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7393q;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7397t;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.j.b.e0.b */
public final class C7316b implements BuiltInsLoader {

    /* renamed from: a */
    public final C7319d f14581a = new C7319d();

    /* renamed from: d.a.a.a.y0.j.b.e0.b$a */
    public /* synthetic */ class C7317a extends C6886g implements C6862l<String, InputStream> {
        public C7317a(C7319d dVar) {
            super(1, dVar);
        }

        public final String getName() {
            return "loadResource";
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C6888i.m12438e(str, "p0");
            return ((C7319d) this.f13782h).mo24945a(str);
        }

        /* renamed from: w */
        public final C6728g mo22957w() {
            return C6902w.m12460a(C7319d.class);
        }

        /* renamed from: y */
        public final String mo22958y() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    public C6035d0 createPackageFragmentProvider(C7441m mVar, C6021a0 a0Var, Iterable<? extends C6076b> iterable, C6077c cVar, C6074a aVar, boolean z) {
        C7441m mVar2 = mVar;
        C6021a0 a0Var2 = a0Var;
        Iterable<? extends C6076b> iterable2 = iterable;
        C6077c cVar2 = cVar;
        C6074a aVar2 = aVar;
        C6888i.m12438e(mVar2, "storageManager");
        C6888i.m12438e(a0Var2, "builtInsModule");
        C6888i.m12438e(iterable2, "classDescriptorFactories");
        C6888i.m12438e(cVar2, "platformDependentDeclarationFilter");
        C6888i.m12438e(aVar2, "additionalClassPartsProvider");
        Set<C6714b> set = StandardNames.BUILT_INS_PACKAGE_FQ_NAMES;
        C7317a aVar3 = new C7317a(this.f14581a);
        C6888i.m12438e(mVar2, "storageManager");
        C6888i.m12438e(a0Var2, "module");
        C6888i.m12438e(set, "packageFqNames");
        C6888i.m12438e(iterable2, "classDescriptorFactories");
        C6888i.m12438e(cVar2, "platformDependentDeclarationFilter");
        C6888i.m12438e(aVar2, "additionalClassPartsProvider");
        C6888i.m12438e(aVar3, "loadResource");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(set, 10));
        for (C6714b bVar : set) {
            String a = C7315a.f14580m.mo24944a(bVar);
            InputStream inputStream = (InputStream) aVar3.invoke(a);
            if (inputStream != null) {
                arrayList.add(C7318c.m13203D(bVar, mVar2, a0Var2, inputStream, z));
            } else {
                throw new IllegalStateException(C6888i.m12444k("Resource not found in classpath: ", a));
            }
        }
        C6047e0 e0Var = r9;
        C6047e0 e0Var2 = new C6047e0(arrayList);
        C6025b0 b0Var = r7;
        C6025b0 b0Var2 = new C6025b0(mVar2, a0Var2);
        C7383k.C7384a aVar4 = C7383k.C7384a.f14759a;
        C7386m mVar3 = r5;
        C7386m mVar4 = new C7386m(e0Var2);
        C7315a aVar5 = C7315a.f14580m;
        C7311d dVar = new C7311d(a0Var2, b0Var2, aVar5);
        C7397t.C7398a aVar6 = C7397t.C7398a.f14785a;
        C7391p pVar = C7391p.f14779a;
        C7382j jVar = r0;
        C6047e0 e0Var3 = e0Var2;
        C6888i.m12437d(pVar, "DO_NOTHING");
        C6258c.C6259a aVar7 = C6258c.C6259a.f12272a;
        C6047e0 e0Var4 = e0Var3;
        ArrayList arrayList2 = arrayList;
        C7393q.C7394a aVar8 = C7393q.C7394a.f14780a;
        Objects.requireNonNull(C7379i.f14736a);
        C7379i iVar = C7379i.C7380a.f14738b;
        C7091f fVar = aVar5.f14541a;
        C7262b bVar2 = r2;
        C7262b bVar3 = new C7262b(mVar2, C6798p.f13713g);
        C7382j jVar2 = new C7382j(mVar, a0Var, aVar4, mVar3, dVar, e0Var, aVar6, pVar, aVar7, aVar8, iterable, b0Var, iVar, aVar, cVar, fVar, (C7504k) null, bVar2, (C6081e) null, 327680);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((C7318c) it.next()).mo24995z(jVar);
        }
        return e0Var4;
    }
}
