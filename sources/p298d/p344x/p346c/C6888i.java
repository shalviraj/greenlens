package p298d.p344x.p346c;

import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6762d;
import p298d.C6776q;

/* renamed from: d.x.c.i */
public class C6888i {
    /* renamed from: a */
    public static boolean m12434a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m12435b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(C0843a.m451l(str, " must not be null"));
            m12443j(illegalStateException, C6888i.class.getName());
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public static void m12436c(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            m12443j(nullPointerException, C6888i.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: d */
    public static void m12437d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(C0843a.m451l(str, " must not be null"));
            m12443j(nullPointerException, C6888i.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public static void m12438e(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(m12441h(str));
            m12443j(nullPointerException, C6888i.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public static void m12439f(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m12441h(str));
            m12443j(illegalArgumentException, C6888i.class.getName());
            throw illegalArgumentException;
        }
    }

    /* renamed from: g */
    public static int m12440g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: h */
    public static String m12441h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: i */
    public static void m12442i() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: j */
    public static <T extends Throwable> T m12443j(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: k */
    public static String m12444k(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m12445l() {
        C6762d dVar = new C6762d();
        m12443j(dVar, C6888i.class.getName());
        throw dVar;
    }

    /* renamed from: m */
    public static void m12446m(String str) {
        C6776q qVar = new C6776q(C0843a.m452m("lateinit property ", str, " has not been initialized"));
        m12443j(qVar, C6888i.class.getName());
        throw qVar;
    }
}
