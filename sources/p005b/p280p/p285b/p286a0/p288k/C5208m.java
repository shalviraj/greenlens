package p005b.p280p.p285b.p286a0.p288k;

import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: b.p.b.a0.k.m */
public final class C5208m extends Exception {

    /* renamed from: h */
    public static final Method f10214h;

    /* renamed from: g */
    public IOException f10215g;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f10214h = method;
    }

    public C5208m(IOException iOException) {
        super(iOException);
        this.f10215g = iOException;
    }
}
