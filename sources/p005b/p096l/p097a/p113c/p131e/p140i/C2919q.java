package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: b.l.a.c.e.i.q */
public final class C2919q implements ThreadFactory {

    /* renamed from: a */
    public final ThreadFactory f4945a = Executors.defaultThreadFactory();

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4945a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
