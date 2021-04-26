package p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a;

import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7529c;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.u.a.a */
public final class C7214a extends C7489j0 implements C7529c {

    /* renamed from: h */
    public final C7580w0 f14448h;

    /* renamed from: i */
    public final C7215b f14449i;

    /* renamed from: j */
    public final boolean f14450j;

    /* renamed from: k */
    public final C6060h f14451k;

    public C7214a(C7580w0 w0Var, C7215b bVar, boolean z, C6060h hVar) {
        C6888i.m12438e(w0Var, "typeProjection");
        C6888i.m12438e(bVar, "constructor");
        C6888i.m12438e(hVar, "annotations");
        this.f14448h = w0Var;
        this.f14449i = bVar;
        this.f14450j = z;
        this.f14451k = hVar;
    }

    /* renamed from: U */
    public List<C7580w0> mo24886U() {
        return C6798p.f13713g;
    }

    /* renamed from: V */
    public C7567t0 mo24887V() {
        return this.f14449i;
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return this.f14450j;
    }

    /* renamed from: Z */
    public C7481g1 mo23545Z(boolean z) {
        if (z == this.f14450j) {
            return this;
        }
        return new C7214a(this.f14448h, this.f14449i, z, this.f14451k);
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C7214a(this.f14448h, this.f14449i, this.f14450j, hVar);
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        if (z == this.f14450j) {
            return this;
        }
        return new C7214a(this.f14448h, this.f14449i, z, this.f14451k);
    }

    /* renamed from: d0 */
    public C7489j0 mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C7214a(this.f14448h, this.f14449i, this.f14450j, hVar);
    }

    /* renamed from: e0 */
    public C7214a mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7580w0 refine = this.f14448h.refine(eVar);
        C6888i.m12437d(refine, "typeProjection.refine(kotlinTypeRefiner)");
        return new C7214a(refine, this.f14449i, this.f14450j, this.f14451k);
    }

    public C6060h getAnnotations() {
        return this.f14451k;
    }

    public C7277h getMemberScope() {
        C7277h c = C7570v.m13782c("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        C6888i.m12437d(c, "createErrorScope(\n            \"No member resolution should be done on captured type, it used only during constraint system resolution\", true\n        )");
        return c;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Captured(");
        u.append(this.f14448h);
        u.append(')');
        u.append(this.f14450j ? "?" : "");
        return u.toString();
    }
}
