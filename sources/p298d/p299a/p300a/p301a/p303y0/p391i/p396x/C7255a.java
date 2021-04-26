package p298d.p299a.p300a.p301a.p303y0.p391i.p396x;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6728g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6158j0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7497f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7507m;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6901v;
import p298d.p344x.p346c.C6902w;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.i.x.a */
public final class C7255a {

    /* renamed from: a */
    public static final /* synthetic */ int f14475a = 0;

    /* renamed from: d.a.a.a.y0.i.x.a$a */
    public static final class C7256a implements C7624c<C6030b1> {

        /* renamed from: a */
        public static final C7256a f14476a = new C7256a();

        public Iterable getNeighbors(Object obj) {
            Collection<C6030b1> overriddenDescriptors = ((C6030b1) obj).getOverriddenDescriptors();
            ArrayList arrayList = new ArrayList(C5266a.m9892V(overriddenDescriptors, 10));
            for (C6030b1 original : overriddenDescriptors) {
                arrayList.add(original.getOriginal());
            }
            return arrayList;
        }
    }

    /* renamed from: d.a.a.a.y0.i.x.a$b */
    public /* synthetic */ class C7257b extends C6886g implements C6862l<C6030b1, Boolean> {

        /* renamed from: p */
        public static final C7257b f14477p = new C7257b();

        public C7257b() {
            super(1);
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public Object invoke(Object obj) {
            C6030b1 b1Var = (C6030b1) obj;
            C6888i.m12438e(b1Var, "p0");
            return Boolean.valueOf(b1Var.mo23125E());
        }

        /* renamed from: w */
        public final C6728g mo22957w() {
            return C6902w.m12460a(C6030b1.class);
        }

        /* renamed from: y */
        public final String mo22958y() {
            return "declaresDefaultValue()Z";
        }
    }

    static {
        C6888i.m12437d(C6717d.m12270l("value"), "identifier(\"value\")");
    }

    /* renamed from: a */
    public static final boolean m13128a(C6030b1 b1Var) {
        C6888i.m12438e(b1Var, "<this>");
        Boolean e2 = C5266a.m9944e2(C5266a.m9910Y2(b1Var), C7256a.f14476a, C7257b.f14477p);
        C6888i.m12437d(e2, "ifAny(\n        listOf(this),\n        { current -> current.overriddenDescriptors.map(ValueParameterDescriptor::getOriginal) },\n        ValueParameterDescriptor::declaresDefaultValue\n    )");
        return e2.booleanValue();
    }

    /* renamed from: b */
    public static final C7227g<?> m13129b(C6055c cVar) {
        C6888i.m12438e(cVar, "<this>");
        return (C7227g) C6790h.m12362p(cVar.mo23163b().values());
    }

    /* renamed from: c */
    public static C6023b m13130c(C6023b bVar, boolean z, C6862l lVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        C6888i.m12438e(bVar, "<this>");
        C6888i.m12438e(lVar, "predicate");
        return (C6023b) C5266a.m9807G0(C5266a.m9910Y2(bVar), new C7258b(z), new C7259c(new C6901v(), lVar));
    }

    /* renamed from: d */
    public static final C6714b m13131d(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        C6715c i = m13136i(kVar);
        if (!i.mo23879f()) {
            i = null;
        }
        if (i == null) {
            return null;
        }
        return i.mo23883i();
    }

    /* renamed from: e */
    public static final C6046e m13132e(C6055c cVar) {
        C6888i.m12438e(cVar, "<this>");
        C6083h declarationDescriptor = cVar.mo23162a().mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor instanceof C6046e) {
            return (C6046e) declarationDescriptor;
        }
        return null;
    }

    /* renamed from: f */
    public static final KotlinBuiltIns m13133f(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        return m13138k(kVar).getBuiltIns();
    }

    /* renamed from: g */
    public static final C6713a m13134g(C6083h hVar) {
        C6206k containingDeclaration;
        C6713a g;
        if (hVar == null || (containingDeclaration = hVar.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof C6032c0) {
            return new C6713a(((C6032c0) containingDeclaration).getFqName(), hVar.getName());
        }
        if (!(containingDeclaration instanceof C6152i) || (g = m13134g((C6083h) containingDeclaration)) == null) {
            return null;
        }
        return g.mo23853d(hVar.getName());
    }

    /* renamed from: h */
    public static final C6714b m13135h(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        C6714b h = C7193g.m13028h(kVar);
        if (h == null) {
            h = C7193g.m13029i(kVar).mo23883i();
        }
        if (h != null) {
            C6888i.m12437d(h, "getFqNameSafe(this)");
            return h;
        }
        C7193g.m13021a(4);
        throw null;
    }

    /* renamed from: i */
    public static final C6715c m13136i(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        C6715c g = C7193g.m13027g(kVar);
        C6888i.m12437d(g, "getFqName(this)");
        return g;
    }

    /* renamed from: j */
    public static final C7495e m13137j(C6021a0 a0Var) {
        C7495e eVar;
        C6888i.m12438e(a0Var, "<this>");
        C7507m mVar = (C7507m) a0Var.mo23089R(C7497f.f14928a);
        if (mVar == null) {
            eVar = null;
        } else {
            eVar = (C7495e) mVar.f14950a;
        }
        return eVar == null ? C7495e.C7496a.f14927a : eVar;
    }

    /* renamed from: k */
    public static final C6021a0 m13138k(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        C6021a0 d = C7193g.m13024d(kVar);
        C6888i.m12437d(d, "getContainingModule(this)");
        return d;
    }

    /* renamed from: l */
    public static final C7668h<C6206k> m13139l(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        C6888i.m12438e(kVar, "<this>");
        return C7679s.m13894b(C5266a.m9898W0(kVar, C7260d.f14481g), 1);
    }

    /* renamed from: m */
    public static final C6023b m13140m(C6023b bVar) {
        C6888i.m12438e(bVar, "<this>");
        if (!(bVar instanceof C6158j0)) {
            return bVar;
        }
        C6207k0 I = ((C6158j0) bVar).mo23200I();
        C6888i.m12437d(I, "correspondingProperty");
        return I;
    }
}
