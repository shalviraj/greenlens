package p416l.p417a.p418t1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.C6769k;

/* renamed from: l.a.t1.c */
public final class C7768c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        Object obj2 = null;
        try {
            obj = new C7766a(m14113a(Looper.getMainLooper(), true), (String) null, false);
        } catch (Throwable th) {
            obj = C5266a.m10038u0(th);
        }
        if (!(obj instanceof C6769k.C6770a)) {
            obj2 = obj;
        }
        C7767b bVar = (C7767b) obj2;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static final Handler m14113a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
