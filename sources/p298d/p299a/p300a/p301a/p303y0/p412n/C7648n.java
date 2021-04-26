package p298d.p299a.p300a.p301a.p303y0.p412n;

import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.n.n */
public class C7648n {

    /* renamed from: a */
    public static final Object f15148a = new C7649a();

    /* renamed from: d.a.a.a.y0.n.n$a */
    public static class C7649a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: d.a.a.a.y0.n.n$b */
    public static final class C7650b {

        /* renamed from: a */
        public final Throwable f15149a;

        public C7650b(Throwable th, C7649a aVar) {
            if (th != null) {
                this.f15149a = th;
            } else {
                m13878a(0);
                throw null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13878a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String toString() {
            return this.f15149a.toString();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m13875a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static <V> V m13876b(Object obj) {
        if (obj != null) {
            m13877c(obj);
            if (obj == null) {
                m13875a(0);
                throw null;
            } else if (obj == f15148a) {
                return null;
            } else {
                return obj;
            }
        } else {
            m13875a(4);
            throw null;
        }
    }

    /* renamed from: c */
    public static <V> V m13877c(Object obj) {
        if (!(obj instanceof C7650b)) {
            return obj;
        }
        Throwable th = ((C7650b) obj).f15149a;
        if (th != null) {
            C6888i.m12438e(th, "e");
            throw th;
        }
        C7650b.m13878a(1);
        throw null;
    }
}
