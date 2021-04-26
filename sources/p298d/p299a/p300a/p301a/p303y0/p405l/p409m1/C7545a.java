package p298d.p299a.p300a.p301a.p303y0.p405l.p409m1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.l.m1.a */
public final class C7545a extends C6890k implements C6862l<C7481g1, Boolean> {

    /* renamed from: g */
    public static final C7545a f14983g = new C7545a();

    public C7545a() {
        super(1);
    }

    public Object invoke(Object obj) {
        C7481g1 g1Var = (C7481g1) obj;
        C6888i.m12438e(g1Var, "it");
        C6083h declarationDescriptor = g1Var.mo24887V().getDeclarationDescriptor();
        boolean z = false;
        if (declarationDescriptor != null) {
            C6888i.m12438e(declarationDescriptor, "<this>");
            if ((declarationDescriptor instanceof C6248w0) && (((C6248w0) declarationDescriptor).getContainingDeclaration() instanceof C6246v0)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
