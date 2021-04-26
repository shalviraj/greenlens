package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6523z;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6341d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6412a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6417d;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.f0.c */
public final class C6286c {

    /* renamed from: a */
    public static final C6286c f12379a = new C6286c();

    /* renamed from: b */
    public static final C6717d f12380b;

    /* renamed from: c */
    public static final C6717d f12381c;

    /* renamed from: d */
    public static final C6717d f12382d;

    /* renamed from: e */
    public static final Map<C6714b, C6714b> f12383e;

    /* renamed from: f */
    public static final Map<C6714b, C6714b> f12384f;

    static {
        C6717d l = C6717d.m12270l("message");
        C6888i.m12437d(l, "identifier(\"message\")");
        f12380b = l;
        C6717d l2 = C6717d.m12270l("allowedTargets");
        C6888i.m12437d(l2, "identifier(\"allowedTargets\")");
        f12381c = l2;
        C6717d l3 = C6717d.m12270l("value");
        C6888i.m12437d(l3, "identifier(\"value\")");
        f12382d = l3;
        C6714b bVar = StandardNames.FqNames.target;
        C6714b bVar2 = C6523z.f12771c;
        C6714b bVar3 = StandardNames.FqNames.retention;
        C6714b bVar4 = C6523z.f12772d;
        C6714b bVar5 = StandardNames.FqNames.repeatable;
        C6714b bVar6 = C6523z.f12775g;
        C6714b bVar7 = StandardNames.FqNames.mustBeDocumented;
        C6714b bVar8 = C6523z.f12774f;
        f12383e = C6790h.m12317D(new C6768j(bVar, bVar2), new C6768j(bVar3, bVar4), new C6768j(bVar5, bVar6), new C6768j(bVar7, bVar8));
        f12384f = C6790h.m12317D(new C6768j(bVar2, bVar), new C6768j(bVar4, bVar3), new C6768j(C6523z.f12773e, StandardNames.FqNames.deprecated), new C6768j(bVar6, bVar5), new C6768j(bVar8, bVar7));
    }

    /* renamed from: a */
    public final C6055c mo23456a(C6714b bVar, C6417d dVar, C6328g gVar) {
        C6412a j;
        C6888i.m12438e(bVar, "kotlinName");
        C6888i.m12438e(dVar, "annotationOwner");
        C6888i.m12438e(gVar, "c");
        if (C6888i.m12434a(bVar, StandardNames.FqNames.deprecated)) {
            C6714b bVar2 = C6523z.f12773e;
            C6888i.m12437d(bVar2, "DEPRECATED_ANNOTATION");
            C6412a j2 = dVar.mo23344j(bVar2);
            if (j2 != null || dVar.mo23346q()) {
                return new C6289e(j2, gVar);
            }
        }
        C6714b bVar3 = f12383e.get(bVar);
        if (bVar3 == null || (j = dVar.mo23344j(bVar3)) == null) {
            return null;
        }
        return mo23457b(j, gVar, false);
    }

    /* renamed from: b */
    public final C6055c mo23457b(C6412a aVar, C6328g gVar, boolean z) {
        C6888i.m12438e(aVar, "annotation");
        C6888i.m12438e(gVar, "c");
        C6713a b = aVar.mo23350b();
        if (C6888i.m12434a(b, C6713a.m12239l(C6523z.f12771c))) {
            return new C6297i(aVar, gVar);
        }
        if (C6888i.m12434a(b, C6713a.m12239l(C6523z.f12772d))) {
            return new C6295h(aVar, gVar);
        }
        if (C6888i.m12434a(b, C6713a.m12239l(C6523z.f12775g))) {
            return new C6284b(gVar, aVar, StandardNames.FqNames.repeatable);
        }
        if (C6888i.m12434a(b, C6713a.m12239l(C6523z.f12774f))) {
            return new C6284b(gVar, aVar, StandardNames.FqNames.mustBeDocumented);
        }
        if (C6888i.m12434a(b, C6713a.m12239l(C6523z.f12773e))) {
            return null;
        }
        return new C6341d(gVar, aVar, z);
    }
}
