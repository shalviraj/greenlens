package p005b.p051h.p052a.p072o;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: b.h.a.o.e */
public final class C1328e {
    /* renamed from: a */
    public static C1326c m1354a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof C1326c) {
                    return (C1326c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                m1355b(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                m1355b(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m1355b(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m1355b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: b */
    public static void m1355b(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
