package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6215o0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.j1.e */
public abstract class C7495e {

    /* renamed from: d.a.a.a.y0.l.j1.e$a */
    public static final class C7496a extends C7495e {

        /* renamed from: a */
        public static final C7496a f14927a = new C7496a();

        /* renamed from: a */
        public C6046e mo25129a(C6713a aVar) {
            C6888i.m12438e(aVar, "classId");
            return null;
        }

        /* renamed from: b */
        public <S extends C7277h> S mo25130b(C6046e eVar, C6851a<? extends S> aVar) {
            C6888i.m12438e(eVar, "classDescriptor");
            C6888i.m12438e(aVar, "compute");
            return (C7277h) ((C6215o0.C6216a) aVar).invoke();
        }

        /* renamed from: c */
        public boolean mo25131c(C6021a0 a0Var) {
            C6888i.m12438e(a0Var, "moduleDescriptor");
            return false;
        }

        /* renamed from: d */
        public boolean mo25132d(C7567t0 t0Var) {
            C6888i.m12438e(t0Var, "typeConstructor");
            return false;
        }

        /* renamed from: e */
        public C6083h mo25133e(C6206k kVar) {
            C6888i.m12438e(kVar, "descriptor");
            return null;
        }

        /* renamed from: f */
        public Collection<C7452c0> mo25134f(C6046e eVar) {
            C6888i.m12438e(eVar, "classDescriptor");
            Collection<C7452c0> supertypes = eVar.getTypeConstructor().getSupertypes();
            C6888i.m12437d(supertypes, "classDescriptor.typeConstructor.supertypes");
            return supertypes;
        }

        /* renamed from: g */
        public C7452c0 mo25135g(C7452c0 c0Var) {
            C6888i.m12438e(c0Var, "type");
            return c0Var;
        }
    }

    /* renamed from: a */
    public abstract C6046e mo25129a(C6713a aVar);

    /* renamed from: b */
    public abstract <S extends C7277h> S mo25130b(C6046e eVar, C6851a<? extends S> aVar);

    /* renamed from: c */
    public abstract boolean mo25131c(C6021a0 a0Var);

    /* renamed from: d */
    public abstract boolean mo25132d(C7567t0 t0Var);

    /* renamed from: e */
    public abstract C6083h mo25133e(C6206k kVar);

    /* renamed from: f */
    public abstract Collection<C7452c0> mo25134f(C6046e eVar);

    /* renamed from: g */
    public abstract C7452c0 mo25135g(C7452c0 c0Var);
}
