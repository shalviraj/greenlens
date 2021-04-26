package p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0;

import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6110i;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6625d;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6708f;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6711g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7344h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.f0.c */
public final class C7323c extends C6110i implements C7322b {

    /* renamed from: i */
    public final C6625d f14588i;

    /* renamed from: j */
    public final C6705c f14589j;

    /* renamed from: k */
    public final C6707e f14590k;

    /* renamed from: l */
    public final C6711g f14591l;

    /* renamed from: m */
    public final C7343g f14592m;

    /* renamed from: n */
    public C7344h.C7345a f14593n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7323c(C6046e eVar, C6157j jVar, C6060h hVar, boolean z, C6023b.C6024a aVar, C6625d dVar, C6705c cVar, C6707e eVar2, C6711g gVar, C7343g gVar2, C6234r0 r0Var) {
        super(eVar, jVar, hVar, z, aVar, r0Var == null ? C6234r0.f12257a : r0Var);
        C6625d dVar2 = dVar;
        C6705c cVar2 = cVar;
        C6707e eVar3 = eVar2;
        C6711g gVar3 = gVar;
        C6046e eVar4 = eVar;
        C6888i.m12438e(eVar, "containingDeclaration");
        C6060h hVar2 = hVar;
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(dVar2, "proto");
        C6888i.m12438e(cVar2, "nameResolver");
        C6888i.m12438e(eVar3, "typeTable");
        C6888i.m12438e(gVar3, "versionRequirementTable");
        this.f14588i = dVar2;
        this.f14589j = cVar2;
        this.f14590k = eVar3;
        this.f14591l = gVar3;
        this.f14592m = gVar2;
        this.f14593n = C7344h.C7345a.COMPATIBLE;
    }

    /* renamed from: J */
    public C6707e mo24950J() {
        return this.f14590k;
    }

    /* renamed from: P */
    public C6711g mo24951P() {
        return this.f14591l;
    }

    /* renamed from: S */
    public C6705c mo24952S() {
        return this.f14589j;
    }

    /* renamed from: T */
    public List<C6708f> mo24953T() {
        return C5266a.m9894V1(this);
    }

    /* renamed from: U */
    public C7323c mo24954U(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6060h hVar, C6234r0 r0Var) {
        C6206k kVar2 = kVar;
        C6888i.m12438e(kVar2, "newOwner");
        C6023b.C6024a aVar2 = aVar;
        C6888i.m12438e(aVar2, "kind");
        C6060h hVar2 = hVar;
        C6888i.m12438e(hVar2, "annotations");
        C6234r0 r0Var2 = r0Var;
        C6888i.m12438e(r0Var2, "source");
        C7323c cVar = new C7323c((C6046e) kVar2, (C6157j) vVar, hVar2, this.f12074g, aVar2, this.f14588i, this.f14589j, this.f14590k, this.f14591l, this.f14592m, r0Var2);
        cVar.setHasStableParameterNames(hasStableParameterNames());
        C7344h.C7345a aVar3 = this.f14593n;
        C6888i.m12438e(aVar3, "<set-?>");
        cVar.f14593n = aVar3;
        return cVar;
    }

    public /* bridge */ /* synthetic */ C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        return mo24954U(kVar, vVar, aVar, hVar, r0Var);
    }

    /* renamed from: h */
    public C7343g mo24955h() {
        return this.f14592m;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    /* renamed from: t */
    public C7117p mo24956t() {
        return this.f14588i;
    }

    /* renamed from: x */
    public /* bridge */ /* synthetic */ C6110i mo23250x(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        return mo24954U(kVar, vVar, aVar, hVar, r0Var);
    }
}
