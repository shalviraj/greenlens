package p005b.p096l.p224e.p226e0;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.e.e0.f */
public class C4356f implements C4380t<T> {

    /* renamed from: a */
    public final C4385y f8065a;

    /* renamed from: b */
    public final /* synthetic */ Class f8066b;

    /* renamed from: c */
    public final /* synthetic */ Type f8067c;

    public C4356f(C4357g gVar, Class cls, Type type) {
        C4385y yVar;
        this.f8066b = cls;
        this.f8067c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new C4381u(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                yVar = new C4382v(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    yVar = new C4383w(declaredMethod3);
                } catch (Exception unused3) {
                    yVar = new C4384x();
                }
            }
        }
        this.f8065a = yVar;
    }

    /* renamed from: a */
    public T mo15987a() {
        try {
            return this.f8065a.mo16038b(this.f8066b);
        } catch (Exception e) {
            StringBuilder u = C0843a.m460u("Unable to invoke no-args constructor for ");
            u.append(this.f8067c);
            u.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(u.toString(), e);
        }
    }
}
