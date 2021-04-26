package p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.C6726e;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6852b;
import p298d.p344x.p345b.C6853c;
import p298d.p344x.p345b.C6854d;
import p298d.p344x.p345b.C6855e;
import p298d.p344x.p345b.C6856f;
import p298d.p344x.p345b.C6857g;
import p298d.p344x.p345b.C6858h;
import p298d.p344x.p345b.C6859i;
import p298d.p344x.p345b.C6860j;
import p298d.p344x.p345b.C6861k;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6863m;
import p298d.p344x.p345b.C6864n;
import p298d.p344x.p345b.C6865o;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p345b.C6867q;
import p298d.p344x.p345b.C6868r;
import p298d.p344x.p345b.C6869s;
import p298d.p344x.p345b.C6870t;
import p298d.p344x.p345b.C6871u;
import p298d.p344x.p345b.C6872v;
import p298d.p344x.p345b.C6873w;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6902w;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;
import p298d.p415c0.C7694h;

/* renamed from: d.a.a.a.y0.b.j1.b.b */
public final class C6173b {

    /* renamed from: a */
    public static final List<C6726e<? extends Object>> f12191a;

    /* renamed from: b */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f12192b;

    /* renamed from: c */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f12193c;

    /* renamed from: d */
    public static final Map<Class<? extends Object<?>>, Integer> f12194d;

    /* renamed from: d.a.a.a.y0.b.j1.b.b$a */
    public static final class C6174a extends C6890k implements C6862l<ParameterizedType, ParameterizedType> {

        /* renamed from: g */
        public static final C6174a f12195g = new C6174a();

        public C6174a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            C6888i.m12438e(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* renamed from: d.a.a.a.y0.b.j1.b.b$b */
    public static final class C6175b extends C6890k implements C6862l<ParameterizedType, C7668h<? extends Type>> {

        /* renamed from: g */
        public static final C6175b f12196g = new C6175b();

        public C6175b() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            C6888i.m12438e(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C6888i.m12437d(actualTypeArguments, "it.actualTypeArguments");
            return C5266a.m9776B(actualTypeArguments);
        }
    }

    static {
        int i = 0;
        List<C6726e<? extends Object>> A = C6790h.m12314A(C6902w.m12460a(Boolean.TYPE), C6902w.m12460a(Byte.TYPE), C6902w.m12460a(Character.TYPE), C6902w.m12460a(Double.TYPE), C6902w.m12460a(Float.TYPE), C6902w.m12460a(Integer.TYPE), C6902w.m12460a(Long.TYPE), C6902w.m12460a(Short.TYPE));
        f12191a = A;
        ArrayList arrayList = new ArrayList(C5266a.m9892V(A, 10));
        for (C6726e eVar : A) {
            arrayList.add(new C6768j(C5266a.m10051w1(eVar), C5266a.m10057x1(eVar)));
        }
        f12192b = C6790h.m12338Y(arrayList);
        List<C6726e<? extends Object>> list = f12191a;
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(list, 10));
        for (C6726e eVar2 : list) {
            arrayList2.add(new C6768j(C5266a.m10057x1(eVar2), C5266a.m10051w1(eVar2)));
        }
        f12193c = C6790h.m12338Y(arrayList2);
        List A2 = C6790h.m12314A(C6851a.class, C6862l.class, C6866p.class, C6867q.class, C6868r.class, C6869s.class, C6870t.class, C6871u.class, C6872v.class, C6873w.class, C6852b.class, C6853c.class, C6854d.class, C6855e.class, C6856f.class, C6857g.class, C6858h.class, C6859i.class, C6860j.class, C6861k.class, C6863m.class, C6864n.class, C6865o.class);
        ArrayList arrayList3 = new ArrayList(C5266a.m9892V(A2, 10));
        for (Object next : A2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList3.add(new C6768j((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C6790h.m12333T();
                throw null;
            }
        }
        f12194d = C6790h.m12338Y(arrayList3);
    }

    /* renamed from: a */
    public static final Class<?> m11072a(Class<?> cls) {
        C6888i.m12438e(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: b */
    public static final C6713a m11073b(Class<?> cls) {
        C6888i.m12438e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(C6888i.m12444k("Can't compute ClassId for primitive type: ", cls));
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C6888i.m12437d(simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    C6713a d = declaringClass == null ? null : m11073b(declaringClass).mo23853d(C6717d.m12270l(cls.getSimpleName()));
                    if (d == null) {
                        d = C6713a.m12239l(new C6714b(cls.getName()));
                    }
                    C6888i.m12437d(d, "declaringClass?.classId?.createNestedClassId(Name.identifier(simpleName)) ?: ClassId.topLevel(FqName(name))");
                    return d;
                }
            }
            C6714b bVar = new C6714b(cls.getName());
            return new C6713a(bVar.mo23865e(), C6714b.m12249k(bVar.mo23868g()), true);
        } else {
            throw new IllegalArgumentException(C6888i.m12444k("Can't compute ClassId for array type: ", cls));
        }
    }

    /* renamed from: c */
    public static final String m11074c(Class<?> cls) {
        C6888i.m12438e(cls, "<this>");
        if (C6888i.m12434a(cls, Void.TYPE)) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        String name = m11072a(cls).getName();
        C6888i.m12437d(name, "createArrayType().name");
        String substring = name.substring(1);
        C6888i.m12437d(substring, "(this as java.lang.String).substring(startIndex)");
        return C7694h.m13943u(substring, '.', '/', false, 4);
    }

    /* renamed from: d */
    public static final List<Type> m11075d(Type type) {
        C6888i.m12438e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C6798p.f13713g;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C7679s.m13901i(C7679s.m13897e(C5266a.m9898W0(type, C6174a.f12195g), C6175b.f12196g));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C6888i.m12437d(actualTypeArguments, "actualTypeArguments");
        return C5266a.m10066y4(actualTypeArguments);
    }

    /* renamed from: e */
    public static final ClassLoader m11076e(Class<?> cls) {
        C6888i.m12438e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C6888i.m12437d(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
