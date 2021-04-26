package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6033c1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.i */
public final class C7197i {

    /* renamed from: a */
    public static final /* synthetic */ int f14428a = 0;

    static {
        new C6714b("kotlin.jvm.JvmInline");
    }

    /* renamed from: a */
    public static final boolean m13049a(C6019a aVar) {
        C6888i.m12438e(aVar, "<this>");
        if (aVar instanceof C6209l0) {
            C6207k0 I = ((C6209l0) aVar).mo23200I();
            C6888i.m12437d(I, "correspondingProperty");
            if (m13052d(I)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m13050b(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        if (kVar instanceof C6046e) {
            C6046e eVar = (C6046e) kVar;
            if (eVar.isInline() || eVar.isValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m13051c(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor == null) {
            return false;
        }
        return m13050b(declarationDescriptor);
    }

    /* renamed from: d */
    public static final boolean m13052d(C6033c1 c1Var) {
        C6888i.m12438e(c1Var, "<this>");
        if (c1Var.getExtensionReceiverParameter() != null) {
            return false;
        }
        C6206k containingDeclaration = c1Var.getContainingDeclaration();
        C6888i.m12437d(containingDeclaration, "this.containingDeclaration");
        if (!m13050b(containingDeclaration)) {
            return false;
        }
        C6030b1 e = m13053e((C6046e) containingDeclaration);
        return C6888i.m12434a(e == null ? null : e.getName(), c1Var.getName());
    }

    /* renamed from: e */
    public static final C6030b1 m13053e(C6046e eVar) {
        C6034d unsubstitutedPrimaryConstructor;
        List<C6030b1> valueParameters;
        C6888i.m12438e(eVar, "<this>");
        if (!m13050b(eVar) || (unsubstitutedPrimaryConstructor = eVar.getUnsubstitutedPrimaryConstructor()) == null || (valueParameters = unsubstitutedPrimaryConstructor.getValueParameters()) == null) {
            return null;
        }
        return (C6030b1) C6790h.m12331R(valueParameters);
    }
}
