package p005b.p096l.p224e.p226e0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.e.e0.h */
public class C4360h implements C4380t<T> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f8074a;

    public C4360h(C4357g gVar, Constructor constructor) {
        this.f8074a = constructor;
    }

    /* renamed from: a */
    public T mo15987a() {
        try {
            return this.f8074a.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            StringBuilder u = C0843a.m460u("Failed to invoke ");
            u.append(this.f8074a);
            u.append(" with no args");
            throw new RuntimeException(u.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder u2 = C0843a.m460u("Failed to invoke ");
            u2.append(this.f8074a);
            u2.append(" with no args");
            throw new RuntimeException(u2.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
