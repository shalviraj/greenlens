package p298d.p299a.p300a.p301a;

import p005b.p291q.p292a.C5266a;
import p298d.C6777r;
import p298d.p299a.C6732j;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.t */
public final class C5953t<T, V> extends C5873a0<T, V> implements C6732j<T, V> {

    /* renamed from: s */
    public final C5941o0<C5954a<T, V>> f11769s;

    /* renamed from: d.a.a.a.t$a */
    public static final class C5954a<T, V> extends C5885c0.C5890c<V> implements C6732j.C6733a<T, V> {

        /* renamed from: m */
        public final C5953t<T, V> f11770m;

        public C5954a(C5953t<T, V> tVar) {
            C6888i.m12438e(tVar, "property");
            this.f11770m = tVar;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11770m;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f11770m.m10784c().mo23009k(obj, obj2);
            return C6777r.f13694a;
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11770m;
        }
    }

    /* renamed from: d.a.a.a.t$b */
    public static final class C5955b extends C6890k implements C6851a<C5954a<T, V>> {

        /* renamed from: g */
        public final /* synthetic */ C5953t f11771g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5955b(C5953t tVar) {
            super(0);
            this.f11771g = tVar;
        }

        public Object invoke() {
            return new C5954a(this.f11771g);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5953t(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5954a<T, V>> V2 = C5266a.m9895V2(new C5955b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Setter(this) }");
        this.f11769s = V2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5953t(C5934n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, obj);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "signature");
        C5941o0<C5954a<T, V>> V2 = C5266a.m9895V2(new C5955b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Setter(this) }");
        this.f11769s = V2;
    }

    /* renamed from: F */
    public C5954a<T, V> m10784c() {
        C5954a<T, V> invoke = this.f11769s.invoke();
        C6888i.m12437d(invoke, "_setter()");
        return invoke;
    }

    /* renamed from: o */
    public void mo23050o(T t, V v) {
        m10784c().mo23009k(t, v);
    }
}
