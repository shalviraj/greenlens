package p005b.p096l.p224e.p226e0.p227a0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p005b.p096l.p224e.C4473r;

/* renamed from: b.l.e.e0.a0.c */
public final class C4351c extends C4350b {

    /* renamed from: d */
    public static Class f8062d;

    /* renamed from: b */
    public final Object f8063b;

    /* renamed from: c */
    public final Field f8064c;

    public C4351c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f8062d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get((Object) null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f8063b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f8064c = field;
    }

    /* renamed from: a */
    public void mo15986a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.f8063b == null || this.f8064c == null)) {
            try {
                f8062d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f8063b, new Object[]{accessibleObject, Long.valueOf(((Long) f8062d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f8063b, new Object[]{this.f8064c})).longValue()), Boolean.TRUE});
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C4473r("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
