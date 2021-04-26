package p298d.p299a.p300a.p301a.p303y0.p405l;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.s */
public final class C7563s extends C7586z0 {

    /* renamed from: b */
    public final C7586z0 f15007b;

    /* renamed from: c */
    public final C7586z0 f15008c;

    public C7563s(C7586z0 z0Var, C7586z0 z0Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f15007b = z0Var;
        this.f15008c = z0Var2;
    }

    /* renamed from: a */
    public boolean mo25170a() {
        return this.f15007b.mo25170a() || this.f15008c.mo25170a();
    }

    /* renamed from: b */
    public boolean mo24892b() {
        return this.f15007b.mo24892b() || this.f15008c.mo24892b();
    }

    /* renamed from: d */
    public C6060h mo25171d(C6060h hVar) {
        C6888i.m12438e(hVar, "annotations");
        return this.f15008c.mo25171d(this.f15007b.mo25171d(hVar));
    }

    /* renamed from: e */
    public C7580w0 mo23539e(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "key");
        C7580w0 e = this.f15007b.mo23539e(c0Var);
        return e == null ? this.f15008c.mo23539e(c0Var) : e;
    }

    /* renamed from: f */
    public boolean mo23540f() {
        return false;
    }

    /* renamed from: g */
    public C7452c0 mo25172g(C7452c0 c0Var, C7484h1 h1Var) {
        C6888i.m12438e(c0Var, "topLevelType");
        C6888i.m12438e(h1Var, "position");
        return this.f15008c.mo25172g(this.f15007b.mo25172g(c0Var, h1Var), h1Var);
    }
}
