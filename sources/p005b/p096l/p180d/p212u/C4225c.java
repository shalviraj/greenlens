package p005b.p096l.p180d.p212u;

import java.util.concurrent.ThreadFactory;

/* renamed from: b.l.d.u.c */
public final /* synthetic */ class C4225c implements ThreadFactory {

    /* renamed from: a */
    public static final C4225c f7815a = new C4225c();

    public Thread newThread(Runnable runnable) {
        int i = C4226d.f7816b;
        return new Thread(runnable, "heartbeat-information-executor");
    }
}
