package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: b.l.d.q.f.g.e0 */
public class C4006e0 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f7338a;

    /* renamed from: b */
    public final /* synthetic */ AtomicLong f7339b;

    /* renamed from: b.l.d.q.f.g.e0$a */
    public class C4007a extends C4000c {

        /* renamed from: g */
        public final /* synthetic */ Runnable f7340g;

        public C4007a(C4006e0 e0Var, Runnable runnable) {
            this.f7340g = runnable;
        }

        /* renamed from: a */
        public void mo15511a() {
            this.f7340g.run();
        }
    }

    public C4006e0(String str, AtomicLong atomicLong) {
        this.f7338a = str;
        this.f7339b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new C4007a(this, runnable));
        newThread.setName(this.f7338a + this.f7339b.getAndIncrement());
        return newThread;
    }
}
