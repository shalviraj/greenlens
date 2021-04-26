package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.b0 */
public class C5880b0<D, E, V> extends C5885c0<V> implements Object<D, E, V>, C6866p {

    /* renamed from: q */
    public final C5941o0<C5881a<D, E, V>> f11660q;

    /* renamed from: r */
    public final C6764f<Field> f11661r = C5266a.m9885T2(C6765g.PUBLICATION, new C5883c(this));

    /* renamed from: d.a.a.a.b0$a */
    public static final class C5881a<D, E, V> extends C5885c0.C5887b<V> implements Object<D, E, V>, C6866p {

        /* renamed from: m */
        public final C5880b0<D, E, V> f11662m;

        public C5881a(C5880b0<D, E, ? extends V> b0Var) {
            C6888i.m12438e(b0Var, "property");
            this.f11662m = b0Var;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11662m;
        }

        public V invoke(D d, E e) {
            return this.f11662m.mo22978E(d, e);
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11662m;
        }
    }

    /* renamed from: d.a.a.a.b0$b */
    public static final class C5882b extends C6890k implements C6851a<C5881a<D, E, ? extends V>> {

        /* renamed from: g */
        public final /* synthetic */ C5880b0 f11663g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5882b(C5880b0 b0Var) {
            super(0);
            this.f11663g = b0Var;
        }

        public Object invoke() {
            return new C5881a(this.f11663g);
        }
    }

    /* renamed from: d.a.a.a.b0$c */
    public static final class C5883c extends C6890k implements C6851a<Field> {

        /* renamed from: g */
        public final /* synthetic */ C5880b0 f11664g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5883c(C5880b0 b0Var) {
            super(0);
            this.f11664g = b0Var;
        }

        public Object invoke() {
            return this.f11664g.mo22993A();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5880b0(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5881a<D, E, V>> V2 = C5266a.m9895V2(new C5882b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Getter(this) }");
        this.f11660q = V2;
    }

    /* renamed from: E */
    public V mo22978E(D d, E e) {
        return mo22961b().mo23009k(d, e);
    }

    /* renamed from: F */
    public C5881a<D, E, V> mo22961b() {
        C5881a<D, E, V> invoke = this.f11660q.invoke();
        C6888i.m12437d(invoke, "_getter()");
        return invoke;
    }

    public V invoke(D d, E e) {
        return mo22978E(d, e);
    }
}
