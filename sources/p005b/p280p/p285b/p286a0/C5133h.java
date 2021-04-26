package p005b.p280p.p285b.p286a0;

import java.util.concurrent.ThreadFactory;

/* renamed from: b.p.b.a0.h */
public final class C5133h implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f9951a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9952b;

    public C5133h(String str, boolean z) {
        this.f9951a = str;
        this.f9952b = z;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f9951a);
        thread.setDaemon(this.f9952b);
        return thread;
    }
}
