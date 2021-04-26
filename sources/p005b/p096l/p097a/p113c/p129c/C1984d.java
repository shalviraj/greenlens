package p005b.p096l.p097a.p113c.p129c;

import android.os.IBinder;
import java.lang.reflect.Field;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p129c.C1980b;

/* renamed from: b.l.a.c.c.d */
public final class C1984d<T> extends C1980b.C1981a {

    /* renamed from: a */
    public final T f3548a;

    public C1984d(T t) {
        this.f3548a = t;
    }

    /* renamed from: n */
    public static <T> T m2900n(C1980b bVar) {
        if (bVar instanceof C1984d) {
            return ((C1984d) bVar).f3548a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(C0843a.m438N(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
