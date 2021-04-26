package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m;

import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6302k;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7554o0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7584y0;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.h0.m.g */
public final class C6403g {

    /* renamed from: a */
    public static final C6714b f12622a = new C6714b("java.lang.Class");

    /* renamed from: a */
    public static final C7452c0 m11422a(C6248w0 w0Var, C6248w0 w0Var2, C6851a<? extends C7452c0> aVar) {
        C6888i.m12438e(w0Var, "<this>");
        C6888i.m12438e(aVar, "defaultValue");
        if (w0Var == w0Var2) {
            return (C7452c0) aVar.invoke();
        }
        List<C7452c0> upperBounds = w0Var.getUpperBounds();
        C6888i.m12437d(upperBounds, "upperBounds");
        C7452c0 c0Var = (C7452c0) C6790h.m12361o(upperBounds);
        if (c0Var.mo24887V().getDeclarationDescriptor() instanceof C6046e) {
            C6888i.m12437d(c0Var, "firstUpperBound");
            return C5266a.m9786C3(c0Var);
        }
        if (w0Var2 != null) {
            w0Var = w0Var2;
        }
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        while (true) {
            Objects.requireNonNull(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            C6248w0 w0Var3 = (C6248w0) declarationDescriptor;
            if (C6888i.m12434a(w0Var3, w0Var)) {
                return (C7452c0) aVar.invoke();
            }
            List<C7452c0> upperBounds2 = w0Var3.getUpperBounds();
            C6888i.m12437d(upperBounds2, "current.upperBounds");
            C7452c0 c0Var2 = (C7452c0) C6790h.m12361o(upperBounds2);
            if (c0Var2.mo24887V().getDeclarationDescriptor() instanceof C6046e) {
                C6888i.m12437d(c0Var2, "nextUpperBound");
                return C5266a.m9786C3(c0Var2);
            }
            declarationDescriptor = c0Var2.mo24887V().getDeclarationDescriptor();
        }
    }

    /* renamed from: b */
    public static final C7580w0 m11423b(C6248w0 w0Var, C6397a aVar) {
        C6888i.m12438e(w0Var, "typeParameter");
        C6888i.m12438e(aVar, "attr");
        return aVar.f12607a == C6302k.SUPERTYPE ? new C7584y0(C5266a.m9952f4(w0Var)) : new C7554o0(w0Var);
    }

    /* renamed from: c */
    public static C6397a m11424c(C6302k kVar, boolean z, C6248w0 w0Var, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            w0Var = null;
        }
        C6888i.m12438e(kVar, "<this>");
        return new C6397a(kVar, (C6398b) null, z2, w0Var, 2);
    }
}
