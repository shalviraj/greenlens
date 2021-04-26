package p005b.p273o;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.n2 */
public final class C4919n2 implements ThreadFactory {
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder u = C0843a.m460u("OS_PENDING_EXECUTOR_");
        u.append(thread.getId());
        thread.setName(u.toString());
        return thread;
    }
}
