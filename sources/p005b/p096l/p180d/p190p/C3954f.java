package p005b.p096l.p180d.p190p;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import p005b.p096l.p180d.p215w.C4284b;

/* renamed from: b.l.d.p.f */
public final /* synthetic */ class C3954f implements C4284b {

    /* renamed from: a */
    public final String f7247a;

    public C3954f(String str) {
        this.f7247a = str;
    }

    public Object get() {
        String str = this.f7247a;
        try {
            Class<?> cls = Class.forName(str);
            if (C3956h.class.isAssignableFrom(cls)) {
                return (C3956h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C3972w(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C3972w(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new C3972w(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new C3972w(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new C3972w(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }
}
