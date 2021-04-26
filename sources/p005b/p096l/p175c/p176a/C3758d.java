package p005b.p096l.p175c.p176a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.l.c.a.d */
public final class C3758d {

    /* renamed from: a */
    public static final Object f6943a;

    static {
        Object a = m7061a();
        f6943a = a;
        if (a != null) {
            m7062b("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a != null) {
            try {
                Method b = m7062b("getStackTraceDepth", Throwable.class);
                if (b != null) {
                    b.invoke(m7061a(), new Object[]{new Throwable()});
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Object m7061a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Method m7062b(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
