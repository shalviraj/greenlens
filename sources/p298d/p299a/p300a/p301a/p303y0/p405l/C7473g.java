package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6254z;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7497f;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7507m;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.l.g */
public abstract class C7473g implements C7567t0 {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;
    private final C7437i<C7476b> supertypes;

    /* renamed from: d.a.a.a.y0.l.g$a */
    public final class C7474a implements C7567t0 {

        /* renamed from: a */
        public final C7495e f14901a;

        /* renamed from: b */
        public final C6764f f14902b;

        /* renamed from: c */
        public final /* synthetic */ C7473g f14903c;

        /* renamed from: d.a.a.a.y0.l.g$a$a */
        public static final class C7475a extends C6890k implements C6851a<List<? extends C7452c0>> {

            /* renamed from: g */
            public final /* synthetic */ C7474a f14904g;

            /* renamed from: h */
            public final /* synthetic */ C7473g f14905h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7475a(C7474a aVar, C7473g gVar) {
                super(0);
                this.f14904g = aVar;
                this.f14905h = gVar;
            }

            public Object invoke() {
                C7495e eVar = this.f14904g.f14901a;
                List<C7452c0> supertypes = this.f14905h.getSupertypes();
                C6254z<C7507m<C7495e>> zVar = C7497f.f14928a;
                C6888i.m12438e(eVar, "<this>");
                C6888i.m12438e(supertypes, "types");
                ArrayList arrayList = new ArrayList(C5266a.m9892V(supertypes, 10));
                for (C7452c0 g : supertypes) {
                    arrayList.add(eVar.mo25135g(g));
                }
                return arrayList;
            }
        }

        public C7474a(C7473g gVar, C7495e eVar) {
            C6888i.m12438e(gVar, "this$0");
            C6888i.m12438e(eVar, "kotlinTypeRefiner");
            this.f14903c = gVar;
            this.f14901a = eVar;
            this.f14902b = C5266a.m9885T2(C6765g.PUBLICATION, new C7475a(this, gVar));
        }

        public boolean equals(Object obj) {
            return this.f14903c.equals(obj);
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.f14903c.getBuiltIns();
            C6888i.m12437d(builtIns, "this@AbstractTypeConstructor.builtIns");
            return builtIns;
        }

        public C6083h getDeclarationDescriptor() {
            return this.f14903c.getDeclarationDescriptor();
        }

        public List<C6248w0> getParameters() {
            List<C6248w0> parameters = this.f14903c.getParameters();
            C6888i.m12437d(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public Collection getSupertypes() {
            return (List) this.f14902b.getValue();
        }

        public int hashCode() {
            return this.f14903c.hashCode();
        }

        public boolean isDenotable() {
            return this.f14903c.isDenotable();
        }

        public C7567t0 refine(C7495e eVar) {
            C6888i.m12438e(eVar, "kotlinTypeRefiner");
            return this.f14903c.refine(eVar);
        }

        public String toString() {
            return this.f14903c.toString();
        }
    }

    /* renamed from: d.a.a.a.y0.l.g$b */
    public static final class C7476b {

        /* renamed from: a */
        public final Collection<C7452c0> f14906a;

        /* renamed from: b */
        public List<? extends C7452c0> f14907b = C5266a.m9910Y2(C7570v.f15020c);

        public C7476b(Collection<? extends C7452c0> collection) {
            C6888i.m12438e(collection, "allSupertypes");
            this.f14906a = collection;
        }
    }

    /* renamed from: d.a.a.a.y0.l.g$c */
    public static final class C7477c extends C6890k implements C6851a<C7476b> {

        /* renamed from: g */
        public final /* synthetic */ C7473g f14908g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7477c(C7473g gVar) {
            super(0);
            this.f14908g = gVar;
        }

        public Object invoke() {
            return new C7476b(this.f14908g.computeSupertypes());
        }
    }

    /* renamed from: d.a.a.a.y0.l.g$d */
    public static final class C7478d extends C6890k implements C6862l<Boolean, C7476b> {

        /* renamed from: g */
        public static final C7478d f14909g = new C7478d();

        public C7478d() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return new C7476b(C5266a.m9910Y2(C7570v.f15020c));
        }
    }

