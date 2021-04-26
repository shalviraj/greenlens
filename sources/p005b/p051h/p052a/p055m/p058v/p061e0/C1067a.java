package p005b.p051h.p052a.p055m.p058v.p061e0;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: b.h.a.m.v.e0.a */
public final class C1067a implements ExecutorService {

    /* renamed from: h */
    public static final long f1166h = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: i */
    public static volatile int f1167i;

    /* renamed from: g */
    public final ExecutorService f1168g;

    /* renamed from: b.h.a.m.v.e0.a$a */
    public static final class C1068a implements ThreadFactory {

        /* renamed from: a */
        public final String f1169a;

        /* renamed from: b */
        public final boolean f1170b;

        /* renamed from: c */
        public int f1171c;

        /* renamed from: b.h.a.m.v.e0.a$a$a */
        public class C1069a extends Thread {
            public C1069a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C1068a.this.f1170b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    Objects.requireNonNull(C1068a.this);
                    ((C1070b.C1071a) C1070b.f1174b).mo10953a(th);
                }
            }
        }

        public C1068a(String str, C1070b bVar, boolean z) {
            this.f1169a = str;
            this.f1170b = z;
        }

        public synchronized Thread newThread(@NonNull Runnable runnable) {
            C1069a aVar;
            aVar = new C1069a(runnable, "glide-" + this.f1169a + "-thread-" + this.f1171c);
            this.f1171c = this.f1171c + 1;
            return aVar;
        }
    }

    /* renamed from: b.h.a.m.v.e0.a$b */
    public interface C1070b {

        /* renamed from: a */
        public static final C1070b f1173a;

        /* renamed from: b */
        public static final C1070b f1174b;

        /* renamed from: b.h.a.m.v.e0.a$b$a */
        public class C1071a implements C1070b {
            /* renamed from: a */
            public void mo10953a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C1071a aVar = new C1071a();
            f1173a = aVar;
            f1174b = aVar;
        }
    }

    @VisibleForTesting
    public C1067a(ExecutorService executorService) {
        this.f1168g = executorService;
    }

    /* renamed from: a */
    public static int m908a() {
        if (f1167i == 0) {
            f1167i = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f1167i;
    }

    public boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
        return this.f1168g.awaitTermination(j, timeUnit);
    }

    public void execute(@NonNull Runnable runnable) {
        this.f1168g.execute(runnable);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f1168g.invokeAll(collection);
    }

    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f1168g.invokeAll(collection, j, timeUnit);
    }

    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) {
        return this.f1168g.invokeAny(collection);
    }

    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) {
        return this.f1168g.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f1168g.isShutdown();
    }

    public boolean isTerminated() {
        return this.f1168g.isTerminated();
    }

    public void shutdown() {
        this.f1168g.shutdown();
    }

    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f1168g.shutdownNow();
    }

    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f1168g.submit(runnable);
    }

    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f1168g.submit(runnable, t);
    }

    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f1168g.submit(callable);
    }

    public String toString() {
        return this.f1168g.toString();
    }
}
