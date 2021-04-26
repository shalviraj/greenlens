package p005b.p280p.p285b.p286a0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.p.b.a0.e */
public class C5126e<T> {

    /* renamed from: a */
    public final Class<?> f9932a;

    /* renamed from: b */
    public final String f9933b;

    /* renamed from: c */
    public final Class[] f9934c;

    public C5126e(Class<?> cls, String str, Class... clsArr) {
        this.f9932a = cls;
        this.f9933b = str;
        this.f9934c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method mo16976a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f9933b
            r1 = 0
            if (r0 == 0) goto L_0x0026
            java.lang.Class[] r2 = r3.f9934c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch:{ NoSuchMethodException -> 0x0013 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0014 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r4 = r1
        L_0x0014:
            if (r4 == 0) goto L_0x0025
            java.lang.Class<?> r0 = r3.f9932a
            if (r0 == 0) goto L_0x0025
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.C5126e.mo16976a(java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: b */
    public Object mo16977b(T t, Object... objArr) {
        Method a = mo16976a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder u = C0843a.m460u("Method ");
            u.append(this.f9933b);
            u.append(" not supported for object ");
            u.append(t);
            throw new AssertionError(u.toString());
        }
    }

    /* renamed from: c */
    public Object mo16978c(T t, Object... objArr) {
        try {
            Method a = mo16976a(t.getClass());
            if (a == null) {
                return null;
            }
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object mo16979d(T t, Object... objArr) {
        try {
            return mo16977b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