    /* renamed from: d.a.a.a.y0.l.g$e */
    public static final class C7479e extends C6890k implements C6862l<C7476b, C6777r> {

        /* renamed from: g */
        public final /* synthetic */ C7473g f14910g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7479e(C7473g gVar) {
            super(1);
            this.f14910g = gVar;
        }

        public Object invoke(Object obj) {
            C7476b bVar = (C7476b) obj;
            C6888i.m12438e(bVar, "supertypes");
            C6242u0 supertypeLoopChecker = this.f14910g.getSupertypeLoopChecker();
            C7473g gVar = this.f14910g;
            Collection<C7452c0> a = supertypeLoopChecker.mo23433a(gVar, bVar.f14906a, new C7488j(gVar), new C7521k(this.f14910g));
            List<T> list = null;
            if (a.isEmpty()) {
                C7452c0 defaultSupertypeIfEmpty = this.f14910g.defaultSupertypeIfEmpty();
                a = defaultSupertypeIfEmpty == null ? null : C5266a.m9910Y2(defaultSupertypeIfEmpty);
                if (a == null) {
                    a = C6798p.f13713g;
                }
            }
            if (this.f14910g.getShouldReportCyclicScopeWithCompanionWarning()) {
                C6242u0 supertypeLoopChecker2 = this.f14910g.getSupertypeLoopChecker();
                C7473g gVar2 = this.f14910g;
                supertypeLoopChecker2.mo23433a(gVar2, a, new C7482h(gVar2), new C7485i(this.f14910g));
            }
            C7473g gVar3 = this.f14910g;
            if (a instanceof List) {
                list = a;
            }
            if (list == null) {
                list = C6790h.m12337X(a);
            }
            List<C7452c0> processSupertypesWithoutCycles = gVar3.processSupertypesWithoutCycles(list);
            C6888i.m12438e(processSupertypesWithoutCycles, "<set-?>");
            bVar.f14907b = processSupertypesWithoutCycles;
            return C6777r.f13694a;
        }
    }

    public C7473g(C7441m mVar) {
        C6888i.m12438e(mVar, "storageManager");
        this.supertypes = mVar.mo25022e(new C7477c(this), C7478d.f14909g, new C7479e(this));
    }

    /* access modifiers changed from: private */
    public final Collection<C7452c0> computeNeighbours(C7567t0 t0Var, boolean z) {
        List<T> list = null;
        C7473g gVar = t0Var instanceof C7473g ? (C7473g) t0Var : null;
        if (gVar != null) {
            list = C6790h.m12322I(((C7476b) gVar.supertypes.invoke()).f14906a, gVar.getAdditionalNeighboursInSupertypeGraph(z));
        }
        if (list != null) {
            return list;
        }
        Collection<C7452c0> supertypes2 = t0Var.getSupertypes();
        C6888i.m12437d(supertypes2, "supertypes");
        return supertypes2;
    }

    public abstract Collection<C7452c0> computeSupertypes();

    public C7452c0 defaultSupertypeIfEmpty() {
        return null;
    }

    public Collection<C7452c0> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        return C6798p.f13713g;
    }

    public abstract C6083h getDeclarationDescriptor();

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    public abstract C6242u0 getSupertypeLoopChecker();

    public List<C7452c0> getSupertypes() {
        return ((C7476b) this.supertypes.invoke()).f14907b;
    }

    public List<C7452c0> processSupertypesWithoutCycles(List<C7452c0> list) {
        C6888i.m12438e(list, "supertypes");
        return list;
    }

    public C7567t0 refine(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        return new C7474a(this, eVar);
    }

    public void reportScopesLoopError(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
    }

    public void reportSupertypeLoopError(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
    }
}
