package p005b.p096l.p164b.p165a.p173d;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.l */
public class C3734l {
    /* renamed from: a */
    public static void m7037a(InputStream inputStream, OutputStream outputStream, boolean z) {
        try {
            Objects.requireNonNull(inputStream);
            Objects.requireNonNull(outputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    /* renamed from: b */
    public static Type m7038b(Type type, Class<?> cls, int i) {
        ParameterizedType h = m7044h(type, cls);
        if (h == null) {
            return null;
        }
        Type type2 = h.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type n = m7050n(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (n != null) {
                return n;
            }
        }
        return type2;
    }

    /* renamed from: c */
    public static Type m7039c(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: d */
    public static Type m7040d(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    /* renamed from: e */
    public static Type m7041e(Type type) {
        return m7038b(type, Iterable.class, 0);
    }

    /* renamed from: f */
    public static Class<?> m7042f(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = m7050n(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m7042f(list, m7039c(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m7043g((ParameterizedType) type);
        }
        C1960d.m2845s(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: g */
    public static Class<?> m7043g(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: h */
    public static ParameterizedType m7044h(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> cls3 = (Class) parameterizedType.getRawType();
                if (cls3 == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : cls3.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : m7043g((ParameterizedType) type2))) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = cls3;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[SYNTHETIC, Splitter:B:24:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.IllegalArgumentException m7045i(java.lang.Exception r4, java.lang.Class<?> r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unable to create new instance of class "
            r0.<init>(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r5.isArray()
            r3 = 0
            if (r2 == 0) goto L_0x001d
            java.lang.String r5 = "because it is an array"
            goto L_0x0073
        L_0x001d:
            boolean r2 = r5.isPrimitive()
            if (r2 == 0) goto L_0x0026
            java.lang.String r5 = "because it is primitive"
            goto L_0x0073
        L_0x0026:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r5 != r2) goto L_0x002d
            java.lang.String r5 = "because it is void"
            goto L_0x0073
        L_0x002d:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isInterface(r2)
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "because it is an interface"
            goto L_0x0046
        L_0x003a:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isAbstract(r2)
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = "because it is abstract"
        L_0x0046:
            r1.add(r2)
        L_0x0049:
            java.lang.Class r2 = r5.getEnclosingClass()
            if (r2 == 0) goto L_0x005e
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = "because it is not static"
            r1.add(r2)
        L_0x005e:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 != 0) goto L_0x006b
            java.lang.String r5 = "possibly because it is not public"
            goto L_0x0073
        L_0x006b:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0071 }
            r5.getConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x0071 }
            goto L_0x0076
        L_0x0071:
            java.lang.String r5 = "because it has no accessible default constructor"
        L_0x0073:
            r1.add(r5)
        L_0x0076:
            java.util.Iterator r5 = r1.iterator()
        L_0x007a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r3 == 0) goto L_0x008e
            java.lang.String r2 = " and"
            r0.append(r2)
            goto L_0x0090
        L_0x008e:
            r2 = 1
            r3 = r2
        L_0x0090:
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r1)
            goto L_0x007a
        L_0x0099:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p173d.C3734l.m7045i(java.lang.Exception, java.lang.Class):java.lang.IllegalArgumentException");
    }

    /* renamed from: j */
    public static boolean m7046j(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    /* renamed from: k */
    public static boolean m7047k(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* renamed from: l */
    public static <T> Iterable<T> m7048l(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        C1960d.m2845s(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new C3747x(obj);
    }

    /* renamed from: m */
    public static <T> T m7049m(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m7045i(e, cls);
        } catch (InstantiationException e2) {
            throw m7045i(e2, cls);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = m7050n(r5, (java.lang.reflect.TypeVariable) r6);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m7050n(java.util.List<java.lang.reflect.Type> r5, java.lang.reflect.TypeVariable<?> r6) {
        /*
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x004d
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r3 = r5.size()
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0022
            java.lang.Object r4 = r5.get(r3)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.ParameterizedType r4 = m7044h(r4, r1)
            goto L_0x0011
        L_0x0022:
            if (r4 == 0) goto L_0x004d
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0038
            r2 = r0[r1]
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0038:
            java.lang.reflect.Type[] r6 = r4.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x004c
            r0 = r6
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type r5 = m7050n(r5, r0)
            if (r5 == 0) goto L_0x004c
            return r5
        L_0x004c:
            return r6
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p173d.C3734l.m7050n(java.util.List, java.lang.reflect.TypeVariable):java.lang.reflect.Type");
    }

    /* renamed from: o */
    public static Object m7051o(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            Array.set(newInstance, i, obj);
            i++;
        }
        return newInstance;
    }
}
