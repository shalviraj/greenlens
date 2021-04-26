package p005b.p051h.p052a.p078s;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.h.a.s.e */
public final class C1373e {

    /* renamed from: a */
    public static final Executor f1789a = new C1374a();

    /* renamed from: b */
    public static final Executor f1790b = new C1375b();

    /* renamed from: b.h.a.s.e$a */
    public class C1374a implements Executor {

        /* renamed from: g */
        public final Handler f1791g = new Handler(Looper.getMainLooper());

        public void execute(@NonNull Runnable runnable) {
            this.f1791g.post(runnable);
        }
    }

    /* renamed from: b.h.a.s.e$b */
    public class C1375b implements Executor {
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }
}
