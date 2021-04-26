package p005b.p096l.p180d.p185o.p189e0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p131e.p136e.C2031a9;

/* renamed from: b.l.d.o.e0.v */
public final class C3897v implements Executor {

    /* renamed from: h */
    public static final C3897v f7180h = new C3897v();

    /* renamed from: g */
    public final Handler f7181g = new C2031a9(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f7181g.post(runnable);
    }
}
