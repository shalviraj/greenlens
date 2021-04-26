package p298d.p299a.p300a.p301a.p302x0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.x0.k */
public abstract class C6013k implements C5986h<Method> {

    /* renamed from: a */
    public final Type f11850a;

    /* renamed from: b */
    public final Method f11851b;

    /* renamed from: c */
    public final List<Type> f11852c;

    /* renamed from: d.a.a.a.x0.k$a */
    public static final class C6014a extends C6013k implements C5985g {

        /* renamed from: d */
        public final Object f11853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6014a(Method method, Object obj) {
            super(method, C6798p.f13713g, (DefaultConstructorMarker) null);
            C6888i.m12438e(method, "unboxMethod");
            this.f11853d = obj;
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            C6888i.m12438e(objArr, "args");
            C5266a.m9836L(this, objArr);
            Object obj = this.f11853d;
            C6888i.m12438e(objArr, "args");
            return this.f11851b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: d.a.a.a.x0.k$b */
    public static final class C6015b extends C6013k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6015b(Method method) {
            super(method, C5266a.m9910Y2(method.getDeclaringClass()), (DefaultConstructorMarker) null);
            C6888i.m12438e(method, "unboxMethod");
        }

        /* renamed from: k */
        public Object mo23072k(Object[] objArr) {
            C6888i.m12438e(objArr, "args");
            C6888i.m12438e(objArr, "args");
            C5266a.m9836L(this, objArr);
            Object obj = objArr[0];
            Object[] i = objArr.length <= 1 ? new Object[0] : C6790h.m12355i(objArr, 1, objArr.length);
            C6888i.m12438e(i, "args");
            return this.f11851b.invoke(obj, Arrays.copyOf(i, i.length));
        }
    }

    public C6013k(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.f11851b = method;
        this.f11852c = list;
        Class<?> returnType = method.getReturnType();
        C6888i.m12437d(returnType, "unboxMethod.returnType");
        this.f11850a = returnType;
    }

    /* renamed from: a */
    public final List<Type> mo23069a() {
        return this.f11852c;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo23070b() {
        return null;
    }

    public final Type getReturnType() {
        return this.f11850a;
    }
}
