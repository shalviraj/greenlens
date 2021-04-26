package p298d.p299a.p300a.p301a.p303y0.p391i;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.c */
public final class C7188c implements C7493d.C7494a {

    /* renamed from: a */
    public final /* synthetic */ C7191e f14410a;

    /* renamed from: b */
    public final /* synthetic */ boolean f14411b;

    /* renamed from: c */
    public final /* synthetic */ C6019a f14412c;

    /* renamed from: d */
    public final /* synthetic */ C6019a f14413d;

    /* renamed from: d.a.a.a.y0.i.c$a */
    public static final class C7189a extends C6890k implements C6866p<C6206k, C6206k, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C6019a f14414g;

        /* renamed from: h */
        public final /* synthetic */ C6019a f14415h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7189a(C6019a aVar, C6019a aVar2) {
            super(2);
            this.f14414g = aVar;
            this.f14415h = aVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C6888i.m12434a((C6206k) obj, this.f14414g) && C6888i.m12434a((C6206k) obj2, this.f14415h));
        }
    }

    public C7188c(C7191e eVar, boolean z, C6019a aVar, C6019a aVar2) {
        this.f14410a = eVar;
        this.f14411b = z;
        this.f14412c = aVar;
        this.f14413d = aVar2;
    }

    /* renamed from: a */
    public final boolean mo24869a(C7567t0 t0Var, C7567t0 t0Var2) {
        C6888i.m12438e(t0Var, "c1");
        C6888i.m12438e(t0Var2, "c2");
        if (C6888i.m12434a(t0Var, t0Var2)) {
            return true;
        }
        C6083h declarationDescriptor = t0Var.getDeclarationDescriptor();
        C6083h declarationDescriptor2 = t0Var2.getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof C6248w0) || !(declarationDescriptor2 instanceof C6248w0)) {
            return false;
        }
        return this.f14410a.mo24871b((C6248w0) declarationDescriptor, (C6248w0) declarationDescriptor2, this.f14411b, new C7189a(this.f14412c, this.f14413d));
    }
}
