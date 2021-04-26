package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6424k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6439z;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.b.t */
public final class C6199t extends C6204y implements C6424k {

    /* renamed from: a */
    public final Constructor<?> f12226a;

    public C6199t(Constructor<?> constructor) {
        C6888i.m12438e(constructor, "member");
        this.f12226a = constructor;
    }

    /* renamed from: O */
    public Member mo23408O() {
        return this.f12226a;
    }

    public List<C6182e0> getTypeParameters() {
        TypeVariable[] typeParameters = this.f12226a.getTypeParameters();
        C6888i.m12437d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable e0Var : typeParameters) {
            arrayList.add(new C6182e0(e0Var));
        }
        return arrayList;
    }

    public List<C6439z> getValueParameters() {
        Type[] genericParameterTypes = this.f12226a.getGenericParameterTypes();
        C6888i.m12437d(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C6798p.f13713g;
        }
        Class<?> declaringClass = this.f12226a.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C6790h.m12355i(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.f12226a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C6888i.m12437d(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C6790h.m12355i(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C6888i.m12437d(genericParameterTypes, "realTypes");
            C6888i.m12437d(parameterAnnotations, "realAnnotations");
            return mo23417P(genericParameterTypes, parameterAnnotations, this.f12226a.isVarArgs());
        }
        throw new IllegalStateException(C6888i.m12444k("Illegal generic signature: ", this.f12226a));
    }
}
