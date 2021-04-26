package p005b.p273o;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b.o.d4 */
public class C4818d4 {

    /* renamed from: c */
    public static Class<?> f9237c;

    /* renamed from: d */
    public static AtomicLong f9238d;

    /* renamed from: e */
    public static AtomicLong f9239e;

    /* renamed from: f */
    public static C4916n1 f9240f;

    /* renamed from: a */
    public Object f9241a;

    /* renamed from: b */
    public Context f9242b;

    public C4818d4(Context context) {
        this.f9242b = context;
    }

    /* renamed from: c */
    public static Method m8838c(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final String mo16557a(C4916n1 n1Var) {
        if (n1Var.f9487b.isEmpty() || n1Var.f9488c.isEmpty()) {
            String str = n1Var.f9489d;
            return str != null ? str.substring(0, Math.min(10, str.length())) : "";
        }
        return n1Var.f9487b + " - " + n1Var.f9488c;
    }

    /* renamed from: b */
    public final Object mo16558b(Context context) {
        Method method;
        if (this.f9241a == null) {
            try {
                method = f9237c.getMethod("getInstance", new Class[]{Context.class});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                method = null;
            }
            try {
                this.f9241a = method.invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f9241a;
    }
}
