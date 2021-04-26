package p298d.p299a.p300a.p301a;

import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6730i;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p345b.C6867q;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.u */
public final class C5957u<D, E, V> extends C5880b0<D, E, V> implements Object<D, E, V>, C6866p, C6730i {

    /* renamed from: s */
    public final C5941o0<C5958a<D, E, V>> f11774s;

    /* renamed from: d.a.a.a.u$a */
    public static final class C5958a<D, E, V> extends C5885c0.C5890c<V> implements Object<D, E, V>, C6867q {

        /* renamed from: m */
        public final C5957u<D, E, V> f11775m;

        public C5958a(C5957u<D, E, V> uVar) {
            C6888i.m12438e(uVar, "property");
            this.f11775m = uVar;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11775m;
        }

        /* renamed from: j */
        public Object mo22971j(Object obj, Object obj2, Object obj3) {
            C5958a<D, E, V> invoke = this.f11775m.f11774s.invoke();
            C6888i.m12437d(invoke, "_setter()");
            invoke.mo23009k(obj, obj2, obj3);
            return C6777r.f13694a;
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11775m;
        }
    }

    /* renamed from: d.a.a.a.u$b */
    public static final class C5959b extends C6890k implements C6851a<C5958a<D, E, V>> {

        /* renamed from: g */
        public final /* synthetic */ C5957u f11776g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5959b(C5957u uVar) {
            super(0);
            this.f11776g = uVar;
        }

        public Object invoke() {
            return new C5958a(this.f11776g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5957u(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5958a<D, E, V>> V2 = C5266a.m9895V2(new C5959b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Setter(this) }");
        this.f11774s = V2;
    }

    /* renamed from: c */
    public C6730i.C6731a mo23048c() {
        C5958a<D, E, V> invoke = this.f11774s.invoke();
        C6888i.m12437d(invoke, "_setter()");
        return invoke;
    }
}
