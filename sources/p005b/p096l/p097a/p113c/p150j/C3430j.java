package p005b.p096l.p097a.p113c.p150j;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.j */
public final class C3430j {

    /* renamed from: a */
    public static final Executor f6198a = new C3431a();

    /* renamed from: b */
    public static final Executor f6199b = new C3421d0();

    /* renamed from: b.l.a.c.j.j$a */
    public static final class C3431a implements Executor {

        /* renamed from: g */
        public final Handler f6200g = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.f6200g.post(runnable);
        }
    }
}
