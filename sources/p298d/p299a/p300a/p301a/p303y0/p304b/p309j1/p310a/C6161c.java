package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7226f;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.j1.a.c */
public final class C6161c {
    /* renamed from: a */
    public static final C7226f m11049a(Class<?> cls) {
        C7226f fVar;
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C6888i.m12437d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C6713a b = C6173b.m11073b(cls);
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            C6714b b2 = b.mo23851b();
            C6888i.m12437d(b2, "javaClassId.asSingleFqName()");
            C6713a mapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(b2);
            if (mapJavaToKotlin != null) {
                b = mapJavaToKotlin;
            }
            return new C7226f(b, i);
        } else if (C6888i.m12434a(cls, Void.TYPE)) {
            C6713a l = C6713a.m12239l(StandardNames.FqNames.unit.mo23883i());
            C6888i.m12437d(l, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new C7226f(l, i);
        } else {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            C6888i.m12437d(primitiveType, "get(currentClass.name).primitiveType");
            if (i > 0) {
                C6713a l2 = C6713a.m12239l(primitiveType.getArrayTypeFqName());
                C6888i.m12437d(l2, "topLevel(primitiveType.arrayTypeFqName)");
                int i2 = i - 1;
                return fVar;
            }
            C6713a l3 = C6713a.m12239l(primitiveType.getTypeFqName());
            C6888i.m12437d(l3, "topLevel(primitiveType.typeFqName)");
            fVar = new C7226f(l3, i);
            return fVar;
        }
    }

    /* renamed from: b */
    public static final void m11050b(Class<?> cls, C6552l.C6555c cVar) {
        C6888i.m12438e(cls, "klass");
        C6888i.m12438e(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C6888i.m12437d(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = declaredAnnotations[i];
            i++;
            C6888i.m12437d(annotation, "annotation");
            m11051c(cVar, annotation);
        }
        cVar.mo23618a();
    }

    /* renamed from: c */
    public static final void m11051c(C6552l.C6555c cVar, Annotation annotation) {
        Class t1 = C5266a.m10033t1(C5266a.m9913Z0(annotation));
        C6552l.C6553a b = cVar.mo23619b(C6173b.m11073b(t1), new C6160b(annotation));
        if (b != null) {
            m11052d(b, annotation, t1);
        }
    }

    /* renamed from: d */
    public static final void m11052d(C6552l.C6553a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C6888i.m12437d(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            i++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C6888i.m12436c(invoke);
                C6717d l = C6717d.m12270l(method.getName());
                C6888i.m12437d(l, "identifier(method.name)");
                Class<?> cls2 = invoke.getClass();
                if (C6888i.m12434a(cls2, Class.class)) {
                    aVar.mo23624b(l, m11049a((Class) invoke));
                } else if (C6165g.f12182a.contains(cls2)) {
                    aVar.mo23626d(l, invoke);
                } else {
                    List<C6726e<? extends Object>> list = C6173b.f12191a;
                    C6888i.m12438e(cls2, "<this>");
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        C6888i.m12437d(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        C6713a b = C6173b.m11073b(cls2);
                        C6717d l2 = C6717d.m12270l(((Enum) invoke).name());
                        C6888i.m12437d(l2, "identifier((value as Enum<*>).name)");
                        aVar.mo23627e(l, b, l2);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class[] interfaces = cls2.getInterfaces();
                        C6888i.m12437d(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) C5266a.m9911Y3(interfaces);
                        C6888i.m12437d(cls3, "annotationClass");
                        C6552l.C6553a c = aVar.mo23625c(l, C6173b.m11073b(cls3));
                        if (c != null) {
                            m11052d(c, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        C6552l.C6554b f = aVar.mo23628f(l);
                        if (f != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                C6888i.m12437d(componentType, "componentType");
                                C6713a b2 = C6173b.m11073b(componentType);
                                Object[] objArr = (Object[]) invoke;
                                int length2 = objArr.length;
                                int i2 = 0;
                                while (i2 < length2) {
                                    Object obj = objArr[i2];
                                    i2++;
                                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    C6717d l3 = C6717d.m12270l(((Enum) obj).name());
                                    C6888i.m12437d(l3, "identifier((element as Enum<*>).name)");
                                    f.mo23633d(b2, l3);
                                }
                            } else {
                                Object[] objArr2 = (Object[]) invoke;
                                if (C6888i.m12434a(componentType, Class.class)) {
                                    int length3 = objArr2.length;
                                    int i3 = 0;
                                    while (i3 < length3) {
                                        Object obj2 = objArr2[i3];
                                        i3++;
                                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                        f.mo23631b(m11049a((Class) obj2));
                                    }
                                } else {
                                    int length4 = objArr2.length;
                                    int i4 = 0;
                                    while (i4 < length4) {
                                        Object obj3 = objArr2[i4];
                                        i4++;
                                        f.mo23632c(obj3);
                                    }
                                }
                            }
                            f.mo23630a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo23623a();
    }
}
