package p005b.p280p.p281a.p284z;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5078n;
import p005b.p280p.p281a.C5080p;
import p005b.p280p.p281a.C5081q;

/* renamed from: b.p.a.z.b */
public final class C5117b {

    /* renamed from: a */
    public static final Set<Annotation> f9903a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f9904b = new Type[0];

    /* renamed from: c */
    public static final Class<?> f9905c;

    /* renamed from: d */
    public static final Class<? extends Annotation> f9906d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f9907e;

    /* renamed from: b.p.a.z.b$a */
    public static final class C5118a implements GenericArrayType {

        /* renamed from: g */
        public final Type f9908g;

        public C5118a(Type type) {
            this.f9908g = C5117b.m9414a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4805c3.m8805d(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f9908g;
        }

        public int hashCode() {
            return this.f9908g.hashCode();
        }

        public String toString() {
            return C5117b.m9425l(this.f9908g) + "[]";
        }
    }

    /* renamed from: b.p.a.z.b$b */
    public static final class C5119b implements ParameterizedType {

        /* renamed from: g */
        public final Type f9909g;

        /* renamed from: h */
        public final Type f9910h;

        /* renamed from: i */
        public final Type[] f9911i;

        public C5119b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C4805c3.m8811j(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f9909g = type == null ? null : C5117b.m9414a(type);
            this.f9910h = C5117b.m9414a(type2);
            this.f9911i = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f9911i;
                if (i < typeArr2.length) {
                    Objects.requireNonNull(typeArr2[i]);
                    C5117b.m9415b(typeArr2[i]);
                    Type[] typeArr3 = this.f9911i;
                    typeArr3[i] = C5117b.m9414a(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4805c3.m8805d(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f9911i.clone();
        }

        public Type getOwnerType() {
            return this.f9909g;
        }

        public Type getRawType() {
            return this.f9910h;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f9911i) ^ this.f9910h.hashCode();
            Type type = this.f9909g;
            Set<Annotation> set = C5117b.f9903a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f9911i.length + 1) * 30);
            sb.append(C5117b.m9425l(this.f9910h));
            if (this.f9911i.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C5117b.m9425l(this.f9911i[0]));
            for (int i = 1; i < this.f9911i.length; i++) {
                sb.append(", ");
                sb.append(C5117b.m9425l(this.f9911i[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: b.p.a.z.b$c */
    public static final class C5120c implements WildcardType {

        /* renamed from: g */
        public final Type f9912g;

        /* renamed from: h */
        public final Type f9913h;

        public C5120c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C5117b.m9415b(typeArr2[0]);
                if (typeArr[0] == cls) {
                    this.f9913h = C5117b.m9414a(typeArr2[0]);
                    this.f9912g = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                C5117b.m9415b(typeArr[0]);
                this.f9913h = null;
                this.f9912g = C5117b.m9414a(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4805c3.m8805d(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f9913h;
            if (type == null) {
                return C5117b.f9904b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f9912g};
        }

        public int hashCode() {
            Type type = this.f9913h;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9912g.hashCode() + 31);
        }

        public String toString() {
            Type type;
            StringBuilder sb;
            if (this.f9913h != null) {
                sb = C0843a.m460u("? super ");
                type = this.f9913h;
            } else if (this.f9912g == Object.class) {
                return "?";
            } else {
                sb = C0843a.m460u("? extends ");
                type = this.f9912g;
            }
            sb.append(C5117b.m9425l(type));
            return sb.toString();
        }
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f9906d = cls;
        try {
            cls2 = Class.forName("kotlin.jvm.internal.DefaultConstructorMarker");
        } catch (ClassNotFoundException unused2) {
        }
        f9905c = cls2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f9907e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static Type m9414a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C5118a(m9414a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C5119b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5119b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof C5118a ? type : new C5118a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType) || (type instanceof C5120c)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C5120c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m9415b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008d, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        m9423j(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if ((r8 instanceof java.lang.reflect.ParameterizedType) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f8, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r8 + "'. Suspiciously, the type was not parameterized but the target class '" + r2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0127, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r8, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[ExcHandler: InvocationTargetException (r7v6 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[ExcHandler: InstantiationException (r7v5 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[ExcHandler: IllegalAccessException (r7v4 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0110 A[ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x0032] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0077=Splitter:B:18:0x0077, B:14:0x005b=Splitter:B:14:0x005b} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p005b.p280p.p281a.C5075l<?> m9416c(p005b.p280p.p281a.C5099x r7, java.lang.reflect.Type r8, java.lang.Class<?> r9) {
        /*
            java.lang.Class<b.p.a.x> r0 = p005b.p280p.p281a.C5099x.class
            java.lang.Class<b.p.a.m> r1 = p005b.p280p.p281a.C5077m.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            b.p.a.m r1 = (p005b.p280p.p281a.C5077m) r1
            r2 = 0
            if (r1 == 0) goto L_0x0128
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x0128
        L_0x0015:
            java.lang.String r1 = r9.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "$"
            java.lang.String r5 = "_"
            java.lang.String r1 = r1.replace(r4, r5)
            r3.append(r1)
            java.lang.String r1 = "JsonAdapter"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x00c5, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r3 = 1
            java.lang.Class r9 = java.lang.Class.forName(r1, r3, r9)     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x00c5, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r4 = 0
            if (r1 == 0) goto L_0x006a
            r1 = r8
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r6[r4] = r0     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r6[r3] = r0     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r5[r3] = r1     // Catch:{ NoSuchMethodException -> 0x005b, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            goto L_0x007f
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            r7[r4] = r0     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r5[r4] = r1     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            goto L_0x007f
        L_0x006a:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0077, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r1[r4] = r0     // Catch:{ NoSuchMethodException -> 0x0077, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r1)     // Catch:{ NoSuchMethodException -> 0x0077, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0077, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0077, ClassNotFoundException -> 0x0110, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            goto L_0x007f
        L_0x0077:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.reflect.Constructor r0 = r9.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
        L_0x007f:
            r0.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            java.lang.Object r7 = r0.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            b.p.a.l r7 = (p005b.p280p.p281a.C5075l) r7     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            b.p.a.l r7 = r7.mo16831c()     // Catch:{ ClassNotFoundException -> 0x0110, NoSuchMethodException -> 0x008d, IllegalAccessException -> 0x00ad, InstantiationException -> 0x0095, InvocationTargetException -> 0x0090 }
            return r7
        L_0x008d:
            r7 = move-exception
            r2 = r9
            goto L_0x00c6
        L_0x0090:
            r7 = move-exception
            m9423j(r7)
            throw r2
        L_0x0095:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00ad:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00c5:
            r7 = move-exception
        L_0x00c6:
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r9 != 0) goto L_0x00f9
            java.lang.reflect.TypeVariable[] r9 = r2.getTypeParameters()
            int r9 = r9.length
            if (r9 == 0) goto L_0x00f9
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for '"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "'. Suspiciously, the type was not parameterized but the target class '"
            r0.append(r8)
            java.lang.String r8 = r2.getCanonicalName()
            r0.append(r8)
            java.lang.String r8 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00f9:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x0110:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x0128:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.p284z.C5117b.m9416c(b.p.a.x, java.lang.reflect.Type, java.lang.Class):b.p.a.l");
    }

    /* renamed from: d */
    public static Type m9417d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m9417d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m9417d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static boolean m9418e(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: f */
    public static Set<? extends Annotation> m9419f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C5080p.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f9903a;
    }

    /* renamed from: g */
    public static C5078n m9420g(String str, String str2, C5081q qVar) {
        String str3;
        String H = qVar.mo16834H();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, H});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, H});
        }
        return new C5078n(str3);
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static Type m9421h(Type type, Class<?> cls, Type type2) {
        return m9422i(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m9422i(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x004e
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r2 = r11.contains(r0)
            if (r2 == 0) goto L_0x000f
            return r10
        L_0x000f:
            r11.add(r0)
            java.lang.reflect.GenericDeclaration r10 = r0.getGenericDeclaration()
            boolean r2 = r10 instanceof java.lang.Class
            if (r2 == 0) goto L_0x001d
            java.lang.Class r10 = (java.lang.Class) r10
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            goto L_0x004a
        L_0x0021:
            java.lang.reflect.Type r2 = m9417d(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
        L_0x002d:
            int r3 = r10.length
            if (r1 >= r3) goto L_0x0044
            r3 = r10[r1]
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0044:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x004a:
            r10 = r0
        L_0x004b:
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x004e:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x006c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x006c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m9422i(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            b.p.a.z.b$a r0 = new b.p.a.z.b$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m9422i(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            b.p.a.z.b$a r10 = new b.p.a.z.b$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c4
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m9422i(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x0096
            r0 = r2
            goto L_0x0097
        L_0x0096:
            r0 = r1
        L_0x0097:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x009c:
            if (r1 >= r5) goto L_0x00b7
            r6 = r4[r1]
            java.lang.reflect.Type r6 = m9422i(r8, r9, r6, r11)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00b4
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r2
        L_0x00b2:
            r4[r1] = r6
        L_0x00b4:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b7:
            if (r0 == 0) goto L_0x00c3
            b.p.a.z.b$b r8 = new b.p.a.z.b$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00c3:
            return r10
        L_0x00c4:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0120
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fb
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m9422i(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0120
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00ea
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ef
        L_0x00ea:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ef:
            b.p.a.z.b$c r9 = new b.p.a.z.b$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fb:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0120
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m9422i(r8, r9, r0, r11)
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0120
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0113
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0118
        L_0x0113:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0118:
            b.p.a.z.b$c r9 = new b.p.a.z.b$c
            java.lang.reflect.Type[] r10 = f9904b
            r9.<init>(r8, r10)
            return r9
        L_0x0120:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p281a.p284z.C5117b.m9422i(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: j */
    public static RuntimeException m9423j(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: k */
    public static String m9424k(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    public static String m9425l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: m */
    public static C5078n m9426m(String str, String str2, C5081q qVar) {
        String str3;
        String H = qVar.mo16834H();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, H});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, H});
        }
        return new C5078n(str3);
    }
}
