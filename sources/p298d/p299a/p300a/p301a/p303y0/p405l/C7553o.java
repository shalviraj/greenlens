package p298d.p299a.p300a.p301a.p303y0.p405l;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7465f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7491b;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7498g;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7530d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.o */
public final class C7553o extends C7558q implements C7547n, C7530d {

    /* renamed from: h */
    public final C7489j0 f14992h;

    /* renamed from: i */
    public final boolean f14993i;

    public C7553o(C7489j0 j0Var, boolean z) {
        this.f14992h = j0Var;
        this.f14993i = z;
    }

    public C7553o(C7489j0 j0Var, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14992h = j0Var;
        this.f14993i = z;
    }

    /* renamed from: h0 */
    public static final C7553o m13710h0(C7481g1 g1Var, boolean z) {
        C6888i.m12438e(g1Var, "type");
        if (g1Var instanceof C7553o) {
            return (C7553o) g1Var;
        }
        g1Var.mo24887V();
        boolean z2 = false;
        boolean z3 = true;
        if (!(g1Var.mo24887V().getDeclarationDescriptor() instanceof C6248w0) && !(g1Var instanceof C7498g)) {
            z3 = false;
        }
        if (z3) {
            if (!z || !(g1Var.mo24887V().getDeclarationDescriptor() instanceof C6248w0)) {
                C6888i.m12438e(g1Var, "type");
                z2 = !C7451c.m13412a(new C7491b(false, true, false, (C7495e) null, 12), C5266a.m9933c3(g1Var), C7465f.C7466a.C7468b.f14894a);
            } else {
                z2 = C7460d1.m13441g(g1Var);
            }
        }
        if (!z2) {
            return null;
        }
        if (g1Var instanceof C7579w) {
            C7579w wVar = (C7579w) g1Var;
            C6888i.m12434a(wVar.f15029h.mo24887V(), wVar.f15030i.mo24887V());
        }
        return new C7553o(C5266a.m9933c3(g1Var), z, (DefaultConstructorMarker) null);
    }

    /* renamed from: D */
    public C7452c0 mo23565D(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "replacement");
        return C7544m0.m13699a(c0Var.mo25056Y(), this.f14993i);
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return false;
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        return z ? this.f14992h.mo23545Z(z) : this;
    }

    /* renamed from: d0 */
    public C7489j0 mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C7553o(this.f14992h.mo23568d0(hVar), this.f14993i);
    }

    /* renamed from: e0 */
    public C7489j0 mo23569e0() {
        return this.f14992h;
    }

    /* renamed from: g0 */
    public C7558q mo23570g0(C7489j0 j0Var) {
        C6888i.m12438e(j0Var, "delegate");
        return new C7553o(j0Var, this.f14993i);
    }

    /* renamed from: i0 */
    public C7553o mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C7553o(this.f14992h.mo23568d0(hVar), this.f14993i);
    }

    public String toString() {
        return this.f14992h + "!!";
    }

    /* renamed from: x */
    public boolean mo23573x() {
        this.f14992h.mo24887V();
        return this.f14992h.mo24887V().getDeclarationDescriptor() instanceof C6248w0;
    }
}
