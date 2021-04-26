package p298d.p299a.p300a.p301a.p303y0.p405l;

import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.l.o0 */
public final class C7554o0 extends C7582x0 {

    /* renamed from: a */
    public final C6248w0 f14994a;

    /* renamed from: b */
    public final C6764f f14995b = C5266a.m9885T2(C6765g.PUBLICATION, new C7555a(this));

    /* renamed from: d.a.a.a.y0.l.o0$a */
    public static final class C7555a extends C6890k implements C6851a<C7452c0> {

        /* renamed from: g */
        public final /* synthetic */ C7554o0 f14996g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7555a(C7554o0 o0Var) {
            super(0);
            this.f14996g = o0Var;
        }

        public Object invoke() {
            return C5266a.m9952f4(this.f14996g.f14994a);
        }
    }

    public C7554o0(C6248w0 w0Var) {
        C6888i.m12438e(w0Var, "typeParameter");
        this.f14994a = w0Var;
    }

    /* renamed from: a */
    public C7452c0 mo25161a() {
        return (C7452c0) this.f14995b.getValue();
    }

    /* renamed from: b */
    public C7484h1 mo25162b() {
        return C7484h1.OUT_VARIANCE;
    }

    /* renamed from: c */
    public boolean mo25163c() {
        return true;
    }

    public C7580w0 refine(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return this;
    }
}
