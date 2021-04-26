package p005b.p096l.p224e.p226e0;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.e.e0.a */
public final class C4345a {

    /* renamed from: a */
    public static final Type[] f8054a = new Type[0];

    /* renamed from: b.l.e.e0.a$a */
    public static final class C4346a implements GenericArrayType, Serializable {

        /* renamed from: g */
        public final Type f8055g;

        public C4346a(Type type) {
            this.f8055g = C4345a.m7961a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C4345a.m7963c(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f8055g;
        }

        public int hashCode() {
            return this.f8055g.hashCode();
        }

        public String toString() {
            return C4345a.m7969i(this.f8055g) + "[]";
        }
    }

    /* renamed from: b.l.e.e0.a$b */
    public static final class C4347b implements ParameterizedType, Serializable {

        /* renamed from: g */
        public final Type f8056g;

        /* renamed from: h */
        public final Type f8057h;

        /* renamed from: i */
        public final Type[] f8058i;

        public C4347b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C1960d.m2853u(z);
            }
            this.f8056g = type == null ? null : C4345a.m7961a(type);
            this.f8057h = C4345a.m7961a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f8058i = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f8058i[i]);
                C4345a.m7962b(this.f8058i[i]);
                Type[] typeArr3 = this.f8058i;
                typeArr3[i] = C4345a.m7961a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C4345a.m7963c(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f8058i.clone();
        }

        public Type getOwnerType() {
            return this.f8056g;
        }

        public Type getRawType() {
            return this.f8057h;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f8058i) ^ this.f8057h.hashCode();
            Type type = this.f8056g;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f8058i.length;
            if (length == 0) {
                return C4345a.m7969i(this.f8057h);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C4345a.m7969i(this.f8057h));
            sb.append("<");
            sb.append(C4345a.m7969i(this.f8058i[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C4345a.m7969i(this.f8058i[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: b.l.e.e0.a$c */
    public static final class C4348c implements WildcardType, Serializable {

        /* renamed from: g */
        public final Type f8059g;

        /* renamed from: h */
        public final Type f8060h;

        public C4348c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C1960d.m2853u(typeArr2.length <= 1);
            C1960d.m2853u(typeArr.length == 1);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                C4345a.m7962b(typeArr2[0]);
                C1960d.m2853u(typeArr[0] != cls ? false : z);
                this.f8060h = C4345a.m7961a(typeArr2[0]);
                this.f8059g = cls;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            C4345a.m7962b(typeArr[0]);
            this.f8060h = null;
            this.f8059g = C4345a.m7961a(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C4345a.m7963c(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f8060h;
            if (type == null) {
                return C4345a.f8054a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f8059g};
        }

        public int hashCode() {
            Type type = this.f8060h;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f8059g.hashCode() + 31);
        }

        public String toString() {
            Type type;
            StringBuilder sb;
            if (this.f8060h != null) {
                sb = C0843a.m460u("? super ");
                type = this.f8060h;
            } else if (this.f8059g == Object.class) {
                return "?";
            } else {
                sb = C0843a.m460u("? extends ");
                type = this.f8059g;
            }
            sb.append(C4345a.m7969i(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Type m7961a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C4346a(m7961a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C4347b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C4346a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C4348c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    public static void m7962b(Type type) {
        C1960d.m2853u(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: c */
    public static boolean m7963c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (!(ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m7963c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: d */
    public static Type m7964d(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m7964d(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m7964d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: e */
    public static Class<?> m7965e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C1960d.m2853u(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m7965e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m7965e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: f */
    public static Type m7966f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C1960d.m2853u(cls2.isAssignableFrom(cls));
        return m7967g(type, cls, m7964d(type, cls, cls2));
    }

    /* renamed from: g */
    public static Type m7967g(Type type, Class<?> cls, Type type2) {
        return m7968h(type, cls, type2, new HashSet());
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
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m7968h(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
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
            java.lang.reflect.Type r2 = m7964d(r8, r9, r10)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x004a
            java.lang.reflect.TypeVariable[] r10 = r10.getTypeParameters()
            int r3 = r10.length
        L_0x002e:
            if (r1 >= r3) goto L_0x0044
            r4 = r10[r1]
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r10 = r2.getActualTypeArguments()
            r10 = r10[r1]
            goto L_0x004b
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x002e
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
            java.lang.reflect.Type r8 = m7968h(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            b.l.e.e0.a$a r0 = new b.l.e.e0.a$a
            r0.<init>(r8)
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0083
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m7968h(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x007d
            goto L_0x0082
        L_0x007d:
            b.l.e.e0.a$a r10 = new b.l.e.e0.a$a
            r10.<init>(r8)
        L_0x0082:
            return r10
        L_0x0083:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00c3
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m7968h(r8, r9, r0, r11)
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
            java.lang.reflect.Type r6 = m7968h(r8, r9, r6, r11)
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
            if (r0 == 0) goto L_0x00c2
            java.lang.reflect.Type r8 = r10.getRawType()
            b.l.e.e0.a$b r10 = new b.l.e.e0.a$b
            r10.<init>(r3, r8, r4)
        L_0x00c2:
            return r10
        L_0x00c3:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x011f
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00fa
            r3 = r0[r1]
            java.lang.reflect.Type r8 = m7968h(r8, r9, r3, r11)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00e9
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getLowerBounds()
            goto L_0x00ee
        L_0x00e9:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x00ee:
            b.l.e.e0.a$c r9 = new b.l.e.e0.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r10[r1] = r11
            r9.<init>(r10, r8)
            return r9
        L_0x00fa:
            int r0 = r3.length
            if (r0 != r2) goto L_0x011f
            r0 = r3[r1]
            java.lang.reflect.Type r8 = m7968h(r8, r9, r0, r11)
            r9 = r3[r1]
            if (r8 == r9) goto L_0x011f
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x0112
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            java.lang.reflect.Type[] r8 = r8.getUpperBounds()
            goto L_0x0117
        L_0x0112:
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r9[r1] = r8
            r8 = r9
        L_0x0117:
            b.l.e.e0.a$c r9 = new b.l.e.e0.a$c
            java.lang.reflect.Type[] r10 = f8054a
            r9.<init>(r8, r10)
            return r9
        L_0x011f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p224e.p226e0.C4345a.m7968h(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: i */
    public static String m7969i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
