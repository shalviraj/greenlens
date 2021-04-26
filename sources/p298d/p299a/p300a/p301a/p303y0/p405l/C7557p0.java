package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.p0 */
public final class C7557p0 extends C7577v0 {

    /* renamed from: c */
    public final /* synthetic */ List<C7567t0> f14998c;

    public C7557p0(List<? extends C7567t0> list) {
        this.f14998c = list;
    }

    /* renamed from: h */
    public C7580w0 mo25168h(C7567t0 t0Var) {
        C6888i.m12438e(t0Var, "key");
        if (!this.f14998c.contains(t0Var)) {
            return null;
        }
        C6083h declarationDescriptor = t0Var.getDeclarationDescriptor();
        Objects.requireNonNull(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return C7460d1.m13447m((C6248w0) declarationDescriptor);
    }
}
