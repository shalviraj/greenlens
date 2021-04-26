package p416l.p417a.p419u1;

import java.util.Objects;
import p298d.p337v.C6827f;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p416l.p417a.C7747n1;

/* renamed from: l.a.u1.r */
public final class C7791r {

    /* renamed from: a */
    public static final C7789p f15356a = new C7789p("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final C6866p<Object, C6827f.C6828a, Object> f15357b = C7792a.f15360g;

    /* renamed from: c */
    public static final C6866p<C7747n1<?>, C6827f.C6828a, C7747n1<?>> f15358c = C7793b.f15361g;

    /* renamed from: d */
    public static final C6866p<C7797u, C6827f.C6828a, C7797u> f15359d = C7794c.f15362g;

    /* renamed from: l.a.u1.r$a */
    public static final class C7792a extends C6890k implements C6866p<Object, C6827f.C6828a, Object> {

        /* renamed from: g */
        public static final C7792a f15360g = new C7792a();

        public C7792a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C6827f.C6828a aVar = (C6827f.C6828a) obj2;
            if (!(aVar instanceof C7747n1)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: l.a.u1.r$b */
    public static final class C7793b extends C6890k implements C6866p<C7747n1<?>, C6827f.C6828a, C7747n1<?>> {

        /* renamed from: g */
        public static final C7793b f15361g = new C7793b();

        public C7793b() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C7747n1 n1Var = (C7747n1) obj;
            C6827f.C6828a aVar = (C6827f.C6828a) obj2;
            if (n1Var != null) {
                return n1Var;
            }
            if (!(aVar instanceof C7747n1)) {
                aVar = null;
            }
            return (C7747n1) aVar;
        }
    }

    /* renamed from: l.a.u1.r$c */
    public static final class C7794c extends C6890k implements C6866p<C7797u, C6827f.C6828a, C7797u> {

        /* renamed from: g */
        public static final C7794c f15362g = new C7794c();

        public C7794c() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C7797u uVar = (C7797u) obj;
            C6827f.C6828a aVar = (C6827f.C6828a) obj2;
            if (aVar instanceof C7747n1) {
                C7747n1<Object> n1Var = (C7747n1) aVar;
                Object f0 = n1Var.mo25420f0(uVar.f15367d);
                Object[] objArr = uVar.f15364a;
                int i = uVar.f15366c;
                objArr[i] = f0;
                C7747n1<Object>[] n1VarArr = uVar.f15365b;
                uVar.f15366c = i + 1;
                n1VarArr[i] = n1Var;
            }
            return uVar;
        }
    }

    /* renamed from: a */
    public static final void m14155a(C6827f fVar, Object obj) {
        if (obj != f15356a) {
            if (obj instanceof C7797u) {
                C7797u uVar = (C7797u) obj;
                int length = uVar.f15365b.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        C7747n1<Object> n1Var = uVar.f15365b[length];
                        C6888i.m12436c(n1Var);
                        n1Var.mo25421z(fVar, uVar.f15364a[length]);
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = fVar.fold(null, f15358c);
                Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((C7747n1) fold).mo25421z(fVar, obj);
            }
        }
    }

    /* renamed from: b */
    public static final Object m14156b(C6827f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, f15357b);
            C6888i.m12436c(obj);
        }
        if (obj == 0) {
            return f15356a;
        }
        return obj instanceof Integer ? fVar.fold(new C7797u(fVar, ((Number) obj).intValue()), f15359d) : ((C7747n1) obj).mo25420f0(fVar);
    }
}
