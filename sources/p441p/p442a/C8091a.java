package p441p.p442a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: p.a.a */
public final class C8091a {

    /* renamed from: a */
    public static final C8093b[] f16269a;

    /* renamed from: b */
    public static final List<C8093b> f16270b = new ArrayList();

    /* renamed from: c */
    public static volatile C8093b[] f16271c;

    /* renamed from: d */
    public static final C8093b f16272d = new C8092a();

    /* renamed from: p.a.a$a */
    public static class C8092a extends C8093b {
        /* renamed from: a */
        public void mo26043a(String str, Object... objArr) {
            for (C8093b a : C8091a.f16271c) {
                a.mo26043a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo26044b(String str, Object... objArr) {
            for (C8093b b : C8091a.f16271c) {
                b.mo26044b(str, objArr);
            }
        }

        /* renamed from: c */
        public void mo18368c(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: p.a.a$b */
    public static abstract class C8093b {

        /* renamed from: a */
        public final ThreadLocal<String> f16273a = new ThreadLocal<>();

        /* renamed from: a */
        public void mo26043a(String str, Object... objArr) {
            mo26045d(3, (Throwable) null, str, objArr);
        }

        /* renamed from: b */
        public void mo26044b(String str, Object... objArr) {
            mo26045d(6, (Throwable) null, str, objArr);
        }

        /* renamed from: c */
        public abstract void mo18368c(int i, String str, String str2, Throwable th);

        /* renamed from: d */
        public final void mo26045d(int i, Throwable th, String str, Object... objArr) {
            String str2 = this.f16273a.get();
            if (str2 != null) {
                this.f16273a.remove();
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                mo18368c(i, str2, str, (Throwable) null);
            }
        }
    }

    static {
        C8093b[] bVarArr = new C8093b[0];
        f16269a = bVarArr;
        f16271c = bVarArr;
    }
}
