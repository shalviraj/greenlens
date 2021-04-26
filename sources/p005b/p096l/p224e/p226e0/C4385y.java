package p005b.p096l.p224e.p226e0;

import java.lang.reflect.Modifier;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.e.e0.y */
public abstract class C4385y {
    /* renamed from: a */
    public static void m8007a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder u = C0843a.m460u("Interface can't be instantiated! Interface name: ");
            u.append(cls.getName());
            throw new UnsupportedOperationException(u.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder u2 = C0843a.m460u("Abstract class can't be instantiated! Class name: ");
            u2.append(cls.getName());
            throw new UnsupportedOperationException(u2.toString());
        }
    }

    /* renamed from: b */
    public abstract <T> T mo16038b(Class<T> cls);
}
