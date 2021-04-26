package p005b.p096l.p097a.p113c.p130d;

import dalvik.system.PathClassLoader;

/* renamed from: b.l.a.c.d.e */
public final class C1994e extends PathClassLoader {
    public C1994e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
