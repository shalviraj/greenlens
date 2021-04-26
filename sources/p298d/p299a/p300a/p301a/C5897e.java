package p298d.p299a.p300a.p301a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.p328b.C6604e;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.e */
public abstract class C5897e {

    /* renamed from: d.a.a.a.e$a */
    public static final class C5898a extends C5897e {

        /* renamed from: a */
        public final List<Method> f11687a;

        /* renamed from: b */
        public final Class<?> f11688b;

        /* renamed from: d.a.a.a.e$a$a */
        public static final class C5899a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Method method = (Method) t;
                C6888i.m12437d(method, "it");
                String name = method.getName();
                Method method2 = (Method) t2;
                C6888i.m12437d(method2, "it");
                return C5266a.m9902X(name, method2.getName());
            }
        }

        /* renamed from: d.a.a.a.e$a$b */
        public static final class C5900b extends C6890k implements C6862l<Method, CharSequence> {

            /* renamed from: g */
            public static final C5900b f11689g = new C5900b();

            public C5900b() {
                super(1);
            }

            public Object invoke(Object obj) {
                Method method = (Method) obj;
                C6888i.m12437d(method, "it");
                Class<?> returnType = method.getReturnType();
                C6888i.m12437d(returnType, "it.returnType");
                return C6173b.m11074c(returnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5898a(Class<?> cls) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(cls, "jClass");
            this.f11688b = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            C6888i.m12437d(declaredMethods, "jClass.declaredMethods");
            this.f11687a = C5266a.m9934c4(declaredMethods, new C5899a());
        }

        /* renamed from: a */
        public String mo23002a() {
            return C6790h.m12369w(this.f11687a, "", "<init>(", ")V", 0, (CharSequence) null, C5900b.f11689g, 24);
        }
    }

    /* renamed from: d.a.a.a.e$b */
    public static final class C5901b extends C5897e {

        /* renamed from: a */
        public final Constructor<?> f11690a;

        /* renamed from: d.a.a.a.e$b$a */
        public static final class C5902a extends C6890k implements C6862l<Class<?>, CharSequence> {

            /* renamed from: g */
            public static final C5902a f11691g = new C5902a();

            public C5902a() {
                super(1);
            }

            public Object invoke(Object obj) {
                Class cls = (Class) obj;
                C6888i.m12437d(cls, "it");
                return C6173b.m11074c(cls);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5901b(Constructor<?> constructor) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(constructor, "constructor");
            this.f11690a = constructor;
        }

        /* renamed from: a */
        public String mo23002a() {
            Class[] parameterTypes = this.f11690a.getParameterTypes();
            C6888i.m12437d(parameterTypes, "constructor.parameterTypes");
            return C5266a.m9869Q2(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, C5902a.f11691g, 24);
        }
    }

    /* renamed from: d.a.a.a.e$c */
    public static final class C5903c extends C5897e {

        /* renamed from: a */
        public final Method f11692a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5903c(Method method) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(method, "method");
            this.f11692a = method;
        }

        /* renamed from: a */
        public String mo23002a() {
            return C5266a.m9989m(this.f11692a);
        }
    }

    /* renamed from: d.a.a.a.e$d */
    public static final class C5904d extends C5897e {

        /* renamed from: a */
        public final String f11693a;

        /* renamed from: b */
        public final C6604e.C6606b f11694b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5904d(C6604e.C6606b bVar) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(bVar, "signature");
            this.f11694b = bVar;
            this.f11693a = bVar.mo23716a();
        }

        /* renamed from: a */
        public String mo23002a() {
            return this.f11693a;
        }
    }

    /* renamed from: d.a.a.a.e$e */
    public static final class C5905e extends C5897e {

        /* renamed from: a */
        public final String f11695a;

        /* renamed from: b */
        public final C6604e.C6606b f11696b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5905e(C6604e.C6606b bVar) {
            super((DefaultConstructorMarker) null);
            C6888i.m12438e(bVar, "signature");
            this.f11696b = bVar;
            this.f11695a = bVar.mo23716a();
        }

        /* renamed from: a */
        public String mo23002a() {
            return this.f11695a;
        }
    }

    public C5897e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* renamed from: a */
    public abstract String mo23002a();
}
