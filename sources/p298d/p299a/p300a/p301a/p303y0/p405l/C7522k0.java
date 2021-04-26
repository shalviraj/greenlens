package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.k0 */
public final class C7522k0 extends C7489j0 {

    /* renamed from: h */
    public final C7567t0 f14962h;

    /* renamed from: i */
    public final List<C7580w0> f14963i;

    /* renamed from: j */
    public final boolean f14964j;

    /* renamed from: k */
    public final C7277h f14965k;

    /* renamed from: l */
    public final C6862l<C7495e, C7489j0> f14966l;

    public C7522k0(C7567t0 t0Var, List<? extends C7580w0> list, boolean z, C7277h hVar, C6862l<? super C7495e, ? extends C7489j0> lVar) {
        C6888i.m12438e(t0Var, "constructor");
        C6888i.m12438e(list, "arguments");
        C6888i.m12438e(hVar, "memberScope");
        C6888i.m12438e(lVar, "refinedTypeFactory");
        this.f14962h = t0Var;
        this.f14963i = list;
        this.f14964j = z;
        this.f14965k = hVar;
        this.f14966l = lVar;
        if (hVar instanceof C7570v.C7574d) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + hVar + 10 + t0Var);
        }
    }

    /* renamed from: U */
    public List<C7580w0> mo24886U() {
        return this.f14963i;
    }

    /* renamed from: V */
    public C7567t0 mo24887V() {
        return this.f14962h;
    }

    /* renamed from: W */
    public boolean mo23566W() {
        return this.f14964j;
    }

    /* renamed from: X */
    public C7452c0 mo23544X(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7489j0 invoke = this.f14966l.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    /* renamed from: a0 */
    public C7481g1 mo23546a0(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        C7489j0 invoke = this.f14966l.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    /* renamed from: c0 */
    public C7489j0 mo23567c0(boolean z) {
        if (z == this.f14964j) {
            return this;
        }
        return z ? new C7483h0(this) : new C7480g0(this);
    }

    /* renamed from: d0 */
    public C7489j0 mo23547b0(C6060h hVar) {
        C6888i.m12438e(hVar, "newAnnotations");
        return hVar.isEmpty() ? this : new C7525l(this, hVar);
    }

    public C6060h getAnnotations() {
        Objects.requireNonNull(C6060h.f11920d);
        return C6060h.C6061a.f11922b;
    }

    public C7277h getMemberScope() {
        return this.f14965k;
    }
}
