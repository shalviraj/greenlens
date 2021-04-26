package p298d.p299a.p300a.p301a;

import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6730i;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.r */
public final class C5947r<V> extends C5975x<V> implements Object<V>, C6851a, C6730i {

    /* renamed from: s */
    public final C5941o0<C5948a<V>> f11762s;

    /* renamed from: d.a.a.a.r$a */
    public static final class C5948a<R> extends C5885c0.C5890c<R> implements Object<R>, C6862l {

        /* renamed from: m */
        public final C5947r<R> f11763m;

        public C5948a(C5947r<R> rVar) {
            C6888i.m12438e(rVar, "property");
            this.f11763m = rVar;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11763m;
        }

        public Object invoke(Object obj) {
            C5948a<V> invoke = this.f11763m.f11762s.invoke();
            C6888i.m12437d(invoke, "_setter()");
            invoke.mo23009k(obj);
            return C6777r.f13694a;
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11763m;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5947r(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5948a<V>> V2 = C5266a.m9895V2(new C5951s(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Setter(this) }");
        this.f11762s = V2;
    }

    /* renamed from: c */
    public C6730i.C6731a mo23048c() {
        C5948a<V> invoke = this.f11762s.invoke();
        C6888i.m12437d(invoke, "_setter()");
        return invoke;
    }
}
