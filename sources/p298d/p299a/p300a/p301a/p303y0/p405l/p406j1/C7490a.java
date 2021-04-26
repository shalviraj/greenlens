package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import com.segment.analytics.integrations.BasePayload;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7465f;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7534h;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7535i;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.j1.a */
public final class C7490a extends C7465f.C7466a.C7467a {

    /* renamed from: a */
    public final /* synthetic */ C7492c f14920a;

    /* renamed from: b */
    public final /* synthetic */ C7448b1 f14921b;

    public C7490a(C7492c cVar, C7448b1 b1Var) {
        this.f14920a = cVar;
        this.f14921b = b1Var;
    }

    /* renamed from: a */
    public C7535i mo25087a(C7465f fVar, C7534h hVar) {
        C6888i.m12438e(fVar, BasePayload.CONTEXT_KEY);
        C6888i.m12438e(hVar, "type");
        C7492c cVar = this.f14920a;
        C7452c0 i = this.f14921b.mo25052i((C7452c0) cVar.mo25083k(hVar), C7484h1.INVARIANT);
        C6888i.m12437d(i, "substitutor.safeSubstitute(\n                        type.lowerBoundIfFlexible() as KotlinType,\n                        Variance.INVARIANT\n                    )");
        C7535i a = cVar.mo25110a(i);
        C6888i.m12436c(a);
        return a;
    }
}
