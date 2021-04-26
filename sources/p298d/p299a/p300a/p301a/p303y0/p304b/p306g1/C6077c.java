package p298d.p299a.p300a.p301a.p303y0.p304b.p306g1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.g1.c */
public interface C6077c {

    /* renamed from: d.a.a.a.y0.b.g1.c$a */
    public static final class C6078a implements C6077c {

        /* renamed from: a */
        public static final C6078a f11984a = new C6078a();

        public boolean isFunctionAvailable(C6046e eVar, C6232q0 q0Var) {
            C6888i.m12438e(eVar, "classDescriptor");
            C6888i.m12438e(q0Var, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: d.a.a.a.y0.b.g1.c$b */
    public static final class C6079b implements C6077c {

        /* renamed from: a */
        public static final C6079b f11985a = new C6079b();

        public boolean isFunctionAvailable(C6046e eVar, C6232q0 q0Var) {
            C6888i.m12438e(eVar, "classDescriptor");
            C6888i.m12438e(q0Var, "functionDescriptor");
            return !q0Var.getAnnotations().mo23169v(C6080d.f11986a);
        }
    }

    boolean isFunctionAvailable(C6046e eVar, C6232q0 q0Var);
}
