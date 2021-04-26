package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.z.h */
public interface C7277h extends C7282j {

    /* renamed from: a */
    public static final C7278a f14517a = C7278a.f14518a;

    /* renamed from: d.a.a.a.y0.i.z.h$a */
    public static final class C7278a {

        /* renamed from: a */
        public static final /* synthetic */ C7278a f14518a = new C7278a();

        /* renamed from: b */
        public static final C6862l<C6717d, Boolean> f14519b = C7279a.f14520g;

        /* renamed from: d.a.a.a.y0.i.z.h$a$a */
        public static final class C7279a extends C6890k implements C6862l<C6717d, Boolean> {

            /* renamed from: g */
            public static final C7279a f14520g = new C7279a();

            public C7279a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C6888i.m12438e((C6717d) obj, "it");
                return Boolean.TRUE;
            }
        }
    }

    /* renamed from: d.a.a.a.y0.i.z.h$b */
    public static final class C7280b extends C7281i {

        /* renamed from: b */
        public static final C7280b f14521b = new C7280b();

        public Set<C6717d> getClassifierNames() {
            return C6800r.f13715g;
        }

        public Set<C6717d> getFunctionNames() {
            return C6800r.f13715g;
        }

        public Set<C6717d> getVariableNames() {
            return C6800r.f13715g;
        }
    }

    Set<C6717d> getClassifierNames();

    Collection<? extends C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar);

    Collection<? extends C6207k0> getContributedVariables(C6717d dVar, C6257b bVar);

    Set<C6717d> getFunctionNames();

    Set<C6717d> getVariableNames();
}
