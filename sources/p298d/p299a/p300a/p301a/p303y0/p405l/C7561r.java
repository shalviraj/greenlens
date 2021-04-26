package p298d.p299a.p300a.p301a.p303y0.p405l;

import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.r */
public abstract class C7561r extends C7558q {

    /* renamed from: h */
    public final C7489j0 f15002h;

    public C7561r(C7489j0 j0Var) {
        C6888i.m12438e(j0Var, "delegate");
        this.f15002h = j0Var;
    }

    /* renamed from: b0 */
    public C7481g1 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return hVar != getAnnotations() ? new C7525l(this, hVar) : this;
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        if (z == mo23566W()) {
            return this;
        }
        return this.f15002h.mo23545Z(z).mo23568d0(getAnnotations());
    }

    /* renamed from: d0 */
    public C7489j0 mo23568d0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return hVar != getAnnotations() ? new C7525l(this, hVar) : this;
    }

    /* renamed from: e0 */
    public C7489j0 mo23569e0() {
        return this.f15002h;
    }
}
