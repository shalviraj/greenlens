package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6414b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6430q;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6436w;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6439z;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.z */
public final class C6205z extends C6204y implements C6430q {

    /* renamed from: a */
    public final Method f12230a;

    public C6205z(Method method) {
        C6888i.m12438e(method, "member");
        this.f12230a = method;
    }

    /* renamed from: F */
    public boolean mo23421F() {
        C6888i.m12438e(this, "this");
        return mo23422Q() != null;
    }

    /* renamed from: O */
    public Member mo23408O() {
        return this.f12230a;
    }

    /* renamed from: Q */
    public C6414b mo23422Q() {
        Object defaultValue = this.f12230a.getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        C6888i.m12438e(defaultValue, "value");
        Class<?> cls = defaultValue.getClass();
        List<C6726e<? extends Object>> list = C6173b.f12191a;
        C6888i.m12438e(cls, "<this>");
        return Enum.class.isAssignableFrom(cls) ? new C6201v((C6717d) null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new C6181e((C6717d) null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new C6185g((C6717d) null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C6197r((C6717d) null, (Class) defaultValue) : new C6203x((C6717d) null, defaultValue);
    }

    public C6436w getReturnType() {
        Type genericReturnType = this.f12230a.getGenericReturnType();
        C6888i.m12437d(genericReturnType, "member.genericReturnType");
        C6888i.m12438e(genericReturnType, "type");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C6178c0(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C6187h(genericReturnType) : genericReturnType instanceof WildcardType ? new C6186g0((WildcardType) genericReturnType) : new C6198s(genericReturnType);
    }

    public List<C6182e0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f12230a.getTypeParameters();
        C6888i.m12437d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new C6182e0(e0Var));
        }
        return arrayList;
    }

    public List<C6439z> getValueParameters() {
        Type[] genericParameterTypes = this.f12230a.getGenericParameterTypes();
        C6888i.m12437d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.f12230a.getParameterAnnotations();
        C6888i.m12437d(parameterAnnotations, "member.parameterAnnotations");
        return mo23417P(genericParameterTypes, parameterAnnotations, this.f12230a.isVarArgs());
    }
}
