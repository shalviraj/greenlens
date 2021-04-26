package p421m.p422m0;

import java.util.concurrent.ThreadFactory;

/* renamed from: m.m0.b */
public final class C7866b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f15617a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15618b;

    public C7866b(String str, boolean z) {
        this.f15617a = str;
        this.f15618b = z;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f15617a);
        thread.setDaemon(this.f15618b);
        return thread;
    }
}
