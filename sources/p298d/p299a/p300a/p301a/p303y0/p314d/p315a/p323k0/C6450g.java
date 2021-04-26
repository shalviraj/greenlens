package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7547n;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7558q;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7579w;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.k0.g */
public final class C6450g extends C7558q implements C7547n {

    /* renamed from: h */
    public final C7489j0 f12659h;

    public C6450g(C7489j0 j0Var) {
        C6888i.m12438e(j0Var, "delegate");
        this.f12659h = j0Var;
    }

    /* renamed from: D */
    public C7452c0 mo23565D(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "replacement");
        C7481g1 Y = c0Var.mo25056Y();
        if (!C5266a.m9827J2(Y) && !C7460d1.m13441g(Y)) {
            return Y;
        }
        if (Y instanceof C7489j0) {
            return mo23571h0((C7489j0) Y);
        }
        if (Y instanceof C7579w) {
            C7455d0 d0Var = C7455d0.f14869a;
            C7579w wVar = (C7579w) Y;
            return C5266a.m9865P4(C7455d0.m13428c(mo23571h0(wVar.f15029h), mo23571h0(wVar.f15030i)), C5266a.m9997n1(Y));
        }
        throw new IllegalStateException(C6888i.m12444k("Incorrect type: ", Y).toString());
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return false;
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        return z ? this.f12659h.mo23545Z(true) : this;
    }

    /* renamed from: d0 */
    public C7489j0 mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C6450g(this.f12659h.mo23568d0(hVar));
    }

    /* renamed from: e0 */
    public C7489j0 mo23569e0() {
        return this.f12659h;
    }

    /* renamed from: g0 */
    public C7558q mo23570g0(C7489j0 j0Var) {
        C6888i.m12438e(j0Var, "delegate");
        return new C6450g(j0Var);
    }

    /* renamed from: h0 */
    public final C7489j0 mo23571h0(C7489j0 j0Var) {
        C7489j0 c0 = j0Var.mo23545Z(false);
        return !C5266a.m9827J2(j0Var) ? c0 : new C6450g(c0);
    }

    /* renamed from: i0 */
    public C6450g mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return new C6450g(this.f12659h.mo23568d0(hVar));
    }

    /* renamed from: x */
    public boolean mo23573x() {
        return true;
    }
}
