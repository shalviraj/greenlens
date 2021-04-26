package p298d.p299a.p300a.p301a;

import java.lang.reflect.Field;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.p299a.C6736l;
import p298d.p299a.C6739m;
import p298d.p299a.p300a.p301a.C5885c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.a0 */
public class C5873a0<T, V> extends C5885c0<V> implements C6739m<T, V> {

    /* renamed from: q */
    public final C5941o0<C5874a<T, V>> f11644q;

    /* renamed from: r */
    public final C6764f<Field> f11645r = C5266a.m9885T2(C6765g.PUBLICATION, new C5876c(this));

    /* renamed from: d.a.a.a.a0$a */
    public static final class C5874a<T, V> extends C5885c0.C5887b<V> implements C6739m.C6740a<T, V> {

        /* renamed from: m */
        public final C5873a0<T, V> f11646m;

        public C5874a(C5873a0<T, ? extends V> a0Var) {
            C6888i.m12438e(a0Var, "property");
            this.f11646m = a0Var;
        }

        /* renamed from: B */
        public C5885c0 mo22963B() {
            return this.f11646m;
        }

        public V invoke(T t) {
            return this.f11646m.get(t);
        }

        /* renamed from: n */
        public C6736l mo22964n() {
            return this.f11646m;
        }
    }

    /* renamed from: d.a.a.a.a0$b */
    public static final class C5875b extends C6890k implements C6851a<C5874a<T, ? extends V>> {

        /* renamed from: g */
        public final /* synthetic */ C5873a0 f11647g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5875b(C5873a0 a0Var) {
            super(0);
            this.f11647g = a0Var;
        }

        public Object invoke() {
            return new C5874a(this.f11647g);
        }
    }

    /* renamed from: d.a.a.a.a0$c */
    public static final class C5876c extends C6890k implements C6851a<Field> {

        /* renamed from: g */
        public final /* synthetic */ C5873a0 f11648g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5876c(C5873a0 a0Var) {
            super(0);
            this.f11648g = a0Var;
        }

        public Object invoke() {
            return this.f11648g.mo22993A();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5873a0(C5934n nVar, C6207k0 k0Var) {
        super(nVar, k0Var);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(k0Var, "descriptor");
        C5941o0<C5874a<T, V>> V2 = C5266a.m9895V2(new C5875b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Getter(this) }");
        this.f11644q = V2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5873a0(C5934n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, (C6207k0) null, obj);
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "signature");
        C6888i.m12438e(nVar, "container");
        C6888i.m12438e(str, "name");
        C6888i.m12438e(str2, "signature");
        C5941o0<C5874a<T, V>> V2 = C5266a.m9895V2(new C5875b(this));
        C6888i.m12437d(V2, "ReflectProperties.lazy { Getter(this) }");
        this.f11644q = V2;
    }

    /* renamed from: E */
    public C5874a<T, V> m10662b() {
        C5874a<T, V> invoke = this.f11644q.invoke();
        C6888i.m12437d(invoke, "_getter()");
        return invoke;
    }

    public V get(T t) {
        return m10662b().mo23009k(t);
    }

    public V invoke(T t) {
        return get(t);
    }
}
