package p298d.p299a.p300a.p301a;

import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.x */
public class C5975x<V> extends C5885c0<V> implements Object<V>, C6851a {

    /* renamed from: q */
    public final C5941o0<C5976a<V>> f11804q;

    /* renamed from: r */
    public final C6764f<Object> f11805r = C5266a.m9885T2(C6765g.PUBLICATION, new C6721z(this));

    /* renamed from: d.a.a.a.x$a */
    public static final class C5976a<R> extends C5885c0.C5887b<R> implements Object<R>, C6851a {

        /* renamed from: m */
        public final C5975x<R> f11806m;

        public C5976a(C5975x<? extends R> xVar) {
            C6888i.m12438e(xVar, "property");
            this.f11806m = xVar;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11806m;
        }

        public R invoke() {
            return this.f11806m.mo22961b().mo23009k(new Object[0]);
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11806m;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5975x(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5976a<V>> V2 = C5266a.m9895V2(new C6017y(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Getter(this) }");
        this.f11804q = V2;
    }

    /* renamed from: E */
    public C5976a<V> mo22961b() {
        C5976a<V> invoke = this.f11804q.invoke();
        C6888i.m12437d(invoke, "_getter()");
        return invoke;
    }

    public V invoke() {
        return mo22961b().mo23009k(new Object[0]);
    }
}
