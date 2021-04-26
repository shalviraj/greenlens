package p005b.p096l.p097a.p113c.p131e.p140i;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: b.l.a.c.e.i.s7 */
public final class C2953s7 implements PrivilegedExceptionAction<Unsafe> {
    /* renamed from: a */
    public static final Unsafe m5222a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m5222a();
    }
}
