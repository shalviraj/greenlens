package p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0;

import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6643i;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6705c;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6707e;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6708f;
import p298d.p299a.p300a.p301a.p303y0.p326e.p330z.C6711g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7344h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.j.b.f0.l */
public final class C7370l extends C6111i0 implements C7322b {

    /* renamed from: g */
    public final C6643i f14707g;

    /* renamed from: h */
    public final C6705c f14708h;

    /* renamed from: i */
    public final C6707e f14709i;

    /* renamed from: j */
    public final C6711g f14710j;

    /* renamed from: k */
    public final C7343g f14711k;

    /* renamed from: l */
    public C7344h.C7345a f14712l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7370l(C6206k kVar, C6232q0 q0Var, C6060h hVar, C6717d dVar, C6023b.C6024a aVar, C6643i iVar, C6705c cVar, C6707e eVar, C6711g gVar, C7343g gVar2, C6234r0 r0Var) {
        super(kVar, q0Var, hVar, dVar, aVar, r0Var == null ? C6234r0.f12257a : r0Var);
        C6643i iVar2 = iVar;
        C6705c cVar2 = cVar;
        C6707e eVar2 = eVar;
        C6711g gVar3 = gVar;
        C6206k kVar2 = kVar;
        C6888i.m12438e(kVar, "containingDeclaration");
        C6060h hVar2 = hVar;
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(iVar2, "proto");
        C6888i.m12438e(cVar2, "nameResolver");
        C6888i.m12438e(eVar2, "typeTable");
        C6888i.m12438e(gVar3, "versionRequirementTable");
        this.f14707g = iVar2;
        this.f14708h = cVar2;
        this.f14709i = eVar2;
        this.f14710j = gVar3;
        this.f14711k = gVar2;
        this.f14712l = C7344h.C7345a.COMPATIBLE;
    }

    /* renamed from: J */
    public C6707e mo24950J() {
        return this.f14709i;
    }

    /* renamed from: P */
    public C6711g mo24951P() {
        return this.f14710j;
    }

    /* renamed from: S */
    public C6705c mo24952S() {
        return this.f14708h;
    }

    /* renamed from: T */
    public List<C6708f> mo24953T() {
        return C5266a.m9894V1(this);
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        C6717d dVar2;
        C6206k kVar2 = kVar;
        C6888i.m12438e(kVar, "newOwner");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(r0Var, "source");
        C6232q0 q0Var = (C6232q0) vVar;
        if (dVar == null) {
            C6717d name = getName();
            C6888i.m12437d(name, "name");
            dVar2 = name;
        } else {
            dVar2 = dVar;
        }
        C7370l lVar = new C7370l(kVar, q0Var, hVar, dVar2, aVar, this.f14707g, this.f14708h, this.f14709i, this.f14710j, this.f14711k, r0Var);
        lVar.setHasStableParameterNames(hasStableParameterNames());
        lVar.f14712l = this.f14712l;
        return lVar;
    }

    /* renamed from: h */
    public C7343g mo24955h() {
        return this.f14711k;
    }

    /* renamed from: t */
    public C7117p mo24956t() {
        return this.f14707g;
    }

    /* renamed from: x */
    public final C6111i0 mo24979x(C6213n0 n0Var, C6213n0 n0Var2, List<? extends C6248w0> list, List<? extends C6030b1> list2, C7452c0 c0Var, C6251y yVar, C6233r rVar, Map<? extends C6019a.C6020a<?>, ?> map, C7344h.C7345a aVar) {
        C6888i.m12438e(list, "typeParameters");
        C6888i.m12438e(list2, "unsubstitutedValueParameters");
        C6888i.m12438e(rVar, "visibility");
        C6888i.m12438e(map, "userDataMap");
        C6888i.m12438e(aVar, "isExperimentalCoroutineInReleaseEnvironment");
        C6111i0 initialize = super.initialize(n0Var, n0Var2, list, list2, c0Var, yVar, rVar, map);
        C6888i.m12437d(initialize, "super.initialize(\n            extensionReceiverParameter,\n            dispatchReceiverParameter,\n            typeParameters,\n            unsubstitutedValueParameters,\n            unsubstitutedReturnType,\n            modality,\n            visibility,\n            userDataMap\n        )");
        this.f14712l = aVar;
        return initialize;
    }
}
