package p005b.p280p.p281a;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.p284z.C5117b;

/* renamed from: b.p.a.g */
public final class C5067g<T> extends C5075l<T> {

    /* renamed from: d */
    public static final C5075l.C5076a f9789d = new C5068a();

    /* renamed from: a */
    public final C5066f<T> f9790a;

    /* renamed from: b */
    public final C5069b<?>[] f9791b;

    /* renamed from: c */
    public final C5081q.C5082a f9792c;

    /* renamed from: b.p.a.g$a */
    public class C5068a implements C5075l.C5076a {
        /* renamed from: a */
        public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
            C5066f fVar;
            Class<Object> cls = Object.class;
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> j = C4805c3.m8811j(type);
            if (j.isInterface() || j.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C5117b.m9418e(j)) {
                mo16824b(type, List.class);
                mo16824b(type, Set.class);
                mo16824b(type, Map.class);
                mo16824b(type, Collection.class);
                String str = "Platform " + j;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(C0843a.m451l(str, " requires explicit JsonAdapter to be registered"));
            } else if (j.isAnonymousClass()) {
                StringBuilder u = C0843a.m460u("Cannot serialize anonymous class ");
                u.append(j.getName());
                throw new IllegalArgumentException(u.toString());
            } else if (j.isLocalClass()) {
                StringBuilder u2 = C0843a.m460u("Cannot serialize local class ");
                u2.append(j.getName());
                throw new IllegalArgumentException(u2.toString());
            } else if (j.getEnclosingClass() != null && !Modifier.isStatic(j.getModifiers())) {
                StringBuilder u3 = C0843a.m460u("Cannot serialize non-static nested class ");
                u3.append(j.getName());
                throw new IllegalArgumentException(u3.toString());
            } else if (!Modifier.isAbstract(j.getModifiers())) {
                Class<? extends Annotation> cls2 = C5117b.f9906d;
                int i = 0;
                if (!(cls2 != null && j.isAnnotationPresent(cls2))) {
                    try {
                        Constructor<?> declaredConstructor = j.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        fVar = new C5062b(declaredConstructor, j);
                    } catch (NoSuchMethodException unused) {
                        try {
                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            fVar = new C5063c(cls3.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), j);
                        } catch (IllegalAccessException unused2) {
                            throw new AssertionError();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            try {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{cls})).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                                declaredMethod2.setAccessible(true);
                                fVar = new C5064d(declaredMethod2, j, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            } catch (InvocationTargetException e) {
                                C5117b.m9423j(e);
                                throw null;
                            } catch (NoSuchMethodException unused5) {
                                try {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                                    declaredMethod3.setAccessible(true);
                                    fVar = new C5065e(declaredMethod3, j);
                                } catch (Exception unused6) {
                                    StringBuilder u4 = C0843a.m460u("cannot construct instances of ");
                                    u4.append(j.getName());
                                    throw new IllegalArgumentException(u4.toString());
                                }
                            }
                        }
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type != cls) {
                        Class<?> j2 = C4805c3.m8811j(type);
                        boolean e2 = C5117b.m9418e(j2);
                        Field[] declaredFields = j2.getDeclaredFields();
                        int length = declaredFields.length;
                        int i2 = i;
                        while (i < length) {
                            Field field = declaredFields[i];
                            int modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !e2)) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                Type h = C5117b.m9421h(type, j2, field.getGenericType());
                                Set<? extends Annotation> f = C5117b.m9419f(field.getAnnotations());
                                String name = field.getName();
                                C5075l<T> d = xVar.mo16932d(h, f, name);
                                field.setAccessible(true);
                                C5074k kVar = (C5074k) field.getAnnotation(C5074k.class);
                                if (kVar != null) {
                                    name = kVar.name();
                                }
                                C5069b bVar = new C5069b(name, field, d);
                                C5069b bVar2 = (C5069b) treeMap.put(name, bVar);
                                if (bVar2 != null) {
                                    StringBuilder u5 = C0843a.m460u("Conflicting fields:\n    ");
                                    u5.append(bVar2.f9794b);
                                    u5.append("\n    ");
                                    u5.append(bVar.f9794b);
                                    throw new IllegalArgumentException(u5.toString());
                                }
                            }
                            i++;
                            i2 = 0;
                        }
                        Class<?> j3 = C4805c3.m8811j(type);
                        type = C5117b.m9421h(type, j3, j3.getGenericSuperclass());
                        i = 0;
                    }
                    return new C5067g(fVar, treeMap).mo16831c();
                }
                StringBuilder u6 = C0843a.m460u("Cannot serialize Kotlin type ");
                u6.append(j.getName());
                u6.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                throw new IllegalArgumentException(u6.toString());
            } else {
                StringBuilder u7 = C0843a.m460u("Cannot serialize abstract class ");
                u7.append(j.getName());
                throw new IllegalArgumentException(u7.toString());
            }
        }

        /* renamed from: b */
        public final void mo16824b(Type type, Class<?> cls) {
            Class<?> j = C4805c3.m8811j(type);
            if (cls.isAssignableFrom(j)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + j.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }
    }

    /* renamed from: b.p.a.g$b */
    public static class C5069b<T> {

        /* renamed from: a */
        public final String f9793a;

        /* renamed from: b */
        public final Field f9794b;

        /* renamed from: c */
        public final C5075l<T> f9795c;

        public C5069b(String str, Field field, C5075l<T> lVar) {
            this.f9793a = str;
            this.f9794b = field;
            this.f9795c = lVar;
        }
    }

    public C5067g(C5066f<T> fVar, Map<String, C5069b<?>> map) {
        this.f9790a = fVar;
        this.f9791b = (C5069b[]) map.values().toArray(new C5069b[map.size()]);
        this.f9792c = C5081q.C5082a.m9296a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    /* renamed from: a */
    public T mo16804a(C5081q qVar) {
        try {
            T a = this.f9790a.mo16818a();
            try {
                qVar.mo16840e();
                while (qVar.mo16835N()) {
                    int n0 = qVar.mo16844n0(this.f9792c);
                    if (n0 == -1) {
                        qVar.mo16845o0();
                        qVar.mo16846p0();
                    } else {
                        C5069b<?> bVar = this.f9791b[n0];
                        bVar.f9794b.set(a, bVar.f9795c.mo16804a(qVar));
                    }
                }
                qVar.mo16849z();
                return a;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            C5117b.m9423j(e2);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: e */
    public void mo16805e(C5087u uVar, T t) {
        try {
            uVar.mo16869e();
            for (C5069b<?> bVar : this.f9791b) {
                uVar.mo16865O(bVar.f9793a);
                bVar.f9795c.mo16805e(uVar, bVar.f9794b.get(t));
            }
            uVar.mo16864H();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JsonAdapter(");
        u.append(this.f9790a);
        u.append(")");
        return u.toString();
    }
}
