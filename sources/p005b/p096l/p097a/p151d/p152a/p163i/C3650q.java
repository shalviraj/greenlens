package p005b.p096l.p097a.p151d.p152a.p163i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.d.a.i.q */
public final class C3650q implements Executor {

    /* renamed from: g */
    public final Handler f6723g = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f6723g.post(runnable);
    }
}
